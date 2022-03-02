let myArr = [];
let message = "";
for (let i = 0; i < 10; i++){
    let num = parseInt(prompt("Nhap so nguyen "));
    myArr.push(num);

}
let myNum = parseInt(prompt("Nhap so nguyen can tim trong mang"));
for (let i = 0; i < myArr.length - 1; i++){
    if (myNum == myArr[i]) {
        message = `${myNum} is in the Array`;
        break;
    } else {
        message =`${myNum} is not the Array`;
    }
}
console.log(message);