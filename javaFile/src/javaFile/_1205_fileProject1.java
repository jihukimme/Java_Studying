package javaFile;


import java.io.*;


//시저스    abcdefg ->DEFGHIJ
//파일 abb-> DEE
//원본파일(input.txt) -> 암호화된 파일(enc.txt)
//복호화 파일(입력-> recover.txt)

class Solution {
    public String solution(String s) {
    	String result = new String();

    	for(int i=0; i<s.length(); i++) {
    		char ch = s.charAt(i);
    		if(Character.isLowerCase(ch)) {
    			ch = (char)((ch-'a'+3)%26+'A');
    		}
    		else if(Character.isUpperCase(ch)) {
    			ch = (char)((ch-'A'+3)%26+'a');
    		}
    		result += ch;
    	}
    	
		return result;
    }
}

class reSolution{
	public String resolution(String s) {
		String result = new String();

		for(int i=0; i<s.length(); i++) {
    		char ch = s.charAt(i);
    		if(Character.isLowerCase(ch)) {
    			ch = (char)((ch-'a'+23)%26+'A');
    		}
    		else if(Character.isUpperCase(ch)) {
    			ch = (char)((ch-'A'+23)%26+'a');
    		}
    		result += ch;
    	}
    	
		return result;
	}
}

public class _1205_fileProject1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("문) 시저의 암호시스템을 만드시오. (아래와 같이 캐릭터가 맵핑되는 암호시스템)\r\n"
				+ "\r\n"
				+ "     a  b  c  d  e ......\r"
				+ "\n"
				+ "->   D  E  F  G  H ......");
		System.out.println();
		
		//텍스트파일에서 읽어오기위한 reader
		FileReader fr = new FileReader("input.txt");		
		BufferedReader br = new BufferedReader(fr);
		
		//암호화하기위한 객체
		Solution secret = new Solution();
		//복호화하기위한 객체
		reSolution resecret = new reSolution();
		//텍스트파일에 저장하기위한 writer
		BufferedWriter bw = new BufferedWriter(new FileWriter("enc.txt"));
		//복호화한 값을 텍스트에 저장하기위한 writer
		BufferedWriter bw_recover = new BufferedWriter(new FileWriter("recover.txt"));

		String line;
		int i=1;
		while((line=br.readLine()) != null){
			//다음라인이 존재한다면 읽기.
			System.out.println("암호화하기 전 " + i + "번째 줄: " + line);//암호화하기 전의 값 출력
			bw.write(secret.solution(line));//암호화한 값을 텍스트파일에 입력
			bw.newLine();
			System.out.println("암호화 " + i + "번째 줄: " + secret.solution(line));//암호화한 값 출력
			bw_recover.write(resecret.resolution(secret.solution(line)));
			bw_recover.newLine();
			System.out.println("복호화 " + i + "번째 줄: " + resecret.resolution(secret.solution(line)));//암호화한 값을 복화하한 값 출력
			i++;
		}
		
		while((line=br.readLine()) != null){
			//다음라인이 존재한다면 읽기.
			bw.write(secret.solution(line));//암호화한 값을 텍스트파일에 입력
			bw.newLine();
			System.out.println(secret.solution(line));//암호화한 값 출력
		}
		br.close();
		bw.flush();
		bw.close();
		bw_recover.flush();
		bw_recover.close();
			
		
	}

}
