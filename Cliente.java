import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BibliotecaFacade biblioteca = new BibliotecaFacade();

        int opcao;
        do {
            System.out.println("\n=== Menu Biblioteca ===");
            System.out.println("1 - Buscar Livro");
            System.out.println("2 - Realizar Empréstimo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    biblioteca.buscarLivro(titulo);
                    break;
                case 2:
                    System.out.print("Nome do usuário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Livro a emprestar: ");
                    String livro = scanner.nextLine();
                    biblioteca.realizarEmprestimo(nome, livro);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}