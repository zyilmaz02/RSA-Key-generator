////////////////////////////
//
// ZIYA YILMAZ 
// T# T00503315
//
//////////////////////////////
import java.util.*;

public class RSATEST {

    public static void main(String[] args) {
    	int P;
    	int Q;

        while (true) {
             P = (int) (Math.random() * (5000 - 3000) + 3000);
            if(isPrime(P)){
                System.out.println("Random Prime P :"+P);
                break;
            }
        }
        while(true){
             Q = (int) (Math.random() * (5000 - 3000) + 3000);
            if(isPrime(Q)&& P!=Q){
                System.out.println("Random Prime Q :"+Q);
                break;
            }
        }
     int   N=Q*P;
     int $N=(Q-1)*(P-1);   
     int e;
     	while(true) {
     		 e = (int) (Math.random() * ($N - 1) + 1);
     		if(isCoprime(e,$N)) {
     			System.out.println("Random e value :"+e+"\t"+"$N=(Q-1)*(P-1):"+$N);
     			break;
     		}
    
     }
     	 int d=findd(e,$N);
    	 System.out.println("Got  d value:"+d+"\t"+"N=(Q*P): "+N);	
    	 
    	 System.out.println("Public keys values 'e' and 'N' : "+e+"\t"+N);
    	 System.out.println("Private key value  'd':"+d);
    

    }

    private static boolean isPrime(int n) {
       int i;
       for(i=2;i<=Math.sqrt(n);i++){
           if(n % i == 0){
               return false;
           }
       }
       return true;
    }


	private static boolean isCoprime(int n,int k) {
		int r,r1,r2,s,s1,s2,t,t1,t2;
		r1=k;
		r2=n;
		s1=1;
		s2=0;
		s=s2;
		t1=0;
		t2=1;
		t=t2;
		
	
		int q=r1/r2;
		
		while (r2>0) {
        r=r1-q*r2;
        r1=r2;
		r2=r;
			s=s1-q*s2;
			s1=s2;
			s2=s;
			t=t1-q*t2;
			t1=t2;
			t2=t;	
			if(r2!=0)
				q=r1/r2;
			else
				q=0;
			s=s1;
			t=t1;
			
	    } 
if(r1==1&& r2==0)
	return true;
else 
	return false;
}
	private static int findd(int n,int k) {
		int r,r1,r2,s,s1,s2,t,t1,t2;
		r1=k;
		r2=n;
		s1=1;
		s2=0;
		s=s2;
		t1=0;
		t2=1;
		t=t2;
		
	
		int q=r1/r2;
		
		while (r2>0) {
        r=r1-q*r2;
        r1=r2;
		r2=r;
			s=s1-q*s2;
			s1=s2;
			s2=s;
			t=t1-q*t2;
			t1=t2;
			t2=t;	
			if(r2!=0)
				q=r1/r2;
			else
				q=0;
			s=s1;
			t=t1;
			
	    } 
	if (t1<0)
		return k+t;
	else
	return t;

}	
		
	}





