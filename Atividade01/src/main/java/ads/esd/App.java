package ads.esd;
import java.util.Scanner;


public class App {
    
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
                    Contato c = new Contato(IO.readln("Entre com o nome:"), IO.readln("Entre com o telefone: "));
                    agenda.adicionarContato(c);
                    break;

                case 2:

                    agenda.removerContato(IO.readln("Entre com o nome a ser removido: "));
                    break;

                case 3:
                    agenda.buscarContato(IO.readln("Entre com o nome a ser buscado: "));
                    break;

//                case 4:
//                    agenda.atualizarContato();
//                    break;

                case 5:
                    agenda.listarContatos();
                    break;

//                case 6:
//                    agenda.adicionarEmLote();
//                    break;

                case 7:
                    agenda.buscarPrefixo(IO.readln("Entre com o prefixo: "));
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
