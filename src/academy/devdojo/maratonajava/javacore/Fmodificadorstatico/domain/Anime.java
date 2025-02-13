package academy.devdojo.maratonajava.javacore.Fmodificadorstatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

//    0 - O bloco de inicialização é carregado quando a JMV carregar a classe;
//    1 - Alocado espaco em memória;
//    2 - Cada atributo de classe é criado e inciailizado com valores default ou o que for passado;
//    3 - Bloco de inicialização é executado;
//    4 - Constructor é executado;

    static {
        System.out.println("Dentro do bloco de inicialização 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static{
        System.out.println("Dentro do bloco de inicialização 2");
    }

    static{
        System.out.println("Dentro do bloco de inicialização 3");
    }

    {
        System.out.println("Dentro de um bloco de inicialização");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodios : Anime.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
