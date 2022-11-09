/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import interfaces.IUPrincipal;

/**
 *
 * @author Martines
 */
public class Main {
   
    public static void main(String[] args) {
         IUPrincipal principal = new IUPrincipal();
         principal.setVisible(true);
         principal.setTitle("Sistema Imobiliária");
         principal.toFront();
    }
}
