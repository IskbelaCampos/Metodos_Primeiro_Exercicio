package codegirlsJavaPrimeiroExercicio;

public class Emprestimo {

    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do emprestimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresPacerlas());
            System.out.println("Valor final do emprestimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas nao aceitas.");
        }
    }

    public static double getTaxaDuasParcelas(){
        return 0.30;
    }

    public static double getTaxaTresPacerlas(){
        return 0.50;
    }

    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }
}
