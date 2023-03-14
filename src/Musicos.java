public  class Musicos extends Artista{

    private String atuacao;   // atributo


    // construtor com atributos vindos da classe artista
    public Musicos(String nome, String data_nascimento, String premiacao, String genero, String atuacao) {
        super(nome, data_nascimento, premiacao, genero);
        this.atuacao = atuacao;
    }


      // gets e sets
    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}