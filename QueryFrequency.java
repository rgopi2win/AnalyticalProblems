public class QueryFrequency{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        int collectionCount = in.nextInt();
        List<String> stringCollection = new ArrayList<>(collectionCount);
        in.nextLine();
        for(int i = 0; i < collectionCount; i++){
            String str = in.nextLine();
            stringCollection.add(str);
        }

        int queriesCount = in.nextInt();
        List<String> queriesCollection = new ArrayList<>(queriesCount);
        in.nextLine();
        for(int i = 0; i < queriesCount; i++){
            String str = in.nextLine();
            queriesCollection.add(str);
        }

        for(String queryString : queriesCollection){
            int freq = Collections.frequency(stringCollection, queryString);
            System.out.println(freq);
        }
  }
}
