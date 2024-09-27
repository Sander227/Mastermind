
package masterMind;

import java.util.Scanner;

public class masterMind {

	public static void main(String[] args) {

		
		
		String wit = "wit";
		String zwart = "zwart";
		String rood = "rood";
		String geel = "geel";
		String groen = "groen";
		String blauw = "blauw";
		String paars = "paars";
		String oranje = "oranje";
		String niks = " - ";
		
		String code1 = blauw;
		String code2 = rood;
		String code3 = geel;
		String code4 = rood;
		 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welkom bij MasterMind");
		System.out.println("Je hebt 10 kansen om de code te kraken");
		System.out.println("Typ je code van 4 kleuren in in:");
		
		System.out.println("Code 1");
		String mastermind1_1 = sc.next();
		String mastermind1_2 = sc.next();
		String mastermind1_3 = sc.next();
		String mastermind1_4 = sc.next();
		
		String codeControleren1_1 = "";
		String codeControleren1_2 = "";
		String codeControleren1_3 = "";
		String codeControleren1_4 = "";
		
		
        if (mastermind1_1.equals(code1)) {
        	codeControleren1_1 = zwart;
        }
        
        else if (mastermind1_1.equals(code2)) {
        	codeControleren1_1 = wit;
        }
        
        else if (mastermind1_1.equals(code3)) {
        	codeControleren1_1 = wit;
        }
        
        else if (mastermind1_1.equals(code4)) {
        	codeControleren1_1 = wit;
        }
        
        else {
        	codeControleren1_1 = niks;
        }
        
        System.out.println(codeControleren1_1);
        
        if (mastermind1_2.equals(code2)) {
        	codeControleren1_2 = zwart;
        }
        	
        else if (mastermind1_2.equals(code1)) {
        	codeControleren1_2 = wit;
        }
        
        else if (mastermind1_2.equals(code3)) {
        	codeControleren1_2 = wit;
        }
        
        else if (mastermind1_2.equals(code4)) {
        	codeControleren1_2 = wit;
        }
        
        else {
             codeControleren1_2 = niks;
        }
        
        System.out.println(codeControleren1_2);
        
        if (mastermind1_3.equals(code3)) {
        	codeControleren1_3 = zwart;
        }
        
        else if (mastermind1_3.equals(code1)) {
        	codeControleren1_3 = wit;
        }
        
        else if (mastermind1_3.equals(code2)) {
        	codeControleren1_3 = wit;
        }
        
        else if (mastermind1_3.equals(code4)) {
        	codeControleren1_3 = wit;
        }
          
        else {
        	codeControleren1_3 = niks;
        }
        
        System.out.println(codeControleren1_3);
        
        if (mastermind1_4.equals(code4)) {
        	codeControleren1_4 = zwart;
        }
        
        else if (mastermind1_4.equals(code1)) {
        	codeControleren1_4 = wit;
        }
        
        else if (mastermind1_4.equals(code2)) {
        	codeControleren1_4 = wit;
        }
        
        else if (mastermind1_4.equals(code3)) {
        	codeControleren1_4 = wit;
        }
        
        else {
        	codeControleren1_4 = niks;
        }
        
        System.out.println(codeControleren1_4);
		
		System.out.println("Code 2");
		String mastermind2_1 = sc.next();
		String mastermind2_2 = sc.next();
		String mastermind2_3 = sc.next();
		String mastermind2_4 = sc.next();
		
		String codeControleren2_1 = "";
		String codeControleren2_2 = "";
		String codeControleren2_3 = "";
		String codeControleren2_4 = "";
		
		System.out.println("Code 3");
		String mastermind3_1 = sc.next();
		String mastermind3_2 = sc.next();
		String mastermind3_3 = sc.next();
		String mastermind3_4 = sc.next();
		
		String codeControleren3_1 = "";
		String codeControleren3_2 = "";
		String codeControleren3_3 = "";
		String codeControleren3_4 = "";
		
		System.out.println("Code 4");
		String mastermind4_1 = sc.next();
		String mastermind4_2 = sc.next();
		String mastermind4_3 = sc.next();
		String mastermind4_4 = sc.next();
		
		String codeControleren4_1 = "";
		String codeControleren4_2 = "";
		String codeControleren4_3 = "";
		String codeControleren4_4 = "";
		
		System.out.println("Code 5");
		String mastermind5_1 = sc.next();
		String mastermind5_2 = sc.next();
		String mastermind5_3 = sc.next();
		String mastermind5_4 = sc.next();
		
		String codeControleren5_1 = "";
		String codeControleren5_2 = "";
		String codeControleren5_3 = "";
		String codeControleren5_4 = "";
		
		System.out.println("Code 6");
		String mastermind6_1 = sc.next();
		String mastermind6_2 = sc.next();
		String mastermind6_3 = sc.next();
		String mastermind6_4 = sc.next();
		
		String codeControleren6_1 = "";
		String codeControleren6_2 = "";
		String codeControleren6_3 = "";
		String codeControleren6_4 = "";
		
		System.out.println("Code 7");
		String mastermind7_1 = sc.next();
		String mastermind7_2 = sc.next();
		String mastermind7_3 = sc.next();
		String mastermind7_4 = sc.next();
		
		String codeControleren7_1 = "";
		String codeControleren7_2 = "";
		String codeControleren7_3 = "";
		String codeControleren7_4 = "";
		
		System.out.println("Code 8");
		String mastermind8_1 = sc.next();
		String mastermind8_2 = sc.next();
		String mastermind8_3 = sc.next();
		String mastermind8_4 = sc.next();
		
		String codeControleren8_1 = "";
		String codeControleren8_2 = "";
		String codeControleren8_3 = "";
		String codeControleren8_4 = "";
		
		System.out.println("Code 9");
		String mastermind9_1 = sc.next();
		String mastermind9_2 = sc.next();
		String mastermind9_3 = sc.next();
		String mastermind9_4 = sc.next();
		
		String codeControleren9_1 = "";
		String codeControleren9_2 = "";
		String codeControleren9_3 = "";
		String codeControleren9_4 = "";
		
		System.out.println("Code 10");
		String mastermind10_1 = sc.next();
		String mastermind10_2 = sc.next();
		String mastermind10_3 = sc.next();
		String mastermind10_4 = sc.next();
		
		String codeControleren10_1 = "";
		String codeControleren10_2 = "";
		String codeControleren10_3 = "";
		String codeControleren10_4 = "";
		
		
		
		sc.close();
		
	
	}
}
