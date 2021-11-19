function isPrime(number) {
    if (!number) return null;
    let result = `${number} la so nguyen to`;
    for (let i = 2; i < number; i++){
        if (number % i === 0) {
            result = `${number} khong phai la so nguyen to`;
            break;
        }
    }
    return result;
}
console.log(isPrime());//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97...