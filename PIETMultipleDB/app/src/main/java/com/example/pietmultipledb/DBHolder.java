package com.example.pietmultipledb;

public class DBHolder {

    String name,education,exp;

    public DBHolder(String name, String education, String exp) {
        this.name = name;
        this.education = education;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
}
