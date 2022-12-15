package inheritance;

public class Singlelevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mother m=new Mother();			//create object for mother class
		m.receipe();					//using object of mother calling mother property
		
		Daughter d=new Daughter();
		d.mobile();
		d.receipe();
		
		Mother.look();
		Daughter.book();
		Daughter.look();
	}

}
