
public class User {

    private String login;
    private String password;

    public User (String login, String password){
        try {
            setLogin(login);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        setPassword(password);
    }
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        if (login.length() > 6 )
            this.login = login;
        else
            throw new IllegalArgumentException("Za krotkie haslo");
        return password;
    }

    public void setLogin(String login) {
        if (login.length() > 6 && !hasDigits(login))
            this.login = login;
        else
            throw new IllegalArgumentException("Za krotki login lub cyfry w srodku");
    }

    private boolean hasDigits(String string) {
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i]))
                return true;
        }
        return false;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
