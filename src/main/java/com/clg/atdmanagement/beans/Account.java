package com.clg.atdmanagement.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@MappedSuperclass
public class Account {

    @Id
    @Column
    @Getter
    @Setter
    protected int id;

    @Column
    @Getter
    @Setter
    protected String firstName;

    @Column
    @Getter
    @Setter
    protected String lastName;

    @Column
    @Getter
    @Setter
    protected String email;

    @Column
    @Getter
    @Setter
    protected String phoneNumber;

    @Column
    @Getter
    @Setter
    protected String gender;

    @Column
    @Getter
    @Setter
    protected String accountType;
}
