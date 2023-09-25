/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2509;

import java.util.Scanner;

public class Atividade25091entrega {
    public static void main(String[] args) {
        
           Scanner sc = new Scanner (System.in);
           
           String nome,classif;
           
           int idade, peso;
           
           double altura,imc;
           
            System.out.println("Digite seu nome: ");
                nome = sc.next();
                
            System.out.println("Digite sua idade : " );
                idade = sc.nextInt();
                
            System.out.println("Digite seu peso: " );
                peso = sc.nextInt();    
           
            System.out.println("Digite seu altura: " );
                altura = sc.nextDouble();    
               
         
          imc = peso/altura/altura;
         
          
          if (imc <=18.5){
                classif="Abaixo do peso normal" ;
                 }
           else if (imc <=24.9){
                classif=" Peso normal";
                 }
           
            else if (imc <=29.9){
                classif=" Excesso de peso" ;
                 }
             else if (imc <=34.9){
                 classif=" Obsidade classe 1" ;
                 }
            else if (imc <=39.9){
                 classif="Obsidade classe 2" ;
                 }
            else {
                classif= " Obsidade classe 3" ;
           }
          
          System.out.println("Nome  = " +nome+ " Idade = " +idade);
          System.out.println("Peso = " +peso+ " Altura = " +altura);
          System.out.println("Seu imc e = "+imc);
          System.out.println("sua classificacao foi = " +classif);
           
    }
}
