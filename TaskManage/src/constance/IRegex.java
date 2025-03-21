package constance;

public interface IRegex {
    String VALID_CODE = "^[a-zA-Z0-9]+$";
    String REGULAR_STRING = "^[a-zA-Z\\s]+$";
    String VALID_EMAIL = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9.-]+$";
    String VALID_PHONE_NUMBER = "^0[0-9]{9}$";
    String UP_DOWN = "^(?i)(up|down)$";
    String VALID_DATE =  "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$";
    String REGEX_DATE
            = "(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|"
            + "(?:(?:29|30)(\\/|-\\.)"
            + "(?:0[1,3-9]|1[0-2])\\2))"
            + "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$"
            + "|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)"
            + "?(?:0[48]|[2468][048][13579][26])|"
            + "(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]"
            + "|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])"
            + "|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
}
