public class Main {

    public static void main(String[] args) {

        //dados mockados para serem testados os metodos, com criacao de alguns objetos de algumas classes

        Filme nfilme = new Filme(" "," ", 2001,2.30," ",new String[]{"teo","lui\n"},"","");
        System.out.printf(nfilme.getTipo() + " " + nfilme.getElenco()[1]);
//
        Artista nartista = new Artista("\nluan","01/09/1978","oi","M");
        System.out.println(nartista.getNome() + " "+ nartista.getData_nascimento());


        Midia nmidia = new Midia("\n ola mundo", "M",2001);
        System.out.println(nmidia.getTitulo());

      BMidias nbmidia = new BMidias("\n joao");
        System.out.println(nbmidia.getUsuario());

    }


}
