package zadaca11;

import java.util.List;
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
List<String> lista1 = new ArrayList<>();
List<String> lista2 = new ArrayList<>();

lista1.add("jas");
lista1.add("ti");
lista1.add("toj");

lista2.add("toj");
lista2.add("nie");
lista2.add("ti");
lista2.add("jas");

lista1.retainAll(lista2);

System.out.println(lista1);
}
}