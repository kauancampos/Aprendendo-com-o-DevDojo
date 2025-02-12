package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.metodos.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(29);
        funcionario.setSalarios(new double[]{1200, 937.82, 2000});
        funcionario.imprime();
        System.out.println("Média: " + funcionario.getMedia());

    }
}
