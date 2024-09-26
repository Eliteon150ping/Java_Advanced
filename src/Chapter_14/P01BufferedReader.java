package Chapter_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P01BufferedReader {
    
    public static void main(String[] args) {
        
        try{
            BufferedReader bReader = 
                new BufferedReader(new FileReader("D:\\Bootcamp\\2_Java\\3_Java_Advanced\\my_source_code\\src\\Chapter_14\\hamlet.txt"));
            
            System.out.println("=== Entire File ===");
            bReader.lines()
                .forEach(line -> 
                    System.out.println(line));
                        
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    } 
}
