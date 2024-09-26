package Chapter_14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class P04NioReadAll {
  public static void main(String[] args) {
        
    Path file =  Paths.get("D:\\Bootcamp\\2_Java\\3_Java_Advanced\\my_source_code\\src\\Chapter_14\\hamlet.txt");
    List<String> fileArr;

    try{
        fileArr = Files.readAllLines(file);

        System.out.println("\n=== Lord Count ===");
        long wordCount = fileArr.stream()
            .flatMap(line -> Stream.of(line.split(" ")))
            .filter(word -> word.contains("lord"))
            .peek(word -> System.out.println(word))
            .count();
        System.out.println("Word count: " + wordCount);

        System.out.println("\n=== Prison Count ===");
        wordCount = fileArr.stream()
            .flatMap(line -> Stream.of(line.split(" ")))
            .filter(word -> word.contains("prison"))
            .peek(word -> System.out.println(word))
            .count();
        System.out.println("Word count: " + wordCount);            

    }catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }
  } 
}
