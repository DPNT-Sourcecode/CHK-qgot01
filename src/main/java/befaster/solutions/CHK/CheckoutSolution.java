package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	System.out.println("  :::: "+skus);
    	int total=0;
    	int ACount=0,BCount=0,ECount=0;
    	char[] c=skus.toCharArray();
    	if(skus.length()==0){
    		return 0;
    	}
    	for(int i=0;i<c.length;i++){
    		if(c[i]=='A'){
    			ACount=ACount+1;
    			//total=total+50;
    		}
    		else if(c[i]=='B'){
    			BCount=BCount+1;
    			//total=total+30;
    		}
    		else if(c[i]=='C'){
    			total=total+20;
    		}
    		else if(c[i]=='D'){
    			total=total+15;
    		}else if(c[i]=='E'){
    			ECount=ECount+1;
    			total=total+40;
    		}
    		else{
    			return -1;
    		}
    	}
    	int RmdrACount=0;
    	if(ACount>=5){
    		total=total+((ACount/5)*200);
    		RmdrACount=(ACount%5);
    	if(RmdrACount>=3){
    		total=total+((RmdrACount/3)*130)+((RmdrACount%3)*50);
    	}
    	else{
    		total=total+((ACount%5)*50);
    	}
    	}else{
    	total=total+((ACount/3)*130)+((ACount%3)*50);
    	}
    	total=total+((BCount/2)*45)+((BCount%2)*30);
    	if(BCount>=1){
    	total=total-((ECount/2)*30);
    	}
    	
    	return total;
        //throw new SolutionNotImplementedException();
    }
}

