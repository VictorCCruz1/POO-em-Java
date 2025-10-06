public class Main {
    public static void main(String[] args) {
        for (int a = 1; a < 11; a++){
            System.out.printf("--------- Tabuada do %d ---------\n",a);
            for (int i = 1; i < 11; i++) {
                int r = a * i;
                System.out.println(a + " x " + i + " = " + r);
            }
        }
    }
}