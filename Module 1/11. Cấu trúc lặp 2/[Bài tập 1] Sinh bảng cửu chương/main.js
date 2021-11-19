document.write(`<table border = ${1} >`)
for (let optimus = 1; optimus <= 9 ; optimus++){
    document.write(`<tr>`);
    for(let bomblebee = 1; bomblebee <= 9; bomblebee++){
        document.write("<td width="+100+"px>");
        document.write(optimus + " * " + bomblebee + " = " + optimus*bomblebee);
        document.write("</td>");
    }
}
document.write(`</table>`);
