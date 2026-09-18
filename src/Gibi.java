public class Gibi extends ItemAcervo{

    public Gibi(String titulo){
        super(titulo);
    }

    @Override
    public String tipo() {
        return "Gibi";
    }


    @Override
    public double calcularMulta(int diasAtrase){
        double valorPorDia = 10.0;
        return diasAtrase * valorPorDia;
    }
}
