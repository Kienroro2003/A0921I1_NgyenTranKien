let asuma = 100;
let shikamaru;
let choji = 1;
for(;choji <= asuma; choji++ ){
    shikamaru = choji;
    if(choji % 3 == 0){
        shikamaru = "Fizz";
    }
    if(choji % 5 == 0){
        shikamaru = "Buzz";
    }
    if(choji % 3 == 0 && choji % 5 == 0){
        shikamaru = "FizzBuzz";
    }
    // console.log(shikamaru);
    document.write(`${shikamaru} <br>`);
}