public class Main
{
	public static void main(String[] args) {
	    Main m = new Main();
	    System.out.println(m.sleep(40));
	    //10 = 2 seconds. and add 1 for every other 10 seconds.
	}
	public static int sleep(int time){
        for(int i = 0; i < time; i++){
            for(int j = 0; j < 1000000000; j++){
                if(j == 999999999){
                    break;
                }
            }
        };
        return 0;
	}
}
