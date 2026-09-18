import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");

        List<ItemAcervo> acervo = new ArrayList<>();
        acervo.add(new Livro("Dom Casmurro"));
        acervo.add(new Revista("Superinteressante"));
        acervo.add(new Gibi("Turma da Mônica"));

        System.out.println("=== " + biblioteca.getNome() + " ===");
        System.out.println();

        System.out.println("--- Acervo cadastrado ---");
        for (ItemAcervo item : acervo) {
            item.exibirDados();
        }


        System.out.println("--- Emprestimos ---");

        biblioteca.registrarEmprestimo(acervo.get(0), "Ana Souza");
        Emprestimo emprestimoComAtraso = biblioteca.registrarEmprestimo(acervo.get(1), "Bruno Lima");
        emprestimoComAtraso.registrarAtraso(4);

        Emprestimo emprestimoComAtraso2 = biblioteca.registrarEmprestimo(acervo.get(2), "Carla Santos");
        emprestimoComAtraso2.registrarAtraso(10);

        biblioteca.listarEmprestimos();
        System.out.println();
        System.out.println("--- Teste de validacao ---");
        try {
            new Livro("");
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro capturado: " + erro.getMessage());
        }
    }
}