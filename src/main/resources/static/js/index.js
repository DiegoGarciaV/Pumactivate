function onloadBody()
{
    let altura = window.innerHeight;
    $(".fullContent").css("height", altura + "px");

    largo = document.getElementById("cover").getElementsByTagName("h1")[0].clientHeight;
    $("#cover h1").css("top", (altura*0.45 - largo*0.5) + "px");

    var largo = largo*1 + document.getElementById("botones").clientHeight;
    $("#botones").css("top", (altura*0.9 - largo) + "px");


}