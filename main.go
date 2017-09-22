package main

import (
	"fmt"
	"log"
	"math/rand"
	"net/http"
	"strconv"
	"time"

	"github.com/alecthomas/template"
)

type players struct {
	number int
}

type result struct {
	Player []int
	Tribe  []string
}

func homePage(w http.ResponseWriter, r *http.Request) {
	fmt.Println("method:", r.Method) //get request method
	if r.Method == "GET" {
		t, _ := template.ParseFiles("submit.gtpl")
		t.Execute(w, nil)
	}
}
func resultPage(w http.ResponseWriter, r *http.Request) {
	fmt.Println("method:", r.Method) //get request method
	if r.Method == "POST" {
		fmt.Println("Inside POST func")
		// Form submitted
		r.ParseForm()

		var rawTribes []string
		var s players

		for key, values := range r.Form { // range over map
			if key == "tribesOwned" {
				for _, value := range values { // range over []string
					rawTribes = append(rawTribes, fmt.Sprintf("%s", value))
				}
			}
			if key == "numPlayers" {
				for _, value := range values { // range over []string
					p, _ := strconv.Atoi(value)
					s.number = p
				}
			}
		}

		shuffledTribes := rawTribes
		shuffle(shuffledTribes)
		var res result

		j := 1
		// Assign each player a tribe
		for _, i := range shuffledTribes {
			if j <= s.number {
				res.Tribe = append(res.Tribe, i)
				res.Player = append(res.Player, j)
				j++
			}

		}

		t, err := template.ParseFiles("random.html")
		if err != nil {
			log.Fatal("Template random.html: ", err)
		}
		t.Execute(w, &res)

	}
}

func shuffle(arr []string) {
	t := time.Now()
	rand.Seed(int64(t.Nanosecond())) // no shuffling without this line

	for i := len(arr) - 1; i > 0; i-- {
		j := rand.Intn(i + 1)
		arr[i], arr[j] = arr[j], arr[i]
	}
}

func main() {
	http.Handle("/assets/", http.StripPrefix("/assets/", http.FileServer(http.Dir("./assets"))))
	http.HandleFunc("/", homePage)
	http.HandleFunc("/random", resultPage)
	err := http.ListenAndServe(":443", nil) // setting listening port
	if err != nil {
		log.Fatal("ListenAndServe: ", err)
	}
	//tribes := []string{"Xin-Xi", "Imperius", "Bardur", "Oumaji", "Kickoo", "Hoodrick", "Luxidoor", "Vengir", "Zebasi", "Ai-Mo", "Aquarion"}
}
