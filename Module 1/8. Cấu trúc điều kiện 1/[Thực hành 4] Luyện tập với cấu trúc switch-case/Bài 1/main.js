let brower = prompt("Sup","");
// if (brower == "Edge"){
//     alert("You've got the Edge");
// }else if (brower == "Chrome"||brower == "Firefox"||brower == "Safari"||brower == "Opera"){
//     alert("Okey we support these browsers too");
// }else{
//     alert("We hope that this page looks ok!");
// }

switch (brower){
    case "Edge":{
        alert("You've got the Edge");
        break;
    }
    case "Chrome":
    case "Firefox":
    case "Safari":
    case "Opera":{
        alert("Okey we suppert these browsers too");
        break;
    }
    default:{
        alert("We hope that this page looks ok!");
    }
}