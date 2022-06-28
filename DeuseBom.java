import java.util.*;

public class DeuseBom {
    public static void main (String args[]) {
        
		Scanner t = new Scanner (System.in);
		
		int c=0;
		String p;
		char p2;
		
		p = t.next();
		t.close();
		
		char[] pConvert = p.toCharArray();
		int fimCont = pConvert.length-1;
		
		while(fimCont>c) {
			p2 = pConvert[c];
			pConvert[c] = pConvert[fimCont];
			pConvert[fimCont] = p2;
			fimCont--;
			c++;
		}
		System.out.print(pConvert);
		
	}
}
