import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Emprestimo registrarEmprestimo(ItemAcervo item, String leitor) {
        Emprestimo emprestimo = new Emprestimo(item, leitor);
        emprestimos.add(emprestimo);
        return emprestimo;
    }

    public void listarEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            emprestimo.imprimir();
        }
    }
}