// let numberA: number = 5;
// if(numberA < 8){
//     let numberB: number = 6;
//     console.log(numberB);
// }
// if(numberA < 10){
//     let numberC: number = 10;
//     // console.log(numberC);
// }
// console.log(numberA);
// numberA = 5;
// console.log(numberA);
// var numberA;
//enum
var City;
(function (City) {
    City["HaNoi"] = "Hello";
    City["HoChiMinh"] = "bye";
    City[City["DaNang"] = 12] = "DaNang";
})(City || (City = {}));
;
var city = City.HoChiMinh;
console.log(city);
