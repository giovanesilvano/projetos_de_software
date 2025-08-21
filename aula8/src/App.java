import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer>  numeros = new ArrayList<>();
        Random random = new Random();

        System.out.println("Lista de numeros:");

        for(int i = 0; i < 10; i++){
            numeros.add(random.nextInt(99));
            System.out.print(numeros.get(i) + " ");
        }

        System.out.println("\nLista de numeros pares:");

        
        for(int i = 0; i < 10; i++){
                if (numeros.get(i) % 2 == 0) {
                System.out.print(numeros.get(i) + " ");
            }
        }
        
        System.out.println("\nLista de nomes:");
        
        HashSet<String> nomes = new HashSet<>();

        nomes.add("Joao");
        nomes.add("Pedro");
        nomes.add("Jose");
        nomes.add("Maria");
        nomes.add("Paulo");

        System.out.println(nomes);

        if (nomes.contains("Paulo")) {
            nomes.remove("Paulo");
        }

        System.out.println(nomes);
      
        System.out.println("\nProdutos e Preços: ");

        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("sabao", 2);
        estoque.put("detergente", 3);
        estoque.put("sabonete", 4);
        estoque.put("shampoo", 50);
        estoque.put("espuma", 60);

        System.out.println(
            "Produtos: " + estoque
        );

        estoque.forEach((key, value) -> {
            if (value > 10) {
                System.out.println("Produto com preço maior de 10: " + key);
            }
            
        });

        System.out.println("\nRemover nomes com A: ");

        ArrayList<String> outrosnomes = new ArrayList<>();
        outrosnomes.add("Alice");
        outrosnomes.add("Clara");
        outrosnomes.add("Aline");
        outrosnomes.add("Claudia");
        outrosnomes.add("Ane");

        System.out.println(outrosnomes);


        
        for (int i = 0; i<outrosnomes.size(); i++) {
            
            if (outrosnomes.get(i).charAt(0) == 'A') {
                outrosnomes.remove(i);
            }
        }

        System.out.println(outrosnomes);










    }
}
