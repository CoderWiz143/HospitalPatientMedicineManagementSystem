/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thinkpad
 */
public class patient {
    private int ID, age;
    private String Name, gender, address, contact;
    
    public patient() {
        this.ID = 0;
        this.age = 0;
        this.Name = "";
        this.gender = "";
        this.address = "";
        this.contact = "";
    }

    public patient(int ID, int age, String Name, String gender, String address, String contact) {
        this.ID = ID;
        this.age = age;
        this.Name = Name;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "patient{" + "ID=" + ID + ", age=" + age + ", Name=" + Name + ", gender=" + gender + ", address=" + address + ", contact=" + contact + '}';
    }
    
    
    
    
    
}
