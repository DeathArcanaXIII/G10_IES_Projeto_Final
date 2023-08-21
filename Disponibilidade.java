/**
 * Escreva uma descrição da classe Disponibilidade aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Disponibilidade
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    int [] listaSalas = new int[10];
    int [] salasDisponiveis = new int [10];
    
    Sala sala01 = new Sala();
    Sala sala02 = new Sala();
    Sala sala03 = new Sala();
    
    public Sala getSala01()
    {
        return sala01;
    }
    
    public Sala getSala02()
    {
        return sala02;
    }
    
    public Sala getSala03()
    {
        return sala03;
    }
    
    /**
     * -Escolha uma função-
     * Gerenciar salas: 1
     * Checar disponibilidade: 2
     * Sair: 3
       */
    public void executarPrograma(int comando){
        if(comando == 1)
        {
            System.out.println("Qual sala deseja gerenciar? (Inserir um numero de 1 a 9!)");
            
        }
    }
}
