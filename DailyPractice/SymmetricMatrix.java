/*
https://hyperskill.org/learn/daily/1936

Given the number n, not exceeding 10, and a matrix of size n × n.

Check whether this matrix is symmetric in relation to the main diagonal. Output the word “YES”, if it is symmetric and the word “NO” otherwise.

Sample Input 1:

3
0 1 2
1 2 3
2 3 4
Sample Output 1:

YES
*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int[][] array2D = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array2D[i][j] = s.nextInt();
            }
        }
        
        if (isSymmetricMatrix(array2D)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    public static boolean isSymmetricMatrix(int[][] array) {
        boolean result = true;
        
        if (array.length > 1) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array[1].length; j++) {
                    if (array[i][j] != array[j][i]) {
                        result = false;
                        break;
                    }
                }
                if (!result) {
                    break;
                }
            }
        } 
        
        return result;
    }
}
