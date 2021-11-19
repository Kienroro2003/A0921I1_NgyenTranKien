function checkNumber(num) {
    message = "";
    if (num > 0) {
        message = "true";
    } else {
        message = "false";
    }
    return message;
}
console.log(checkNumber(parseInt(prompt("Nhap mot so nguyen bat ki de kiem tra"))));