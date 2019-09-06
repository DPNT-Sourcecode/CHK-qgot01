package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	System.out.println("  :::: "+skus);
    	int total=0;
    	int ACount=0,BCount=0;
    	char[] c=skus.toCharArray();
    	for(int i=0;i<c.length;i++){
    		if(c[i]=='A' || c[i]=='a'){
    			ACount=ACount+1;
    			//total=total+50;
    		}
    		else if(c[i]=='B' || c[i]=='b'){
    			BCount=BCount+1;
    			//total=total+30;
    		}
    		else if(c[i]=='C' || c[i]=='c'){
    			total=total+20;
    		}
    		else if(c[i]=='D' || c[i]=='d'){
    			total=total+15;
    		}
    	}
    	return total;
        //throw new SolutionNotImplementedException();
    }
}



