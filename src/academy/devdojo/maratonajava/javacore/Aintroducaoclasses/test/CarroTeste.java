package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = ("Fusca");
        carro1.modelo = ("Retrõ");
        carro1.ano = 1985;

       Carro carro2 = new Carro();
        carro2.nome = ("Ford K");
        carro2.modelo = ("Novo");
        carro2.ano = 2010;

        carro1 = carro2;

        System.out.println("Nome: " + carro1.nome  + " | Modelo: " + carro1.modelo + " | Ano de lançamento: " + carro1.ano);

        System.out.println("Nome: " + carro2.nome  + " | Modelo: " + carro2.modelo + " | Ano de lançamento: " + carro2.ano);
    }
}
