//program to perform write,read and delete operation on files
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
class CreateFile {
    //method to create a file
    public void createFile(){
        try {
            File myFile = new File("hobbies.txt");
            if (myFile.createNewFile()){
                System.out.println("File created succesfully!: " + myFile.getName());

            } else {
                System.out.println("File exists!");
            }
        }
        catch (IOException err) {
            System.out.println("Error");
        }
        //
        finally {
            System.out.println("File management with java");
        }
}
//method to write to a file
    public void writeFile(){
        try {
            FileWriter _write = new FileWriter("hobbies.txt");
            _write.write("Watching movies,animations and mountain climbing");
            _write.close();
            System.out.println("Content written succesfully");
        }catch (IOException err){
            System.out.println("Error");
            err.printStackTrace();
        }
    }
//method to read to a file
    public void readFile(){
        try {
            File myFile = new File("hobbies.txt");
            Scanner read = new Scanner(myFile);
            while(read.hasNextLine()){
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        } catch (FileNotFoundException err) {
            System.out.println("Error");
            err.printStackTrace();
        }
    }
    //method to delete a file
    public void deleteFile(){
        try {
            File myFile = new File("hobbies.txt");
            if(myFile.delete()){
                System.out.println("File deleted succesfully!: " + myFile.getName());

            } else {
                System.out.println("Unable to delete the file");
            }
        }finally {
            System.out.println("Thats all with simple file management!!!");
        }
    }
    
}
class Files extends CreateFile {
    public static void main(String[] args){
        Files myNewFile = new Files();
        //calling our methods
        myNewFile.createFile();
        //myNewFile.writeFile();
        //myNewFile.readFile();
        //myNewFile.deleteFile();
    }
}