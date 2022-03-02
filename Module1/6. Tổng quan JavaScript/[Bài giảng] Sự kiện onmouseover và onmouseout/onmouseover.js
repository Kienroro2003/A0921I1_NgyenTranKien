var demo = document.getElementById("demo");
demo.addEventListener("mouseout", mouseOut);
demo.addEventListener("mouseover", mouseOver);

function mouseOver() {
    document.getElementById("demo").style.color = "red";
}

function mouseOut() {
    document.getElementById("demo").style.color = "blue";
}