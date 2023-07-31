package Exercicio1;

import java.time.LocalDate;

public class Pessoa {
    private String name;
    private LocalDate dateOfBirth;
    private Integer age;

    public Pessoa(String name) {
        this.name = name;
    }
    public Pessoa (LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public Pessoa(int age){
        this.age = age;
    }

    //Getters e Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

