package principal;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro",22,"M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java","Autor de Java",300,p[0]);
        l[1] = new Livro("POO para iniciantes","Autor de POO",500,p[1]);
        l[2] = new Livro("Java Avançado","Autora Avançada", 800,p[0]);

        l[0].abrir();
        l[0].folhear(150);

        System.out.println(l[0].detalhes());


    }
}