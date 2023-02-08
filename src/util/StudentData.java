package util;

public class StudentData {
    private String FirstName;
    private String SecondName;
    private String FamilyName;
    private String Email;
    private String Department;
    private String Year;
    private String PhoneNumber;
    private String Address;

    public StudentData(String firstName, String secondName, String familyName, String email, String department, String year, String phoneNumber, String address) {
        this.FirstName = firstName;
        this.SecondName = secondName;
        this.FamilyName = familyName;
        this.Email = email;
        this.Department = department;
        this.Year = year;
        this.PhoneNumber = phoneNumber;
        this.Address = address;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public String getEmail() {
        return Email;
    }

    public String getDepartment() {
        return Department;
    }

    public String getYear() {
        return Year;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public String getAddress() {
        return Address;
    }
}
