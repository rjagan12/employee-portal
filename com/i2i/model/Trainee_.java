package com.i2i.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Trainee.class)
public abstract class Trainee_ extends com.i2i.model.Employee_ {

	public static volatile ListAttribute<Trainee, Trainer> trainerDetails;
	public static volatile SingularAttribute<Trainee, LocalDate> passOutYear;

	public static final String TRAINER_DETAILS = "trainerDetails";
	public static final String PASS_OUT_YEAR = "passOutYear";

}

