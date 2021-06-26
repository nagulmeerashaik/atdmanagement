package com.clg.atdmanagement.beans;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AccountType {
    STUDENT,ADMIN,TEACHER
}
