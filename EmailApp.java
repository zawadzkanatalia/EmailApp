package emailapp;

public class EmailApp {

    public static void main(String[] args){
        PersonalData pd = new PersonalData();
        Email em1 = new Email(pd.getName(), pd.getSurname());
        System.out.println(em1.displayInfo());
    }
}
