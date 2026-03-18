public class Elevador {
    private int andarAtual = 0;
    private int totalAndares = 10;
    private boolean statusPorta ;

    public Elevador(int totalAndares) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.statusPorta = false;
    }

    public void abrirPorta(){
        statusPorta = true;
        System.out.println("Porta aberta!");
    }
    public void fecharPorta(){
        statusPorta = false;
        System.out.println("Porta Fechada!");
    }

    public void subir(){
        if(statusPorta){
            System.out.println("Não posso subir: Porta aberta!");
        }else if(andarAtual >= totalAndares){
            System.out.println("Não posso subir: Já estou no último andar");
        }else {
            andarAtual++;
            System.out.println("Subindo, andar atual: " + andarAtual);
        }
    }

    public void descer(){
        if(statusPorta){
            System.out.println("Não posso descer: Porta aberta!");
        }else if(andarAtual <= 0){
            System.out.println("Não posso descer: Já estou no térreo!");
        }else  {
            andarAtual--;
            System.out.println("Descendo, andar atual: " + andarAtual);
        }
    }
}
