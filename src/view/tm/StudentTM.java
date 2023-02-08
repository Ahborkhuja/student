package view.tm;

import javafx.scene.control.Button;

public class StudentTM {
    private String id;
    private String name;
    private String address;
    private String email;
    private String nic;
    private String birthDay;
    private String gender;
    private String mobile;
    private String date;
    private Button update;
    private Button delete;

    public StudentTM() {
    }

    public StudentTM(String id, String name, String address, String mobile, String date) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.date = date;
    }

    public StudentTM(String id, String name, String address, String mobile, Button update, Button delete) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.update = update;
        this.delete = delete;
    }

    public StudentTM(String id, String name, String address, String email, String nic, String birthDay, String gender, String mobile, Button update, Button delete) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.nic = nic;
        this.birthDay = birthDay;
        this.gender = gender;
        this.mobile = mobile;
        this.update = update;
        this.delete = delete;
    }

    public StudentTM(String id, String name, String address, String mobile) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Button getUpdate() {
        return update;
    }

    public void setUpdate(Button update) {
        this.update = update;
    }

    public Button getDelete() {
        return delete;
    }

    public void setDelete(Button delete) {
        this.delete = delete;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
