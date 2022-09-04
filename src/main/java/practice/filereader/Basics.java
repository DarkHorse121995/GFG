package practice.filereader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.input.ReversedLinesFileReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basics {

    public static void main(String[] args) throws IOException{

//        readFile();

        //NOT EFFICIENT WAY FOR LARGE SIZED FILES
//        readNlinesFromFileInReverse();

        // EFFICIENT WAY FOR LARGE SIZED FILES
//        efficientOneUsingScannerClass();

//        efficientWayUsingStream();

//        efficientWayUsingLineIterator();

        printNReverseLinesOfFiles();







    }

    private static void printNReverseLinesOfFiles() {
        String path = "C:\\Users\\Tanu\\Desktop\\Text.txt";
        AtomicInteger count = new AtomicInteger(6);
        try(Stream<String> stream = Files.lines(Paths.get(path));){
            stream
                    .collect(
                    Collectors.collectingAndThen(
                            Collectors.toList(), (list)->{
                                Collections.reverse(list);
                                return list.stream();
                            }))
                    .forEach((s)-> {
                        if (count.getAndDecrement() > 0) {
                            System.out.println(s);
                        }
                    });
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void efficientWayUsingLineIterator() throws IOException {
        String path = "C:\\Users\\Tanu\\Desktop\\Text.txt";
        ReversedLinesFileReader reversedLinesFileReader = new ReversedLinesFileReader(new File(path));

        try(LineIterator itr = FileUtils.lineIterator(new File(path))){
            while(itr.hasNext()){
                System.out.println(itr.nextLine());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void efficientWayUsingStream() {
        String path = "C:\\Users\\Tanu\\Desktop\\Text.txt";
        try(Stream<String> stream = Files.lines(Paths.get(path));){
            stream.forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void efficientOneUsingScannerClass() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream("C:\\Users\\Tanu\\Desktop\\Text.txt");
        Scanner scanner = new Scanner(stream);

        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }

    private static void readFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] strTokens = s.split(" ");
        System.out.println("Output : " + Arrays.asList(strTokens));

        FileReader fileReader = new FileReader("C:\\Users\\Tanu\\Desktop\\Text.txt");
        bufferedReader = new BufferedReader(fileReader);
        s = bufferedReader.readLine();
        while(s!=null){
            System.out.println(s);
            s = bufferedReader.readLine();
        }
    }

    private static void readNlinesFromFileInReverse() {
        String path = "C:\\Users\\Tanu\\Desktop\\Text.txt";
        List<String> linesList = null;
        try{
            linesList = Files.readAllLines(Paths.get(path));
        }catch (Exception e){
            e.printStackTrace();
        }
        for(int i=linesList.size()-1; i>linesList.size()-7 ; i--){
            System.out.println(linesList.get(i));
        }

        System.out.println(linesList.subList(linesList.size()-6,linesList.size()));
        Collections.reverse(linesList);
        System.out.println(linesList.subList(0,6));
//        linesList.forEach(System.out::println);
    }

}
