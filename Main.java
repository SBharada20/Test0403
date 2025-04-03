package rensyuu4_2;

public class Main {
	  public static void main(String[] args) {
	    int[] moneyList = {121902, 8302, 55100};
//	    for文
	    for (int i = 0; i < moneyList.length; i++) {
	      System.out.println(moneyList[i]);
	    }
	    
	    System.out.println("\n");
	    
//	    拡張for文
	    for (int i : moneyList) {
	      System.out.println(i);
	    }
	  }
	}
