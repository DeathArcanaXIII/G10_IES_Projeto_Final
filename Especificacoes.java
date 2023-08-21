 

/**
 *
 * @author
 */
public class Especificacoes {
    
    private int comprimento;
    private int largura;
    private int quantidadeAssentos;
    private boolean ehAcessivel;
    private String tipoProjetor;
    private int quantidadeSaidasEmergencia;
    private String equipamentoEletronicoSalaProjecao;
    private String descricaoDisposicaoCaixasDeSom;
    
    public void setEspecificacoes(int comprimento, int largura, int quantidadeAssentos,
                          boolean ehAcessivel, String tipoProjetor,
                          int quantidadeSaidasEmergencia,
                          String equipamentoEletronicoSalaProjecao,
                          String descricaoDisposicaoCaixasDeSom) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.quantidadeAssentos = quantidadeAssentos;
        this.ehAcessivel = ehAcessivel;
        this.tipoProjetor = tipoProjetor;
        this.quantidadeSaidasEmergencia = quantidadeSaidasEmergencia;
        this.equipamentoEletronicoSalaProjecao = equipamentoEletronicoSalaProjecao;
        this.descricaoDisposicaoCaixasDeSom = descricaoDisposicaoCaixasDeSom;
    }
    
    public int getComprimento() {
        return comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }

    public boolean isEhAcessivel() {
        return ehAcessivel;
    }

    public String getTipoProjetor() {
        return tipoProjetor;
    }

    public int getQuantidadeSaidasEmergencia() {
        return quantidadeSaidasEmergencia;
    }

    public String getEquipamentoEletronicoSalaProjecao() {
        return equipamentoEletronicoSalaProjecao;
    }

    public String getDescricaoDisposicaoCaixasDeSom() {
        return descricaoDisposicaoCaixasDeSom;
    }
    
    public void setComprimento(int novoComprimento) {
        comprimento = novoComprimento;
    }
            
    public void setLargura(int novaLargura) {
        largura = novaLargura;
    }
            
    public void setQuantidadeAssentos(int novaQuantidadeAssentos) {
        quantidadeAssentos = novaQuantidadeAssentos;
    }
    
    public void setEhAcessivel(boolean novoEhAcessivel) {
        ehAcessivel = novoEhAcessivel;
    }
    
    public void setTipoProjetor(String novoTipoProjetor) {
        tipoProjetor = novoTipoProjetor;
    }
    
    public void setQuantidadeSaidasEmergencia(int novaQuantidadeSaidasEmergencia) {
        quantidadeSaidasEmergencia = novaQuantidadeSaidasEmergencia;
    }
    
    public void setEquipamentoEletronicoSalaProjecao(String novoEquipamentoEletronicoSalaProjecao) {
        equipamentoEletronicoSalaProjecao = novoEquipamentoEletronicoSalaProjecao;
    }
    
    public void setDescricaoDisposicaoCaixasDeSom(String novaDescricaoDisposicaoCaixasDeSom) {
        descricaoDisposicaoCaixasDeSom = novaDescricaoDisposicaoCaixasDeSom;
    }
}
