import java.util.HashMap;
import java.util.Map;

public class AloneNumberFinder {
    public static void main(String[] args){

        int[] numbers = {4, 1, 2, 1, 2};
        int aloneNumber = findAloneNumber(numbers);
        if (aloneNumber != 0){
            System.out.println("The alone number is:" + aloneNumber);
        }else{
            System.out.println("no alone number found");
        }
    }

    public static int findAloneNumber(int[] numbers){
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int number : numbers){
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        for(int number : numbers){
            if (countMap.get(number) == 1){
                return number;
            }
        }

        return 0;
    }
}
