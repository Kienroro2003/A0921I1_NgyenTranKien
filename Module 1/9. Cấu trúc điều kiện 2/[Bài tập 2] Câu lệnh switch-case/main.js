let month = document.getElementById("month").value;
function do_something(){
    let btn = month;
    // let message = document.getElementById("return").innerText;
    switch (parseInt(btn)){
        case 1:
            case 3:
                case 5:
                    case 7:
                        case 8:
                            case 10:
                                case 12:{
                                    message = document.getElementById("return").innerText = `Tháng ${month} có 31 ngày`;
                                    break;
                                }
                                case 4:
                                     case 6:
                                         case 9:
                                            case 11:{
                                                    message = document.getElementById("return").innerText = `Tháng ${month} có 30 ngày`
                                                    break;
                                                }
                                                default:{
                                                    message = document.getElementById("return").innerText = `Tháng ${month} có 28 ngày hoặc 29 ngày`
                                                    break;
                                                }
    }
}