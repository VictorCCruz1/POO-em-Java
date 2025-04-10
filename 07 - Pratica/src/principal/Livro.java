package principal;

public class Livro implements Publicacao {
    private String titulo, autor;
    private Pessoa leitor;
    private int totPaginas, pagAtual;
    private boolean aberto;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String detalhes() {
        return "Livro{ "+
                "\ntitulo     = " + this.titulo +
                "\nautor      = " + this.autor +
                "\nleitor     = " + this.leitor.getNome() +
                "\nsua idade  = " + this.leitor.getIdade() +
                "\nseu sexo   = " + this.leitor.getSexo() +
                "\ntotPaginas = " + this.totPaginas +
                "\npagAtual   = " + this.pagAtual +
                "\naberto     = " + this.aberto +
                "\n}";
    }

    public String getTitulo(){return this.titulo;}
    public void setTitulo(String titulo){this.titulo = titulo;}

    public String getAutor(){return this.autor;}
    public void setAutor(String autor){this.autor = autor;}

    public Pessoa getLeitor() {return leitor;}
    public void setLeitor(Pessoa leitor) {this.leitor = leitor;}

    public int getTotPaginas() {return totPaginas;}
    public void setTotPaginas(int totPaginas) {this.totPaginas = totPaginas;}

    public boolean isAberto() {return aberto;}
    public void setAberto(boolean aberto) {this.aberto = aberto;}

    public int getPagAtual() {return pagAtual;}
    public void setPagAtual(int pagAtual) {this.pagAtual = pagAtual;}


    @Override
    public void abrir() {this.aberto = true;}
    @Override
    public void fechar() {this.aberto = false;}
    @Override
    public void folhear(int p){
            if (p <= this.totPaginas && p > 0){
                this.pagAtual= p;}
            else{System.out.println("Essa página não existe.");}
    }
    @Override
    public void avancarPag() {this.pagAtual++;}
    @Override
    public void voltarPag() {this.pagAtual--;}
}
