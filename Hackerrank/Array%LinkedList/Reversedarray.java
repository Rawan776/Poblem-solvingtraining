class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    Collections.reverse(a);
        List<Integer> reversed=new ArrayList<>();
        for(Integer i:a){
            reversed.add(i);
        }
    return reversed;
    }

}
