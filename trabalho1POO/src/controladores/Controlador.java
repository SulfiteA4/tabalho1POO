/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Arquivos.IOArquivos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Cliente;
import modelos.Configuracao;
import modelos.Imobiliaria;

/**
 *
 * @author Lucas
 */
public class Controlador {
    
    public static Imobiliaria imobiliaria = new Imobiliaria();
    
    /* set e ge4t das configuracoes*/
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
    
    public void getTodosClientes(){
        IOArquivos arq = new IOArquivos();
        System.out.println(arq.lerClientes());    
    }
}
