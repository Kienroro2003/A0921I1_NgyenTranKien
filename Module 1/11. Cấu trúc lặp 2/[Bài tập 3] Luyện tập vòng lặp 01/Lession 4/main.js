let optimus = 10;
let bomblebee = 9;
let character;
for(let i = 1 ; i>0;){
    character = optimus + bomblebee;
    bomblebee = optimus;
    optimus = character;
    if ( character % 5 == 0){
        break;
    }
}
document.write(`Số đầu tiên trong dãy fibonacci là ${character}`)