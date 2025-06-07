package LoginApp.login;

public class Auth {
    private String usernameDB = "admin";
    private String passwordDB = "12345";

    public void login(String username, String password)
            throws UserNotFoundException, WrongPasswordException {

        if (!username.equals(usernameDB)) {
            throw new UserNotFoundException("Username tidak ditemukan!");
        }

        if (!password.equals(passwordDB)) {
            throw new WrongPasswordException("Password salah!");
        }

        System.out.println("Login berhasil! Selamat datang, " + username);
    }
}
