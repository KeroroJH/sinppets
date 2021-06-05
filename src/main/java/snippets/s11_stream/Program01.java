package snippets.s11_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program01 {
	public static void main(String[] args) {
		
		String[] arr = {"A","B","C","D","F"};
		List<String> arrList = Arrays.asList(arr);
		
		//자바7 이전의 코드
		Iterator<String> iterator = arrList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//자바8 이후 람다 , 스트림 이용
		Stream<String> stream1 = arrList.stream();
		stream1.forEach( s -> System.out.println("8+"+s) );
		
		
		//객체를 스트림으로 생성
		List<Product> productList = Arrays.asList(
					new Product("kro", 25),
					new Product("keroro", 36)
				);
		Stream<Product> stream2 = productList.stream();
		stream2.forEach( p ->{
			StringBuffer sb = new StringBuffer();
			sb.append("name is " + p.getName());
			sb.append(" AND age is "+ p.getAge());
			System.out.println(sb);
		});
		
		// int스트림 생성
		int[] arr2 = {3,4,5,6,7,8,9,10};
		 IntStream stream3 = Arrays.stream(arr2);
		 stream3.forEach(i -> System.out.println(i));
		 
		 //스트림 from file
		 Path path = Paths.get("src/snippets/s11_stream/Program01.java");
		 try {
			Stream<String> stream4 = Files.lines(path,Charset.defaultCharset());
			stream4.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		//스트림 form file2
		 Path path2 = Paths.get("src/snippets/s11_stream/Product.java");
		 File file1 = path2.toFile();
		 
		 try {
			FileReader reader1 = new FileReader(file1);
			BufferedReader reader2 = new BufferedReader(reader1);
			Stream<String> stream5 = reader2.lines();
			stream5.forEach(System.out::println);
			stream5.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 
		//경로의 파일 리스트 스트림
		 Path path3 = Paths.get("/Users/junghyunkang");
		 try {
			Stream<Path> pathStream1 = Files.list(path3);
			pathStream1.forEach(p -> System.out.println(p.getFileName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 
		 
	}
}
