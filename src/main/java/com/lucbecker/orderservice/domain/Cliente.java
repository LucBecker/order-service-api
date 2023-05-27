package com.lucbecker.orderservice.domain;

import org.apache.tomcat.jni.OS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<OS> list = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(Integer id, String nome, String cpf, String telefone) {
        super(id, nome, cpf, telefone);
    }

    public List<OS> getList() {
        return list;
    }

    public void setList(List<OS> list) {
        this.list = list;
    }
}
