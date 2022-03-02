function reverseNumber(value) {
    let strNumber = value.toString();
    const arrNumber = strNumber.split("");
    // console.log(arrNumber);
    let first = 0;
    let last = arrNumber.length - 1;
    while (first < last) {
        let temp = arrNumber[first];
        arrNumber[first] = arrNumber[last];
        arrNumber[last] = temp;
        first++;
        last--;
    }
    let number = parseInt(arrNumber.join(""));
    console.log(number);
}

reverseNumber(parseInt(prompt("Nhap chuoi so")));