package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{55, 72, 23, 14, 95};
       // for (int i = 0; i < numeros3.length; i++) {
         //   System.out.println(numeros3[i]);
        //}
        for (int num:numeros3){
            System.out.println(num);
        }
    }
}
