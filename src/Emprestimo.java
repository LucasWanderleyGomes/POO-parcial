public class Emprestimo {

    private ItemAcervo item;
    private String leitor;
    private int diasAtraso;

    public Emprestimo(ItemAcervo item, String leitor) {
        if (leitor.isEmpty()) {
            throw new IllegalArgumentException("O leitor nao pode ser vazio.");
        }
        this.item = item;
        this.leitor = leitor;
        this.diasAtraso = 0;
    }

    public void registrarAtraso(int dias) {
        if (dias < 0) {
            throw new IllegalArgumentException("Dias de atraso invalidos.");
        }
        this.diasAtraso = dias;
    }

    public double getMulta() {
        return item.calcularMulta(diasAtraso);
    }

    public void imprimir() {
        System.out.println(item.getTitulo() + " (" + item.tipo() + ") | Leitor: " + leitor
                + " | Atraso: " + diasAtraso + " dia(s) | Multa: R$ " + getMulta());
    }
}