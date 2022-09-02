package com.i2i.dao;

import com.i2i.configure.ConfigureClass;
import com.i2i.model.Trainer;
import com.i2i.model.Trainee;
import com.i2i.service.EmployeeServiceImpl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <h> EmployeeDaoImpl </h> 
 *  class used to get and store employee details from EmployeeDaoImpl and  
 *  returns details as object to EmployeeServiceImpl vice versa
 * 
 * @version 1.0
 * @author Jaganathan R  
 */
public class EmployeeDaoImpl {

    /**
     * Method used to add All trainees Details 
     * @param {@link Trainee}  
     * @return {@link String }return status
     */
    public String insertTraineeDetails(Trainee trainee) throws Exception {
	
	Transaction transaction = null;
	String message = "Details Not Added Successfully";

	try(Session session = ConfigureClass.getFactory().openSession();) {
	    transaction = session.beginTransaction();
	    session.save(trainee);
	    transaction.commit();
	    message = "Trainee details Added Successfully";
	
	} catch(HibernateException e) {

	    if(transaction != null) {
		transaction.rollback();
	    }	  
	    throw e;
	}
	return message;
	
    }

    /**
     * Method used to add All trainers Details 
     * @param {@link Trainer}  
     * @return {@link String }return status
     */
    public String insertTrainerDetails(Trainer trainer) throws Exception {
	
	Transaction transaction = null;
	String message = "Details Not Added Successfully";

	try(Session session = ConfigureClass.getFactory().openSession();) {
	    transaction = session.beginTransaction();
	    session.save(trainer);
	    transaction.commit();
	    message = "Trainer details Added Successfully";
	
	} catch(HibernateException e) {

	    if(transaction != null) {
		transaction.rollback();
	    }	  
	    throw e;
	}
	return message;
	
    }

    /**
     * Method used to show traineeDetails by id 
     * @param {@link String}traineeid  
     * @return {@link Trainee }return traineeDetails
     */
    public Trainee displayTraineeDetailsById(int traineeId) throws Exception {

        Transaction transaction = null;
        Trainee trainee = null;

        try(Session session = ConfigureClass.getFactory().openSession();) {
            transaction = session.beginTransaction();
            trainee = (Trainee) session.get(Trainee.class, traineeId);

        } catch(HibernateException e) {

            throw e;
        }
        return trainee; 
    }

    /**
     * Method used to show trainerDetails by id 
     * @param {@link String}trainerid  
     * @return {@link Trainer }return trainerDetails
     */
    public Trainer displayTrainerDetailsById(int trainerId) throws Exception {

        Transaction transaction = null;
        Trainer trainer = null;

        try(Session session = ConfigureClass.getFactory().openSession();) {
            transaction = session.beginTransaction();
            trainer = (Trainer) session.get(Trainer.class, trainerId);

        } catch(HibernateException e) {

            throw e;
        }
        return trainer;
    }


    /**
     * Method used to show All trainees Details 
     * @param {@link noparam} 
     * @return {@link List<Trainee> }return traineeDetails
     */
    public List<Trainee> retrieveTraineesDetails() throws Exception {

        List<Trainee> trainees = new ArrayList<>(); 

        try(Session session = ConfigureClass.getFactory().openSession();) {
            trainees = session.createQuery("from Trainee where isDeleted = false").list();

        } catch(HibernateException e) {

            throw e;
        }
        return trainees;
    }


    /**
     * Method used to show All trainers Details 
     * @param {@link noparam} 
     * @return {@link List<Trainer> }return trainerDetails
     */
    public List<Trainer> retrieveTrainersDetails() throws Exception {

        List<Trainer> trainers = new ArrayList<>();
 
        try(Session session = ConfigureClass.getFactory().openSession();) {
             trainers = session.createQuery("from Trainer where isDeleted = false").list();

        } catch(HibernateException e) {

            throw e;
        }
        return trainers;
    }

