package Adapter;

import java.time.LocalDate;
import java.util.Date;

public class Client implements PersonalInformation{

    private Person person;

    public Client(Person person){
        this.person = person;
    }

    @Override
    public String getPersonalInformation() {
        return "{\n" +
                "\"name\": " + person.getName() + ",\n" +
                "\"bDay\": " + person.getbDay() + ",\n" +
                "\"email\": " + person.getEmail() + ",\n" +
                "\"telephone\": " + person.getTelephone() + "\n" +
                "}";
    }

    public static void main(String[] args) {
        Person person = new Person("John Doe",
                 LocalDate.now(),
                "john.doe@gmail.com",
                "123456789");

       Adapter jsonAdapter = new Adapter(new PersonalData(person));

       System.out.println(jsonAdapter.getPersonalInformation());
    }

}
