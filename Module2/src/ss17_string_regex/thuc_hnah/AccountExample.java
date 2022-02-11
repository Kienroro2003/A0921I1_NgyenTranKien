package ss17_string_regex.thuc_hnah;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    /**
     * Khong chua cac ki tu dac biet
     * Phai dai hon 6 ki tu
     * Khong chua cac ki tu viet hoa
     * Cho phep gach duoi (_)
     */

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
