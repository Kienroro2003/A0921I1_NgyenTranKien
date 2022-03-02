// function do_something() {
//     var selectedValue = document.getElementById("mySelect").value;
//     alert(selectedValue);
// }

var selectElement = document.getElementById("mySelect");
selectElement.addEventListener("change", changeFunction);

function changeFunction() {
    var selectedElement = document.getElementById("mySelect").value;
    alert(selectedElement);
}