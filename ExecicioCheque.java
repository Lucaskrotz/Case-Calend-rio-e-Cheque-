/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocase;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ExecicioCheque {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o valor que deseja pagar: ");
        int valor = entrada.nextInt();

        int milhar = valor / 1000;
        int centena = valor % 1000 / 100;
        int dezena = valor % 100 / 10;
        int unidade = valor % 10;

        String extenso = "";
        
         System.out.println("____________________________________________________");
        System.out.println("123  |  123456  |   010101   |      valor:# " + valor);
        System.out.print(" valor :");
        
        
        switch (milhar) {
            case 1:
                System.out.print(extenso + " Mil ");
                break;
            case 2:
                System.out.print(extenso + " Dois mil ");
                break;
            case 3:
                System.out.print(extenso + " Tres mil ");
                break;
            case 4:
                System.out.print(extenso + " Quatro mil ");
                break;
            case 5:
                System.out.print(extenso + " Cinco mil ");
                break;
            case 6:
                System.out.print(extenso + " Seis mil ");
                break;
            case 7:
                System.out.print(extenso + " Sete mil ");
                break;
            case 8:
                System.out.print(extenso + " Oito mil ");
                break;
            case 9:
                System.out.print(extenso + " Nove mil ");
                break;
        }
        
        
          switch (centena) {
            case 1:
                if (valor % 100 == 0) {

                    extenso += " Cem ";

                } else {

                    extenso += " Cento ";
                }
                break;

            case 2:
                System.out.print(extenso + " Duzentos ");
                break;
            case 3:
                System.out.print(extenso + " Tresentos ");
                break;
            case 4:
                System.out.print(extenso + " Quatrocentos ");
                break;
            case 5:
                System.out.print(extenso + " Quinhentos ");
                break;
            case 6:
                System.out.print(extenso + " Seisentos ");
                break;
            case 7:
                System.out.print(extenso + " Setecentos ");
                break;
            case 8:
                System.out.print(extenso + " Oitocentos ");
                break;
            case 9:
                System.out.print(extenso + " Novecentos ");
                break;
        }
          
          
          switch (dezena) {

            case 1:
                
                switch (unidade) {
                    case 0 : System.out.print(extenso +" Dez ");
                    case 1 : System.out.print(extenso + "e Onze reais ");
                    break;
                    case 2 : System.out.print(extenso + "e Doze reais ");
                    break;
                    case 3 : System.out.print(extenso + "e Trese reais ");
                    break;
                    case 4 : System.out.print(extenso + "e Quatorze reais ");
                    break;
                    case 5 : System.out.print(extenso + "e Quinze reais ");
                    break;
                    case 6 : System.out.print(extenso + "e Dezeseis reais ");
                    break;
                    case 7 : System.out.print(extenso + "e Dezesete reais ");
                    break;
                    case 8 : System.out.print(extenso + "e Dezoito reais ");
                    break;
                    case 9 : System.out.print(extenso + "e Dezenove reais ");
                    break;
                
                }
                unidade = 0;
                break;
            case 2:
                System.out.print(extenso + "e Vinte ");
                break;
            case 3:
                System.out.print(extenso + "e Trinta  ");
                break;
            case 4:
                System.out.print(extenso + "e Quarenta  ");
                break;
            case 5:
                System.out.print(extenso + "e Cinquenta ");
                break;
            case 6:
                System.out.print(extenso + "e Setenta ");
                break;
            case 7:
                System.out.print(extenso + "e Setenta  ");
                break;
            case 8:
                System.out.print(extenso + "e Oitenta ");
                break;
            case 9:
                System.out.print(extenso + "e Noventa ");
                break;
        }
        

        switch (unidade) {

            case 1:
                System.out.print(extenso + "e Um reais ");
                break;
            case 2:
                System.out.print(extenso + "e Dois reais ");
                break;
            case 3:
                System.out.print(extenso + "e Tres reais ");
                break;
            case 4:
                System.out.print(extenso + "e Quatro reais ");
                break;
            case 5:
                System.out.print(extenso + "e Cinco reais ");
                break;
            case 6:
                System.out.print(extenso + "e Seis reais ");
                break;
            case 7:
                System.out.print(extenso + "e Sente reais ");
                break;
            case 8:
                System.out.print(extenso + "e Oito reais ");
                break;
            case 9:
                System.out.print(extenso + "e Nove reais ");
                break;
        }
        
        System.out.println("");
        System.out.println("____________________________________________________");
        System.out.println("");
        System.out.println("                    C. Das Missões, 20, agosto, 2019");
        System.out.println("");
        System.out.println("");
        System.out.println("                        __________________________  ");
        System.out.println("                                 Lucas Krötz  ");

    }

}
