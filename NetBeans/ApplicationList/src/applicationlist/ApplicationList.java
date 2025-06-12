package applicationlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("carlos");
        list.add("bob");
        list.add("alex");
        list.add("silvia");
        list.add("renan");
        list.add("maria");
        list.add("ana clara");
        list.add(1, "Marco");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------------");
        list.remove(4);
        list.removeIf(x -> x.charAt(0) == 'M' || x.charAt(0) == 'm');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("=====================");
        System.out.println("Index of Bob:"+ list.indexOf("bob"));
        System.out.println("Index of Jarro: "+ list.indexOf("jarro"));
        System.out.println("===========================");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }
        System.out.println("-----------=================----------");
        String name = list.stream().filter(x -> x.charAt(0)=='t').findFirst().orElse(null);
        System.out.println(name);
        
    
    }

}
