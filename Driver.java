
/*
 *This program utilizes many objects to create a menu, and ticket system for a restaurant
 *and fill a ticket with food
 *Java @ TCC
 *Arick Mounts
 */


public class Driver {
	public static void main (String[] args) {
		MenuItem mi00 = new MenuItem("food0", 2.99, "it's Food", 0);
		MenuItem mi01 = new MenuItem("food1", 8.99, "it's Food", 1);
		MenuItem mi02 = new MenuItem("food2", 17.99, "it's Food", 2);
		MenuItem mi03 = new MenuItem("food3", 4.99, "it's Food", 3);
		MenuItem mi04 = new MenuItem("food4", 9.99, "it's Food", 4);
		MenuItem mi05 = new MenuItem("food5", 7.99, "it's Food", 5);
		MenuItem mi06 = new MenuItem("food6", 6.99, "it's Food", 6);
		MenuItem mi07 = new MenuItem("food7", 91.99, "it's Food", 7);
		MenuItem mi08 = new MenuItem("food8", 13.99, "it's Food", 8);
		MenuItem mi09 = new MenuItem("food9", 20.99, "it's Food", 9);
		
		Menu menu01 = new Menu ("Food Place");
		
		Ticket tic01 = new Ticket (15);
		Ticket tic02 = new Ticket (37);
	
		
		menu01.addItem(mi00);
		menu01.addItem(mi01);
		menu01.addItem(mi02);
		menu01.addItem(mi03);
		menu01.addItem(mi04);
		menu01.addItem(mi05);
		menu01.addItem(mi06);
		menu01.addItem(mi07);
		menu01.addItem(mi08);
		menu01.addItem(mi09);
		
		tic01.addItem(mi01);
		tic01.addItem(mi02);
		tic01.addItem(mi03);
		tic02.addItem(mi04);
		tic02.addItem(mi05);
		tic02.addItem(mi06);
		
		System.out.println (menu01.toString());
		
		System.out.println ("\n\n**********************************************\n\n");
		System.out.println (tic01.toString());
		
		System.out.println ("\n\n**********************************************\n\n");
		System.out.println (tic02.toString());
	}
}