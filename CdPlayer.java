public class CdPlayer {

    private int numMusica;
    private int faixaAtual = 1;
    private int estado;
    private String status;

    public CdPlayer(){}

    public int getNumMusica() {
        return numMusica;
    }

    public void setNumMusica(int numMusica) {
        this.numMusica = numMusica;
    }

    public int getFaixaAtual() {
        return faixaAtual;
    }

    public void setFaixaAtual(int faixaAtual) {
        this.faixaAtual = faixaAtual;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void tocaCD(){
        setEstado(1);
        System.out.println("Tocando CD...\n");
    }

    public void paraCD(){
        setEstado(2);
        System.out.println("CD Pausado...\n");
    }

    public void interrompeCD(){
        setEstado(3);
        setFaixaAtual(1);
        System.out.println("CD Interrompido...\n");
    }

    public void proximaFaixa(){
        setEstado(4);
        if(++faixaAtual>numMusica){
            setFaixaAtual(faixaAtual = 1);
        }
        else{
            setFaixaAtual(faixaAtual++);
        }
        System.out.println("Pulando para a prÃ³xima faixa...\n");
    }

    public void faixaAnterior(){
        setEstado(5);
        if(--faixaAtual<1){
            setFaixaAtual(faixaAtual = numMusica);
        }
        else{
            setFaixaAtual(faixaAtual--);
        }
        System.out.println("Retrocedendo para faixa anterior...\n");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "Quantidade de Faixas: " + getNumMusica() + "\nEstado: " + getEstado() + " - " + getStatus() + "\nFaixa Atual: " + getFaixaAtual();

    }
}
