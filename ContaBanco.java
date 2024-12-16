public class ContaBanco {
    // ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // MÉTODO CONSTRUTOR
    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    // MÉTODOS PERSONALIZADOS
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }


    public void AbrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        }
        else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com Sucesso!");
    }

    public void FecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro!");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito!");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com Sucesso!");
        }
    }

    public void Depositar(double v) {
        if (this.status == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " +this.getDono());
        }
        else{
            System.out.println("Impossivel depositar");
        }
    }

    public void Sacar(double v) {
        if(this.getStatus()){
            if(this.getSaldo() >= v ){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saldo realizado na conta de " +this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }

    public void PagarMensal() {
        int v = 0; //VARIAVEL LOCAL
        if (this.getTipo() == "CC"){
            v = 12;
        }
        else if(this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com Sucesso por " +this.getDono());
        }
        else{
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }

    // GETTERS E SETTERS
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

}