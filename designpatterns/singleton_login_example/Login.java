public class Login {
    private static Login login;
    private Login() { login = null; }

    public static synchronized Login getInstance() {
        if(login == null ){
            login = new Login();
        }

        return login;
    }
}