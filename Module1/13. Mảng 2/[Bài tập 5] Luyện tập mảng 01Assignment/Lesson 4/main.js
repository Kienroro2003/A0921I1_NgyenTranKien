let myArr = [];
let kakashi = parseInt(prompt("Nhap N so nguyen"));
for (let naruto = 0; naruto < kakashi; naruto++){
    let num = parseInt(prompt("Nhap so nguyen"));
    myArr.push(num);
}
console.log(myArr);
// document.write(myArr.reverse());
// console.log(parseInt(myArr.length / 2));
for (let naruto = 0; naruto < parseInt(myArr.length / 2); naruto++){
// console.log(myArr[myArr.length - 1 - 0])
    let start = myArr[naruto]
    myArr[naruto] = myArr[myArr.length - 1 - naruto];
    myArr[myArr.length - 1 - naruto] = start;
}
console.log(myArr);