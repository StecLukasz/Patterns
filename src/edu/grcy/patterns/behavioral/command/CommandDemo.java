package edu.grcy.patterns.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {

        MyFile myFile = new MyFile("sampleFile.txt");
        FileOperationPerformer performer = new FileOperationPerformer();

        performer.executeOperation(new CreateFileOperation(myFile),"Początkowa zawartość");
        System.out.println(myFile.getContent());

        performer.executeOperation(new UpdateFileOperation(myFile), "\nDodatkowa zawartość");
        System.out.println(myFile.getContent());
        System.out.println("======================");
        performer.executeOperation(new UpdateFileOperation(myFile),"\n\nJeszcze kolejna zawartość");
        System.out.println(myFile.getContent());
        System.out.println("======================");
        performer.executeOperation(new CreateFileOperation(myFile),"Piszemy do pliku od nowa");
        System.out.println(myFile.getContent());
        System.out.println("======================");


        System.out.println("+++Historia operacji+++");
        performer.getFileOperationsHistory()
                .forEach(System.out::println);




    }
}
