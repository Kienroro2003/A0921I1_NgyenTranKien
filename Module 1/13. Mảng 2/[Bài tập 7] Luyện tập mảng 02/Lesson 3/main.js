let checkNum = [1, 2, "hello", 43, "kienroro", "bye", 43];
let result = 0;
for (let i = 0; i < checkNum.length; i++){
    if (typeof checkNum[i] == "number") {
        result++
    }
}
console.log(`Co cac so trong mang la ${result}`);
