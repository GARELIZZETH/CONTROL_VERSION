public class    Principal {//INICIO CLASE
    
    public static void main(String[] args) { //INICIO MAIN
       
		  System.out.println("COMMIT 1: LUNES");
          int[] vector = new  int [10];

          System.out.println("COMMIT 2: MARTES");
          for(int i = 0; i<vector.length; i++){
            vector[i] = (int)(Math.random() * 6 + 1);
          }
         System.out.println("COMMIT 3: MIERCOLES");
         for(int i= 0; i<vector.length; i++) {
            System.out.print(vector[i] + "  ");
         }
	   
    }//FINAL MAIN