/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Arquivos.IOArquivos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Aluguel;
import modelos.Cliente;
import modelos.Configuracao;
import modelos.Corretor;
import modelos.Imobiliaria;
import modelos.Imovel;
import modelos.Seguro;
import modelos.Venda;

/**
 *
 * @author Lucas
 */
public class Controlador {
    
    public static Imobiliaria imobiliaria = new Imobiliaria();
    
    /* set e get das configuracoes*/
    public Configuracao getConfiguracoes(){
        return imobiliaria.getConfiguracoes();
    }
    
    public void setConfiguracoes(Configuracao config){
        imobiliaria.setConfiguracoes(config);
        IOArquivos arq = new IOArquivos();
        arq.escreverConfig(config);
        JOptionPane.showMessageDialog(null, "configurações slavas com sucesso!");
    }
    
    
    /* funções para recuperar arquivos de configurações */
    
    public String getConfigClientes(){
        return imobiliaria.getConfiguracoes().getArquivoClientes();
    }
    
    public String getConfigCorretores(){
        return imobiliaria.getConfiguracoes().getArquivoCorretores();
    }
    
    public String getConfigImoveis(){
        return imobiliaria.getConfiguracoes().getArquivoImoveis();
    }
    
    public String getConfigVendas(){
        return imobiliaria.getConfiguracoes().getArquivoVendas();
    }
    
    public String getConfigAlugueis(){
        return imobiliaria.getConfiguracoes().getArquivoAlugueis();
    }
    
    public String getConfigSeguros(){
        return imobiliaria.getConfiguracoes().getArquivoSeguros();
    }
    
    //funções para add registros aos arquivos
    
    public void addCliente(Cliente novoCliente){
        IOArquivos arq = new IOArquivos();
        arq.escreverCliente(novoCliente);
    }
    
    public void addCorretor(Corretor novoCorretor){
        IOArquivos arq = new IOArquivos();
        arq.escreverCorretor(novoCorretor);
    }
    
    public void addAluguel(Aluguel novoAluguel){
        IOArquivos arq = new IOArquivos();
        arq.escreverAlugueis(novoAluguel);
    }
    
    public void addImovel(Imovel novoImovel){
        IOArquivos arq = new IOArquivos();
        arq.escreverImovel(novoImovel);
    }
    
    public void addVenda(Venda novaVenda){
        IOArquivos arq = new IOArquivos();
        arq.escreverVenda(novaVenda);
    }
    
    public void addSeguro(Seguro novoSeguro){
        IOArquivos arq = new IOArquivos();
        arq.escreverSeguros(novoSeguro);
    }
    
    //
    
    public ArrayList<Cliente> getTodosClientes(){
        IOArquivos arq = new IOArquivos();
        return arq.lerClientes();    
    }
}
