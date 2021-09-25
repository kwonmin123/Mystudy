package progammersQuiz;

public class ReverseNaturalNum {

    public int[] solution(long n) {
        String [] a = String.valueOf(n).split("");
        int[] answer = new int[a.length];
        for(int i=0;i<answer.length;i++){
            answer[i]=Integer.parseInt(a[answer.length-i]);
        }
        return answer;
    }
}
