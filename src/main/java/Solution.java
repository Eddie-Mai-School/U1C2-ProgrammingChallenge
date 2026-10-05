public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1 + t2 + t3 + t4) / 4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) (average + 0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        if (roundedAverage < 65) {
            return false;
        } else {
            return true;
        }
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares * price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        if (totalStock < 0) {
            return (int) (totalStock - 0.5);
        } else {
            return (int) (totalStock + 0.5);
        }
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        int a=(int)((userDouble+100)%1000/100);
        int b=(int)((userDouble+10)%100/10);
        int c=(int)(((userDouble+1)%10));
        int d=(int)((userDouble+.1)%1*10);
        int e=(int)(((userDouble+.01)%.1*100)+.5)%10;
        return 100*a+10*b+c+.1*d+.01*e;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
