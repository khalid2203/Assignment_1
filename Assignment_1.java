public class Assignment_1 {

    // Question 1
        static int longestCommonSubstring(String s1, String s2){
            int result = 0;  //To store maximum length of continuous common substring
            for (int i = 0; i < s1.length(); i++) {   //itrate to the length of first string
                int f = 0;   // to store different length of continuous common substring so that we can find maximum length
                for (int j = 0; j < s2.length(); j++) {    //itrate to the length of second string
                    //itrate till all the below conditions are setisfied
                    while ((i+f)<s1.length() && (j+f)<s2.length() && s1.charAt(i+f) == s2.charAt(j+f)) {
                        f++;
                    }
                }
                result = Math.max(result, f); //storing the maximum value of result and f in result variable.
            }
            return result;  // return the maximum length of common substring
        }
    
    
        // Question 2
        static void matrixMultiplication(int arr1[][],int row1,int col1, int arr2[][], int row2, int col2){
           
            if (row2 != col1) {
                System.out.println("Multiplication is not possible between these two matrix");
            }
    
            int result[][] = new int[row1][col2];  // for Storing the final result in this matrix
    
            for (int i = 0; i < row1; i++) {  // itrate to the row of the first matrix
                for (int j = 0; j < col2; j++) { // itrate to the column of the first matrix
                    result[i][j]=0; // initializing the value
                    for (int j2 = 0; j2 < row2; j2++) { // itrate to the row of the second matrix
                        //multiply the value of column of first matrix to the row of second matrix and add them
                        result[i][j]= arr1[i][j2]*arr2[j2][j] + result[i][j];
                    }
                    System.out.print(result[i][j] + " "); // printing the final value
                }
                System.out.println();  // for printing in new line or in different row
            }
            
        }
    
        public static void main(String[] args) {
        // Question 1
        //    System.out.println(longestCommonSubstring("abcfg", "fgabcfa"));   //Output 4(abcf are common substring)
        //    System.out.println(longestCommonSubstring("dzpurx", "nzpuo"));   //Output 3(zpu are common substring)
        // ------------------------------------------------------------------------------------------------------------------------
    
        // Question 2
         int arr1[][] = {{1,2,3},
                        {4,3,2}};
         int arr2[][] = {{5,2,1},
                        {3,1,2},
                        {3,1,2}};
            int row1 = 2;
            int col1 = 3;
            int row2 = 3;
            int col2 = 3;
    
        matrixMultiplication(arr1,row1,col1,arr2,col2,row2);   //output 20 7 11
                                                                     // 35 13 14
        }
    }
    