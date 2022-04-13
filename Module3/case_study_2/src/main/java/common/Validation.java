package common;

public class Validation {
    public static boolean checkName(String name) {
        String regex = "^[a-zA-Z ]{3,45}$";
        return name.matches(regex);
    }

    public static boolean checkPhone(String phone) {
        String regex = "^09[01][0-9]{7}|\\(84\\)\\+9[01][0-9]{7}$";
        return phone.matches(regex);
    }

    public static boolean positiveNumbers(String strNumber) {
        String regex = "^\\d*(\\.\\d+)?$";
        return strNumber.matches(regex);
    }

    public static boolean checkIdCard(String idCard) {
        String regex = "^[0-9]{9}|[0-9]{12}$";
        return idCard.matches(regex);
    }

    public static boolean checkEmail(String email) {
        String regex = "^.{1,}@gmail.com$";
        return email.matches(regex);
    }
}
