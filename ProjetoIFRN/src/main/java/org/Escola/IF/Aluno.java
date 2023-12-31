//Definindo o pacote desta classe
package org.Escola.IF;

//Importando classe para criação da F. de leitura
import java.util.Scanner;

//Definindo Classe Abstrata (Essa classe apenas receberá e armazenará)
//Toda essa classe será apenas uma forma de armazenar e registrar os dados do aluno
public class Aluno {
    //Criando função de leitura
    Scanner ler = new Scanner(System.in);

    //Definindo dados (variáveis) da classe
    String nome;
    String email;
    String matricula;
    double[] notas = new double[4]; //É assim que se cria vetor em Java

    //Definindo método para leitura do nome
    void getNome () {
        System.out.print("Digite o nome do aluno: ");
        nome = ler.nextLine();
    }

    //Definindo método para leitura do email
    void getEmail () {
        System.out.print("Digite o email do aluno: ");
        email = ler.nextLine();
    }

    //Definindo método para leitura da matricula
    void getMatricula () {
        System.out.print("Digite a matrícula do aluno: ");
        matricula = ler.nextLine();
    }

    //Definindo método para registrar as notas
    void getNotas () {
        int i = 0;
        while (i <= 3) {
            System.out.print("Digite a nota número " + (i + 1) + ": ");
            notas[i] = ler.nextDouble();
            i++;
        }
        String descarte = ler.nextLine(); //Problemas relacionados ao Scanner.
       //Procurarei uma forma mais profissional depois.
    }

    //Definindo método para retornar média
    double getMedia () {
        return (notas[0] + notas[1] + notas[2] + notas[3])/4;
    }
}