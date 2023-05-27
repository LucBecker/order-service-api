package com.lucbecker.orderservice.domain;

import org.apache.tomcat.jni.OS;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Pessoa {
    private static final long serialVersionUID = 1L;

    private List<OS> list = new ArrayList<>();
    public Tecnico() {
    }

    public Tecnico(Integer id, String nome, String cpf, String telefone) {
        super(id, nome, cpf, telefone);
    }

    public List<OS> getList() {
        return list;
    }

    public void setList(List<OS> list) {
        this.list = list;
    }
}



