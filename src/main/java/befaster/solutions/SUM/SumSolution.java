package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) {
    	try{
    	return x+y;
    	}catch(Exception e){
        throw new SolutionNotImplementedException();
    	}
    }

}


