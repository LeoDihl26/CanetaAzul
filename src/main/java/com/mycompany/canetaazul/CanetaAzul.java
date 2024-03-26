package com.mycompany.canetaazul;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * 
 * Classe CanetaAzul 
 * 
 * 
 * \\\\\\ATRIBUTOS\\\\\\\
 * Marca: caracter - String - Bic
 * Cor: caracter - String - Azul
 * Ponta: numero real - Double - 2.0
 * Carga: numero inteiro - Int - 50
 * Tampa: atributo logico - boolean (true/false) - false
 * 
 * 
 * \\\\\\METODO\\\\\\\
 * Escrever:
 * Rabisco:
 * Pintar:
 * tampar:
 * Destampar:
 * 
 * 
 * metodo rabiscar(); SEMPRE vai ter ()
 * 
 * se (tampada) entao 
 * escrever (ERRO)
 * senao 
 * escrever (Rabiscar)
 * fimSe
 * fimMetodo
 * 
 * metodo tampar()
 * 
 * 
 * \\\\\ESTADO\\\\\
 * tampada
 * 50
 * 
 * 
 * tampada = verdadeiro - (true)
 * fimMetodo
 * fimClasse
 * 
 * 
 * OBJETO - UMA CANETA
 * CLASSE - FORMA/MOLDE
 * 
 * 
 * c1 = new caneta; //depois do new é a classe que vou utilizar & antes do new é o objeto que vai existir
 * c1.cor = azul; //o atributo "cor", do objeto "c1" está recebendo "azul"
 * c1.ponta = 0.5;
 * c1.tampada = false;
 * 
 * c1.escrever();
 * 
 * c2 = new caneta;
 * c2.cor = preta;
 * c2.ponta = 1.0;
 * c2.tampada = true;
 * c2.destampar();
 * 
 * 
 * 
 */
public class CanetaAzul {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner STRING = new Scanner (System.in);
        Scanner INT = new Scanner (System.in);
        Scanner DOUBLE = new Scanner (System.in);
        
        
        
        System.out.printf("Digite a marca da 1º caneta: ");
        String marcaC1 = STRING.nextLine();
        System.out.printf("\nDigite a cor da 1º caneta: ");
        String corC1 = STRING.nextLine();
        System.out.printf("\nDigite a espessura da 1º caneta: ");
        double pontaC1 = DOUBLE.nextDouble();
        System.out.printf("\nDigite a carga da 1º caneta: ");
        int cargaC1 = INT.nextInt();
        
        
      
        Classe c1 = new Classe();
        
        c1.marca = marcaC1;
        c1.cor = corC1;
        c1.ponta = pontaC1;
        c1.carga = cargaC1;
        
        boolean respostaTampada = c1.perguntaTampada();
        c1.tampada = respostaTampada;
        c1.estado();
        c1.escrever();
        
        /*Classe c2 = new Classe();
        c2.marca = "Bic";
        c2.ponta = 7.4;
        c2.cor = "Preta";
        c2.tampada = false;
        c2.carga = 1;
        c2.destampar();
        c2.estado();
        c2.escrever();*/
    }
}
