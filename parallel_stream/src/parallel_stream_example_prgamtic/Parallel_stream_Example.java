package parallel_stream_example_prgamtic;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Parallel_stream_Example {
	
	public static long checkPerformanceResult(Supplier<Integer> supplier,int numberOfTimes) {
		
		Long startTime  = System.currentTimeMillis();
		
		for(int i=0;i<numberOfTimes;i++) {
		supplier.get();
		}
		Long endTime  = System.currentTimeMillis();
		return endTime - startTime;
	}
	

	public static int sum_sequencial_Stream() {
		
		return IntStream.rangeClosed(1, 100000).sum();
	}
	
	public static int sum_parallel_Stream() {
		
		return IntStream.rangeClosed(1, 100000).parallel().sum();
	}
	
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(checkPerformanceResult(Parallel_stream_Example::sum_sequencial_Stream,20));
		System.out.println(checkPerformanceResult(Parallel_stream_Example::sum_parallel_Stream,20));
		
		
	}
	
}
