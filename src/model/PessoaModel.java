package model;

public class PessoaModel {

    private String nome;
    private String idade;
    private String altura;
    private String sentimento;

    public PessoaModel() {
        this.nome = "João";
        this.idade = "30 anos";
        this.altura = "1.80";
        this.sentimento = sentimento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getSentimento() {
        return sentimento;
    }

    public void setSentimento(String sentimento) {
        this.sentimento = sentimento;
    }
}
