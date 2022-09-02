package com.i2i.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Class is used to define the Employee data type 
 *
 */
@MappedSuperclass
public class Employee {

    @Column(name = "name")
    private String name;

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "mobilenumber")
    private long mobileNumber;

    @Column(name = "mail")
    private String mail;

    @Column(name = "birthdate")
    private LocalDate dateOfBirth;

    @Column(name = "joiningdate")
    private LocalDate dateOfJoin;

    @Column(name = "aadharnumber")
    private long aadharNumber;

    @Column(name = "pannumber")
    private String panNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "isDeleted")
    private boolean isDeleted;

    @Column(name = "role")
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getIsDeleted() {
	return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
	this.isDeleted = isDeleted;
    }

    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }

    public long getMobileNumber() {
        return mobileNumber;
    } 
    public String getPanNumber() {
        return panNumber;
    }

    public long getAadharNumber() {
        return aadharNumber;
    }

    public String getMail() {
        return mail;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    
    public LocalDate getDateOfJoin() {
        return dateOfJoin;
    } 
    
    public String getAddress() {
        return address;
    }

    public void setName(String name) {   
        this.name = name;
   }

   public void setMail(String mail) {
       this.mail = mail;
   }

   public void setDateOfBirth(LocalDate dateOfBirth) {        
       this.dateOfBirth = dateOfBirth;
   }

   public void setId(int id) {
       this.id = id;
   }

   public void setDateOfJoin(LocalDate dateOfJoin) {
       this.dateOfJoin = dateOfJoin;
   }

   public void setMobileNumber(long mobileNumber) {           
       this.mobileNumber = mobileNumber;
   }

   public void setAadharNumber(long aadharNumber) {

       this.aadharNumber = aadharNumber;
   }

   public void setPanNumber(String panNumber) {
       this.panNumber = panNumber;
   }
   
   public void setAddress(String address) {
       this.address = address;
   }
}