package com.example.labm4.projeto_redesocial;

/**
 * Created by Lucas on 10/07/2015.
 */
public class Perfis {
    private String nome,msg,modelHP;

    public Perfis(String nome,String msg,String modelHP) {
        this.nome = nome;
        this.msg = msg;
        this.modelHP = modelHP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getModelHP() {
        return modelHP;
    }

    public void setModelHP(String modelHP) {
        this.modelHP = modelHP;
    }
}
