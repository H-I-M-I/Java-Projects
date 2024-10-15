
package assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Assignment4 {


    public static void main(String[] args) {


    try{
           BufferedReader file= new BufferedReader(new FileReader("E:/Java_programs/lab_assignment/commitlog_ctags.txt"));
           String dots;

           int Commits=0;

           Set<String> Dates = new HashSet<String>();
           Set<String> Commiters = new HashSet<String>();
           Set<String> Commit_IDs = new HashSet<String>();

           while((dots=file.readLine()) != null){

               dots = file.readLine();
               if(dots == null) break;

               String[] spaces = dots.split(" | ");
               String commit_id = spaces[0];
               String commiter = spaces[2];
               String date = spaces[4];
               int num_dotss = Integer.parseInt(spaces[spaces.length-2]);

               dots = file.readLine();

               boolean flag = true;
               while(num_dotss!=0){
                   dots=file.readLine();

                   if(flag && (dots.toLowerCase().contains("bug") || dots.toLowerCase().contains("bugging") 
                           || dots.toLowerCase().contains("debug") || dots.toLowerCase().contains("fix") 
                           || dots.toLowerCase().contains("fixed") || dots.toLowerCase().contains("fixing"))){
                       Commits++;
                       Commit_IDs.add(commit_id);
                       Commiters.add(commiter);
                       Dates.add(date);
                       flag = false;
                   }
                   num_dotss--;
               }
           }
           System.out.println("Number of bug-fix commits : " + Commits);


           Iterator<String>ID  = Commit_IDs.iterator();
           System.out.println("Commit IDs : ");

           while (ID.hasNext())
               System.out.println(ID.next());

           System.out.println();


           Iterator<String> cmt = Commiters.iterator();
           System.out.println("Distinct commiters : ");

           while (cmt.hasNext())
               System.out.println(cmt.next());

           System.out.println();

           ID = Dates.iterator();
           System.out.println("Distinct commit Dates : ");

           while (ID.hasNext())
               System.out.println(ID.next());


           file.close();
       }

       catch(Exception e){

           System.out.print(e);
       }
   }
}












