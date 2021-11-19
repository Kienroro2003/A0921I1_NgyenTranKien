let naruto = parseInt(prompt("Nhập phần tử đầu tiên"));
let sasuke = parseInt(prompt("Nhập phần tử thứ hai"));
document.write(`Hai phần tử bắt đầu là ${naruto} va ${sasuke} <br>` )
for(let minato = 1 ; minato <= 20 ; minato ++){
    document.write(naruto);
    if (minato <= 20){
        document.write(" + ");
    }
    document.write(sasuke);
    let kakashi = naruto + sasuke;
    document.write(" = " + kakashi + "<br>");
    console.log(kakashi);
    naruto = sasuke;
    sasuke = kakashi;
}