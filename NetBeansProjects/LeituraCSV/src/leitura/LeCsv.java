
package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         

         LinkedList<Cliente> clientes = new  LinkedList<Cliente>();
         String current = new java.io.File( "." ).getCanonicalPath();
         File inputFile = new File(current + "/src/arquivo.csv");
         FileReader in = new FileReader(inputFile);
         BufferedReader br = new BufferedReader(in);

         String linha = br.readLine();
         String[] data;

         linha = br.readLine();
         while (linha != null) {
             data = linha.split(";");

             Cliente novo_cliente = new Cliente();
             novo_cliente.setId(data[0]);
             novo_cliente.setNome(data[1]);
             novo_cliente.setEmail(data[2]);
             novo_cliente.setTelefone(data[4]);
             novo_cliente.setTotalCompras(Double.parseDouble(data[5]));

             clientes.add(novo_cliente);

             linha = br.readLine();
         }
         br.close();
         in.close();
        
        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        
        return clientes;
     }
}
