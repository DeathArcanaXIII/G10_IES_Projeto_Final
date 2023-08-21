import java.util.*;

/**
 * Escreva uma descrição da classe Sala aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

public class Sala 
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    
    public int[] checkList = {0, 1, 2, 3, 4, 5, 6, 7};
    private int numDaSala = 0;
    private int comprimento = 0;
    private int largura = 0;
    private int quantidadeAssentos;
    private boolean ehAcessivel;
    private String tipoProjetor;
    private int quantidadeSaidasEmergencia;
    private String equipamentoEletronicoSalaProjecao;
    private String descricaoDisposicaoCaixasDeSom;

    public void setNumDaSala(int num)
    {
        this.numDaSala = num;
    }
    
    public int getNumDaSala()
    {
        return numDaSala;
    }
    public int getComprimento() {
        return comprimento;
    }
    
    public void setComprimento(int comprimento){
        this.comprimento = comprimento;
        System.out.println("Comprimento alterado!");
    }

    public int getLargura() {
        return largura;
    }
    
    public void setLargura(int largura){
        this.largura = largura;
        System.out.println("Largura alterado!");
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }
    
    public void setQuantidadeAssentos(int quantidadeAssentos){
        this.quantidadeAssentos = quantidadeAssentos;
        System.out.println("Quantidade de assentos alterado!");
    }
    
    public boolean isEhAcessivel() {
        return ehAcessivel;
    }
    
     public void setEhAcessivel(boolean ehAcessivel){
        this.ehAcessivel = ehAcessivel;
    }
    
    public String getTipoProjetor() {
        return tipoProjetor;
    }
    
    public void setTipoProjetor(int tipoProjetor){
        if(tipoProjetor == 1){
            this.tipoProjetor = "IMAX";
        }
        else if(tipoProjetor == 2){
            this.tipoProjetor = "3D";
        }
        else if(tipoProjetor == 3){
            this.tipoProjetor = "4DX";
        }
        else if(tipoProjetor == 4){
            this.tipoProjetor = "XD";
        }
        else if(tipoProjetor == 5){
            this.tipoProjetor = "X-PLUS";
        }
        else if(tipoProjetor == 6){
            this.tipoProjetor = "Macro-XE";
        }
        else{
            System.out.println("OPÇÃO INVALÍDA");
        }
        System.out.println("Projetor alterado!");
    }
    
    public int getQuantidadeSaidasEmergencia() {
        return quantidadeSaidasEmergencia;
    }
 
    public void setQuantidadeSaidasEmergencia(int getQuantidadeSaidasEmergencia){
        this.quantidadeSaidasEmergencia = quantidadeSaidasEmergencia;
        System.out.println("Saidas de emergencia alterado!");
    }
    
    public String getEquipamentoEletronicoSalaProjecao() {
        return equipamentoEletronicoSalaProjecao;
    }
    
    public void setEquipamentoEletronicoSalaProjecao(String equipamentoEletronicoSalaProjecao) {
        this.equipamentoEletronicoSalaProjecao = equipamentoEletronicoSalaProjecao;
    }
    
    public String getDescricaoDisposicaoCaixasDeSom() {
        return descricaoDisposicaoCaixasDeSom;
    }
    
    public void setDescricaoDisposicaoCaixasDeSom(int tipoSom) {
        if(tipoSom == 1){
            this.descricaoDisposicaoCaixasDeSom = "Stereo";
        }
        else if(tipoSom == 2){
            this.descricaoDisposicaoCaixasDeSom = "Surround 5.1";
        }
        else if(tipoSom == 3){
            this.descricaoDisposicaoCaixasDeSom = "Surround 7.1";
        }
        else{
            System.out.println("Opção Invalída");
        }
        System.out.println("Sistema de som alterado!");
    }

    /**
     Retorna "TRUE" caso funcionando corretamento, retorna "FALSE" caso necessite de manutenção. 
     */
    public boolean getStatusSeguranca()
    {
        if(checkList[0] == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /**
     Retorna "TRUE" caso funcionando corretamento, retorna "FALSE" caso necessite de manutenção. 
     */
    public boolean getStatusLimpeza()
    {
        if(checkList[1] == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /**
     Retorna "TRUE" caso funcionando corretamento, retorna "FALSE" caso necessite de manutenção. 
     */
    public boolean getStatusBombeiros()
    {
        if(checkList[2] == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /**
     Retorna "TRUE" caso funcionando corretamento, retorna "FALSE" caso necessite de manutenção. 
     */
    public boolean getStatusLuzes()
    {
        if(checkList[3] == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /**
     Retorna "TRUE" caso funcionando corretamento, retorna "FALSE" caso necessite de manutenção. 
     */
    public boolean getStatusSom()
    {
        if(checkList[4] == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /**
     Retorna "TRUE" caso funcionando corretamento, retorna "FALSE" caso necessite de manutenção. 
     */
    public boolean getStatusTela()
    {
        if(checkList[5] == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /**
     Retorna "TRUE" caso funcionando corretamento, retorna "FALSE" caso necessite de manutenção. 
     */
    public boolean getStatusProjetor()
    {
        if(checkList[6] == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /**
     Retorna "TRUE" caso funcionando corretamento, retorna "FALSE" caso necessite de manutenção. 
     */
    public boolean getStatusTMS()
    {
        if(checkList[7] == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

