
class Main{
    public static void main(String[] args) {
        for (int i = 2; i <= 8; i = i + 2) {
            for (int j = i; j <= 4; j++) {
                for (int k = 1; k <= j; k = k + i) {
                    System.out.println("i = "+i + ", j = " + j + ", k = " + k);
                }
            }
        }
    }
}

/*

 O programa imprime os números correspondentes aos inteiros
 da sequência dos loops i, j e k.
 "i" imprime o mesmo 5 vezes aguardando os outros loops que imprime
 "j" é quem interrompe a sequência, pois recebe o valor 4 da soma
  antes mesmo que "i" possa imprimir por estar mais externo no loop
 "k" é o loop mais ao centro que contem o println, que faz com que
 ocorram repetições nos prints nos números atribuídos a "j" e "i"

 */