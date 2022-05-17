import java.util.HashMap;
import java.util.Random;

public class Balls {

	int count = 1000;
	int bag=0;
	        Random rnd = new Random();
	        for(int i=1;i<=count;i++) {
	            
	            int select1 = rnd.nextInt(bag.size());
	            Balls indexPos1 = bag.get(select1);
	            int select2 = rnd.nextInt(bag.size());
	            Balls indexPos2 = bag.get(select2);
	            int select3 = rnd.nextInt(bag.size());
	            Balls indexPos3 = bag.get(select3);
		    int select4 = rnd.nextInt(bag.size());
	            Balls indexPos4 = bag.get(select4);
		HashMap<String, Integer> balla=new HashMap<String, Integer>();
	            System.out.println(select1);
	            System.out.println(select2);
		    System.out.println(select3);
		    System.out.println(select4);
	            if (bag.select1 = white) {
	                Balls white=add.select1;
	                    
	                    continue;
	                }if (bag.select2 = red) {
	                Balls red=add.select2;
	                    
	                    continue;
	                }if (bag.select2 = green) {
	                Balls green=add.select3;
	                    
				  continue;
	                }if (bag.select2 = blue) {
	                Balls blue=add.select4;
			continue;
	            }
	        }
}
