import java.io.File;
import java.util.Scanner;
class SearchFile{
    static void listFilesAndDir(String path){
        File dir = new File(path);
        String[] fileList = dir.list();
        if(fileList != null){
            System.out.println("List of Files and Directories : ");
            for(String name : fileList){
                System.out.println(name);
            }
        }else{
            System.out.println("Directory not found or is empty");
        }
    }
    static void search(String path,String filename){
        File files = new File(path);
        File[] fileList = files.listFiles();
        if(fileList != null){
            boolean found = false;
            for(File file : fileList){
                if(file.getName().equals(filename)){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println(filename+" found in the directory.");
            }else{
                System.out.println(filename+" not found in the directory.");
            }
        }else{
            System.out.println("Directory not found or is empty");
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String path = "/home/lab2/Desktop/Akash/S2/Java/sample";
        listFilesAndDir(path);
        System.out.print("Enter the file to search : ");
        String searchfile = scn.next();
        search(path,searchfile);
    }
}
