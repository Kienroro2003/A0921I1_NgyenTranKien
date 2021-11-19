let naruto = 1;
let sasuke = 1;
let kakashi = 0;
let text ;
document.write("Tổng của 20 số đầu tiên trong dãy fibonacci bắt đầu từ 2 phần tử 1 và 1: ")
for (let i= 1; i<= 10; i++){
    sakura = naruto + sasuke;
    text = sakura;
    document.write(text);
    if(i< 10){
        document.write(" + ");
    }
    kakashi += sakura;
    // console.log(sakura);
    sasuke = naruto;
    naruto = sakura;
}
// console.log(kakashi)
document.write(" = "+kakashi)