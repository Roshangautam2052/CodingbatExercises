package AP1;

public class scoresIncreasing {

    public static boolean evaluateScoresIncreasing(int[]scores){
        int state = 0;
        for(int i=1; i<scores.length; i++){
            if(scores[i]>scores[i-1] || scores[i]==scores[i-1]){
                state ++;

            }

        }
        if(state == scores.length-1){
            return true;
        }
        return false;
    }

    public static void main(String[]args){
        int[] array = {1,2,3, 12, 5};
        System.out.println(evaluateScoresIncreasing(array));

    }
}
