public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
    ContaBanco conta1 = new ContaBanco(150.00f,true);

    conta1.setStatus(true);
    conta1.setSaldo(1500.00f);
    conta1.status();
    System.out.println("----------------------------------");
    conta1.depositar(500f);
    conta1.status();
    System.out.println("----------------------------------");
    conta1.sacar(150f);
    System.out.println("----------------------------------");
    conta1.depositar(200f);
    System.out.println("----------------------------------");
    }
}