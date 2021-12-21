package emailapp;

import java.util.Scanner;

public class PersonalData {
    private String name;
    private String surname;

    public String getName(){
        System.out.println("First name: ");
        Scanner in = new Scanner(System.in);
        name = in.next();
        return name;
    }

    public String getSurname(){
        System.out.println("Last name: ");
        Scanner in = new Scanner(System.in);
        surname = in.next();
        return surname;
    }
}
