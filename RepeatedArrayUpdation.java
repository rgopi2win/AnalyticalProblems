public class RepeatedArrayUpdation {
  public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();
            long[] array = new long[n];
            System.out.println(Arrays.toString(array));
            for(int a0 = 0; a0 < m; a0++){
                int a = in.nextInt();
                int b = in.nextInt();
                int k = in.nextInt();

                
                System.out.println("a:"+a+" b:"+b+" k:"+k);
                while( a <= b){
                    System.out.println("a:"+a+" b:"+b+" k:"+k+" array["+(a-1)+"]:"+array[a-1]);
                    array[a-1] = array[a-1] + k;
                    a++;
                }


                System.out.println(Arrays.toString(array));
            }

            System.out.println(Arrays.stream(array).max().getAsLong());
            in.close();
    }
}
