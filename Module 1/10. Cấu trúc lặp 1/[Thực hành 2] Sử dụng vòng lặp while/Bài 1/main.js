let num = parseInt(prompt("Nhập một số bất kì > = 0"));
let retuln = document.getElementById("demo");
let total = 0;
while (num != -1){
    retuln.innerHTML += num;
    retuln.innerHTML += " + ";
    total += num
    num = parseInt(prompt("Nhap so tiep theo. Nhap '-1'de dung ct"));
}

retuln.innerHTML += `= ${total}`;