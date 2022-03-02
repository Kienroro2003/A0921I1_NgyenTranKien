// function click() {
//   let text = document.getElementById("supText").value;
//   console.log(text);
//   let arr1 = ["hello", "goodbye", "good morning"];
//   let arr2 = ["xin chào", "tạm biệt", "chào buổi sáng"];
//   let result = document.getElementById("demo");
//   for (let x = 0; x < arr1.length; x++) {
//     if (text == arr1[x]) {
//         result.innerHTML = arr2[x];
//         break;
//     } else {
//       result.innerHTML = "khong tim thay";
//     }
//   }
// }

let arr1 = ["hello", "goodbye", "good morning"];
let arr2 = ["xin chào", "tạm biệt", "chào buổi sáng"];
let myStr = "hedfsfsllo";
let result = "";
for (let x = 0; x < arr1.length; x++){
    if (myStr == arr1[x]) {
        result = arr2[x]
        break;
    } else {
        result = "khong thay";
    }
}
console.log(result);