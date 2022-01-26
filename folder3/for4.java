package folder3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class for4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int num = Integer.parseInt(br.readLine());
        
        // BufferdReader 클래스의 메서드로 입력을 읽어들이면, 라인 단위로 읽어들인다.
        // StringTokenizer를 초기화
        StringTokenizer st;
        for(int i=0; i <num; i++){
           st = new StringTokenizer(br.readLine()); // 라인을 읽어서 문자열을 띄어쓰기 기준으로 분리
           bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.close();

    }
}
