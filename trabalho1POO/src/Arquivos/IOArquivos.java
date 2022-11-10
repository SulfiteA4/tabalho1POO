/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Configuracao;
import modelos.Usuario;
import controladores.Controlador;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Cliente;
import modelos.Corretor;
import modelos.Imovel;

/**
 *
 * @author Lucas
 */
public class IOArquivos {
    public Configuracao lerConfig(){
        try{
            File arquivoConfig = new File("config.arq");
            
            Configuracao configAtual;
            FileInputStream ios;
            if (!arquivoConfig.exists()){
                configAtual = new Configuracao();
                this.escreverConfig(configAtual);
                return configAtual;
            }
            
            ios = new FileInputStream(arquivoConfig);
            ObjectInputStream ois = new ObjectInputStream(ios);
            
            configAtual = (Configuracao) ois.readObject();
            return configAtual;
            
        }catch( FileNotFoundException ex){
            return null;
        }catch(IOException | ClassNotFoundException ex){
            return null;
        }
    }
    
    public void escreverConfig(Configuracao novaConfig){
        try{
            File configFile = new File("config.arq");
            
            if(configFile.exists() == false)configFile.createNewFile();
            
            FileOutputStream fos = new FileOutputStream("config.arq");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo de configurações!");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo de configurações!");
        }
    }
    
    public ArrayList<Cliente> lerClientes(){
        try{
            Controlador control = new Controlador();
            FileInputStream fis = new FileInputStream(control.getConfigClientes());
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int contClientes = ois.readInt();
            ArrayList<Cliente> clientes = new ArrayList<>();
            
            for(int i = 0; i < contClientes;i++){
                clientes.add((Cliente) ois.readObject());
            }
            
            return clientes;
            
        }catch(IOException ex){
            return null;
        }catch(ClassNotFoundException ex){
            return null;
        }
    }
    
    public ArrayList<Corretor> lerCorretores(){
        try{
            Controlador control = new Controlador();
            FileInputStream fis = new FileInputStream(control.getConfigCorretores());
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int contCorretores = ois.readInt();
            ArrayList<Corretor> corretores = new ArrayList<>();
            
            for(int i = 0; i < contCorretores;i++){
                corretores.add((Corretor) ois.readObject());
            }
            
            return corretores;
            
        }catch(IOException ex){
            return null;
        }catch(ClassNotFoundException ex){
            return null;
        }
    }
    
    public void escreverCliente(Cliente cliente){
        
        try {
            Controlador control = new Controlador();
            File arquivoClientes = new File(control.getConfigClientes());
            ArrayList<Cliente> clientes;
            clientes = lerClientes();
            
            int contClientes;
            
            if(arquivoClientes.exists() == false) arquivoClientes.createNewFile();
             
            FileOutputStream fos = new FileOutputStream(arquivoClientes);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
            
            
            if(clientes != null){
                clientes.add(cliente);
                contClientes = clientes.size();
                ous.writeInt(contClientes);
                for(int i = 0;i<contClientes;i++){
                    ous.writeObject(clientes.get(i));
                }
            }else{
                ous.writeInt(1);
                ous.writeObject(cliente);
            }
            ous.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado Com Sucesso!!");
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo de Clientes");
        } catch (IOException ex) {
            Logger.getLogger(IOArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void escreverCorretor(Corretor corretor){
        
        try {
            Controlador control = new Controlador();
            File arquivoCorretores = new File(control.getConfigCorretores());
            ArrayList<Corretor> corretores;
            corretores = lerCorretores();
            
            int contCorretores;
            
            if(arquivoCorretores.exists() == false) arquivoCorretores.createNewFile();
             
            FileOutputStream fos = new FileOutputStream(arquivoCorretores);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
            
            
            if(corretores != null){
                corretores.add(corretor);
                contCorretores = corretores.size();
                ous.writeInt(contCorretores);
                for(int i = 0;i<contCorretores;i++){
                    ous.writeObject(corretores.get(i));
                }
            }else{
                ous.writeInt(1);
                ous.writeObject(corretor);
            }
            ous.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "Corretor Cadastrado Com Sucesso!!");
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo de Clientes");
        } catch (IOException ex) {
            Logger.getLogger(IOArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList<Imovel> lerImoveis(){
        try{
            Controlador control = new Controlador();//controlador para pegar as configs da classe imovel
            FileInputStream fis = new FileInputStream(control.getConfigImoveis()); //faz a conexao com o arquivo que possui os dados dos imoveis
            ObjectInputStream ois = new ObjectInputStream(fis);//objeto que le as informacoes passadas por um inputStream(fis)
            
            int contImoveis = ois.readInt();
            ArrayList<Imovel> imoveis = new ArrayList<>();
            
            for (int i = 0; i < contImoveis ; i++) {    
                imoveis.add((Imovel) ois.readObject());
            }
            return imoveis;
            
        }catch(IOException ex){
            return null;
        }catch(ClassNotFoundException ex){
            return null;
        }
    }
    
    public void escreverImovel(Imovel imovel){
        try{
            Controlador control = new Controlador();
            File arquivoImoveis = new File(control.getConfigImoveis());
            ArrayList<Imovel> imoveis =  lerImoveis();
            
            int contImoveis;
            
            if(arquivoImoveis.exists() == false) arquivoImoveis.createNewFile();
            
            FileOutputStream fos = new FileOutputStream(arquivoImoveis);//conecta o arquivo em que as informacoes serao gravadas
            ObjectOutputStream ous = new ObjectOutputStream(fos);//manipula o objeto que sera inserido dentro do arquivo de dados, no seu construtor informamos o arquivo do OutputStream(fos)
            
            
            if(imoveis != null){
                imoveis.add(imovel);//add o novo imovel ao ArrayList
                contImoveis = imoveis.size();//Atualiza o valor do contador de imoveis com o tamanho do vetor de imoveis
                ous.writeInt(contImoveis);// registra a quantidade de imoveis no arquivo
                for(int i = 0; i < contImoveis; i++){
                    ous.writeObject(imoveis.get(i));//faz a escrita do novo imovel no arquivo
                }
            }else{
                ous.writeInt(1);
                ous.writeObject(imovel);
            }
            
            ous.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "imóvel Cadastrado com sucesso!");
            
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Abrir o arquivo de Imoveis");
        }catch(IOException ex){
            Logger.getLogger(IOArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
