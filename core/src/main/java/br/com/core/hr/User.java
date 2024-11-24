package br.com.core.hr;

public class User {
    public String name;
    private String userType;
    private float salary;
    private String username;
    private String password;

    public User(String name, String userType, float salary, String username, String password){
        this.name = name;
        this.userType = userType;
        this.salary = salary;
        this.username = username;
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getUserType(){
        return this.userType;
    }

    public void setUserType(String userType){
        this.userType = userType;
    }

    public Float getSalary(){
        return this.salary;
    }

    public void setSalary(Float salary){
        this.salary = salary;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
