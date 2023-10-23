import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		
		Integer abc;
		Integer dıvıdent=0;
		Integer cba = 0;
		Integer ab;
		Integer ba;
		Integer cb;
		Integer bc;
		
		
		System.out.println("Lütfen 3 basamaklı bir sayı girin");
		Scanner scan=new Scanner(System.in);
		abc=scan.nextInt();
		
		for(int i=2;i<abc;i++){
		    if(abc%i==0){ dıvıdent++;}
		    }
		    if(dıvıdent==0){
		    System.out.println(abc+" asaldır");
		    } 
		
		    for(;abc != 0; abc /= 10) {
	            int basamak = abc % 10;
	            cba = cba*10 + basamak;
	        }
		
		    for(int i=2;i<cba;i++){
			    if(cba%i==0){ dıvıdent++;}
			    }
			    if(dıvıdent==0){
			    System.out.println(cba+" asaldır");
			    } 
			    
			  
			   
				    int c = abc % 10;
			        int b = (abc / 10) % 10;
			        int a = (abc / 100) % 10;
			        bc=abc-a*100;
			        cb=(c*10)+b;
			        ab=a*10+b;
			        ba=b*10+a;
			        
			        for(int i=2;i<bc;i++){
					    if(bc%i==0){ dıvıdent++;}
					    }
					    if(dıvıdent==0){
					    System.out.println(bc+" asaldır");
					    } 

		
					    
					    for(int i=2;i<cb;i++){
						    if(cb%i==0){ dıvıdent++;}
						    }
						    if(dıvıdent==0){
						    System.out.println(cb+" asaldır");
						    } 
						    
						    
						    
						    for(int i=2;i<ab;i++){
							    if(ab%i==0){ dıvıdent++;}
							    }
							    if(dıvıdent==0){
							    System.out.println(ab+" asaldır");
							    } 
							    
							    
							    for(int i=2;i<ba;i++){
								    if(ba%i==0){ dıvıdent++;}
								    }
								    if(dıvıdent==0){
								    System.out.println(ba+" asaldır");
								    } 
		
		                 if(cba>abc) {
		                	 System.out.println("cba>abc");
		                 }
	}

}
