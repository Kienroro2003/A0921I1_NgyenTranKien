let saitama = parseInt(prompt("Nhập 1 giá trị lớn hơn 0 để tính giai thừa"));
let total = 1;
while(saitama < 0){
    saitama = parseInt(prompt("Nhập lại giá trị lớn hơn 0"));
}
document.write(`Giá trị giai thừa của ${saitama} <br>`);
for (; saitama > 0 ; saitama--){
    total *= saitama;
    document.write(`${saitama}`)
    if (saitama > 1){
        document.write(" * ");
    }
}
document.write(" = " + total);