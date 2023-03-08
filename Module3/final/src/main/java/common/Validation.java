package common;

public class Validation {
    public static boolean checkName(String name) {
        String regex = "^[a-zA-Z ]{3,45}$";
        return name.matches(regex);
    }

    public static boolean checkMaBenhAn(String str){
        String regex = "^BA-[0-9]{3}$";
        return str.matches(regex);
    }

    public static boolean checkMaBenhNhan(String str){
        String regex = "^BN-[0-9]{3}$";
        return str.matches(regex);
    }

}
