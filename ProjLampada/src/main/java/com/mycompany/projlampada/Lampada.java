/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projlampada;

/**
 *
 * @author iranp
 */
public class Lampada {

        String modelo;
        String tensao;
        int potencia;
        String cor;
        String tipoluz;
        int garantiaMeses;
        String[] tipos; 
        boolean tipoAbajur; 
        boolean Ligada;
        
        void Ligar(){
            Ligada = true;
        }
        void Desligar(){
            Ligada = false;
        }
        void status(){
            if(Ligada){
            System.out.println("Lâmpada está Ligada");
            } else {
            System.out.println("Lâmpada está desligada");
            }
        } 
    }

