# Number of Heightest Candles

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Candles {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int tallestCandleCount = 0, candleHeight=0;
        for(int candleCount = 0; candleCount < n; candleCount++){
            if(ar[candleCount] > candleHeight){
                tallestCandleCount = 1;
                candleHeight = ar[candleCount];
            }else if(ar[candleCount] == candleHeight){
                tallestCandleCount++;
            }
        }
        
        return tallestCandleCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
```
