public class Musica extends Midia{

    private double duracao;
    private String artista;    // atributos
    private int notas;


       // construtor
    public Musica(String titulo, String genero, int ano, double duracao, String artista, int notas) {
        super(titulo, genero, ano);
        this.duracao = duracao;
        this.artista = artista;
        this.notas = notas;
    }


      // gets e sets
    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {

        if(notas>5)              // condicao
         this.notas = notas;
         else{System.out.println("nota invalida insira nota de 1 a 5");}

    }


}







