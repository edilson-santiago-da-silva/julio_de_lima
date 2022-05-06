package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    protected double valor;
    private Tamanho tamanho;
    private List<ItemIncluso> itensInclusos; //Definindo que o objeto será uma lista.
    private String paisFrabricacao; // Modo Automático de encapsular > direito do mouse > refactor > encapsulate fields

    public Produto(String marcaInicial, Tamanho tamanhoInicial) {  // construtor
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
        }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca){
        this.marca = novaMarca;
    }

    public double getValor() { // pega o valor e retorna o valor para usarmos na nossa classe lojinha.
        return this.valor;
    }

    public void setValor(double novoValor) { //toda vez que chamarmos setValor vai vir um novo valor > atribui um novo valor
        if (novoValor > 0) {
            this.valor = novoValor;      //usando condiciçoes na pratica
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public List<ItemIncluso> getItensInclusos(){  //Passando os paramêtros de uma lista para o Get
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novoItensInclusos){  //Passando os paramêtros de uma lista para o Set
        this.itensInclusos = novoItensInclusos;
    }

    public String getPaisFrabricacao() {
        return paisFrabricacao;
    }

    public void setPaisFrabricacao(String novoPaisFrabricacao) {
        this.paisFrabricacao = novoPaisFrabricacao;
    }
}
