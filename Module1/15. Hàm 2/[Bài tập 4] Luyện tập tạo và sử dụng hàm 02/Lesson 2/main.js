function radius(number) {
    if(!number) return null;
    let C = number * 2 * Math.PI;
    let S = number * number * Math.PI;
    alert(`Chu vi là ${C.toFixed(2)}`);
    alert(`Diện tích là ${S.toFixed(2)}`);
}

radius(parseInt(prompt(`Nhap ban kinh`)));