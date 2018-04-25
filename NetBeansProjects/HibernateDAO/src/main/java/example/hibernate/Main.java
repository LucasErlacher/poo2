package example.hibernate;

import example.hibernate.model.Usuario;
import example.hibernate.model.Veiculo;
import example.hibernate.persistencia.UsuarioDAO;
import example.hibernate.persistencia.UsuarioDAOImpl;
import example.hibernate.persistencia.VeiculoDAO;
import example.hibernate.persistencia.VeiculoDAOImpl;
import java.util.List;


public class Main {    		
	public static void main(String[] args) throws Exception {                                    
                        
            
           //Construindo DAO's
           VeiculoDAO veiculoDAO = new VeiculoDAOImpl();  
           UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
           
           //Construindo Veículo
           Veiculo veiculo = new Veiculo();
           veiculo.setAno("2010");
           veiculo.setMarca("Fiat");
           veiculo.setModelo("Uno");
           veiculo.setQuilometragem("1000");
           veiculo.setTipo("carro");
           
           //Construindo Usuário
           Usuario usuario = new Usuario();
                   usuario.setNome("Lucas");
                   usuario.setLogin("LucasER");
                   usuario.setSenha("Lucas123");
                   usuario.setEmail("lucaserlacher@hotmail.com"); 
           
           //Inserindo Usuario e Veiculo
           usuarioDAO.inserir(usuario);
           veiculoDAO.inserir(veiculo); 
           
           //Listando
           List<Veiculo> listar = veiculoDAO.listar(Veiculo.class);
           List<Usuario> listar2 = usuarioDAO.listar(Usuario.class);
           
           for(Veiculo printVeiculo : listar){
               System.out.println(printVeiculo.toString());
           }
           
           
           for(Usuario printUser : listar2){
               System.out.println(printUser.toString());
           }
           
           
           //Deletando Veículo
           veiculoDAO.deletar(veiculo);           
           listar = veiculoDAO.listar(Veiculo.class);
           for(Veiculo printVeiculo : listar){
               System.out.println(printVeiculo.toString());
           }
           
            
	}                
}
