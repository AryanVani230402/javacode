import java.util.HashMap;
import java.util.Map;

public class hashMap_practice {
    public static void main(String[] args) {
        HashMap <String, Integer> myHashmap= new HashMap<>();

        myHashmap.put("Aryan",1);
        myHashmap.put("Arjun",2);
        myHashmap.put("Anuj",2);
        myHashmap.put("Udit",3);
        myHashmap.put("Ar",2);

        System.out.println(myHashmap);


        myHashmap.computeIfPresent("Aryan",(k,v)->++v);
        myHashmap.computeIfPresent("Aryan",(k,v)->++v);

        System.out.println(myHashmap.entrySet());

//        myHashmap.p

        System.out.println(myHashmap);
//        HashMap <Integer,String> newHashmap=new HashMap<>();
//        newHashmap = (HashMap<Integer, String>) myHashmap.clone();

//        for(Map.Entry m : myHashmap.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
    }
}
