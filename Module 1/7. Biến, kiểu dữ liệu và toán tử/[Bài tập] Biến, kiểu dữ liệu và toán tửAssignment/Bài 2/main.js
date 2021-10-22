let inputCelsius;
inputCelsius = prompt("Nhập độ C vào");
let celsius = parseFloat(inputCelsius);
let area = (celsius * 9) / 5 + 32;
document.write("Độ F là : " + parseFloat(area));