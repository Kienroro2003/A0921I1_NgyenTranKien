let inputRadius;
inputRadius = prompt("Nhập bán kính hình tròn để tính điện tích(cm)");
let radius = parseFloat(inputRadius);
const pi = 3.14;
let area = Math.pow(radius, 2) * pi;
document.write("Kết quả điện tích hình tròn là " + area);