/*
 * Student Name: Jamal Nwaubani
 * Student ID: 022028146
 * Section: JAC444
 */

package assignments;

public class A2 {
    public static void main(String[] args) {
    	//
        System.out.println("\n Degree       Sine        Cosine");
        System.out.println("________________________________");
        int i=0; //value i
            System.out.print(" "+i+"            ");
            System.out.printf("%-6.4f      ",sine(i));
            System.out.printf("%-6.4f\n", cosine(i));
            
        for(i=10; i<=90; i++) {
        	//takes value i and pushes to sine and cosine until it reaches to 90
            System.out.print(" "+i+"           ");
            System.out.printf("%-6.4f      ",sine(i));
            System.out.printf("%-6.4f\n", cosine(i));
            i = i+9;
        }
        
        for(i=100; i<=180; i++) {
        	//takes value i and pushes to sine and cosine until it reaches to 180
            System.out.print(" "+i+"          ");
            System.out.printf("%-6.4f     ",sine(i));
            System.out.printf("%-6.4f\n", cosine(i));
            i = i+9;
        }
        
        for(i=190; i<=270; i++) {
        	//takes value i and pushes to sine and cosine until it reaches to 270
            System.out.print(" "+i+"         ");
            System.out.printf("%-6.4f     ",sine(i));
            System.out.printf("%-6.4f\n", cosine(i));
            i = i+9;
        }
        
        for(i=280; i<=360; i++) {
        	//takes value i and pushes to sine and cosine until it reaches to 360
            System.out.print(" "+i+"         ");
            System.out.printf("%-6.4f      ",sine(i));
            System.out.printf("%-6.4f\n", cosine(i));
            i = i+9;
        }
       }
    
        
public static double sine(double i) {
	//takes number and sine's  using math equation
    double sinAngle = Math.sin(i/180*Math.PI);
return sinAngle;
    } 

public static double cosine(double i) {
	//takes number and cosine's using math equation
    double cosAngle = Math.cos(i/180*Math.PI);
    return cosAngle;
}
}