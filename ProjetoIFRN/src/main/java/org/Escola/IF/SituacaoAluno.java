package org.Escola.IF;

public class SituacaoAluno {
    //Adicionando método que calcula a situação do aluno
    public String getSituacao(float media) {
        if (media > 90) {
            return "A";
        }
        else {
            if (media > 80) {
                return "B";
            }
            else {
                if (media > 70) {
                    return "B-";
                }
                else {
                    if (media > 60) {
                        return "C";
                    }
                }
            }
        }
        return "Só pra não dar erro";
    }
}
