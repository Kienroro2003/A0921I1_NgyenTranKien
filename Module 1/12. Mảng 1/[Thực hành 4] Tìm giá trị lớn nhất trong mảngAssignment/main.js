let numbers = [100,-3, 5, 1, 3, 2, 10];
let index = 0;
let max = numbers[0];
for (let star = 1; star < numbers.length; star++){
    if (max < numbers[star]) {
        max = numbers[star];
        index = star;
    }
}
console.log(`So lon nhat la ${max} o vi tri ${index}`);