import java.util.Random;

import javax.swing.JOptionPane;

public class Soru3 {

	public static void main(String[] args) {
		String response1,response2;
		;
		 response1=JOptionPane.showInputDialog("Lutfen 1 ile 100 arasında bır sayı tutunuz.");
	try {
		int a=Integer.parseInt(response1);
        Random random=new Random();
        int x=random.nextInt(101);
        if (a==x) {
			System.out.println("Tebrikler sayıyı bildiniz");
		}
		else {
		JOptionPane.showMessageDialog(null,"Bilemediniz sayı buydu:"+x+ "Lutfen tekrar deneyiniz" );
	
		}
		return;
	} catch (Exception e) {
		System.out.println("Lutfen metin değil sayı gırın");
		
	}
		}
		
	}


