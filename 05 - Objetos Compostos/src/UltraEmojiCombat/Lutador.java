package UltraEmojiCombat;

public class Lutador {

    private String nome, nacionalidade, categoria;
    private int idade,vitorias, derrortas, empates;
    private float altura, peso;

    public void apresentar(){
        System.out.println("----------==----------");
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Peso: "+this.getPeso()+"kg");
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrortas());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("----------==----------");
    }
    public void status(){
        System.out.println(getPeso()+"kg, "+getVitorias()+" vitórias, "
                +getDerrortas()+ " derrotas, "+getEmpates()+" empates.");
    }
    public void ganharLuta(){setVitorias(getVitorias()+1);}
    public void perdeLuta(){setDerrortas(getDerrortas()+1);}
    public void empatarLuta(){setEmpates(getEmpates()+1);}

    public Lutador(String nome, String nacionalidade, int idade, float altura,
                   float peso, int vitorias, int derrortas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrortas = derrortas;
        this.empates = empates;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getNacionalidade() {return nacionalidade;}

    public void setNacionalidade(String nacionalidade) {this.nacionalidade = nacionalidade;}

    public int getIdade() {return idade;}

    public void setIdade(int idade) {this.idade = idade;}

    public float getAltura() {return altura;}

    public void setAltura(float altura) {this.altura = altura;}

    public float getPeso() {return peso;}

    public void setPeso(float peso) {
        this.peso = peso; setCategoria();
    }

    public String getCategoria() {return categoria;}

    private void setCategoria() {
        while (this.peso<52.2){
            this.categoria = "Peso inválido";
            return;
        }
        while (this.peso>=52.2 && peso<=70.3){
            this.categoria = "Leve";
            return;
        }
        while (this.peso>70.3 && this.peso<120.2){
            this.categoria = "Médio";
            return;
        }
        while (this.peso>120.2){
            this.categoria = "Pesado";
            return;
        }
    }

    public int getVitorias() {return vitorias;}

    public void setVitorias(int vitorias) {this.vitorias = vitorias;}

    public int getDerrortas() {return derrortas;}

    public void setDerrortas(int derrortas) {this.derrortas = derrortas;}

    public int getEmpates() {return empates;}

    public void setEmpates(int empates) {this.empates = empates;}
}
