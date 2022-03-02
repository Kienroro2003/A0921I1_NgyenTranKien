function do_something(){
    let randomNum = parseInt(Math.random()*10)
    // console.log(randomNum);
    let num = parseInt(prompt("Nhap vao gia tri trong khoang 0 -> 10"));
    while (num < 0 || num >10){
        num = parseInt(prompt("Nhap lai gia tri trong khoang 0 -> 10"));
    }
    // console.log(num);
    if(num === randomNum){
        alert(`${num} bang voi so cua may ${randomNum}`);
    }else if (num < randomNum){
        alert(`${num} nho hon ${randomNum}`);
    }else{
        alert(`${num} lon hon ${randomNum}`);
    }
}




