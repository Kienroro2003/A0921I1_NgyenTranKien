let fibo = (x:number):number =>{
    if (x == 0 || x == 1)return 1;
    return fibo(x - 1) + fibo(x - 2);
}

let count:number = 5;

let total: number = 0;

for(let i:number =0; i < count; i++){
    console.log(fibo(i));
    if(i < count - 1){
        console.log(" + ");
    }
    total += fibo(i);
}
console.log(" = ");
console.log(total);
