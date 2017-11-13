/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

/**
 *
 * @author paulo.hbezerra
 */
public class ListaProdutos {

    private int tamanho = 10;

    private int[] codigobarras = new int[tamanho];
    String[] nomeproduto = new String[tamanho];
    private double[] valor = new double[tamanho];
    private double[] valordesconto = new double[tamanho];
    private String[] FaixaEtaria = new String[tamanho];
    private String[] Fabricante = new String[tamanho];
    private String[] PrazoGarantia = new String[tamanho];
    private int[] Quantidade = new int[tamanho];
    private int[] idproduto = new int[tamanho];

    public ListaProdutos() {
        
        //FIZ SOMENTE COM 5 ITENS PARA O MOCK

        nomeproduto[1] = "Telefone Feliz";
        valor[1] = 20.00;
        valordesconto[1] = valor[1] / 0.2;
        FaixaEtaria[1] = "0 à 12 meses";
        Fabricante[1] = "Mattel";
        PrazoGarantia[1] = "3 meses";
        Quantidade[1] = 1;
        idproduto[1] = 1;
    }
    
    public String GetNome(int idproduto){
        return nomeproduto[idproduto];
        
    }    
    public double GetValor(int idproduto){
        return valor[idproduto];
        
    }  
    public double GetValorDesconto(int idproduto){
        return valordesconto[idproduto];
        
    }  
    public String GetFaixaEtaria(int idproduto){
        return FaixaEtaria[idproduto];
        
    }  
    
     public String GetFabricante(int idproduto){
        return Fabricante[idproduto];
        
    }
    public String GetPrazoGarantia(int idproduto){
        return PrazoGarantia[idproduto];
        
    }
    public int GetQuantidade(int idproduto){
        
        return Quantidade[idproduto];
    }
    

}
