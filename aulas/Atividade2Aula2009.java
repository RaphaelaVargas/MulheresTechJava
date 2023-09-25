/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Atividade2Aula2009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int idade;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        
        idade = sc.nextInt();
        
        if (idade>=18){
            System.out.println("Voce e maior de idade!");
            
        }
        else{
            System.out.println("Voce e menor de idade!");
        }
        
        
        
    }
    
}
