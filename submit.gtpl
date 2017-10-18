<html>
<head>
  <title>Polytopia Randomizer</title>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<style>
#grad1 {
    height: 150%;
    background: pink; /* For browsers that do not support gradients */
    background: -webkit-linear-gradient(left top, pink, yellow); /* For Safari 5.1 to 6.0 */
    background: -o-linear-gradient(bottom right, pink, yellow); /* For Opera 11.1 to 12.0 */
    background: -moz-linear-gradient(bottom right, pink, yellow); /* For Firefox 3.6 to 15 */
    background: linear-gradient(to bottom right, #ff67bd,  #F4E093); /* Standard syntax (must be last) */
}
</style>
<style media="screen" type="text/css">
.check
{
  opacity:0.4;
	color:#996;

}

.hidden
{
  opacity:0;
  display: none;
}

.img-thumbnail
{
  display: block;
  margin: 0 auto;
}
</style>
</head>

<body>
  <div id="grad1">

<div class="container">
    <p style='color:white;font-size:36px;' class="text-center"> Polytopia Random Tribe Generator </p>
		<form action="random" method="post" multiple="">
    <div class="form-group">
    </br>
      <p style='color:white;font-size:20px;'> Select Number of players </p>
      <input type="number" name="numPlayers" min="1" max="9"> 1-9</br></br><br>
      <p style='color:white;font-size:20px;'>Select Tribes Owned</p>
    <div class="row">
		  <div class="col-md-3"><label class="btn btn-primary"><img src="assets/Xin-Xi.png" alt="..." class="img-thumbnail img-check"><input type="checkbox" name="tribesOwned" value="Xin-Xi" class="hidden" autocomplete="off"/></div>
      <div class="col-md-3"><label class="btn btn-primary"><img src="assets/Imperius.png" alt="..." class="img-thumbnail img-check"><input type="checkbox" name="tribesOwned" value="Imperius" class="hidden" autocomplete="off"/></div>
      <div class="col-md-3"><label class="btn btn-primary"><img src="assets/Bardur.png" alt="..." class="img-thumbnail img-check"><input type="checkbox" name="tribesOwned" value="Bardur" class="hidden" autocomplete="off"/></div>
      <div class="col-md-3"><label class="btn btn-primary"><img src="assets/Oumaji.png" alt="..." class="img-thumbnail img-check"><input type="checkbox" name="tribesOwned" value="Oumaji" class="hidden" autocomplete="off"/></div>
    </div>
    <div class="row">
      <div class="col-md-3"><label class="btn btn-primary"><img src="assets/Kickoo.png" alt="..." class="img-thumbnail img-check"><input type="checkbox" name="tribesOwned" value="Kickoo" class="hidden" autocomplete="off"/></div>
      <div class="col-md-3"><label class="btn btn-primary"><img src="assets/Hoodrick.png" alt="..." class="img-thumbnail img-check"><input type="checkbox" name="tribesOwned" value="Hoodrick" class="hidden" autocomplete="off"/></div>
      <div class="col-md-3"><label class="btn btn-primary"><img src="assets/Luxidoor.png" alt="..." class="img-thumbnail img-check"><input type="checkbox" name="tribesOwned" value="Luxidoor" class="hidden" autocomplete="off"/></div>
      <div class="col-md-3"><label class="btn btn-primary"><img src="assets/Vengir.png" alt="..." class="img-thumbnail img-check"><input type="checkbox" name="tribesOwned" value="Vengir" class="hidden" autocomplete="off"/></div>
    </div>
    <div class="row">
      <div class="col-md-3"><label class="btn btn-primary"><img src="assets/Zebasi.png" alt="..." class="img-thumbnail img-check"><input type="checkbox" name="tribesOwned" value="Zebasi" class="hidden" autocomplete="off"/></div>
      <div class="col-md-3"><label class="btn btn-primary"><img src="assets/Ai-Mo.png" alt="..." class="img-thumbnail img-check"><input type="checkbox" name="tribesOwned" value="Ai-Mo" class="hidden" autocomplete="off"/></div>
      <div class="col-md-3"><label class="btn btn-primary"><img src="assets/Aquarion.png" alt="..." class="img-thumbnail img-check"><input type="checkbox" name="tribesOwned" value="Aquarion" class="hidden" autocomplete="off"/></div>
      <div class="col-md-3"><label class="btn btn-primary"><img src="assets/Quetzali.png" alt="..." class="img-thumbnail img-check"><input type="checkbox" name="tribesOwned" value="Quetzali" class="hidden" autocomplete="off"/></div>
    </div>
  </div>
  <div class="col-md-12 text-center">
    <input type="Submit" value="Randomize!" class="btn btn-primary btn-lg">
  </div>
		</form>
  </div>
</div>
<script>
$(document).ready(function(e){
    		$(".img-check").click(function(){
				$(this).toggleClass("check");
			});
	});
</script>
</body>
</html>
</body></html>
