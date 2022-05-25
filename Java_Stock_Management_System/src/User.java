package sumit;

//abstract parent class
//child classes are Manager and WarehouseStaff
abstract public class User implements UserEditor {

    // used to store User name
    protected String userName;
    // used to store User's password
    protected String userPassword;

    public User() {

    }

    // constructor of User class
    public User(String userName, String userPassword) {
        // values from arguments are store in above declares strings
        this.userName = userName;
        this.userPassword = userPassword;
    }

    //abstract method is declared inside child classes
    abstract public String getOptionList();

    public String getuserName() {
        return this.userName;
    }

    public String getuserPassword() {
        return this.userPassword;
    }

}
