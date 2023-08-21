import java.util.Scanner;

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
    int nSala = 0;

    Aprovacao aprov = new Aprovacao();
    Sala sala01 = new Sala();
    Sala sala02 = new Sala();
    Sala sala03 = new Sala();

    public Disponibilidade() 
    {
        sala01.setNumDaSala(1);
        sala02.setNumDaSala(2);
        sala03.setNumDaSala(3);
        aprov.acessarSala(sala01);
    }

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
    public void executarPrograma()
    {
        int comando = 0;
        int atributo = 0;
        while(comando != 4)
        {
            if(comando == 0)
            {
                System.out.println("/-----Escolha uma função-----/\n");
                System.out.println("Gerenciar salas: 1\nChecar disponibilidade: 2\nSair: 3\n");
                Scanner scanComando = new Scanner(System.in);
                comando = scanComando.nextInt();
            }
            else if(comando == 1)
            {
                while(atributo != 6){
                    if(atributo == 0){
                        System.out.println("\n/----------Qual atributo deseja gerenciar?----------/\n");
                        System.out.println("Dimensões da Sala: 1\nAssentos disponíveis: 2\nTipo de projetor: 3\nSaídas de emergencia: 4\nSistema de som: 5\nSair: 6\n");
                        Scanner scanAtributo = new Scanner(System.in);
                        atributo = scanAtributo.nextInt();
                    }else if(atributo == 1){
                        System.out.println("Insira o comprimento e largura da sala.");
                        Scanner scanComprimento = new Scanner(System.in);
                        int comprimento = scanComprimento.nextInt();
                        sala01.setComprimento(comprimento);
                        sala01.setLargura(comprimento);
                        atributo = 0;
                    }else if(atributo == 2){
                        System.out.println("Insira a quantidades de assentos.");
                        Scanner scanAssento = new Scanner(System.in);
                        int nAssento = scanAssento.nextInt();
                        sala01.setQuantidadeAssentos(nAssento);
                        atributo = 0;
                    }else if(atributo == 3){
                        System.out.println("Qual projetor deseja usar?");
                        System.out.println("IMAX: 1\n3D: 2\n4DX: 3\nXD: 4\nX-PLUS: 5\nMacro-XE: 6\n");
                        Scanner scanProjetor = new Scanner(System.in);
                        int tipoProjetor = scanProjetor.nextInt();
                        sala01.setTipoProjetor(tipoProjetor);
                    }
                }
            }
            else if(comando == 2)
            {
                if(aprov.getstatusAprovacao() == true)
                {
                    System.out.println("Sala: " +sala01.getNumDaSala()+ " Disponível.\n");
                    comando = 0;
                }
                else
                {
                    System.out.println("Sala: " +sala01.getNumDaSala()+ " Indisponível.\n");
                    comando = 0;
                }
            }
            else
            {
                System.out.println("COMANDO INVALÍDO!!!");
                comando = 0;
            }
        }   
        System.out.println("Encerrando programa...");
    }
}
