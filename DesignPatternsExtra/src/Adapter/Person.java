package Adapter;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate bDay;
    private String email;
    private String telephone;

    public Person(String name, LocalDate bDay, String email, String telephone){
        this.name = name;
        this.bDay = bDay;
        this.email = email;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public LocalDate getbDay() {
        return bDay;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }
}
