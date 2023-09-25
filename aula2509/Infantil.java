/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2509;

import java.util.Scanner;
/**
 *
 * @author 16128972023.1
 */
public class Infantil {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner (System.in);
                
                String nome;
                int idade;
                
                System.out.println("Digite nome da crianca: ");
                nome = sc.next();
                
                System.out.println("Digite a idade da crianca:" );
                 idade = sc.nextInt();
                 
                 if (idade <=2){
                     System.out.println("Crianca = " +nome+  " Encaminhar ao bercario");
                 }
                 
                 else if (idade <=4){
                     System.out.println("Crianca = " +nome+ " Encaminhar ao infantil A");
                 }
                 else if (idade <=5){
                     System.out.println("Crianca = " +nome+ " Encaminhar ao infantil B");
                 }
                else if (idade <=6){
                     System.out.println("Crianca = " +nome+ " Encaminhar ao infantil C");
                 }
                 else {
                     System.out.println("Crianca = " +nome+ " Crianca fora da tabela");
                 }
                
    }
}
