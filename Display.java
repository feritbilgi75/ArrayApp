import java.util.Scanner;

public class Display {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


       

        

        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        ArrayCreate av = new ArrayCreate();
        int[] a = av.createArray(size);

        System.out.println("Array has been created successfully...");

       while (true){



         System.out.println("Welcome to Menu");
        
        System.out.println("Find minimum of the array -----> 1");
        System.out.println("Find maximum of the array -----> 2");
        System.out.println("Find the average of the array -----> 3");
        System.out.println("Find sum of the odd and even numbered indexes -----> 4");
        System.out.println("For quit please press 'q'.....");

        System.out.println("");
        System.out.println("Enter your process: ");

        String input = scanner.nextLine();
      

        if (input.equals("1")){
            if (size < 0){
            System.out.println("Please create an array first.");                
            }
            else{
                int min = a[0];
                for (int i = 1; i < a.length; i ++){
                    if (min > a[i]){
                        min = a[i];
                    }
                }
                System.out.println("Minimum number of the array: " + min);
                System.out.println("");
            }
        }

        else if (input.equals("2")){
            if (size < 0){
            System.out.println("Please create an array first.");                
            }
            else {
                if (size < 0){
            System.out.println("Please create an array first.");                
            }
            else{
                int max = a[0];
                for (int i = 1; i < a.length; i ++){
                    if (max < a[i]){
                        max = a[i];
                    }
                }
                System.out.println("Maximum number of the array: " + max);
                System.out.println("");
            }
            }
            
        }

        else if (input.equals("3")){
            if (size < 0){
            System.out.println("Please create an array first.");                
            }

            else{
                Average average = new Average();
                System.out.println("Average of the array: " + average.findAverage(a));
                double b[] = average.findDiffer(a);
                System.out.print("Difference of average are: " );
                
                
                
                String s = "";
                s += ("{");
               

                for (int i = 0; i < a.length; i++){
                s += (Double.toString(b[i]));
                s += (",");
                 }
                
                /* 
                for (int i = 0; i < b.length; i++){
                    System.out.print(b[i]);
                }
                */
                
                 System.out.println(average.findAverage(a));
                
                s = s.substring(0, (s.length()-1));
                s += "}";
                
                System.out.print(s);
                1
                System.out.println("");

            }
            
        }

        else if (input.equals("4")){
            if (size < 0){
            System.out.println("Please create an array first.");                
            }
            else{
                Sum sum1 = new Sum();
                sum1.sum(a);
                System.out.println("");
            }
            
        }
        else if (input.equals("q")){
            System.out.println("Goodbye Sir....");
            break;
        }

        else{
            System.out.println("Process has not found!! Enter the valid process number.");
            System.out.println("");
        }
    }
}
    }

