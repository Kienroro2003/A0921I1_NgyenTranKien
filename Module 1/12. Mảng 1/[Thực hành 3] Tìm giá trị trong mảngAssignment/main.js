let naruto = new Array(1, 3, 54, 32, -32, 44);
let sasuke = parseInt(prompt("Nhap so bat ki"));
for (let boruto = 0; boruto < naruto.length - 1; boruto++){
    if (sasuke == naruto[boruto]) {
        alert(`So ${sasuke} nam o vi tri ${boruto}` )
    }
}