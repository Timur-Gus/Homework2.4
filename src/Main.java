import myexceptions.WrongLoginException;
import myexceptions.WrongPasswordException;

public class Main {
    public static final String VALID_CHARACTERS = "^[a-zA-Z0-9_]*$";

    public static void main(String[] args) {

        try {
            registrationCheck("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }

    }

    public static void registrationCheck(String login, String password, String confirmPassword) {
        if (!login.matches(VALID_CHARACTERS)) {
            throw new WrongLoginException("Вы ввели некорректный символ");
        }
        if (login.length() > 20) {
            throw new WrongLoginException("Логин больше 20 символов");
        }
        if (!password.matches(VALID_CHARACTERS)) {
            throw new WrongPasswordException("Вы ввели некорректный символ");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль больше 20 символов");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароли не совподают");
        }
    }
}