public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,7,-3,4,-5,-15,9};

        int checkNegativeNum =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<0){
                checkNegativeNum++;
            }
        }

        System.out.println("Total negative numbers = "+ checkNegativeNum);
    }
}
