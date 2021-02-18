package UniqueArrays;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Integer[] vetor ={1,2,2,4,4,15};
        Integer[] vetor1 = {1,2,3,4,2,3};
        Integer[][] vetor2 = {{1,2,3}, {2,3}, {3,4}};
        List<List<Integer>> lista = new LinkedList<>();
        Set<Integer[]> set = new HashSet<>(Arrays.asList(vetor2));
        System.out.println(set);
        }
    }