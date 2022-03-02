function checkNumber(value) {
    let message = "";
    if (typeof value == "number") {
        message = "true";
    } else {
        message = "false";
    }
    console.log(message);
}
checkNumber();