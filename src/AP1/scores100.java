package AP1;

public class scores100 {
    public static boolean evaluateScores100(int[]scores){
        for(int i =0; i<scores.length-1; i++){
            if(scores[i]==100 && scores[i+1]==100){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[] array = {12, 100, 200,100, 100};
        System.out.println(evaluateScores100(array));
    }
}
