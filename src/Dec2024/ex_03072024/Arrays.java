package Dec2024.ex_03072024;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {25, 17, 30, 45, 78, 90, 60};
        int max_value = give_max(array);
        System.out.printf("max value is %d", max_value);
    }
    static int give_max(int [] array){
        int max = array[0];
        for (int i=0;i< array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return  max;
    }
}
