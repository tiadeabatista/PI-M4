public class Artista {

    private String nome;               //atributos
    private String dataNascimento;
    private String premiacao;
    private String genero;

                   //construtor
    public Artista(String nome, String data_nascimento, String premiacao, String genero) {
        this.nome = nome;
        this.dataNascimento = data_nascimento;
        this.premiacao = premiacao;
        this.genero = genero;
    }

         //gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return dataNascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(String premiacao) {
        this.premiacao = premiacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
