package com.mycompany.calcularmedia;
import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);
        
        //Declarando variáveis
        int n1, n2, n3, n4, n5;
        int media;
        
        //Recebe as notas
        System.out.println("Digite sua primeira nota: ");
        n1 = soma.nextInt();
        
        System.out.println("Digite sua segunda nota: ");
        n2 = soma.nextInt();
        
        System.out.println("Digite sua terceira nota: ");
        n3 = soma.nextInt();
        
        //Cálculo da média
        media = (n1+n2+n3)/3;
        
        //Imprimir o cálculo.
        System.out.println("A sua média é de: "+media+" pontos.");
        
        if(media >= 7){
            System.out.println("Você passou de ano!!");
        }else{
            System.out.println("Que pena.. Você reprovou.");
        }
        
    }
}
