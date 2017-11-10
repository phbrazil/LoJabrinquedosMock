/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo.hbezerra
 */
public class TestClassUnicaSQL {

     static Connection conexao = null;

    static String select = "";
    static String nomecliente = "";

    public static void main(String[] args) {
        try {
            conexao = BancoMySQL.getConnection();
            System.out.println("Conectado!");

            java.sql.Statement st = conexao.createStatement();

            select = "select * from clientes where cpf = '375.197.588-85'";
            ResultSet result = st.executeQuery(select);

            while (result.next()) {

                nomecliente = result.getString("nome");
                JOptionPane.showMessageDialog(null, nomecliente);

            }

        } catch (Exception e) {
            //Imprime erros de conexão
            e.printStackTrace();
        } finally {
            //Trata erros do fechamento de conexão com o banco de dados
            try {
                //Tenta fechar a conexão com o banco
                conexao.close();
            } catch (Exception e) {
                //Imprime erros de fechamento de conexão
                e.printStackTrace();
            }
        }
    }

}
