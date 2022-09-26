public class Polynomial {

    double[] coefficients; // Class level variable init

    public Polynomial() {  
        this.coefficients = new double[1];
        this.coefficients[0] = 0.0; // setting coeff to 0
    }

    public Polynomial(double[] givenCoefficients) {  
        this.coefficients = givenCoefficients; 
    }
    
    public Polynomial add(Polynomial object) {
    	double[] finalCoefficients;
    	
    	int intialPolyLength = this.coefficients.length; 
    	int passedObjLength = object.coefficients.length;
    	
        if(passedObjLength >= intialPolyLength) { // checking poly lengths
        	
        	//setting coefficients
        	finalCoefficients = new double[object.coefficients.length];
        	finalCoefficients = object.coefficients;
        	
        	//adding values
            for(int i =0; i < intialPolyLength; i++) {
            	finalCoefficients[i] += this.coefficients[i];
            }

        }
        else {
        	
        	//setting coefficients
        	finalCoefficients = new double[this.coefficients.length];
        	finalCoefficients = this.coefficients;
        	
        	//adding values
        	for(int i =0; i < passedObjLength; i++) {
            	finalCoefficients[i] += object.coefficients[i];
            }
        }
        //init new poly with resulting coefficients 
        Polynomial addedPoly = new Polynomial(finalCoefficients);	
        return addedPoly;
        	
        }

    


	
	public double evaluate(double value) {
		
		double evaluation = 0;		
	    
		//calculating the evaluation
		for(int i = 0; i < this.coefficients.length; i++) {
			evaluation += ((this.coefficients[i])*(Math.pow(value, i)));
		}

		return evaluation;
		
	}
	
	public boolean hasRoot(double value) {
    	return (evaluate(value) == 0); 
    }
}
