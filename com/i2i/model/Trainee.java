package com.i2i.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * <h> Trainee </h> 
 *  class used to get Trainee details from user and  
 *  set details with setter and getters 
 * 
 * @version 1.0
 * @author Jaganathan R  
 */
@Entity
@Table(name = "trainees")
public class Trainee extends Employee {

    @Column(name = "passoutyear")
    private LocalDate passOutYear;

    @ManyToMany( fetch = FetchType.EAGER, mappedBy = "trainee_id") 
    private List<Trainer> trainerDetails;

    public void setPassOutYear(LocalDate passOutYear) {
        this.passOutYear = passOutYear;
    }

    public void setTrainerDetails(List<Trainer> trainerDetails) {
        this.trainerDetails = trainerDetails;
    }

    public List<Trainer> getTrainerDetails() {
        return trainerDetails;
    }

    public LocalDate getPassOutYear() {
        return passOutYear;
    }
}