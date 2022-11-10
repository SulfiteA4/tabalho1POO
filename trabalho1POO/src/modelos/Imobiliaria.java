/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Imobiliaria {
    private String nome;    
    private String endereco;
    private ArrayList<Aluguel> alugueis;
    private ArrayList<Venda> vendas;
    private ArrayList<Imovel> imoveis;
    private ArrayList<Usuario> clientes;
    private ArrayList<Usuario> corretores;
    private ArrayList<Seguro> seguros;
    private Configuracao configuracoes;
    
    public Imobiliaria(){};

    public Imobiliaria(String nome, String endereco, Configuracao configuracoes) {
        this.nome = nome;
        this.endereco = endereco;
        this.alugueis = new ArrayList();
        this.vendas = new ArrayList();
        this.imoveis = new ArrayList();
        this.clientes = new ArrayList();
        this.corretores = new ArrayList();
        this.seguros = new ArrayList();
        this.configuracoes = configuracoes;
    }
    
    //so implementei os getters e setters dos que não são ArrayList

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Configuracao getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Configuracao configuracoes) {
        this.configuracoes = configuracoes;
    }
    
    
    
    
}
