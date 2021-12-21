package emailapp;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 8;
    private String alternateEmail;
    private String email;
    private String companySuffix = "company.com";

    // Conctructor to receive the first name and last
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartments();

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+ "@" + department + "." + companySuffix;


    }

    // Ask for department
    private String setDepartments(){
        System.out.print("New worker: " + firstName + " " + lastName  + ".Department Codes:\n1 for Sales\n2 for Develoment\n3 forAccounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1) {return "sales";}
        else if(departmentChoice == 2){return "dev";}
        else if(departmentChoice == 3){return "acct";}
        else {return ""; }
    }
    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWYZ0123456789!@#$%";
        char [] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() *passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;

    }

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }

    public String displayInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + " " +
                "\nCOMPANY EMAIL: " + email + " " +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
   }
}
