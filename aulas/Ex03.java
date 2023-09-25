/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Ex03 {
    public static void main(String[] args) {
        
         int aluno;
         
         Double nota1, nota2, nota3, media;
         
         Scanner sc = new Scanner(System.in);
         
           System.out.println(" Digite o numero do aluno: ");
         aluno = sc.nextInt();
         
        System.out.println(" Digite o primeiro nota: ");
         nota1 = sc.nextDouble();
         
        System.out.println(" Digite o segunda nota: ");
         nota2 = sc.nextDouble();
         
        System.out.println(" Digite o terceira nota: ");
         nota3 = sc.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Numero do aluno = " +aluno);
        System.out.println("Media das notas = " +media);

         
    }
}
