package homework6;

public class User {
    String username;
    String password;
    String confirmPassword;
    boolean confirmCondition;


    public User(String username, String password, String confirmPassword) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public boolean validateUser() {
        if (username.length() > 7) {
            confirmCondition = true;
            System.out.println("The username \'" + this.username + "\' length is bigger than 7 characters");
        } else if (username.length() == 7) {
            confirmCondition = false;
            System.out.println("The username \'" + this.username + "\' length has 7 characters");
        } else {
            confirmCondition = false;
            System.out.println("The username \'" + this.username + "\' length is less than 7 characters");
        }
        return confirmCondition;
    }

    public boolean validatePassword() {
        int s = 0;
        if (this.password.length() >= 8) {
            for (int i = 0; i < this.password.length(); i++) {
                if (Character.isDigit(this.password.charAt(i))) {
                    s++;
                }
            }
            if (s >= 2) {
                if (this.password == this.confirmPassword) {
                    this.confirmCondition = true;
                    System.out.println("Password has " + s + " digits");
                    System.out.println("Password \'" + this.password + "\' length is bigger than 8, it has more than 2 digits and it is the same with the confirmed password \'" + this.confirmPassword + "\'");
                } else System.out.println("Password mismatch: \'" + this.password + "\' is not the same with \'" + this.confirmPassword + "\' !");
            } else System.out.println("less than 2 digits");

        }

        return this.confirmCondition;
    }


}
