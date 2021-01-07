//Trabalho Uninter
//Tópicos Avançados em Programação
//Douglas Ribeiro Silverio
//RU: 260075

package br.com.douglassilverio.calculadora; //pacote que se encontra a classe

import androidx.appcompat.app.AppCompatActivity; //importação de outras classes
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Operacoes operacoes = new Operacoes(); //instanciação da classe Operacoes


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);

    }


    public void zero(View view){ //método que será executado ao apertar o número 0 no visor
        if(operacoes.getPrimeiroNumero().equals("sim")){ //verifica se é o primeiro número da conta
            if(operacoes.getN1().equals("")) { //sendo o primeiro número verifica se ele está vazio
                operacoes.setN1("0"); //estando vazio lhe é atribuído o dígito zero
                textView.setText(operacoes.getN1()); //é impresso no visor o valor do atributo N1 do objeto operacoes utilizando getters através da instância da classe
            }
            else {
                operacoes.setN1(operacoes.getN1() + "0");//caso a primeira casa ja contenha dígitos o dígito zero será adicionado após o último dígito
                textView.setText(operacoes.getN1()); //é impresso no visor o valor do atributo N2 do objeto operacoes utilizando getters através da instância da classe
            }
        }
        else{//caso não seja o primeiro número da conta
            if(operacoes.getN2().equals("")){//verifica se o segundo número está vazio
                operacoes.setN2("0");//estando vazio lhe é atribuído o número zero
                textView.setText(operacoes.getN2());//é impresso no visor o valor do atributo N1 do objeto operacoes utilizando getters através da instância da classe
            }
            else{
                operacoes.setN2(operacoes.getN2() + "0");//caso a primeira casa ja contenha dígitos o dígito zero será adicionado após o último dígito
                textView.setText(operacoes.getN2());//é impresso no visor o valor do atributo N2 do objeto operacoes utilizando getters através da instância da classe
            }
        }

    }

    public void um(View view){

        if(operacoes.getPrimeiroNumero().equals("sim")){
            if(operacoes.getN1().equals("")) {
                operacoes.setN1("1");
                textView.setText(operacoes.getN1());
            }
            else {
                operacoes.setN1(operacoes.getN1() + "1");
                textView.setText(operacoes.getN1());
            }
        }
        else{
            if(operacoes.getN2().equals("")){
                operacoes.setN2("1");
                textView.setText(operacoes.getN2());
            }
            else{
                operacoes.setN2(operacoes.getN2() + "1");
                textView.setText(operacoes.getN2());
            }
        }

    }

    public void dois(View view){

        if(operacoes.getPrimeiroNumero().equals("sim")){
            if(operacoes.getN1().equals("")) {
                operacoes.setN1("2");
                textView.setText(operacoes.getN1());

            }
            else {
                operacoes.setN1(operacoes.getN1() + "2");
                textView.setText(operacoes.getN1());

            }
        }
        else{
            if(operacoes.getN2().equals("")){
                operacoes.setN2("2");
                textView.setText(operacoes.getN2());

            }
            else{
                operacoes.setN2(operacoes.getN2() + "2");
                textView.setText(operacoes.getN2());
            }
        }

    }

    public void tres(View view){

        if(operacoes.getPrimeiroNumero().equals("sim")){
            if(operacoes.getN1().equals("")) {
                operacoes.setN1("3");
                textView.setText(operacoes.getN1());

            }
            else {
                operacoes.setN1(operacoes.getN1() + "3");
                textView.setText(operacoes.getN1());

            }
        }
        else{
            if(operacoes.getN2().equals("")){
                operacoes.setN2("3");
                textView.setText(operacoes.getN2());

            }
            else{
                operacoes.setN2(operacoes.getN2() + "3");
                textView.setText(operacoes.getN2());
            }
        }

    }

    public void quatro(View view){

        if(operacoes.getPrimeiroNumero().equals("sim")){
            if(operacoes.getN1().equals("")) {
                operacoes.setN1("4");
                textView.setText(operacoes.getN1());

            }
            else {
                operacoes.setN1(operacoes.getN1() + "4");
                textView.setText(operacoes.getN1());

            }
        }
        else{
            if(operacoes.getN2().equals("")){
                operacoes.setN2("4");
                textView.setText(operacoes.getN2());

            }
            else{
                operacoes.setN2(operacoes.getN2() + "4");
                textView.setText(operacoes.getN2());
            }
        }

    }

    public void cinco(View view){

        if(operacoes.getPrimeiroNumero().equals("sim")){
            if(operacoes.getN1().equals("")) {
                operacoes.setN1("5");
                textView.setText(operacoes.getN1());

            }
            else {
                operacoes.setN1(operacoes.getN1() + "5");
                textView.setText(operacoes.getN1());

            }
        }
        else{
            if(operacoes.getN2().equals("")){
                operacoes.setN2("5");
                textView.setText(operacoes.getN2());

            }
            else{
                operacoes.setN2(operacoes.getN2() + "5");
                textView.setText(operacoes.getN2());
            }
        }

    }

    public void seis(View view){

        if(operacoes.getPrimeiroNumero().equals("sim")){
            if(operacoes.getN1().equals("")) {
                operacoes.setN1("6");
                textView.setText(operacoes.getN1());

            }
            else {
                operacoes.setN1(operacoes.getN1() + "6");
                textView.setText(operacoes.getN1());

            }
        }
        else{
            if(operacoes.getN2().equals("")){
                operacoes.setN2("6");
                textView.setText(operacoes.getN2());

            }
            else{
                operacoes.setN2(operacoes.getN2() + "6");
                textView.setText(operacoes.getN2());
            }
        }

    }

    public void sete(View view){

        if(operacoes.getPrimeiroNumero().equals("sim")){
            if(operacoes.getN1().equals("")) {
                operacoes.setN1("7");
                textView.setText(operacoes.getN1());

            }
            else {
                operacoes.setN1(operacoes.getN1() + "7");
                textView.setText(operacoes.getN1());

            }
        }
        else{
            if(operacoes.getN2().equals("")){
                operacoes.setN2("7");
                textView.setText(operacoes.getN2());

            }
            else{
                operacoes.setN2(operacoes.getN2() + "7");
                textView.setText(operacoes.getN2());
            }
        }

    }

    public void oito(View view){

        if(operacoes.getPrimeiroNumero().equals("sim")){
            if(operacoes.getN1().equals("")) {
                operacoes.setN1("8");
                textView.setText(operacoes.getN1());

            }
            else {
                operacoes.setN1(operacoes.getN1() + "8");
                textView.setText(operacoes.getN1());

            }
        }
        else{
            if(operacoes.getN2().equals("")){
                operacoes.setN2("8");
                textView.setText(operacoes.getN2());

            }
            else{
                operacoes.setN2(operacoes.getN2() + "8");
                textView.setText(operacoes.getN2());
            }
        }

    }

    public void nove(View view){

        if(operacoes.getPrimeiroNumero().equals("sim")){
            if(operacoes.getN1().equals("")) {
                operacoes.setN1("9");
                textView.setText(operacoes.getN1());

            }
            else {
                operacoes.setN1(operacoes.getN1() + "9");
                textView.setText(operacoes.getN1());

            }
        }
        else{
            if(operacoes.getN2().equals("")){
                operacoes.setN2("9");
                textView.setText(operacoes.getN2());

            }
            else{
                operacoes.setN2(operacoes.getN2() + "9");
                textView.setText(operacoes.getN2());
            }
        }

    }

    public void adicao(View view){
        operacoes.setOperacao("+");//apertando no sinal de adição ele será inserido em formato de String no atributo operacao da classe Operacoes
        operacoes.setPrimeiroNumero("nao");//seta como "não" o atributo PrimeiroNúmero da classe operacoes para que após o sinal seja inserida a segunda casa númerica a ser utilizada na conta
    }

    public void multiplicacao(View view){
        operacoes.setOperacao("*");
        operacoes.setPrimeiroNumero("nao");
    }

    public void subtracao(View view){
        operacoes.setOperacao("-");
        operacoes.setPrimeiroNumero("nao");
    }

    public void divisao(View view){
        operacoes.setOperacao("/");
        operacoes.setPrimeiroNumero("nao");
    }

    public void igual(View view){//verifica na classe operacoes qual a operação será utilizada na conta
        if(operacoes.getOperacao().equals("+")){//caso seja uma adicao
            textView.setText(operacoes.adicao(operacoes));//passa o objeto operacoes como parâmetro no método adicao da classe Operacoes e o resultado retornado é impresso no visor
        }
        if(operacoes.getOperacao().equals("*")){
            textView.setText(operacoes.multiplicacao(operacoes));
        }
        if(operacoes.getOperacao().equals("-")){
            textView.setText(operacoes.subtracao(operacoes));
        }
        if(operacoes.getOperacao().equals("/")){
            textView.setText(operacoes.divisao(operacoes));
        }
    }

    public void clear(View view){//utilizado para limpar os dados da classe operacoes
        operacoes.setN1("");
        operacoes.setN2("");
        operacoes.setOperacao("");
        operacoes.setPrimeiroNumero("sim");
        textView.setText("");
    }

    public void ponto(View view){//utilizado para representar números decimais
        if(operacoes.getPrimeiroNumero().equals("sim")) {//verifica se é o primeiro número da conta
            if (operacoes.getN1() != "") {//verifica se ele está preenchido
                operacoes.setN1(operacoes.getN1() + ".");//caso esteja preenchido é inserido um ponto após o último número
                textView.setText(operacoes.getN1());//o atual estado da variável N1 do objeto operacoes é impresso na tela
            }
        }
        else{//caso seja o segundo número da conta
            if (operacoes.getN2() != "") {//verifica se ele está preenchido
                operacoes.setN2(operacoes.getN2() + ".");//caso esteja preenchido é inserido um ponto após o último número
                textView.setText(operacoes.getN2());//o atual estado da variável N2 do objeto operacoes é impresso na tela
            }
        }
    }
}
