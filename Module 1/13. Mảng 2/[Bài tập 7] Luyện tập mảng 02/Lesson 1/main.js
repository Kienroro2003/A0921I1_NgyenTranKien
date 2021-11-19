let a = [
    [1, 2, 1, 24],
    [8, 11, 9, 4],
    [7, 0, 7, 27],
    [7, 4, 28, 14],
    [3, 10, 26, 7]
];
// console.log(a.length);
for (let i = 0; i < a.length; i++){
    console.log(`Row ${i}`);
    for (let j in a[i]) {
        console.log(a[i][j]);
    }
}