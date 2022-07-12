package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _0703_programmers_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] grade = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            grade[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        for(int i=grade.length-1; i>0; i--){
            if(grade[i]<grade[i-1]){
                answer +=grade[i-1]-grade[i];
                grade[i-1] = grade[i];
            }
        }
        System.out.println(answer);
    }
}
