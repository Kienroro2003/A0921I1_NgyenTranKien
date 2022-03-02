let num = -1;
let sum = 0;
let add = document.getElementById("retuln");
while (num < 0){
    num = parseInt(prompt("Nhập 1 số bất kì lớn hơn 0"));
}
for(let i = 1; i <= num; i++){
    sum += i;
    add.innerHTML += i ;
    if(i == num){
        break;
    }
    add.innerHTML += " + ";
}
    add.innerHTML += `= ${sum}`;
