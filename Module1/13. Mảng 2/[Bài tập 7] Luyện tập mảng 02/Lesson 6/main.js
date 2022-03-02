let myStr = prompt("Nhap chuoi vao");
let myStrArr = myStr.split("");
for (let i = 0; i < myStrArr.length; i++){
    if (myStrArr[i] == "-") {
        myStrArr[i] = "_";
    }
}
console.log(myStrArr.join(""));