package com.mycompany.canetaazul;

import java.util.Scanner;

public class Classe {
 
    String marca;
    String cor;
    double ponta;
    int carga;
    boolean tampada;
    
    
    void estado(){
        System.out.println("Informações da caneta " 
                + "\ncor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ela está tampada? " + (this.tampada ? "Sim" : "Não"));
    }
    
    void escrever(){
        if(this.tampada == true){
            System.out.println("Está tampada!\n");
        }else{
            System.out.println("Está destampada!\n");
        }
        
    }
    
    void tampar(){
         this.tampada = true;
    }
    
    void destampar(){
         this.tampada = false;
    }
    
    
    boolean perguntaTampada(){
        Scanner STRING = new Scanner(System.in);
        System.out.println("\nA caneta está tampada? (Sim/Não)");
        String resposta = STRING.nextLine().toLowerCase();
        
        if(resposta.equals("Sim") || resposta.equals("sim")){
            return true;
        }else if (resposta.equals("Não") || resposta.equals("nao")){
            return false;
        }else{
            System.out.println("Reposta inválida. Por favor, digite sim ou não de forma correta.");
            return perguntaTampada();
        }
        
        
    }
    
}
