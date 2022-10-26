public class SelectionMadness
{
    // No instance variables //

    // no-parameter constructor with "empty" body since no instance variables
    public SelectionMadness() {}

    public boolean flipCoin() {
        int flip = (int) (Math.random()*2)+1;
        boolean isHeads = false;
        if(flip==1){
            isHeads = true;
        } else if (flip == 2){
            isHeads = false;
        }
        return isHeads;
    }

    public int largest(int num1, int num2, int num3) {
        if ((num1>=num2) && (num1>=num3)){
            return num1;
        }
        if ((num2>=num1)&&(num2>=num3)){
            return num2;
        }
        if ((num3>=num1)&&(num3>=num2)){
            return num3;
        }
        return num3; //added but will not be used
    }

    public boolean rightTriangle(int side1, int side2, int side3)
    {
        int c = largest(side1,side2,side3);
        double sumOfOthers =0.0;

        if (c==side1){
            sumOfOthers = Math.pow(side3,2)+Math.pow(side2,2);
        } else if(c==side2){
            sumOfOthers = Math.pow(side1,2)+Math.pow(side3,2);
        } else if (c==side3){
            sumOfOthers = Math.pow(side1,2)+Math.pow(side2,2);
        }

        double largestSquared = Math.pow(c,2);

        if (largestSquared==sumOfOthers){
            return true;
        } else{
            return false;
        }
    }

}

