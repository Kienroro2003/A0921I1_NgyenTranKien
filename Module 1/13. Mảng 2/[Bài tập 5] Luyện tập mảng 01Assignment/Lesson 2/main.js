let myArr = [];

let indexNum = 0;
for (let naruto = 0; naruto < 10; naruto++) {
  let myNum = parseInt(prompt("Nhap so bat ki"));
  myArr.push(myNum);
  // if (max < myArr[naruto]) {
  //     max = myArr[naruto];
  //     indexNum = naruto;
  // }
}
let max = myArr[0];
for (let naruto = 0; naruto < myArr.length; naruto++){
    if (max < myArr[naruto]) {
        max = myArr[naruto];
        indexNum = naruto;
    }
}
// console.log(max);
// console.log(myArr);
// console.log(`${max} ${indexNum}`);
document.write(`So lon nhat la ${max} vi tri la ${indexNum}`);
