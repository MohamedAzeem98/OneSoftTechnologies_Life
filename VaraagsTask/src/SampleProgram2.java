
public class SampleProgram2 {

	static void fun(String str,int...a) {
		System.out.println("Arguments"+" "+str);
	System.out.println(str.length());
	for(int s:a) {
		System.out.println();
		System.err.print(s+" ");
		System.out.println();
	}
}
public static void main(String[] args) {
	fun("h u n d r e d",100);
	fun("one two three four",1,2,3,4);
	fun("1 2 3 4 5",1,2,3,4,5);
	}

}
