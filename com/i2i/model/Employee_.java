package com.i2i.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile SingularAttribute<Employee, String> address;
	public static volatile SingularAttribute<Employee, String> role;
	public static volatile SingularAttribute<Employee, String> mail;
	public static volatile SingularAttribute<Employee, LocalDate> dateOfJoin;
	public static volatile SingularAttribute<Employee, Long> aadharNumber;
	public static volatile SingularAttribute<Employee, Boolean> isDeleted;
	public static volatile SingularAttribute<Employee, Long> mobileNumber;
	public static volatile SingularAttribute<Employee, String> name;
	public static volatile SingularAttribute<Employee, LocalDate> dateOfBirth;
	public static volatile SingularAttribute<Employee, Integer> id;
	public static volatile SingularAttribute<Employee, String> panNumber;

	public static final String ADDRESS = "address";
	public static final String ROLE = "role";
	public static final String MAIL = "mail";
	public static final String DATE_OF_JOIN = "dateOfJoin";
	public static final String AADHAR_NUMBER = "aadharNumber";
	public static final String IS_DELETED = "isDeleted";
	public static final String MOBILE_NUMBER = "mobileNumber";
	public static final String NAME = "name";
	public static final String DATE_OF_BIRTH = "dateOfBirth";
	public static final String ID = "id";
	public static final String PAN_NUMBER = "panNumber";

}

