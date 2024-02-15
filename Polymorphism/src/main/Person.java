package main;

public class Person {
    
    private String name, address, gender, civilStatus, bloodType, religion;
    private int age;

    public Person() {
    }

    public Person(String name, String address, String gender, int age, String civilStatus, String religion, String bloodType) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.civilStatus = civilStatus;
        this.religion = religion;
        this.bloodType = bloodType;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String displayData(){
        return "Name: " + getName() 
                + "\nAddress: " + getAddress()
                + "\nGender: "  + getGender()
                + "\nAge: "     + getAge()
                + "\nCivil Status: "    + getCivilStatus()
                + "\nReligion: "        + getReligion()
                + "\nBlood Type: "      + getBloodType();
    }
    
    public void eat(){
        System.out.println("Person is eating food.");
    }
    
    public void sleep(int hours){
        System.out.println("The person is sleeping " + hours + " hours.");
    }
}
