/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Ex04 {
     public static void main(String[] args) {
         
        String func;
          
        Double hrs, shr, salario;
          
        Scanner sc = new Scanner(System.in);
          
        System.out.println(" Digite o nome do funcionario: " );
          func= sc.next() ;
          
        System.out.println("Numero de horas trabalhadas = ");
         hrs = sc.nextDouble();
         
        System.out.println("Valor salario por hora = " );
         shr = sc.nextDouble();
         
        salario = hrs * shr ;
          
        System.out.println("Nome do funcionario = " +func);
       
        System.out.println("Valor salario mes = " +salario);

          
     }
    
    
}
