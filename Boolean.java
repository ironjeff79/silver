package silver;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Boolean {
	public static void main(String[] args) {
		String opt =  "true";
	switch (opt) {
		case "true":
			System.out.print("True");
			break;
		 default:
			 System.out.print("***");

		}
		System.out.println("Done");

	
		int num = 5;
		do {
			System.out.println(num-- + " ");
		}while (num == 0);
		
		
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int d = (a<b)? (a<c)?a :(b<c)?b : c : x;
		System.out.println(d);
		
		List <String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		if (names.remove("Bran")) {
			names.remove("Jon");
		}
		System.out.println(names);
		
		A a1 = new A();
		A a2 = new A();
		a1.i = 3;
		a1.j = 4;
		a2.i = 5;
		a2.j = 6;
		System.out.println(a1.i + " " + a1.j + " " + a2.i + " " + a2.j);
		
		
		
		String [] arr = {"A", "B" , "C", "D"};
		for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i] + " ");
		if (arr[i].equals("C")) {
			continue;
		}
		System.out.println("Work done");
		break;
		}
		
		Alpha ref1 = new Alpha(100);
		Alpha ref2 = new Alpha(50);
		Alpha ref3 = new Alpha(125);
		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();
		
		
		int ii = 0;
		int jj = 7;
		for (ii = 0; ii < jj - 1; ii = ii + 2) {
		System.out.println(ii + " ");
		}
		LocalDate date1 = LocalDate.now();
		//LocalDate date2 = LocalDate.of(6, 20, 2014);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
		System.out.println("date1 = " + date1);
		//System.out.println("date2 = " + date2);
		System.out.println("date3 = " + date3);
		
		String[] planets = {"Mercury", "Venus", "Earth", "Mars"};
		System.out.println(planets.length); //4 elements in the array
		System.out.println(planets[1].length()); //Venus - 5 characters

	
		
		/*ArrayList myList = new ArrayList();
		String[] myArray;
		try{
			while (true){
				myList.add("My string");
			}
			}catch (RuntimeException e){
				System.out.println("catch RunTimeException");
			}catch (Exception e){
				System.out.println("catch Exception");
			}
		System.out.println("Ready to use ");
		*/
		  String[][] arr1 = {{"A", "B", "C"},{"D", "E"}};
		  for(int i = 0; i < arr1.length; i++){
			  for (int j = 0; j<arr1[i].length; j++){
				  System.out.print(arr1[i][j] + " ");
				  if(arr1[i][j].equals("B")){
					  break;
				  }
			  }
			  continue;
		  }
		  
		  String str2 = " ";
		  str2.trim(); // if we use str2 = str2.trim(); the answer will be true true
		  System.out.println(str2.equals("") + " " + str2.isEmpty());
	}	
}
	
	
class A{
	static int i;
	int j;
}

class Alpha {
	int ns;
	static int s;
	Alpha(int ns){ // constructor
		if(s < ns) {
			s = ns;
			this.ns = ns;
		}
	}
	void doPrint() {
		System.out.println("ns = " + ns + " s = " + s);	
    }
}
