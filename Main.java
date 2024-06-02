/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automatos;

import java.util.Scanner;

/**
 *
 * @author Ozeias
 */
public class Main {

    Integer contador;
    char palavra[];

    public static void main(String[] args) {
        Main automatos = new Main();
        String caractere;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o caractere: ");
        caractere = entrada.nextLine();
        automatos.palavra = caractere.toCharArray(); // transformando minha palavra em uma cadeira de caracteres
        automatos.iniciar();
    }

    public void iniciar() {
        contador = 0;
        q0();
    }

    public void q0() {
        if (contador < palavra.length) {
            if (palavra[contador] == 'a') {
                contador++;
                q1();
            } else if (palavra[contador] == 'c') {
                qf();
            } else {
                qerror();
            }
        }
        
        else{
            qerror();
        }
    }

    public void q1() {
        if (contador < palavra.length) {
            if (palavra[contador] == 'b') {
                contador++;
                q2();
            } else {
                qerror();
            } 
        }
        
        else {
            qerror();
        }
    }

    public void q2() {
        if (contador < palavra.length) {
            if (palavra[contador] == 'b') {
                contador++;
                q0();
            } else {
                qerror();
            }
        }
        
        else {
            qerror();
        }
    }

    public void qf() {
        System.out.println("Plavra aceita pelo automato");
    }

    public void qerror() {
        System.out.println("Palavra rejeitada pelo automato");
    }
}
