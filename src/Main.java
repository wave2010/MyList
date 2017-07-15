
public class Main {

	public static void main(String[] args) {
		MyArrayList<String> ls = new MyArrayList<>();

		ls.add("A");
		ls.add("B");
		
		
		MyArrayList<String> ls2 = new MyArrayList<>();

		ls2.add("E");
		ls2.add("C");
		ls2.add("D");	
	//	ls2.remove("D");
		System.out.println(ls2.toString());
		
		

	}

}
