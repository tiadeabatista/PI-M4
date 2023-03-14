public class Midia{


   private String titulo;   // atributos
   private String genero;
   private int ano;


        // cosmtrutor
    public Midia(String titulo, String genero, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;

    }

        // gets e sets
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


      // criacao de objetos
    public static void main(String[] args) {
        Midia descricao = new Midia("meu amor", "sertanejo", 2001);

        System.out.println(" Nome da música : " + descricao.titulo);
        System.out.println(" Genero da música : " + descricao.genero);
        System.out.println(" Ano da música :" + descricao.ano);

    }

}


