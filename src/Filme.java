public class Filme extends Midia {

    private double duracao;
    private String tipo;                      //atributos
    private String[] elenco = new String[33];
    private String diretor;
    private String produtor;



    //construtor
    public Filme(String titulo, String genero, int ano, double duracao, String tipo, String[] elenco, String diretor, String produtor) {
        super(titulo, genero, ano);
        this.duracao = duracao;
        this.tipo = tipo;
        this.elenco = elenco;
        this.diretor = diretor;
        this.produtor = produtor;
    }

       // gets e sets
    public double getDuracao() {

        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTipo() {
        if(duracao>30) {
            this.setTipo("longa metragem");
        }else {
            this.setTipo("curta metragem");
        }
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }


}



