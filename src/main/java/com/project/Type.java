package com.project;

import javax.persistence.*;

@Entity
@Table(name = "type")

public class Type {

    public Type() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "typeId")
    Integer typeId;

    @Column(name = "typeName")
    String typeName;

    public Integer getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
