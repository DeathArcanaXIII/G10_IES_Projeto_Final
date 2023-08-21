import java.util.ArrayList;
import java.util.List;

public class Disponibilidade {
    private List<Sala> salas;
    Aprovacao aprovacao = new Aprovacao();
    Especificacoes sala = new Especificacoes();

    public Disponibilidade() {
        salas = new ArrayList<>();
    }

    public boolean verificarStatusAprovacao(Sala sala) {
        return aprovacao.isStatusAprovacao();
    }

    public Especificacoes (Sala sala) {
        return sala.getEspecificacoes();
    }

    public void adicionarSala(Sala sala) {
        salas.add(sala);
    }

    public void retirarSala(Sala sala) {
        salas.remove(sala);
    }

    public static void main(String[] args) {
        Disponibilidade disponibilidade = new Disponibilidade();

        // Criar uma sala com suas especificações e status de aprovação
        Especificacoes especificacoesSala1 = new Especificacoes();
        Aprovacao aprovacaoSala1 = new Aprovacao();
        aprovacaoSala1.setStatusAprovacao(true);

        Sala sala1 = new Sala(especificacoesSala1, aprovacaoSala1);

        // Adicionar a sala à lista de disponibilidade
        disponibilidade.adicionarSala(sala1);

        // Verificar o status de aprovação da sala
        boolean statusAprovacaoSala1 = disponibilidade.verificarStatusAprovacao(sala1);
        System.out.println("Status de aprovação da Sala 1: " + statusAprovacaoSala1);

        // Obter especificações da sala
        Especificacoes especificacoesSala1Obtidas = disponibilidade.obterEspecificacoes(sala1);
        System.out.println("Especificações da Sala 1: ");
        System.out.println("Comprimento: " + especificacoesSala1Obtidas.getComprimento());
        System.out.println("Largura: " + especificacoesSala1Obtidas.getLargura());
        System.out.println("Quantidade de Assentos: " + especificacoesSala1Obtidas.getQuantidadeAssentos());
        System.out.println("É Acessível: " + especificacoesSala1Obtidas.isEhAcessivel());
        System.out.println("Tipo de Projetor: " + especificacoesSala1Obtidas.getTipoProjetor());
        System.out.println("Quantidade de Saídas de Emergência: " + especificacoesSala1Obtidas.getQuantidadeSaidasEmergencia());
        System.out.println("Equipamento Eletrônico na Sala de Projeção: " + especificacoesSala1Obtidas.getEquipamentoEletronicoSalaProjecao());
        System.out.println("Descrição da Disposição de Caixas de Som: " + especificacoesSala1Obtidas.getDescricaoDisposicaoCaixasDeSom());

        // Remover a sala da lista de disponibilidade
        disponibilidade.retirarSala(sala1);
    }
}