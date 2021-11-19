let weight = parseInt(prompt("Nhập vào cân nặng của bạn"));
let height = parseInt(prompt("Nhập vào chiêu cao của bạn"));
let bmi = weight / Math.pow(height, 2);
// console.log(bmi);
if (bmi < 18.5) {
  alert("Underweight");
} else if (bmi < 25) {
  alert("Normal");
} else if (bmi < 30) {
  alert("Overweight");
} else {
  alert("Obese");
}


