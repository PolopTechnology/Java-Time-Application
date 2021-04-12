/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    Main m = new Main();
	    System.out.println(m.sleep(2000000000));
	}
	public static int sleep(int time){
        for(int i = 0; i < time; i++){
            if(i == time){
                break;
            }
        };
        return 0;
	}
}
