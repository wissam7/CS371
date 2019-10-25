package pjshell;

import java.io.*;
import java.util.*;


public class PJShell
{
    public static void main(String[] args) throws java.io.IOException {
  
        String inputCom;
        ArrayList<String> parms = new ArrayList<String>();
        BufferedReader buffInput = new BufferedReader
              (new InputStreamReader(System.in));
        boolean flag=true;
        while (flag) {
            System.out.print("PJShell> ");
            inputCom = buffInput.readLine(); 
            
            String []inpParams=inputCom.split(" ");
            
            if (inpParams[0].equals("")) {
                continue;
            } 
            else if(inpParams[0].equalsIgnoreCase("exit"))  {
                System.out.println("quitted");
                flag=false;
            }
            else if(inpParams[0].equalsIgnoreCase("quit"))  {
                System.out.println("quitted");
                flag=false;
            }	
            else if(inpParams[0].equalsIgnoreCase(("mkdir"))){
                System.out.println("Making directory");
                parms.add((inpParams[1]));
            }
            else if(inpParams[0].equalsIgnoreCase(("rmdir"))){
                System.out.println("Removing directory");
                int i=0;
                while(i<parms.size())
                {
                    if(parms.get(i).equalsIgnoreCase(inpParams[1]))
                        parms.remove(i);
                    i++;
                }
            }
            else if(inpParams[0].equalsIgnoreCase(("ls"))){
                System.out.println("Listing directories");
                int i=0;
                while(i<parms.size())
                {
                    System.out.println(parms.get(i));
                    i++;
                }
            }

        }
    }
 }	