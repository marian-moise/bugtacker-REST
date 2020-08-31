package com.project;

import javax.persistence.*;


@Entity
@Table(name="status")
public class Status {

    public Status() {
    }

    public Status(String statusName) {
        this.numeDeStatus = statusName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statusId")
    Integer idDeStatus;

    @Column(name = "statusName", nullable = false)
    String numeDeStatus;


    @Override
    public String toString() {
        return "Status{" +
                "idDeStatus=" + idDeStatus +
                ", numeDeStatus='" + numeDeStatus + '\'' +
                '}';
    }

    public Integer getIdDeStatus() {
        return idDeStatus;
    }

    public void setIdDeStatus(Integer idDeStatus) {
        this.idDeStatus = idDeStatus;
    }

    public String getNumeDeStatus() {
        return numeDeStatus;
    }

    public void setNumeDeStatus(String numeDeStatus) {
        this.numeDeStatus = numeDeStatus;
    }
}
