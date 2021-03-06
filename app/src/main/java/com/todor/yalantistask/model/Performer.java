package com.todor.yalantistask.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class Performer extends RealmObject {

    @SerializedName("id")
    private Integer id;

    @SerializedName("organization")
    private String organization;

    @SerializedName("person")
    private String person;

    @SerializedName("deadline")
    private Integer deadline;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Performer{" +
                "id=" + id +
                ", organization='" + organization + '\'' +
                ", person='" + person + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
