const myNum = [1, 2, 34, 42, 23, 31, 541];
const supMyNum = myNum.sort(function (a, b) {
    console.log(a, b);
    if (a > b) {
        // console.log(a, b);
        return 1;// sắp xếp giảm dần //thay dổi vị trí
    } else {
        // console.log(a, b);
        return -1;// sắp xếp tăng dần // giữ nguyên vị trí
    }
});
console.log(supMyNum);