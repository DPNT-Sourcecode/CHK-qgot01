package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	System.out.println("  :::: "+skus);
    	int total=0;
    	int ACount=0,BCount=0,ECount=0,FCount=0;
    	char[] c=skus.toCharArray();
    	if(skus.length()==0){
    		return 0;
    	}
    	for(int i=0;i<c.length;i++){
    		if(c[i]=='A'){
    			ACount=ACount+1;
    			
    		}
    		else if(c[i]=='B'){
    			BCount=BCount+1;
    			
    		}
    		else if(c[i]=='C'){
    			total=total+20;
    		}
    		else if(c[i]=='D'){
    			total=total+15;
    		}else if(c[i]=='E'){
    			ECount=ECount+1;
    			total=total+40;
    		}else if(c[i]=='F'){
    			FCount=FCount+1;
    		}else if(c[i]=='G'){FCount=FCount+1;}else if(c[i]=='H'){FCount=FCount+1;
    		}else if(c[i]=='I'){FCount=FCount+1;}else if(c[i]=='J'){FCount=FCount+1;
    		}else if(c[i]=='K'){FCount=FCount+1;}else if(c[i]=='L'){FCount=FCount+1;
    		}else if(c[i]=='M'){FCount=FCount+1;}else if(c[i]=='N'){FCount=FCount+1;
    		}else if(c[i]=='O'){FCount=FCount+1;}else if(c[i]=='P'){FCount=FCount+1;
    		}else if(c[i]=='Q'){FCount=FCount+1;}else if(c[i]=='R'){FCount=FCount+1;
    		}else if(c[i]=='S'){FCount=FCount+1;}else if(c[i]=='T'){FCount=FCount+1;
    		}else if(c[i]=='U'){FCount=FCount+1;}else if(c[i]=='V'){FCount=FCount+1;
    		}else if(c[i]=='W'){FCount=FCount+1;}else if(c[i]=='X'){FCount=FCount+1;
    		}else if(c[i]=='Y'){FCount=FCount+1;}else if(c[i]=='Z'){FCount=FCount+1;
    		}
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
    	if(BCount>=1){
        	BCount=BCount-(ECount/2);
        	}
    	if(BCount>=1){
    	total=total+((BCount/2)*45)+((BCount%2)*30);
    	}
    	if(FCount>2){
    	total=total+((FCount/3)*20)+((FCount%3)*10);
    	}
    	else{
    		total=total+(FCount*10);
    	}
    	   	return total;
        //throw new SolutionNotImplementedException();
    }
}





