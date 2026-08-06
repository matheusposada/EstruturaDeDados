package ads.esd;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
    
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

               
        while (executando) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    agenda.adicionarContato(Contato c);
                    break;

                case 2:
                    agenda.removerContato(Contato c);
                    break;

                case 3:
                    agenda.buscarContato(Contato c);
                    break;

                case 4:
                    agenda.atualizarContato(Contato c);
                    break;

                case 5:
                    agenda.listarContatos(Contato c);
                    break;

                case 6:
                    agenda.adicionarEmLote(Contato[] novosContatos);
                    break;

                case 7:
                    agenda.buscarPrefixo(Contato c);
                    break;

                case 0:
                    executando = false;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n===== MENU DE CONTATOS =====");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Remover contato");
        System.out.println("3 - Buscar contato");
        System.out.println("4 - Atualizar contato");
        System.out.println("5 - Listar contatos");
        System.out.println("6 - Adicionar em lote");
        System.out.println("7 - Buscar por prefixo");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    
}
