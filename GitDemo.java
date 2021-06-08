/*****
Reema Sreenivasan
// REPOSITORY URL : https://github.com/reemasreeni/Assignment1_rsreeni2.git
******/
public class GitDemo {
    
    private double previousNumber;
    
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function adds the given number to the private "previousNumber"
     * stored in the GitDemo class. 
     * 
     * @param num - A number that should be added to GitDemo:previousNumber
     * @return the updated value of 'previousNumber'
    *****/
    public double addNumber(double num) {
        System.out.print("Add num to previousNumber");
        previousVariable = num;
        return previousVariable;
    }
    
    /*****
     * Description of function goes here
     *
     * @param - description of passed in arguments go here
     * @return - description of return value goes here
     *****/
    public void templateFunction1(int num) {
        double newNumber = 1;
        
        for(int i = 1; i <= num; ++i){
            newNumber = newNumber * i;
        }
        return newNumber;
    }
  
    public void templateFunction2(int num){
        double factorialNumber = 0;
        
        while (num != 0) {
            double temp = num % 10;
            factorialNumber = factorialNumber * 10 + temp;
            num /= 10;
        }
        return factorialNumber; 
    }
}
