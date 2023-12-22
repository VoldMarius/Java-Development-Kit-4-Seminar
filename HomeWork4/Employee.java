package HomeWork4;


public class Employee {
    private int IdentificationNumber;
    private String name;
    private String phoneNumbers;
    private int experience;

    public int getIdentificationNumber() {
        return IdentificationNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public int getExperience() {
        return experience;
    }

    public void setIdentificationNumber(int identificationNumber) {
        IdentificationNumber = identificationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
