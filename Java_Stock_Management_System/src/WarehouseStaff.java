package sumit;

import javax.swing.JOptionPane;

//child class of User implements UserEditor interface
public class WarehouseStaff extends User {

    public WarehouseStaff(String userName, String userPassword) {

        super(userName, userPassword);

    }

    // abstract method from User declared here
    public String getOptionList() {
        String list = "\nMenu\n\n2. View/Update Stock\n5. Change Username\n6. Change Password\n\n8.Log Out";
        return list;
    }

    // abstract method from UserEditor interface declared here
    public void changeUsername() throws Exception {
        String name = "";

        name = JOptionPane.showInputDialog("Enter New Username");

        if (name.trim().equals("")) {
            // if the string is empty exception is thrown which will be caught in StockManagementSystem CLass
            throw new InvalidEntryExcepion("Username can not be empty");

        } else {

            this.userName = name;

        }
    }

    // abstract method from UserEditor interface declared here
    public void changePassword() throws Exception {
        String password = "";

        password = JOptionPane.showInputDialog("Enter New Password");

        if (password.trim().equals("")) {
            // if the string is empty exception is thrown which will be caught in StockManagementSystem CLass
            throw new InvalidEntryExcepion("Password can not be empty");

        } else {

            this.userPassword = password;

        }
    }
}
