package testepessoa;

import model.PessoaModel;
import sentimentos.Feliz;

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        PessoaModel pessoa1 = new PessoaModel();
        Feliz feliz = new Feliz();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma das situações que podem afetar o seu humor: ");
        System.out.println("Digite 1 - Para ganhar na mega sena");
        System.out.println("Digite 2 - Para tristeza ");
        System.out.println("Digite 3 - Para infelicidade ");
        System.out.println("Digite uma das opções acima para descrever seu humor: ");

        int resposta = input.nextInt();
        switch (resposta){
            case 1:
                pessoa1.setSentimento((feliz.humor());

        }
    }
}
