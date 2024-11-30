public class SelectionSort {
    public static void main (String [] args){
        double [] score = { 2.3, 5, 8.6, 1, 5, 3, 5.5, 3, 5};
        selectionSort(score);
        for(double num : score)
            System.out.print(num + " ");
    }

    //method for sorting
    public static void selectionSort(double[] list){
        for(int i = 0; i < list.length - 1; i++){
            double currentMax = list[i];
            int currentMinIndex = i;

            for(int j = i + 1; j < list.length; j++) {
                if (currentMax < list[j]){
                    currentMax = list[j];
                    currentMinIndex = j;
                }
            }

            // swap list[i] with list[currentMinIndex] if necessary
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
