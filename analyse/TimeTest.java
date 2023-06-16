package sae2;

import java.util.concurrent.TimeUnit;

//Programme pour mesurer le temps écoulé en Java
class TimeTest
{
 public static void main(String[] args) throws InterruptedException
 {
     long startTime = System.nanoTime();

     TimeUnit.SECONDS.sleep(5);

     long endTime = System.nanoTime();

     long temp = endTime - startTime;

     System.out.println("Execution time in nanoseconds: " + temp);
     System.out.println("Execution time in milliseconds: " + temp / 1000000);
 }
}