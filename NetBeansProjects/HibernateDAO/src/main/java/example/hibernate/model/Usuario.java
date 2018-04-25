/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author LucasER-20161bsi0187
 */

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer id;
    
    private String nome;
    private String login;
    private String senha;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
//    public Usuario(String nome, String login, String senha, String email){
//        this.nome = nome; this.login = login; this.senha = senha; this.email = email;
//    }
    
    public String toString(){
        return "Nome: " + nome + "\nLogin: " + login + "\nSenha: " + senha + "\nEmail: " + email;
    }
    
}
