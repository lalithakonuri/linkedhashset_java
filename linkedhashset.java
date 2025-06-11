import java.util.LinkedHashSet;

class Main{
    public static void main(String args[]){
        
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        set.add("car");
        set.add("bike");
        set.add("bus");
        set.add("train");
        set.add("flight");
        
        System.out.println("HashSet:"+set);
        
        set.remove("flight");
        
        System.out.println("After Removing:"+set);
        
        System.out.println("checking if the element is present or not:"+set.contains("bus"));
        
        System.out.println("Returns the Size:"+set.size());
        
        System.out.println("checking if the hashset is empty or not:"+set.isEmpty());
        
        for(String transport:set){
            System.out.println("Iterating through the hashset:"+transport);
        }
        set.clear();
        System.out.println("After clearing the hashset elements:"+set);
    }
}
