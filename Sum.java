public class Sum {
    public void sum(int[] a){
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < a.length; i++){
            if (i % 2 == 0){
                sumEven += a[i];
            }
            else{
                sumOdd += a[i];
            }
        }
        System.out.println("Sum of odd indexed numbers: " + sumOdd);
        System.out.println("Sum of even indexed numbers: " + sumEven);
    }
}
