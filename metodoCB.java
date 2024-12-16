public class metodoCB {
    public static void main(String args[]){
        //CRIAR CONTA
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("isabelly");
        p1.AbrirConta("CC");
        
        //CRIAR CONTA
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Erika");
        p2.AbrirConta("CP");

        //DEPOSITAR
        p1.Depositar(100);
        p2.Depositar(500);

        //SACAR
        p2.Sacar(100);

        //ESTADO
        p1.estadoAtual();
        p2.estadoAtual();
    }
}