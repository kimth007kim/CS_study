import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;



public class deque {
	public class arr{
		Deque<Deque<Integer>> deq = new ArrayDeque<>();
	}

	

	public static void main(String[] args) throws  IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		Deque<Integer> deq = new ArrayDeque<>();
		
		for (int i=0; i<count; i++) {
			StringTokenizer srt = new StringTokenizer(br.readLine()," ");
			String str = srt.nextToken();
			System.out.println(str);
		}
		
	}

}
