import java.io.File;
import java.util.Scanner;

public class FileList {

    public static void main(String[] args) throws Exception{
        // Creates an array in which we will store the names of files and directories
        String[] pathnames;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root Directory path");
        String root = s.nextLine();

        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File f = new File(root);

        // Populates the array with names of files and directories
        pathnames = f.list();

        // For each pathname in the pathnames array
        for (String pathname : pathnames) {
            // Print the names of files and directories
            System.out.println(pathname);
        }
    }
}