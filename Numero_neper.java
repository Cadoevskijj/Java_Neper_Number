public class Numero_neper {
    public static void main(String[] args) {
        int fake_infinity = 1000;
        double Summation_index = 1;
        double factorial = 1;
        double temp_factorial = 1;
        double neper_number = 1;
        while(Summation_index<=fake_infinity){
            temp_factorial = 1;
            for(double i = 1; i<=Summation_index; i++){
                temp_factorial *= 1/i;
                }
            factorial = temp_factorial;
            //System.out.println(factorial);
            neper_number += factorial;
            
            Summation_index++;
        }
System.out.println("Neper number is 'e' = " + neper_number); 


    }

}
