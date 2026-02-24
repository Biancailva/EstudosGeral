package estruturadados.vetor.teste;

import java.util.ArrayList;

public class Teste12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);
        arrayList.add(1, "B");
        System.out.println(arrayList);

//       boolean existe =  arrayList.contains("D");
//       if(existe){
//           System.out.println("Elemento existe");
//       }else{
//           System.out.println("Elemento não existe");
//       }
       int pos = arrayList.indexOf("B");
        if(pos > -1){
            System.out.println("Elemento existe " + pos);
        }else{
            System.out.println("Elemento não existe " + pos);
        }
        System.out.println(arrayList.get(2));
        arrayList.remove(0);
        arrayList.remove("B");
        System.out.println(arrayList);
        System.out.println(arrayList.size());


    }
}
