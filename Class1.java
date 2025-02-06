import java.io.*;
import java.util.*;
public class Class1 {

	public static void main(String[] args) throws FileNotFoundException{
		Random ran1=new Random();
		ArrayList <Integer>arr=new ArrayList<Integer>();
			for( int i=0; i<20; i++)arr.add(ran1.nextInt(10));
				System.out.println(arr);
					PrintWriter out1=new PrintWriter("out.txt");
					
			for(int i=0; i<arr.size();i++)out1.print(arr.get(i)+" ");
			out1.close();
			Scanner in= new Scanner(new File("out.txt"));
			while(in.hasNextInt()) System.out.print(in.nextInt()+", ");
			in.close(); 
			
			Scanner in1= new Scanner(new File("Class1.csv"));
			in1.useDelimiter(",|\n");
			in1.nextLine(); 
			System.out.println("\n"+in1.next()+" "+in1.nextInt());
			in1.close();
			
			Scanner in2= new Scanner(new File("medal.txt"));
			in2.nextLine();
			String country="";
			while(in2.hasNext()) {
				country="";
				while(!in2.hasNextInt()) {
					country += in2.next()+" ";
				}
				country = country.substring(0,country.length()-1);
				System.out.println(country+" "+in2.nextInt());
			}
			
			in2.close();
			Scanner in3= new Scanner(new File("medal2.txt"));
			in3.nextLine();
			country="";
			int medal=0;
			while(in3.hasNext()) {
				medal=in3.nextInt();
				country=in3.nextLine();
				System.out.println(country+" "+medal);
				}
			
			System.out.println("beginning of line scanner code");
			Scanner in4=new Scanner(new File("medal.txt"));
			in4.nextLine();
			while (in4.hasNext()) {
					String temp=in4.nextLine();
					Scanner lineScan=new Scanner(temp);
					while(lineScan.hasNext())System.out.print(lineScan.next());
					System.out.println(); 
				}
			}
			}