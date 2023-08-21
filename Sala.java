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
    
    private int[] checkList = new int[8];
    private int numDaSala;
    private int comprimento;
    private int largura;
    private int quantidadeAssentos;
    private boolean ehAcessivel;
    private String tipoProjetor;
    private int quantidadeSaidasEmergencia;
    private String equipamentoEletronicoSalaProjecao;
    private String descricaoDisposicaoCaixasDeSom;

    /**
     * Construtor para objetos da classe Sala
     */
    public Sala()
    {
        // inicializa variáveis de instância
        for(int i = 0; i < 8; i++){
            checkList[i] = 0;
        }
    }

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
    }

    public int getLargura() {
        return largura;
    }
    
    public void setLargura(int largura){
        this.largura = largura;
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }
    
    public void setQuantidadeAssentos(int quantidadeAssentos){
        this.quantidadeAssentos = quantidadeAssentos;
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
    
    public void setTipoProjetor(String tipoProjetor){
        this.tipoProjetor = tipoProjetor;
    }
    
    public int getQuantidadeSaidasEmergencia() {
        return quantidadeSaidasEmergencia;
    }
 
    public void setQuantidadeSaidasEmergencia(int getQuantidadeSaidasEmergencia){
        this.quantidadeSaidasEmergencia = quantidadeSaidasEmergencia;
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
    
    public void setDescricaoDisposicaoCaixasDeSom(String descricaoDisposicaoCaixasDeSom) {
        this.descricaoDisposicaoCaixasDeSom = descricaoDisposicaoCaixasDeSom;
    }
    
    /**
     Recebe o valor "0" para "Reprovado", e o valor "1" para "Aprovado". 
     */
    public void setStatusSeguranca(int status)
    {
        if(status != 0 && status!= 1)
        {
            System.out.println("INSIRA UM VALOR VÁLIDO!");
        }
        else
        {
            checkList[0] = status;
        }
    }
    
    /**
     Recebe o valor "0" para "Reprovado", e o valor "1" para "Aprovado". 
     */
    //Setter/Getters - Caio da Silva Alves
    public void setStatusLimpeza(int status)
    {
        if(status != 0 && status!= 1)
        {
            System.out.println("INSIRA UM VALOR VÁLIDO!");
        }
        else
        {
            checkList[1] = status;
        }
    }
    
    /**
     Recebe o valor "0" para "Reprovado", e o valor "1" para "Aprovado". 
     */
    public void setStatusBombeiros(int status)
    {
        if(status != 0 && status!= 1)
        {
            System.out.println("INSIRA UM VALOR VÁLIDO!");
        }
        else
        {
            checkList[2] = status;
        }
    }
    
    /**
     Recebe o valor "0" para "Reprovado", e o valor "1" para "Aprovado". 
     */
    public void setStatusLuzes(int status)
    {
        if(status != 0 && status!= 1)
        {
            System.out.println("INSIRA UM VALOR VÁLIDO!");
        }
        else
        {
            checkList[3] = status;
        }
    }
    
    /**
     Recebe o valor "0" para "Reprovado", e o valor "1" para "Aprovado". 
     */
    public void setStatusSom(int status)
    {
        if(status != 0 && status!= 1)
        {
            System.out.println("INSIRA UM VALOR VÁLIDO!");
        }
        else
        {
            checkList[4] = status;
        }
    }
    
    /**
     Recebe o valor "0" para "Reprovado", e o valor "1" para "Aprovado". 
     */
    public void setStatusTela(int status)
    {
        if(status != 0 && status!= 1)
        {
            System.out.println("INSIRA UM VALOR VÁLIDO!");
        }
        else
        {
            checkList[5] = status;
        }
    }
    
    /**
     Recebe o valor "0" para "Reprovado", e o valor "1" para "Aprovado". 
     */
    public void setStatusProjetor(int status)
    {
        if(status != 0 && status!= 1)
        {
            System.out.println("INSIRA UM VALOR VÁLIDO!");
        }
        else
        {
            checkList[6] = status;
        }
    }
    
    /**
     Recebe o valor "0" para "Reprovado", e o valor "1" para "Aprovado". 
     */
    public void setStatusTMS(int status)
    {
        if(status != 0 && status!= 1)
        {
            System.out.println("INSIRA UM VALOR VÁLIDO!");
        }
        else
        {
            checkList[7] = status;
        }
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

