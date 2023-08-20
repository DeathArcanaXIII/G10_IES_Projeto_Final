import java.util.*; 
public class Aprovacao{
    private boolean statusAprovacao;
    private boolean statusSeguranca;
    private boolean statusLimpeza;
    private boolean statusPermissaoBombeiros;
    private boolean statusLuzSom;
    private boolean statusProjetorTMS;
    private boolean statusTela;

    public void testarEquipamento()
    {
        Sala sala01 = new Sala();
        if(sala01.getStatusSom() == false)
        {
            System.out.println("Som: Necessita manutenção!");
        }
    }
    public Aprovacao() {
        // Configuração inicial dos status
        statusAprovacao = false;
        statusSeguranca = false;
        statusLimpeza = false;
        statusPermissaoBombeiros = false;
        statusLuzSom = false;
        statusProjetorTMS = false;
        statusTela = false;
    }

    public boolean isStatusAprovacao() {
        return statusAprovacao;
    }

    public void setStatusAprovacao(boolean statusAprovacao) {
        this.statusAprovacao = statusAprovacao;
    }

    public boolean isStatusSeguranca() {
        return statusSeguranca;
    }

    public void setStatusSeguranca(boolean statusSeguranca) {
        this.statusSeguranca = statusSeguranca;
    }

    public boolean isStatusLimpeza() {
        return statusLimpeza;
    }

    public void setStatusLimpeza(boolean statusLimpeza) {
        this.statusLimpeza = statusLimpeza;
    }

    public boolean isStatusPermissaoBombeiros() {
        return statusPermissaoBombeiros;
    }

    public void setStatusPermissaoBombeiros(boolean statusPermissaoBombeiros) {
        this.statusPermissaoBombeiros = statusPermissaoBombeiros;
    }

    public boolean isStatusLuzSom() {
        return statusLuzSom;
    }

    public void setStatusLuzSom(boolean statusLuzSom) {
        this.statusLuzSom = statusLuzSom;
    }

    public boolean isStatusProjetorTMS() {
        return statusProjetorTMS;
    }

    public void setStatusProjetorTMS(boolean statusProjetorTMS) {
        this.statusProjetorTMS = statusProjetorTMS;
    }

    public boolean isStatusTela() {
        return statusTela;
    }

    public void setStatusTela(boolean statusTela) {
        this.statusTela = statusTela;
    }

    public void acessarSala() {
       
    }
    public static void main(String[] args) {
        Aprovacao aprovacao = new Aprovacao();

        aprovacao.setStatusSeguranca(true);
        aprovacao.setStatusLimpeza(true);
        aprovacao.setStatusLuzSom(true);
        aprovacao.setStatusProjetorTMS(true);
        aprovacao.setStatusTela(true);
        aprovacao.acessarSala();

        // Alterar status de aprovação
        aprovacao.setStatusAprovacao(true);

        System.out.println("Status de aprovação: " + aprovacao.isStatusAprovacao());
    }
}
