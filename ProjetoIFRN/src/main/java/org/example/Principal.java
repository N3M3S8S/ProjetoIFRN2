//Definindo pacote da classe
package org.example;

//Até o momento, esta será a classe principal, onde toda mágica acontecerá
public class Principal {
    //Criando método principal
    public static void main (String[] args) {
        //Criando o primeiro objeto
        Aluno a1 = new Aluno();

        //Experimentando seus métodos
        a1.getNome();
        a1.getEmail();
        a1.getMatricula();
        a1.getNotas();
        a1.getMedia();
    }
}
