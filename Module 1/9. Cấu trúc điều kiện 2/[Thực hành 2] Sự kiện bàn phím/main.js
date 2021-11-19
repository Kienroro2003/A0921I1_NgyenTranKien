let element = document.getElementById('nobita');
function upArrowPressed(){
    // let element = document.getElementById('nobita');
    element.style.top=parseInt(element.style.top) - 5 + 'px';
}
function downArrowPressed(){
    // let element = document.getElementById('nobita');
    element.style.top=parseInt(element.style.top) + 5 + 'px';
}
function leftArrowPressed(){
    // let element = document.getElementById('nobita');
    element.style.left=parseInt(element.style.left) - 5 + 'px';
}
function rightArrowPressed(){
    // alert(element.style.left);
    element.style.left=parseInt(element.style.left) + 5 + 'px';
}

function demo(evt){
    console.log(evt.keyCode);
}
function moveSelection(evt){
    switch (evt.keyCode){
        case 37:{
            leftArrowPressed();
            break;
        }
        case 39:{
            rightArrowPressed();
            break;
        }
        case 38:{
            upArrowPressed();
            break;
        }
        case 40:{
            downArrowPressed();
            break;
        }

    }
}

function docReady() {
    window.addEventListener('keydown',moveSelection);
}