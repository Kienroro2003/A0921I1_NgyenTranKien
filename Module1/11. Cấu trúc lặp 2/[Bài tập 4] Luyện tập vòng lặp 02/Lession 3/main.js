let goku = parseInt(prompt("Nhap gia tri"));
for (let vegeta = 1 ; vegeta <= goku ; vegeta++){
    for(let chichi = 1 ; chichi <= vegeta ; chichi++){
        document.write("*");
    }
    document.write("<br>");
}
document.write("<br><br><br></br>")
for (let vegeta = 1 ; vegeta <= goku ; vegeta++){
    for(let chichi =  goku; chichi >= vegeta ; chichi--){
        document.write("*");
    }
    document.write("<br>");
}
document.write("<br><br><br></br>")
for (let vegeta = 1 ; vegeta <= goku ; vegeta++){
    for(let chichi =  goku; chichi > vegeta ; chichi--){
        document.write(`   &nbsp;`);
    }
    for(let bulma = 1 ; bulma <= vegeta ; bulma++){
        document.write("*");
    }
    document.write("<br>");
}
document.write("<br><br><br></br>")
for (let vegeta = 1 ; vegeta <= goku ; vegeta++){
    for(let bulma = 1 ; bulma < vegeta ; bulma++){
        document.write("	&nbsp;");
    }
    for(let chichi =  goku; chichi >= vegeta ; chichi--){
        document.write(`*`);
    }
    document.write("<br>");
}


