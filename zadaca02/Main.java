package zadaca02;

import java.util.List;
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
List<String> drzavi = new ArrayList<>();
drzavi.add("Makedonija");
drzavi.add("Srbija");
drzavi.add("Anglija");
drzavi.add("Francija");
System.out.println(drzavi.size());
if(drzavi.size() == 3) {
drzavi.add("Finska");
drzavi.add("Germanija");
System.out.println(drzavi);
}
else
System.out.println(drzavi);
}
}
