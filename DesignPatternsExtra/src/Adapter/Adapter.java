package Adapter;

public class Adapter implements PersonalInformation {
    private PersonalDataI personalData;

    public Adapter(PersonalDataI personalData) {
        this.personalData = personalData;
    }

    @Override
    public String getPersonalInformation() {
        return "{\n" +
                "\"name\": " + personalData.getName() + ",\n" +
                "\"bDay\": " + personalData.getBDay() + ",\n" +
                "\"email\": " + personalData.getEmail() + ",\n" +
                "telephone: " + personalData.getTelephone() + "\n" +
                "}";
    }
}
