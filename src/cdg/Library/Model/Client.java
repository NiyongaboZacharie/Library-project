package cdg.Library.Model;
// Generated May 13, 2020 6:57:26 AM by Hibernate Tools 4.3.1



/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private Integer regNo;
     private String firstname;
     private String lastname;
     private int phoneNumber;
     private String photo;
     private String email;
     private String clientcategory;

    public Client() {
    }

    public Client(String firstname, String lastname, int phoneNumber, String photo, String email, String clientcategory) {
       this.firstname = firstname;
       this.lastname = lastname;
       this.phoneNumber = phoneNumber;
       this.photo = photo;
       this.email = email;
       this.clientcategory = clientcategory;
    }

    public Client(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public Integer getRegNo() {
        return this.regNo;
    }
    
    public void setRegNo(Integer regNo) {
        this.regNo = regNo;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getClientcategory() {
        return this.clientcategory;
    }
    
    public void setClientcategory(String clientcategory) {
        this.clientcategory = clientcategory;
    }




}

