public class Calculator {
    static public float calculator(float first, float last, char operator) {
        switch (operator) {
            case '+': {
                return first + last;
            }
            case '-':{
                return first - last;
            }
            case '*':{
                return first * last;
            }
            case '/':{
                if(last != 0){
                    return first / last;
                }else{
                    throw new RuntimeException("Can't divide by zero");
                }
            }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
