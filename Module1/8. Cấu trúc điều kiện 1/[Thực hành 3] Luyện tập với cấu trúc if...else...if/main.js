let userName = prompt("Who'a there?","");
if (userName == "Admin"){
    let passWord = prompt("Password?","") ;
    if (passWord == "theMaster"){
            alert("Welcome");
    }else if(passWord == undefined ){
        alert("Canceled");
    }else{
        alert("I don't know you");
    }
}else if (userName == undefined){
    alert("Canceled");
}else{
    alert("I don't know you");
}