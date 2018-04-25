/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.hibernate.persistencia;

import example.hibernate.model.Usuario;
import java.util.List;

/**
 *
 * @author 20161bsi0187
 */
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario> implements UsuarioDAO{
    public Usuario buscaUsuarioPorNomeESenha(String nome, String senha){
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        
        List<Usuario> users = sessao.createQuery("from usuario where nome like '" + nome
        + "' and senha like '" + senha + "'").list();
        //TODO: Implementar esta parte
        return null;
    }
}