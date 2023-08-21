import java.util.*;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Aprovacao {
    private boolean aprovacao = false;
    Sala sala;
    public void acessarSala(Sala novaSala)
    {
        sala = novaSala;
    }
    /**
     * User Story 1 - Caio da Silva Alves
     */
    public void testarEquipamento()
    {
        System.out.println("/----------STATUS DOS EQUIPAMENTOS----------/\n");
        if(sala.getStatusSeguranca() == false)
        {
            System.out.println("Segurança: Necessita manutenção!");
        }
        else
        {
            System.out.println("Segurança: Funcionando corretamente!");
        }
        if(sala.getStatusLimpeza() == false)
        {
            System.out.println("Limpeza: Necessita manutenção!");
        }
        else
        {
            System.out.println("Limpeza: Funcionando corretamente!");
        }
        if(sala.getStatusBombeiros() == false)
        {
            System.out.println("Equip. Incêndio: Necessita manutenção!");
        }
        else
        {
            System.out.println("Equio. Incêndio: Funcionando corretamente!");
        }
        if(sala.getStatusLuzes() == false)
        {
            System.out.println("Luzes: Necessita manutenção!");
        }
        else
        {
            System.out.println("Luzes: Funcionando corretamente!");
        }
        if(sala.getStatusSom() == false)
        {
            System.out.println("Som: Necessita manutenção!");
        }
        else
        {
            System.out.println("Som: Funcionando corretamente!");
        }
        if(sala.getStatusTela() == false)
        {
            System.out.println("Tela: Necessita manutenção!");
        }
        else
        {
            System.out.println("Tela: Funcionando corretamente!");
        }
        if(sala.getStatusProjetor() == false)
        {
            System.out.println("Projetor: Necessita manutenção!");
        }
        else
        {
            System.out.println("Projetor: Funcionando corretamente!");
        }
        if(sala.getStatusTMS() == false)
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
            if(sala.getStatusSeguranca() == true)
            {
                escrita.write("Segurança: Funcionando!\n");
            }
            else
            {
                escrita.write("Segurança: Necessita Manutenção!\n");
            }
            if(sala.getStatusLimpeza() == true)
            {
                escrita.write("Limpeza: Funcionando!\n");
            }
            else
            {
                escrita.write("Limpeza: Necessita Manutenção!\n");
            }
            if(sala.getStatusBombeiros() == true)
            {
                escrita.write("Equip. Incêndio: Funcionando!\n");
            }
            else
            {
                escrita.write("Equip. Incêndio: Necessita Manutenção!\n");
            }
            if(sala.getStatusLuzes() == true)
            {
                escrita.write("Luzes: Funcionando!\n");
            }
            else
            {
                escrita.write("Luzes: Necessita Manutenção!\n");
            }
            if(sala.getStatusSom() == true)
            {
                escrita.write("Som: Funcionando!\n");
            }
            else
            {
                escrita.write("Som: Necessita Manutenção!\n");
            }
            if(sala.getStatusTela() == true)
            {
                escrita.write("Tela: Funcionando!\n");
            }
            else
            {
                escrita.write("Tela: Necessita Manutenção!\n");
            }
            if(sala.getStatusProjetor() == true)
            {
                escrita.write("Projetor: Funcionando!\n");
            }
            else
            {
                escrita.write("Projetor: Necessita Manutenção!\n");
            }
            if(sala.getStatusTMS() == true)
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

    
    /**
     * User Story 2 - Lorenzo Lima Germano
     */
    public void ChamarFuncionario(){

        int funcparea = 500;
        int Qtdlimp = 0;
        int Qtdrep = 0;
        int Qtdti = 0;


        if(sala.getStatusLimpeza() == false){
            Qtdlimp = (sala.getComprimento() * sala.getLargura() + sala.getQuantidadeAssentos())/funcparea;
            System.out.println ("Chamar " +Qtdlimp +" funcionarios da equipe de Limpeza");

        }
        if(sala.getStatusLuzes() == false || sala.getStatusSom() == false || sala.getStatusTela() == false){
            if (sala.getStatusLuzes() == false){
                Qtdrep ++;
            }
            if (sala.getStatusSom() == false){
                Qtdrep ++;
            }
            if (sala.getStatusTela() == false){
                Qtdrep ++;
            }

            System.out.println ("Chamar " +Qtdrep +" funcionarios da equipe de Reparos");
        }
        if(sala.getStatusProjetor() == false || sala.getStatusTMS() == false){
            if (sala.getStatusTMS() == false){
                Qtdti ++;
            }
            if (sala.getStatusProjetor() == false){
                Qtdti ++;
            }
            System.out.println ("Chamar " +Qtdti +" funcionarios da equipe de TI");
        }
        if(sala.getStatusBombeiros() == false){
            System.out.println ("Chamar equipe de Bombeiros");
        }
    }
    public void setStatusSala(int selecao, int status){
       
        
        if(status != 0 && status!= 1)
        {
            System.out.println("INSIRA UM VALOR VÁLIDO!");
        }
        else
        {
            sala.checkList[selecao] = status;
        }
        
    }
    public void getEspecificacao(){
        String nomeArquivo = "Especs.txt";
        try
        {
            BufferedWriter escrita = new BufferedWriter(new FileWriter(nomeArquivo));
            escrita.write("-----ESPECIFICACOES DA SALA-----");
            escrita.newLine();
            escrita.write("Numero da sala:"+sala.getNumDaSala()+"\n");
            escrita.write("Comprimento:"+sala.getComprimento()+"\n");
            escrita.write("Largura:"+sala.getLargura()+"\n");
            escrita.write("Quantidade de assentos:"+sala.getQuantidadeAssentos()+"\n");
            escrita.write("Acessíbilidade:"+sala.isEhAcessivel()+"\n");
            escrita.write("Tipo de projetor:"+sala.getTipoProjetor()+"\n");
            escrita.write("Quantidade de saidas de emergência:"+sala.getQuantidadeSaidasEmergencia()+"\n");
            escrita.write("Equipamento eletronico para projeção:"+sala.getEquipamentoEletronicoSalaProjecao()+"\n");
            escrita.write("Disposição das caixas de som:"+sala.getDescricaoDisposicaoCaixasDeSom()+"\n");
            escrita.close();
            System.out.println("\nRelatório gerado com sucesso!");
        }
        catch(IOException e)
        {
            System.err.println("Erro ao gerar relatório!" + e.getMessage());
        }
    }
    
     public boolean getstatusAprovacao(){
     int qtdEquipamentosFuncionando = 0;
     for(int i = 0; i < 8; i++){
            if(sala.checkList[i] == 1){
                qtdEquipamentosFuncionando++;
            }
        }
     if(qtdEquipamentosFuncionando == 7){
            aprovacao = true;
           
        }
     return aprovacao;

    }
}