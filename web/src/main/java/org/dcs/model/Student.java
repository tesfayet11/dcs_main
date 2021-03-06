package org.dcs.model;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "studentId"))
public class Student extends Person   implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6033697974524969695L;

	@ManyToOne
	@JoinColumn(name = "guardianId", foreignKey = @ForeignKey(name = "FK_GUARDIAN"))
	private Guardian guardian; 
	
	@ManyToOne
	@JoinColumn(name = "schoolId", foreignKey = @ForeignKey(name = "FK_SCHOOL"))
	private School school;
	
	
	public Guardian getGuardian() {
		return guardian;
	}
	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
}
