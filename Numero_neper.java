public class Numero_neper {
    public static void main(String[] args) {
        int fake_infinito = 1000;
        double indice_sommatoria = 1;
        double fattoriale = 1;
        double temp_fattoriale = 1;
        double numero_di_nepero = 1;
        while(indice_sommatoria<=fake_infinito){
            temp_fattoriale = 1;
            for(double i = 1; i<=indice_sommatoria; i++){
                temp_fattoriale *= 1/i;
                }
            fattoriale = temp_fattoriale;
            //System.out.println(fattoriale);
            numero_di_nepero += fattoriale;
            
            indice_sommatoria++;
        }
System.out.println("numero di nepero 'e' = " + numero_di_nepero); 


    }

}
