package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	System.out.println("  :::: "+skus);
    	int total=0;
    	int ACount=0,BCount=0,ECount=0,FCount=0,HCount=0,KCount=0,NCount=0,MCount=0,PCount=0,QCount=0,RCount=0,UCount=0;
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
    		}else if(c[i]=='G'){total=total+20;}else if(c[i]=='H'){HCount=HCount+1;
    		}else if(c[i]=='I'){total=total+35;}else if(c[i]=='J'){total=total+60;
    		}else if(c[i]=='K'){KCount=KCount+1;}else if(c[i]=='L'){total=total+90;
    		}else if(c[i]=='M'){MCount=MCount+1;}else if(c[i]=='N'){NCount=NCount+1;total=total+40;
    		}else if(c[i]=='O'){total=total+10;}else if(c[i]=='P'){PCount=PCount+1;
    		}else if(c[i]=='Q'){QCount=QCount+1;}else if(c[i]=='R'){RCount=RCount+1;total=total+50;
    		}else if(c[i]=='S'){total=total+30;}else if(c[i]=='T'){total=total+20;
    		}else if(c[i]=='U'){UCount=UCount+1;}else if(c[i]=='V'){FCount=FCount+1;
    		}else if(c[i]=='W'){total=total+20;}else if(c[i]=='X'){total=total+90;
    		}else if(c[i]=='Y'){total=total+10;}else if(c[i]=='Z'){total=total+50;;
    		}
    		else{
    			return -1;
    		}
    	}
    /**A**/
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
    	 /**A**/
    	 /**B**/
    	if(BCount>=1){
        	BCount=BCount-(ECount/2);
        	}
    	if(BCount>=1){
    	total=total+((BCount/2)*45)+((BCount%2)*30);
    	}
    	 /**B**/
    	 /**F**/
    	if(FCount>2){
    	total=total+((FCount/3)*20)+((FCount%3)*10);
    	}
    	else{
    		total=total+(FCount*10);
    	}
    	 /**F**/
    	 /**H**/
    	int RmdrHCount=0;
    	if(HCount>=10){
    		total=total+((HCount/10)*80);
    		RmdrHCount=(HCount%10);
    	if(RmdrHCount>=5){
    		total=total+((RmdrHCount/5)*45)+((RmdrHCount%5)*10);
    	}
    	else{
    		total=total+((HCount%10)*10);
    	}
    	}else{
    	total=total+((HCount/5)*45)+((HCount%5)*10);
    	}
    	 /**H**/
    	 /**K**/
    	total=total+((KCount/2)*150)+((KCount%2)*80);
    	 /**K**/
    	 /**M**/
    	if(MCount>=1){
        	MCount=MCount-(NCount/3);
        	total=total+(MCount*15);
        	}
    	 /**M**/
    	/**P**/
    	total=total+((PCount/5)*200)+((PCount%5)*50);
    	 /**P**/
    	 /**Q**/
    	if(QCount>=1){
    		QCount=QCount-(RCount/2);
        	}
    	if(QCount>=1){
    	total=total+((QCount/3)*80)+((QCount%3)*30);
    	}
    	/**Q**/
    	/**U**/
    	if(UCount>3){
    	total=total+((UCount/4)*120)+((UCount%4)*40);
    	}
    	else{
    		total=total+(UCount*40);
    	}
    	 /**F**/
    	
    	
    	   	return total;
        //throw new SolutionNotImplementedException();
    }
}

