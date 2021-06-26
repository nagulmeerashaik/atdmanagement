package com.clg.atdmanagement.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Data
@Entity
@Table(name = "ACCOUNT")
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Student extends Account{
	
    @Column
    @Getter
    @Setter
    private String academicYear;

    @Column
    @Getter
    @Setter
    private String currentYear;

	@Override
	public String toString() {
		return "Student [academicYear=" + academicYear + ", currentYear=" + currentYear + ", id=" + id + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", gender=" + gender + ", accountType=" + accountType + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



    
    
}
