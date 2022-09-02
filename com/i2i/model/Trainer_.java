package com.i2i.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Trainer.class)
public abstract class Trainer_ extends com.i2i.model.Employee_ {

	public static volatile ListAttribute<Trainer, Trainee> traineeDetails;
	public static volatile SingularAttribute<Trainer, String> previousCompanyName;
	public static volatile SingularAttribute<Trainer, Integer> experience;

	public static final String TRAINEE_DETAILS = "traineeDetails";
	public static final String PREVIOUS_COMPANY_NAME = "previousCompanyName";
	public static final String EXPERIENCE = "experience";

}

