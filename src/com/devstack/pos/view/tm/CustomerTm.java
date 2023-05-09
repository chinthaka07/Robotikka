package com.devstack.pos.view.tm;

import javafx.scene.control.Button;

public class CustomerTm {
    int id;
    String email;
    String contact;
    String name;
    Double salary;
    Button deleteButton;

    public CustomerTm() {
    }

    public CustomerTm(int id, String email, String contact, String name, Double salary, Button deleteButton) {
        this.id = id;
        this.email = email;
        this.contact = contact;
        this.name = name;
        this.salary = salary;
        this.deleteButton = deleteButton;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Button getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(Button deleteButton) {
        this.deleteButton = deleteButton;
    }
}
