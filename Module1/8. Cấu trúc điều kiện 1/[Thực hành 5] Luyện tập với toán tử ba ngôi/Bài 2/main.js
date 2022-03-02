/*
* Cách 1
* */

// let message;
// let login = prompt("String");
// if (login == "Employee"){
//     message = "Hello";
// }else if (login == "Director") {
//     message = "Greetings";
// }else if (login == ""){
//     message = "No login";
// }else {
//     message = "";
// }
// alert(message);

/*
* Cách 2
* */

let login = prompt("String");
let message = (login == "Employee") ? "Hello" : (login == "Director") ? "Greetings" : (login == "") ? "No login" : "";
alert(message);