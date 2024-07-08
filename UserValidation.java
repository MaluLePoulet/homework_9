public class UserValidation {

    public static boolean validateUser(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login must be less than 20 characters and contain no spaces");
        }

        if (password.length() >= 20 || password.contains(" ") || !password.contains("1")) {
            throw new WrongPasswordException("Password must be less than 20 characters and contain no spaces and contain at least one '1'");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and Confirm Password must match");
        }

        return true;
    }
}
