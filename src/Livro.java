public class Livro extends ItemAcervo {

    public Livro(String titulo) {
        super(titulo);
    }

    @Override
    public String tipo() {
        return "Livro";
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        double valorPorDia = 10.0;
        return diasAtraso * valorPorDia;
    }
}