    /**
     * Method used to remove trainees deatils 
     * @param {@link String }traineeid 
     * @return {@link String }return status
     */
    public String removeTraineeDetails(int id) throws Exception {

        Transaction transaction = null;
        String message = "Trainee Details not deleted";

        try (Session session = ConfigureClass.getFactory().openSession();) {
            transaction = session.beginTransaction();
            Trainee trainee = (Trainee) session.get(Trainee.class, id);
            trainee.setIsDeleted(true);
            session.update(trainee);
            message = "trainee details deleted successfully";
            transaction.commit();

        } catch (HibernateException e) {

            if(transaction != null) {
                transaction.rollback();
            }
            throw e;
        }
        return message;
    }

    /**
     * Method used to remove trainers deatils
     * @param {@link String }trainerid 
     * @return {@link String }return status
     */
    public String removeTrainerDetails(int id) throws Exception {

        Transaction transaction = null;
        String message = "Trainer Details not deleted";

        try (Session session = ConfigureClass.getFactory().openSession();) {
            transaction = session.beginTransaction();
            Trainer trainer = (Trainer) session.get(Trainer.class, id);
            trainer.setIsDeleted(true);
            session.update(trainer);
            message = "trainer details deleted successfully";
            transaction.commit();

        } catch (HibernateException e) {

            if(transaction != null) {
                transaction.rollback();
            }
            throw e;
        }
        return message;
    }


    /**
     * Method used to update trainee Details by id 
     * @param {@link String, Trainee}traineeid, traineeDetails 
     * @return {@link String}return status
     */
    public String updateTraineeDetails(int traineeId, Trainee traineeDetails) throws Exception {

        Transaction transaction = null;
        String message = "Trainee details not updated successfully";

        try(Session session = ConfigureClass.getFactory().openSession();) {
            transaction = session.beginTransaction();
            Trainee trainee = (Trainee) session.get(Trainee.class, traineeId);
            trainee.setName(traineeDetails.getName());
            trainee.setMail(traineeDetails.getMail());
            trainee.setDateOfBirth(traineeDetails.getDateOfBirth());
            trainee.setDateOfJoin(traineeDetails.getDateOfJoin());
            trainee.setPanNumber(traineeDetails.getPanNumber());
	    trainee.setAadharNumber(traineeDetails.getAadharNumber());
            trainee.setMobileNumber(traineeDetails.getMobileNumber());
            trainee.setRole(traineeDetails.getRole());
            trainee.setAddress(traineeDetails.getAddress());
            trainee.setPassOutYear(traineeDetails.getPassOutYear());
            trainee.setTrainerDetails(traineeDetails.getTrainerDetails());
            session.update(trainee);
            message = "trainee Details updated Successfully";
            transaction.commit();

        } catch(HibernateException e) {

            if(transaction!=null) {
                transaction.rollback();
            }
            throw e;
        }
        return message;
    }


    /**
     * Method used to update trainer Details by id 
     * @param {@link String, Trainer}trainerid, trainerDetails 
     * @return {@link String}return status
     */
    public String updateTrainerDetails(int trainerId, Trainer trainerDetails) throws Exception {

        Transaction transaction = null;
        String message = "Trainer details not updated successfully";

        try(Session session = ConfigureClass.getFactory().openSession();) {
            transaction = session.beginTransaction();
            Trainer trainer = (Trainer) session.get(Trainer.class, trainerId);
            trainer.setName(trainerDetails.getName());
            trainer.setMail(trainerDetails.getMail());
            trainer.setDateOfBirth(trainerDetails.getDateOfBirth());
            trainer.setDateOfJoin(trainerDetails.getDateOfJoin());
            trainer.setMobileNumber(trainerDetails.getMobileNumber());
            trainer.setPanNumber(trainerDetails.getPanNumber());
            trainer.setAadharNumber(trainerDetails.getAadharNumber());
            trainer.setAddress(trainerDetails.getAddress());
            trainer.setRole(trainerDetails.getRole());
            trainer.setPreviousCompanyName(trainerDetails.getPreviousCompanyName());
            trainer.setExperience(trainerDetails.getExperience());
            trainer.setTraineeDetails(trainerDetails.getTraineeDetails());
            session.update(trainer);
            message = "Trainer Details updated Successfully";
            transaction.commit();

        } catch(HibernateException e) {

            if(transaction!=null) {
                transaction.rollback();
            }
            throw e;
        }
        return message;

    } 


}