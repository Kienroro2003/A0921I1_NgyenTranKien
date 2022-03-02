function conpare(number1, number2) {
    if (number1 > number2) {
        alert(`${number1} lớn hơn ${number2}`)
    } else {
        let result = number1 + number2;
        alert(`${result} là tổng của hai số ${number1} ${number2}`);
    }
}
conpare(parseInt(prompt("Nhap gia tri so thu nhat")), parseInt(prompt("Nhap gia tri so thu nhat")));