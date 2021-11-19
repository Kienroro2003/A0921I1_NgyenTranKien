let arr = [];
let reset = 0;
let title = parseInt(prompt("Nhap vao N phan tu"));
for (let i = 1; i <= title; i++){
    let sasuke = parseInt(prompt("Nhap so nguyen bat ki"));
    arr.push(sasuke);
}
console.log(arr);
document.write(`Nhung so lon hon bang 10 la `)
for (let i = 0; i < arr.length; i++){
    if (arr[i] >= 10) {
        document.write(` ${arr[i]} `);
        reset++;
    }
}
document.write("<br>");
document.write(`Co bao nhieu chu so nguyen lon hon bang 10 la ${reset}`);