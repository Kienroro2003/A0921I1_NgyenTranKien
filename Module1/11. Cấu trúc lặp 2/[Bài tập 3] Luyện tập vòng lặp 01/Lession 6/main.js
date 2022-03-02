let i = 1;
let total = 0;
for (; i <= 7*30; i++){
    if(i % 7 == 0){
        console.log(i);
        // total = 0;
        total += i;
    }
}
console.log(total); 
