package zadaca04;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
public static void main(String[] args) {
List<Integer> broevi = new ArrayList<>();
broevi.add(4);
broevi.add(12);
broevi.add(45);
broevi.add(13);
broevi.add(72);
broevi.add(38);
Collections.sort(broevi);
System.out.println(broevi);
}
}
