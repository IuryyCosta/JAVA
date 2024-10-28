package CollectiosStudent;

import java.util.HashMap;

public class EstudoHashMap {
    public static void main(String args[]){
        HashMap<Integer,String> carros = new HashMap<Integer,String>();

        carros.put(1,"Polo");
        carros.put(2,"HRV");
        carros.put(3,"HB20");
        carros.put(4,"Camaro");
        carros.put(5,"Cruze");

       // System.out.println(carros.get(1));

        /*for(int i = 0 ; i < carros.size(); i++) {
            System.out.println(carros.get((i+1)));
        }*/
//       String remove =  carros.remove(5);
        for (String c : carros.values()){
            System.out.println(c);
        }
    }


}
