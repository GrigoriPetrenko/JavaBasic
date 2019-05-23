public class ConsoleOutput {
   
    public static void main(String[] args) {

		System.out.println("Java has a function for formatted output System.out.printf (): System.out.printf()");

		int x=5;
		int y=6;
		System.out.printf("x=%d; y=%d \n", x, y);

		System.out.println("the letter %d means that this specifier will be used to display integer values");
		System.out.println("%x: for displaying hexadecimal numbers");
		System.out.println("%f: to output floating point numbers");
		System.out.println("%e: to output numbers in exponential form, for example, 1.3e + 01");
		System.out.println("%c: to output a single character");
		System.out.println("%s: to display string values");
		

		String name = "Tom";
        	int age = 30;
        	float height = 1.7f;
          
        	System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
    }
}