import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        String password = generatePassword(15); // input length of password
        System.out.println("Your new password: " + password);
    }

    public static String generatePassword(int length) {
        if (length < 10 || length > 20) {
        throw new IllegalArgumentException("Invalid parameters");
    }

        SecureRandom random = new SecureRandom(); // password's generation
        StringBuilder password = new StringBuilder(); // password's assemble

        while (password.length() < length) {
            char nextChar = generateRandomChar();
            password.append(nextChar);
        }
        return password.toString();
    }

    private static char generateRandomChar() {
        SecureRandom random = new SecureRandom();
        String validChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-+_-";
        return validChar.charAt(random.nextInt(validChar.length()));
    }
}