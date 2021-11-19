let arr = [1, 2, 54, 321, -231, 45, 43];
console.log(arr);
let first = 0;
let last = arr.length - 1;
while (first < last) {
    let b = arr[first];
    arr[first] = arr[last];
    arr[last] = b;
    first++;
    last--;

}
console.log(arr)