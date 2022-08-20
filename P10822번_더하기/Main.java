package P10822번_더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
      int sum = 0;

		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		while(st.hasMoreTokens()) {
         sum += Integer.parseInt(st.nextToken());
		}
      System.out.println(sum);

	}
}