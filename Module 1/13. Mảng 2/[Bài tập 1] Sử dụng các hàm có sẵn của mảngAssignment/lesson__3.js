let UPPER = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
let LOWER = 'abcdefghijklmnopqrstuvwxyz';
let myStr = prompt("Nhap 1 String");
let result = [];
for (let i = 0; i < myStr.length; i++){
    if (UPPER.indexOf(myStr[i] ) === -1) {
        result.push(myStr[i].toUpperCase());
    } else if (LOWER.indexOf(myStr[i]) === -1) {
        result.push(myStr[i].toLowerCase())
    } else {
        result.push(myStr[i]);
    }
}
console.log(result.join(""));