import java.util.*;

public class Main {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(args[0]);
    list.add("world");
    list.add("Hello");
    if (args[0] == "hello") new Exception();
    for (Object s : list) System.out.print(s);
  }
}
//0404listの追加しました
