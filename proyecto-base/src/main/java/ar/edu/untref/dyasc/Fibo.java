package ar.edu.untref.dyasc;

public class Fibo {

    public static void main(String[] args){

        int numFibo = Integer.parseInt(args[0]);
        int num1 = 0;
        int num2 = 1;
        int aux = 0;

        System.out.print("fibo<"+numFibo+">: ");

        if(numFibo>1){
            System.out.print("0 1 ");
        }
        if(numFibo==1){
            System.out.print("0 ");
        }
        if(numFibo>2){
            for(int i = 0; i<numFibo-2;i++){
    
                aux = num1+num2;
                num1 = num2;
                num2 = aux;
                System.out.print(aux+" ");
            }
        }
    }
    
}
