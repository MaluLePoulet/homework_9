public class Main {

    public static void main(String[] args) {

        try {
            String login = "Login";
            String password = "Password1";
            String confirmPassword = "Password";

            boolean isValid = UserValidation.validateUser(login, password, confirmPassword);
            System.out.println("Validation result: " + isValid);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}
