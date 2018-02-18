package com.ukraine.springmvc.model;

import java.sql.Timestamp;
import java.util.Date;

public class Employee {
    //for list all employes
    private int objectId;
    private String object;
    private String oType;
    private String attrName;
    private int mgr;
    private String hirerDate;
    private float sal;
    private float com;
    private int deptno;

    //mauby more fiels
    private String login;
    private String password;
    private String role;
    private int attrId;
    private int rolesId;
    private int projectId;


    public int getAttrId() {
        return attrId;
    }

    public void setAttrId(int attrId) {
        this.attrId = attrId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getoType() {
        return oType;
    }

    public void setoType(String oType) {
        this.oType = oType;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public String getHirerDate() {
        return hirerDate;
    }

    public void setHirerDate(String hirerDate) {
        this.hirerDate = hirerDate;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public float getCom() {
        return com;
    }

    public void setCom(float com) {
        this.com = com;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public int getRolesId() {
        return rolesId;
    }

    public void setRolesId(int rolesId) {
        this.rolesId = rolesId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "objectId=" + objectId +
                ", object='" + object + '\'' +
                ", oType='" + oType + '\'' +
                ", attrName='" + attrName + '\'' +
                ", mgr=" + mgr +
                ", hirerDate='" + hirerDate + '\'' +
                ", sal=" + sal +
                ", com=" + com +
                ", deptno=" + deptno +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", attrId=" + attrId +
                '}';
    }
}
