public class gradeExam {
    public static void main (String [] args){
        char [] [] answer = {
                {'A', 'C', 'B', 'A' ,'A', 'C', 'A', 'B', 'B', 'A'},
                {'A', 'C', 'B', 'A' ,'A', 'C', 'A', 'B', 'B', 'A'},
                {'A', 'C', 'B', 'A' ,'A', 'C', 'A', 'B', 'B', 'A'},
                {'A', 'C', 'B', 'A' ,'A', 'C', 'A', 'B', 'B', 'A'},
                {'A', 'C', 'B', 'A' ,'A', 'C', 'A', 'B', 'B', 'A'},
                {'A', 'C', 'B', 'A' ,'A', 'C', 'A', 'B', 'B', 'A'},
                {'A', 'C', 'B', 'A' ,'A', 'C', 'A', 'B', 'B', 'A'},
                {'A', 'C', 'B', 'A' ,'A', 'C', 'A', 'B', 'B', 'A'},
                {'A', 'C', 'B', 'A' ,'A', 'C', 'A', 'B', 'B', 'A'}
        };

        char[] key = {'A', 'C', 'B', 'A' ,'A', 'C', 'A', 'B', 'B', 'A'};

        for(int i = 0; i < answer.length; i++){
            int correctCount = 0;
            for(int j = 0; j < answer[i].length; j++){
                if(answer[i][j] == key[j])
                    correctCount++;
            }
            System.out.println("student " + i + "'s get " + correctCount);
        }
    }
}
