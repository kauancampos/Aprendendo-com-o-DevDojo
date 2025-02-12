package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("JOJO SB", "TV", 12, "Ação");
        anime.imprime();
    }
}
