let num = parseInt(prompt("Nhap vao so lan"));
for (let i = 1; i <= num ; i++){
    let count = document.getElementById("demo")
    count.innerHTML += "The number is " + i + "<br>"
}