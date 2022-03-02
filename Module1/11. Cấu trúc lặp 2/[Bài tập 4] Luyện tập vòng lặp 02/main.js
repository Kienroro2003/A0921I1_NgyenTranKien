// Tạo một mảng ví dụ
let mangViDu = [10, 0, 1, 2, 3, 30, 20];

// Sắp xếp mảng theo thứ tự tăng dần
// với phương thức sort()
// mangViDu.sort();

// In ra kết quả
console.log(mangViDu.sort());
// let sortNum = mangViDu.sort((a, b) => (a > b ? 1 : -1));
// console.log(sortNum);
let sortNum2 = mangViDu.sort((a, b) => (a - b));
console.log(sortNum2);