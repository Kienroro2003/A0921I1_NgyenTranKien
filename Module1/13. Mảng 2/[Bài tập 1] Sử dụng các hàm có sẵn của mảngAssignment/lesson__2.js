let num = prompt("Nhap so tu nhien bat ki");
let arrNum = [num[0]];
// console.log(num.length);
// console.log(typeof evenNum);
console.log(arrNum);
for (let x = 1; x < num.length ; x++) {
    if (num[x - 1] % 2 === 0 && num[x] % 2 === 0) {
        arrNum.push("-", num[x]);
    }
    else {
        arrNum.push(num[x]);
    }
}
// arrNum.join("");
console.log(arrNum.join(""));
