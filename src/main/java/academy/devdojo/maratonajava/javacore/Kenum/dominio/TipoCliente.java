package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    private int valor;
    private String nomeRelatiorio;

    TipoCliente(int valor, String nomeRelatiorio) {
        this.valor = valor;
        this.nomeRelatiorio = nomeRelatiorio;
    }

    public static TipoCliente tipoClientePorNomeRelatiorio(String nomeRelatiorio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatiorio().equals(nomeRelatiorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatiorio() {
        return nomeRelatiorio;
    }

    public int getValor() { return valor; }
}
