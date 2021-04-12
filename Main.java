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
