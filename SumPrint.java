class SumCalculator 
{
    int sumEven = 0;
    int sumOdd = 0;

    // Method to calculate sum of even numbers
    void calculateEvenSum(int[] numbers) 
    {
        for (int num : numbers) 
        {
            if (num % 2 == 0) 
            {
                sumEven += num;
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
    }

    // Method to calculate sum of odd numbers
    void calculateOddSum(int[] numbers) 
    {
        for (int num : numbers) 
        {
            if (num % 2 != 0) 
            {
                sumOdd += num;
            }
        }
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}

class SumPrint 
{
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example input
        SumCalculator calculator = new SumCalculator();

        // Create and start thread for even sum
        Thread evenThread = new Thread(() -> calculator.calculateEvenSum(numbers));

        // Create and start thread for odd sum
        Thread oddThread = new Thread(() -> calculator.calculateOddSum(numbers));

        evenThread.start();
        oddThread.start();
    }
}

