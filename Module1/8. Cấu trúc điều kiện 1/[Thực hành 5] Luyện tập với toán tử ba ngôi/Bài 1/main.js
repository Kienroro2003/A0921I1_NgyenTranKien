let a = parseInt(prompt("Nhập số a:"));
let b = parseInt(prompt("Nhập số b:"));
/*
* Cách 1:
* */
// let result;
// if ((parseInt(a) + parseInt(b)) < 4){
//     result = "Below";
// }else{
//     result = "Over";
// }
// alert(result);
/*
* Cách 2:
* */
result = (a + b < 4) ? 'Below' : 'Over';
alert(result);

