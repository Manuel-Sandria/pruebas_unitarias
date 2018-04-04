package pruebas_unitarias;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class HolaMundoTestRunner{
     public static void main(String args[]){
          Result result=JUnitCore.runClasses(HolaMundoTest.class);
          for(Failure failure:result.getFailures()){
               System.out.println("---------------------------------");
               System.out.println(failure.toString());
               System.out.println("Message: "+failure.getMessage());
               System.out.println("Test Header: "+failure.getTestHeader());
               System.out.println("Exception is: "+failure.getException());
               System.out.println("---------------------------------");
          }

          System.out.println("Result: "+result.wasSuccessful());
          System.out.println("Run Count: "+result.getRunCount());
          System.out.println("Failure Count: "+result.getFailureCount());
          System.out.println("Run Time: "+result.getRunTime()+" miliseconds");
     }
}