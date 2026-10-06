package com.attendance.model;

public class Student {

    private int studentId;
    private String name;
    private String department;
    private int year;
    private String section;
    private String email;

    public Student(int studentId, String name, String department, int year, String section, String email) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.year = year;
        this.section = section;
        this.email = email;
    }
public int getStudentId() {
    return studentId;
}

public void setStudentId(int studentId) {
    this.studentId = studentId;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getDepartment() {
    return department;
}

public void setDepartment(String department) {
    this.department = department;
}

public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}

public String getSection() {
    return section;
}

public void setSection(String section) {
    this.section = section;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}
}