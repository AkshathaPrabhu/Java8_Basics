package com.aksha.beans;

public class Employee {
    private int empId;
    private String empName;
    private Department dept;
    private String projectName;
    private String location;

    public Employee(int empId, String empName, Department dept, String projectName, String location) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
        this.projectName = projectName;
        this.location = location;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", dept=" + dept +
                ", projectName='" + projectName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
