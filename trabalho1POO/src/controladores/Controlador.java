/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelos.Imobiliaria;

/**
 *
 * @author Lucas
 */
public class Controlador {
    public static Imobiliaria imobiliaria = new Imobiliaria();
    
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
}
