
public class StringSortSelectionSort {
    public static void main(String[] args) {
        String[][] customer = {{"A004" , "kamal"} , {"A001" , "madu"} , {"A002" , "nimal"} , {"A003" , "sunil"}};

        int n = customer.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;

            for (int j = i+1; j < n; j++) {
                if(customer[j][0].compareTo(customer[minIndex][0]) < 0){
                    minIndex = j;
                }
            }
            String[] temp = customer[minIndex];
            customer[minIndex] = customer[i];
            customer[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <customer[i].length; j++) {
                System.out.print(customer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
