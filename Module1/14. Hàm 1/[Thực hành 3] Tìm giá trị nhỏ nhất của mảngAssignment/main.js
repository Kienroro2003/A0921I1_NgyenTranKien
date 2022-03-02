function minArray(arr) {
    if (arr.length === 0) return -1;
    let min = arr[0];
    for (let i = 0; i < arr.length; i++) {
        if (min > arr[i]) {
            min = arr[i];
        }
    }
    return min;
}

let arr2= [7, 12, 6, 9, 20, 56, 89]

let arr3= []

let arr4= [0, 0, 0, 0, 0, 0];
console.log(minArray(arr2));
console.log(minArray(arr3));
console.log(minArray(arr4));