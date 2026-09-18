public class Revista extends ItemAcervo {

    public Revista(String titulo) {
        super(titulo);
    }

    @Override
    public String tipo() {
        return "Revista";
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        double valorPorDia = 0.5;
        return diasAtraso * valorPorDia;
    }
}