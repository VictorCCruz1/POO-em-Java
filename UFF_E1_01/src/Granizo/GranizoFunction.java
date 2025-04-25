package Granizo;

public class GranizoFunction {
    public void granizo(int numero){
        while (numero > 1){
            int resto = (numero % 2);
            if(resto == 0){
                numero = numero / 2;
                System.out.println(numero);
            }else{
                numero = (numero*3)+1;
                System.out.println(numero);
            }
        }
        if (numero < 1){
            System.out.println("Erro, n < 1.");
        }
    }
}
