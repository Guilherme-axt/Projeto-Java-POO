/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo;

/**
 *
 * @author Guilherme
 */
public class Computador {
    // Atributos
    private String marca;
    private String modelo;
    private double preco;
    private int memoriaRAM;
    private int armazenamento;

    // Construtor default
    public Computador() {
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
        this.preco = 0.0;
        this.memoriaRAM = 0;
        this.armazenamento = 0;
    }

    // Construtor com parâmetros
    public Computador(String marca, String modelo, double preco, int memoriaRAM, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    // Método para imprimir os atributos
    public void imprimir() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Memória RAM: " + this.memoriaRAM + " GB");
        System.out.println("Armazenamento: " + this.armazenamento + " GB");
        System.out.println();
    }

    // Método main
    public static void main(String[] args) {
        Computador computador = new Computador("Dell", "Inspiron", 3500.0, 16, 512);
        computador.imprimir();
    }
}
