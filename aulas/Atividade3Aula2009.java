/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Atividade3Aula2009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Double n1, n2, n3, n4, media;
        
        Scanner sc = new Scanner(System.in);
        
       
        
        System.out.println(" Digite o primeiro nota: ");
         n1 = sc.nextDouble();
         
         System.out.println(" Digite segunda nota: ");
         n2 = sc.nextDouble();
         
         System.out.println(" Digite terceira nota: ");
         n3 = sc.nextDouble();
         
         System.out.println(" Digite o quarta nota: ");
         n4 = sc.nextDouble();
         
       
        media = (n1+n2+n3+n4)/4;
        
        //Somente uma variavel 
      /*  
        if (media>=6){
            System.out.println("Aluno aprovado! - Media " +media);
            
        }
        else{
            System.out.println("Aluno reprovado! - Media = " +media);
        }
        */
        
      
      //Começando pelo maior (IF ANINHADO)
       /*  if (media>=6){
            System.out.println("Aluno aprovado! - Media " +media);
            
        }
        else if(media>=3){
            System.out.println("Aluno em recuperacao! - Media = " +media);
        }
          else{
            System.out.println("Aluno reprovado! - Media = " +media);
        }*/
       
       
       
       //Começando pelo menor (IF ANINHADO)
       
          if (media<3){
            System.out.println("Aluno aprovado! - Media " +media);
            
        }
        else if(media<6){
            System.out.println("Aluno em recuperacao! - Media = " +media);
        }
          else{
            System.out.println("Aluno reprovado! - Media = " +media);
        }
        
       
       
       
       
    }
    
}
