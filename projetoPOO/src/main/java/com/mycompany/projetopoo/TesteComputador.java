package com.mycompany.projetopoo;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;

public class TesteComputador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de dois objetos usando o construtor default
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();

        // Preenchendo os atributos dos objetos criados com o construtor default
        System.out.println("Preencha os dados do computador 1:");
        System.out.print("Marca: ");
        computador1.setMarca(scanner.nextLine());
        System.out.print("Modelo: ");
        computador1.setModelo(scanner.nextLine());
        System.out.print("Preço: ");
        computador1.setPreco(scanner.nextDouble());
        System.out.print("Memória RAM (GB): ");
        computador1.setMemoriaRAM(scanner.nextInt());
        System.out.print("Armazenamento (GB): ");
        computador1.setArmazenamento(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.println("\nPreencha os dados do computador 2:");
        System.out.print("Marca: ");
        computador2.setMarca(scanner.nextLine());
        System.out.print("Modelo: ");
        computador2.setModelo(scanner.nextLine());
        System.out.print("Preço: ");
        computador2.setPreco(scanner.nextDouble());
        System.out.print("Memória RAM (GB): ");
        computador2.setMemoriaRAM(scanner.nextInt());
        System.out.print("Armazenamento (GB): ");
        computador2.setArmazenamento(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do scanner

        // Criação de dois objetos usando o construtor parametrizado
        System.out.println("\nPreencha os dados do computador 3:");
        System.out.print("Marca: ");
        String marca3 = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo3 = scanner.nextLine();
        System.out.print("Preço: ");
        double preco3 = scanner.nextDouble();
        System.out.print("Memória RAM (GB): ");
        int memoriaRAM3 = scanner.nextInt();
        System.out.print("Armazenamento (GB): ");
        int armazenamento3 = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        Computador computador3 = new Computador(marca3, modelo3, preco3, memoriaRAM3, armazenamento3);

        System.out.println("\nPreencha os dados do computador 4:");
        System.out.print("Marca: ");
        String marca4 = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo4 = scanner.nextLine();
        System.out.print("Preço: ");
        double preco4 = scanner.nextDouble();
        System.out.print("Memória RAM (GB): ");
        int memoriaRAM4 = scanner.nextInt();
        System.out.print("Armazenamento (GB): ");
        int armazenamento4 = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        Computador computador4 = new Computador(marca4, modelo4, preco4, memoriaRAM4, armazenamento4);

        // Exibindo os atributos dos quatro objetos criados
        System.out.println("\nAtributos do Computador 1:");
        computador1.imprimir();

        System.out.println("Atributos do Computador 2:");
        computador2.imprimir();

        System.out.println("Atributos do Computador 3:");
        computador3.imprimir();

        System.out.println("Atributos do Computador 4:");
        computador4.imprimir();

        scanner.close();
    }
}

