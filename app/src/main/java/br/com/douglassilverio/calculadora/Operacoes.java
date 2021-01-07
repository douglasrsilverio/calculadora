package br.com.douglassilverio.calculadora;//Pacote que a classe se encontra

import java.text.DecimalFormat;

public class Operacoes {//declaração dos atributos
    private String n1 = "";
    private String n2 = "";
    private String operacao = "";
    private String primeiroNumero = "sim";

    public String getN1() {
        return n1;
    } //declaração dos getters e setters

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(String primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public String adicao(Operacoes op){//método de adicao
        Double resultado;//declara uma variável do tipo double
        resultado = Double.parseDouble(this.n1) + Double.parseDouble(this.n2);//converte o numero um e o numero dois da conta para double e realiza a adicao
        Double resultadoTruncado = Math.floor(resultado * 100) / 100;//Limita o número de casas decimais(truncamento)
        this.n1 = resultadoTruncado.toString(); //armazena o resultado final na primeira casa numérica e converte o mesmo para String
        this.n2 = "";//limpa a segunda casa numérica
        return this.n1;//retorna a primeira casa numérica para o método Igual da classe MainActivity
    }

    public String multiplicacao(Operacoes op){
        Double resultado;
        resultado = Double.parseDouble(this.n1) * Double.parseDouble(this.n2);
        Double resultadoTruncado = Math.floor(resultado * 100) / 100;
        this.n1 = resultadoTruncado.toString();
        this.n2 = "";
        return this.n1;
    }

    public String subtracao(Operacoes op){
        Double resultado;
        resultado = Double.parseDouble(this.n1) - Double.parseDouble(this.n2);
        Double resultadoTruncado = Math.floor(resultado * 100) / 100;
        this.n1 = resultadoTruncado.toString();
        this.n2 = "";
        return this.n1;
    }

    public String divisao(Operacoes op){
        Double resultado;
        resultado = Double.parseDouble(this.n1) / Double.parseDouble(this.n2);
        Double resultadoTruncado = Math.floor(resultado * 100) / 100;
        this.n1 = resultadoTruncado.toString();
        this.n2 = "";
        return this.n1;
    }
}
