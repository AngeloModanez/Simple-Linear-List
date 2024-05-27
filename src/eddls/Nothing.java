/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddls;

/**
 *
 * @author labfatec
 */
public class Nothing {

    int id;
    String name;
    String email;

    public Nothing() {
    }

    public Nothing(int id, String name, String email) {
        this.id = id;
        this.email = name;
        this.name = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "[{" + this.id + "},{" + this.name + "},{" + this.email + "}]";
    }

}
