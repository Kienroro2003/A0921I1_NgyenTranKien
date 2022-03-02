let myName = ["k", "i", "e", "n", "r", "o", "r", "o", 2, 0, 0, 3];
let first = 0;
let last = myName.length;
while (first < last) {
    let reset = myName[first];
    myName[first] = myName[last];
    myName[last] = reset;
    first++;
    last--;
}
console.log(myName.join(""));