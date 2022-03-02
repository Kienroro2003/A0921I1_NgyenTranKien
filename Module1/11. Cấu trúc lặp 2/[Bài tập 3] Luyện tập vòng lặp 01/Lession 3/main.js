let startNum = 1;
let endNum = 1;
for(let num = 1 ; num <= 20 ; num++){
    let total = startNum + endNum;
    document.write(`${startNum} + ${endNum} = ${total} `)
    document.write("<br>");
    startNum = endNum;
    endNum = total;
    // console.log(total);

}


/**
 * 1 + 1 =2;
 * 1 + 2 =3;
 * 2 + 3 =5;
 * ...
 */