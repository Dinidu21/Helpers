public class StringSortBubbleSort {
    public static void main(String[] args) {
        String[][] customer = {{"A004" , "kamal"} , {"A001" , "madu"} , {"A002" , "nimal"} , {"A003" , "sunil"}};

        int n = customer.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if(customer[j-1][0].compareTo(customer[j][0]) > 0){
                    String[] temp = customer[j-1];
                    customer[j-1] = customer[j];
                    customer[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <customer[i].length; j++) {
                System.out.print(customer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
