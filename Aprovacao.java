import java.util.*; 
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Aprovacao{
    private boolean statusAprovacao;
    private boolean statusSeguranca;
    private boolean statusLimpeza;
    private boolean statusPermissaoBombeiros;
    private boolean statusLuzSom;
    private boolean statusProjetorTMS;
    private boolean statusTela;
    
    Sala sala01 = new Sala();
    
    public void initStatus()
    {
        sala01.setStatusSeguranca(1);
    }

    /** 
     * User Story 1 - Caio da Silva Alves
     */
    public void testarEquipamento() 
    {
        System.out.println("/----------STATUS DOS EQUIPAMENTOS----------/\n");
        if(sala01.getStatusSeguranca() == false)
        {
            System.out.println("Segurança: Necessita manutenção!");
        }
        else
        {
            System.out.println("Segurança: Funcionando corretamente!");
        }
        if(sala01.getStatusLimpeza() == false)
        {
            System.out.println("Limpeza: Necessita manutenção!");
        }
        else
        {
            System.out.println("Limpeza: Funcionando corretamente!");
        }
        if(sala01.getStatusBombeiros() == false)
        {
            System.out.println("Equip. Incêndio: Necessita manutenção!");
        }
        else
        {
            System.out.println("Equio. Incêndio: Funcionando corretamente!");
        }
        if(sala01.getStatusLuzes() == false)
        {
            System.out.println("Luzes: Necessita manutenção!");
        }
        else
        {
            System.out.println("Luzes: Funcionando corretamente!");
        }
        if(sala01.getStatusSom() == false)
        {
            System.out.println("Som: Necessita manutenção!");
        }
        else
        {
            System.out.println("Som: Funcionando corretamente!");
        }
        if(sala01.getStatusTela() == false)
        {
            System.out.println("Tela: Necessita manutenção!");
        }
        else
        {
            System.out.println("Tela: Funcionando corretamente!");
        }
        if(sala01.getStatusSeguranca() == false)
        {
            System.out.println("Projetor: Necessita manutenção!");
        }
        else
        {
            System.out.println("Projetor: Funcionando corretamente!");
        }
        if(sala01.getStatusTMS() == false)
        {
            System.out.println("TMS(Theater Management System): Necessita manutenção!");
        }
        else
        {
            System.out.println("TMS(Theater Management System): Funcionando corretamente!");
        }
        
        criarRelatorioTXT();
    }
    
    /** 
     * User Story 1 - Caio da Silva Alves 
     */
    private void criarRelatorioTXT()
    {
        String nomeArquivo = "Relatorio.txt";
        try
        {
            BufferedWriter escrita = new BufferedWriter(new FileWriter(nomeArquivo));
            escrita.write("-----STATUS DO EQUIPAMENTO-----");
            escrita.newLine();
            if(sala01.getStatusSeguranca() == true)
            {
                escrita.write("Segurança: Funcionando!\n");
            }
            else
            {
                escrita.write("Segurança: Necessita Manutenção!\n");
            }
            if(sala01.getStatusLimpeza() == true)
            {
                escrita.write("Limpeza: Funcionando!\n");
            }
            else
            {
                escrita.write("Limpeza: Necessita Manutenção!\n");
            }
            if(sala01.getStatusBombeiros() == true)
            {
                escrita.write("Equip. Incêndio: Funcionando!\n");
            }
            else
            {
                escrita.write("Equip. Incêndio: Necessita Manutenção!\n");
            }
            if(sala01.getStatusLuzes() == true)
            {
                escrita.write("Luzes: Funcionando!\n");
            }
            else
            {
                escrita.write("Luzes: Necessita Manutenção!\n");
            }
            if(sala01.getStatusSom() == true)
            {
                escrita.write("Som: Funcionando!\n");
            }
            else
            {
                escrita.write("Som: Necessita Manutenção!\n");
            }
            if(sala01.getStatusTela() == true)
            {
                escrita.write("Tela: Funcionando!\n");
            }
            else
            {
                escrita.write("Tela: Necessita Manutenção!\n");
            }
            if(sala01.getStatusProjetor() == true)
            {
                escrita.write("Projetor: Funcionando!\n");
            }
            else
            {
                escrita.write("Projetor: Necessita Manutenção!\n");
            }
            if(sala01.getStatusTMS() == true)
            {
                escrita.write("TMS(Theater Management System): Funcionando!\n");
            }
            else
            {
                escrita.write("TMS(Theater Management Sustem): Necessita Manutenção!\n");
            }
            escrita.close();
            System.out.println("\nRelatório gerado com sucesso!");
        }
        catch(IOException e)
        {
            System.err.println("Erro ao gerar relatório!" + e.getMessage());
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
