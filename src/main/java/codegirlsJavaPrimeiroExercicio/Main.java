package codegirlsJavaPrimeiroExercicio;

public class Main {

    public static void main(String[] args){

        //Chamar Classe Calculadora
        Calculadora.soma(7,4);
        Calculadora.sobtrair(7,4);
        Calculadora.dividir(7,4);
        Calculadora.multiplicar(7,4);

        //Chamar Classe Mensagem
        Mensagem.obterMensagem(3);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(10);

        //Chamar Classe Emprestimo
        Emprestimo.calcular(2500,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2500,Emprestimo.getTresParcelas());
        Emprestimo.calcular(2500,5);
    }
}
