function inpArr() {
    let arrNumber = parseInt(prompt("Nhap so luong mang"));
    let arrNum = [];
    for (let i = 1; i <= arrNumber; i++){
        let themArr = parseInt(prompt(`Nhap lan thu ${i}`));
        arrNum.push(themArr);
    }
    console.log(arrNum);
    return arrNum;
}
// console.log(inpArr());

function checkAppearNumber(arrValue, value) {
    let count = 0;
    for (let i = 0; i < arrValue.length; i++){
        if (value == arrValue[i]) {
            count++;
        };
        // if (value != arrValue[i]) return -1;
    }
    if (count === 0) return -1;
    return count;
}

console.log(checkAppearNumber(inpArr(), parseInt(prompt("Nhập số muốn kiểm tra"))));