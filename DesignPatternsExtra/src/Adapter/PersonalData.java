package Adapter;

import java.time.LocalDate;

public class PersonalData implements PersonalDataI{

    private Person person;

    public PersonalData(Person person){
        this.person = person;
    }

    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public LocalDate getBDay() {
        return person.getbDay();
    }

    @Override
    public String getEmail() {
        return person.getEmail();
    }

    @Override
    public String getTelephone() {
        return person.getTelephone();
    }
}
