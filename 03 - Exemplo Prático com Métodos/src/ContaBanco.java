public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0f;
        this.status = status;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "Corrente"){
            this.setSaldo(50f);
        }
        if (t == "Poupança") {
            this.setSaldo(150f);
        }
    }

    public void fecharConta(){
        if (getSaldo() != 0f) {
            System.out.println("Não é possível fechar a conta, pois o saldo" +
                    "é de: R$" + getSaldo() + ".");
        } else {
            this.setStatus(false);
            System.out.println("Conta foi fechada.");
        }

    }

    public void depositar(float d){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo()+d);
            System.out.println("Saldo anterior: R$"+(getSaldo()-d)+".");
            System.out.println("Saldo atual: R$"+getSaldo()+".");
        } else {
            System.out.println("Conta inativa, não foi possível depositar.");
        }
    }

    public void sacar(float v){
        if (this.isStatus()){
            if (getSaldo() > v);{
                this.setSaldo(getSaldo()-v);
                System.out.println("Saldo anterior: R$"+(getSaldo()+v)+".");
                System.out.println("Saldo atual: R$"+getSaldo()+".");
            }
            if (getSaldo() < v){
                System.out.println("Saldo insuficiente.");

            }

        } else {
            System.out.println("Conta inativa.");
        }
    }

    public void sacarMensal(String tipo){
        if(this.isStatus()) {
            if (tipo == "Corrente") {
                this.setSaldo(getSaldo() - 12);
            } else {
                this.setSaldo(getSaldo() - 20);
            }
         }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void status(){
        System.out.println("Saldo = R$"+ saldo+".");
        System.out.println("Status = "+ status +".");
    }

}
