let number1=document.getElementById("number1");
let number2=document.getElementById("number2");
let result;
function sum(){
    result=parseInt(number1.value)+parseInt(number2.value);
    document.getElementById("result").innerHTML="<b style='color:red'>Result: </b>"+result;
}
function difference(){
    result=parseInt(number1.value)-parseInt(number2.value);
    document.getElementById("result").innerHTML="<b style='color:red'>Result: </b>"+result;
}
function multiplication(){
    result=parseInt(number1.value)*parseInt(number2.value);
    document.getElementById("result").innerHTML="<b style='color:red'>Result: </b>"+result;
}
function division(){
    if(parseInt(number2)==0){
        result="Mẫu số phải khác 0";
    }else{

        result=parseInt(number1.value)/parseInt(number2.value);
    }
    document.getElementById("result").innerHTML="<b style='color:red'>Result: </b>"+result;
}