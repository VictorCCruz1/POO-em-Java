package principal;

public class Pessoa {
    private String nome, sexo;
    private int idade;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;

    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public void fazerAniver(){
        this.idade++;
    }
}
