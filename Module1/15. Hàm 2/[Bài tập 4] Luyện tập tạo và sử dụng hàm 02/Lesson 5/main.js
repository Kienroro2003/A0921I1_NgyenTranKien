function minNumber(value1 = 0, value2 = 0, value3 =0) {
    let min = value1;
    if (value2 < value1) {
        if (value3 < value2) {
            min = value3;
        } else {
            min = value2;
        }
    } else if(value3 < value1){
        min = value3
    }
    return min;
}
console.log(minNumber(100, 200, 300));