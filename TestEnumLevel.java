public class TestEnumLevel {
enum Level {
  LOW(1),
  MEDIUM(2),
  HIGH(3);

private int value;
private Level(int value) {
	this.value= value;
}
}
  public static void main(String[] args) {

  
  for (Level myVar2 : Level.values()) {
	  System.out.println(myVar2 + " "+myVar2.value);
	}
  }
}

