import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 3; i++) {
      priorityQueue.add(Integer.parseInt(st.nextToken()));
    }
    System.out.print(priorityQueue.poll() + " " + priorityQueue.poll() + " " + priorityQueue.poll());
  }
}