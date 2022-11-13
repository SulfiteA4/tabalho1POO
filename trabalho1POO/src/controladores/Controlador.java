/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Arquivos.IOArquivos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Aluguel;
import modelos.ApartamentoResidencial;
import modelos.CasaResidencial;
import modelos.Cliente;
import modelos.Comercial;
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
    
    //funções para listagem dos imoveis
    //1. Listar todos os Imóveis cadastrados, seja Casa Residencial, Apartamento Residencial ou Comercial.
    public ArrayList<Imovel> listaTodosOsImoveis(){
        IOArquivos arq = new IOArquivos();
        return arq.lerImoveis();
    }
    
    //2. Listar todos os Imóveis de categoria Casa Residencial.
    public ArrayList<CasaResidencial> listaTodasAsCasasResidenciais(){
        IOArquivos arq = new IOArquivos();
        ArrayList<CasaResidencial> todasCasasResidenciais = new ArrayList();
        ArrayList<Imovel> todosOsImoveis= arq.lerImoveis();
        if(todosOsImoveis != null){
            for(int i =0; i < todosOsImoveis.size(); i++){
                if(todosOsImoveis.get(i) instanceof CasaResidencial){
                    todasCasasResidenciais.add((CasaResidencial)todosOsImoveis.get(i));
                }
            }
            return todasCasasResidenciais;
        }else{
            return null;
        }
    }
    
    //3. Listar todos os Imóveis de categoria Apartamento Residencial.
    public ArrayList<ApartamentoResidencial> listaTodosOsApartamentosResidenciais(){
        IOArquivos arq = new IOArquivos();
        ArrayList<ApartamentoResidencial> todosApartamentosResidenciais = new ArrayList();
        ArrayList<Imovel> todosOsImoveis= arq.lerImoveis();
        if(todosOsImoveis != null){
            for(int i =0; i < todosOsImoveis.size(); i++){
                if(todosOsImoveis.get(i) instanceof ApartamentoResidencial){
                    todosApartamentosResidenciais.add((ApartamentoResidencial)todosOsImoveis.get(i));
                }
            }
            return todosApartamentosResidenciais;
        }else{
            return null;
        }
    }
    
    //4. Listar todos os Imóveis de categoria Comercial.
    public ArrayList<Comercial> listaTodosOsComerciais(){
        IOArquivos arq = new IOArquivos();
        ArrayList<Comercial> todosComerciais = new ArrayList();
        ArrayList<Imovel> todosOsImoveis= arq.lerImoveis();
        if(todosOsImoveis != null){
            for(int i =0; i < todosOsImoveis.size(); i++){
                if(todosOsImoveis.get(i) instanceof Comercial){
                    todosComerciais.add((Comercial)todosOsImoveis.get(i));
                }
            }
            return todosComerciais;
        }else{
            return null;
        }
    }
    
    //5. Listar todos os Imóveis disponíveis para locação (aluguel).
    public ArrayList<Imovel> listaImoveisDisponiveisLocacao(){
        IOArquivos arq = new IOArquivos();
        ArrayList<Imovel> todosOsImoveis = arq.lerImoveis();
        ArrayList<Imovel> imoveisDisponiveis = new ArrayList();
        
        if(todosOsImoveis == null){
            return null;
        }else{
            for(int i = 0; i < todosOsImoveis.size(); i++){
                if(todosOsImoveis.get(i).isDisponivelAluguel() == true){
                    imoveisDisponiveis.add(todosOsImoveis.get(i));
                }   
            }
            return imoveisDisponiveis;
        }
    }
    
    //6. Listar todos os Imóveis não disponíveis para locação, ou seja, alugados ou vendidos.
    public ArrayList<Imovel> listaImoveisIndisponiveis(){
        IOArquivos arq = new IOArquivos();
        ArrayList<Imovel> todosOsImoveis = arq.lerImoveis();
        ArrayList<Imovel> imoveisIndisponiveis = new ArrayList();
        
        if(todosOsImoveis == null){
            return null;
        }else{
            for(int i = 0; i < todosOsImoveis.size(); i++){
                if(todosOsImoveis.get(i).isDisponivelAluguel()== false && todosOsImoveis.get(i).isDisponivelVenda()== false ){
                    imoveisIndisponiveis.add(todosOsImoveis.get(i));
                }   
            }
            return imoveisIndisponiveis;
        }
    }
    
    //7. Listar todos os Imóveis disponíveis para vendas.
    public ArrayList<Imovel> listaImoveisDisponiveisCompra(){
        IOArquivos arq = new IOArquivos();
        ArrayList<Imovel> todosOsImoveis = arq.lerImoveis();
        ArrayList<Imovel> imoveisDisponiveis = new ArrayList();
        
        if(todosOsImoveis == null){
            return null;
        }else{
            for(int i = 0; i < todosOsImoveis.size(); i++){
                if(todosOsImoveis.get(i).isDisponivelVenda() == true){
                    imoveisDisponiveis.add(todosOsImoveis.get(i));
                }   
            }
            return imoveisDisponiveis;
        }
    }
    
    //8. Listar todos os Imóveis com atraso no pagamento do aluguel.
    public ArrayList<Imovel> listaImoveisAlugueisAtrasados(){
        IOArquivos arq = new IOArquivos();
        ArrayList<Aluguel> todosOsAlugueis = arq.lerAlugueis();
        ArrayList<Imovel> imoveisAtrasados = new ArrayList();
        
        if(todosOsAlugueis == null){
            return null;
        }else{
            for(int i = 0; i < todosOsAlugueis.size(); i++){
                if(todosOsAlugueis.get(i).verificarAtraso()){
                    imoveisAtrasados.add(todosOsAlugueis.get(i).getImovel());
                }
            }
            return imoveisAtrasados;
        }
    }
    
    //9.
    
    public ArrayList<Cliente> getTodosClientes(){
        IOArquivos arq = new IOArquivos();
        return arq.lerClientes();    
    }
    
    public ArrayList<Corretor> getTodosCOrretores(){
        IOArquivos arq = new IOArquivos(); 
        return arq.lerCorretores();
    }
    
}
