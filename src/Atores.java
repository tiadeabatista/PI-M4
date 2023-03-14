public class Atores extends Artista{

    String formacao;   // atributo


       // construtor
    public Atores(String nome, String data_nascimento, String premiacao, String genero, String formacao) {
        super(nome, data_nascimento, premiacao, genero);
        this.formacao = formacao;
    }


    //get e set
    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
