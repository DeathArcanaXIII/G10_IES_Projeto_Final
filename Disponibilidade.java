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
    int [] salasDisponiveis = {0, 0 , 0};
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
        int manutencao = 0;
        int statusLoop = 0;
        while(comando != 5)
        {
            if(comando == 0)
            {
                System.out.println("/-----Escolha uma função-----/\n");
                System.out.println("Gerenciar salas: 1\nChecar disponibilidade: 2\nManutenção da Sala: 3\nLista de salas disponíveis: 4\nSair: 5\n");
                Scanner scanComando = new Scanner(System.in);
                comando = scanComando.nextInt();
            }
            else if(comando == 1)
            {
                while(atributo != 8){
                    if(atributo == 0){
                        System.out.println("\n/----------Qual atributo deseja gerenciar?----------/\n");
                        System.out.println("Dimensões da Sala: 1\nAssentos disponíveis: 2\nTipo de projetor: 3\nSaídas de emergencia: 4\nSistema de som: 5\nVer especificações da sala: 6\nAlterar Status da Sala: 7\nVoltar: 8\n");
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
                        atributo = 0;
                    }else if(atributo == 4){
                        System.out.println("Quantas saídas de emergência tem esta sala?");
                        Scanner scanSaida = new Scanner(System.in);
                        int saida = scanSaida.nextInt();
                        sala01.setQuantidadeSaidasEmergencia(saida);
                        atributo = 0;
                    }else if(atributo == 5){
                        System.out.println("Qual dispositivo de som tem esta sala?");
                        System.out.println("Stereo: 1\nSurround 5.1: 2\nSurround 7.1: 3");
                        Scanner scanSom = new Scanner(System.in);
                        int tipoSom = scanSom.nextInt();
                        sala01.setDescricaoDisposicaoCaixasDeSom(tipoSom);
                        atributo = 0;
                    }else if(atributo == 6){
                        aprov.getEspecificacao();
                        atributo = 0;
                    }else if(atributo == 7){
                        while(statusLoop != 8){

                            System.out.println("Digite o numero do equipamento e seu status(0 = Indisponível, 1 = Disponível.)");
                            System.out.println("Segurança: 0\nLimpeza: 1\nEquip.Incêndio: 2\nLuzes: 3\nSom: 4\nTela: 5\nProjetor: 6\nTMS: 7\nVoltar: 8\n");
                            Scanner scanEquip = new Scanner(System.in);
                            int equip = scanEquip.nextInt();
                            statusLoop = equip;
                            if(equip != 8){
                                Scanner scanStatus = new Scanner(System.in);
                                int status = scanStatus.nextInt();
                                System.out.println(statusLoop);
                                aprov.setStatusSala(equip, status);
                            }
                        }
                        atributo = 0;
                        statusLoop = 0;
                    }
                }
                comando = 0;
                atributo = 0;
            }
            else if(comando == 2)
            {
                if(aprov.getstatusAprovacao() == true)
                {
                    System.out.println("Sala: " +sala01.getNumDaSala()+ " Disponível.\n");
                    salasDisponiveis[0] = 1;
                    comando = 0;
                }
                else
                {
                    System.out.println("Sala: " +sala01.getNumDaSala()+ " Indisponível.\n");
                    comando = 0;
                }
            }
            else if(comando == 3){
                while(manutencao != 3){
                    if(manutencao == 0){
                        System.out.println("Escolha uma opção.");
                        System.out.println("Testar equipamento: 1\nChamar manutenção: 2\nVoltar: 3\n");
                        Scanner scanManut = new Scanner(System.in);
                        manutencao = scanManut.nextInt();
                    }
                    else if(manutencao == 1){
                        aprov.testarEquipamento();
                        manutencao = 0;
                    }else if(manutencao == 2){
                        aprov.ChamarFuncionario();
                        manutencao = 0;
                    }
                }
                comando = 0;
                manutencao = 0;
            }else if(comando == 4){
                for(int i = 0, j = 0; i < 3; i++){
                    if(salasDisponiveis[i] == 0){
                        j = i+1;
                        System.out.println("Sala "+j+ " indisponível");
                    }else if(salasDisponiveis[i] == 1){
                        j = i+1;
                        System.out.println("Sala "+j+ " disponível");
                    }
                }
                comando = 0;
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
