public abstract class ItemAcervo implements Emprestavel {

    private String titulo;

    public ItemAcervo(String titulo) {
        if (titulo.isEmpty()) {
            throw new IllegalArgumentException("O titulo nao pode ser vazio.");
        }
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibirDados() {
        System.out.println(tipo() + ": " + titulo);
    }

    public abstract String tipo();
}