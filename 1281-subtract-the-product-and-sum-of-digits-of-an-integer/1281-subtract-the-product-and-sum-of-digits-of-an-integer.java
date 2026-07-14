class Solution {
    public int subtractProductAndSum(int n) {
        int num1 = n;
        int num2 = n;
        int product =1;
        int sum = 0;
        
        while(num1 != 0){

            int lastdigit = num1 % 10;
            product = product * lastdigit;
            num1 = num1 / 10;
        }
        while(num2 != 0){

            int lastdigit = num2 % 10;
            sum = sum + lastdigit;
            num2 = num2 / 10;

        }
        return product - sum;

    }
}