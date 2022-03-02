let inputPhysics = prompt("Nhập điểm vật lí");
let inputChemistry = prompt("Nhập điểm môn hóa học");
let inputBiological = prompt("Nhập điểm môn sinh học");
let physics = parseFloat(inputPhysics);
let chemistry = parseFloat(inputChemistry);
let biological = parseFloat(inputBiological);
let area = (physics + chemistry + biological) / 3;
document.write("Điểm trung bình 3 môn là =" + area);