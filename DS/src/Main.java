import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        String[] names = {"sophie", "Daniel", "Yuri", "Pedi"};


        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //foreach
        for (int num : nums) {
            System.out.println(num);
        }

        //CHALL1
        for (String name : names){
            System.out.println("My name is " + name);
        }

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Monkey");
        System.out.println(animals);
    }
}