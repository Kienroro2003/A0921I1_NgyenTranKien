let star = ["Polaris", "Aldebaran", "Deneb", "Vega", "Altair", "Dubhe", "Regulus"];
let constellation = ["Ursa Minor", "Tarurus", "Cygnus", "Lyra", "Aquila", " Ursa Major", "Leo"];
function checkStar(a) {
    let message = "";
    console.log(a);
    for (let i = 0; i < star.length; i++){
        console.log(star[i]);
        if (a == star[i]) {
            message = constellation[i];
            break;
        } else {
            message = "Khong tim thay";
        }
    }
    alert(message);
}
checkStar(prompt("Nhap ten ngoi sao"));