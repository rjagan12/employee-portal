package com.i2i.dao;

import com.i2i.configure.ConfigureClass;
import com.i2i.model.Trainer;
import com.i2i.model.Trainee;
import com.i2i.service.impl.EmployeeServiceImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;

/**
 * <h> EmployeeDao </h> 
 *  class used to get and store employee details from EmployeeDaoImpl and  
 *  returns details as object to EmployeeServiceImpl vice versa
 * 
 * @version 1.0
 * @author Jaganathan R  
 */
public interface EmployeeDao {

    /**
     * Method used to add All trainees Details 
     * @param {@link Trainee}  
     * @return {@link String }return status
     */
    public String insertTraineeDetails(Trainee trainee) throws Exception;

    /**
     * Method used to add All trainers Details 
     * @param {@link Trainer}  
     * @return {@link String }return status
     */
    public String insertTrainerDetails(Trainer trainer) throws Exception;

    /**
     * Method used to show traineeDetails by id 
     * @param {@link String}traineeid  
     * @return {@link Trainee }return traineeDetails
     */
    public Trainee displayTraineeDetailsById(int traineeId) throws Exception;

    /**
     * Method used to show trainerDetails by id 
     * @param {@link String}trainerid  
     * @return {@link Trainer }return trainerDetails
     */
    public Trainer displayTrainerDetailsById(int trainerId) throws Exception;


    /**
     * Method used to show All trainees Details 
     * @param {@link noparam} 
     * @return {@link List<Trainee>}return traineeDetails
     */
    public List<Trainee> retrieveTraineesDetails() throws Exception;

    /**
     * Method used to show All trainers Details 
     * @param {@link noparam} 
     * @return {@link List<Trainer> }return trainerDetails
     */
    public List<Trainer> retrieveTrainersDetails() throws Exception;

    /**
     * Method used to remove trainees deatils 
     * @param {@link String }traineeid 
     * @return {@link String }return status
     */
    public String removeTraineeDetails(int id) throws Exception;

    /**
     * Method used to remove trainers deatils
     * @param {@link String }trainerid 
     * @return {@link String }return status
     */
    public String removeTrainerDetails(int id) throws Exception;

    /**
     * Method used to update trainee Details by id 
     * @param {@link String, Trainee}traineeid, traineeDetails 
     * @return {@link String}return status
     */
    public String updateTraineeDetails(int traineeId, Trainee traineeDetails) throws Exception;


    /**
     * Method used to update trainer Details by id 
     * @param {@link String, Trainer}trainerid, trainerDetails 
     * @return {@link String}return status
     */
    public String updateTrainerDetails(int trainerId, Trainer trainerDetails) throws Exception;
 
} 