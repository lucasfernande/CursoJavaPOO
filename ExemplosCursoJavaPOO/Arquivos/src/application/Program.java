package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        
        File[] folders = path.listFiles(File::isDirectory); // esse referenceMethods lista apenas quem é diretório, ou seja, pasta
        
        System.out.println("FOLDERS: ");
        for(File folder : folders) {
        	System.out.println(folder);
        }
        
        File[] files = path.listFiles(File::isFile); // e esse lista somente arquivos
        System.out.println();
        System.out.println("FILES: ");
        for (File file : files) {
        	System.out.println(file);
        }
        
        boolean success = new File(strPath + "\\subDir").mkdir();
        System.out.println("Directory created succesfully: " + success);
        
        sc.close();

	}
}
