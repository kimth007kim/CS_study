import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","신용권","감자바","람다식","박병렬");
		
		Stream<String> stream= list.stream();
		
		stream.forEach(ParallelExample::print);
		Arrays.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
	            System.out.println(o1+" "+o2);
				return (o1+o2).compareTo(o2+o1);
			}
		});
		System.out.println();
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample::print);

	}
	public static void print(String str) {
		System.out.println(str+ " : "+ Thread.currentThread().getName());
	}

}
