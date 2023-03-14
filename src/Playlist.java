
public class Playlist {

    private String[] midias;
    private int ordemExecucao;     //atributos
    private int midiaAtual;

       //construtor//

    public Playlist(String[] midias, int ordemExecucao, String ui) {
        this.midias = midias;
        this.ordemExecucao = ordemExecucao;
        this.midiaAtual = 0;
    }

        //gets e sets

    public String[] getMidias() {
        return midias;
    }

    public void setMidias(String[] midias) {
      this.midias = midias;
    }


         //metodo trocando midias//

    public void tocar_midias(String[] midias){
        for(int i=0; midias.length<i; i++){
        System.out.println("tocando midias:" + midias[i]);
         this.midiaAtual=i;


        }
    }

    public void prox_midia(){
        for(int i=0; midias.length<i; i++){
            System.out.println("tocando proxima midia");
            this.prox_midia();
        }

    }

    public void voltar_midia(){
        for(int i=midias.length; i>=0; i--){
        System.out.println("tocando midia anterior:" + midias[i]);
        this.midiaAtual=i;

        }
    }

    public void misturar_midia(){
        System.out.println("misturando midias");
    }


    public int getOrdemExecucao() {
        return ordemExecucao;
    }

    public void setOrdemExecucao(int ordemExecucao) {
        this.ordemExecucao = ordemExecucao;
    }

    public int getMidiaAtual() {
        return midiaAtual;
    }

    public void setMidiaAtual(int midiaAtual) {
        this.midiaAtual = midiaAtual;
    }


}

