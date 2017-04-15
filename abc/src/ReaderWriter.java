
 
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
 
public class ReaderWriter{
 
   private Map sharedMap = new HashMap();
   private ReentrantReadWriteLock theLock = new ReentrantReadWriteLock(true);
 
   public static void main(String[] args) {
      ReaderWriter rwObj = new ReaderWriter();
      rwObj.initializeTesting();
   }
 
   public ReaderWriter() {
      sharedMap.put("Variable1", "A");
      sharedMap.put("Variable2", "B");
      sharedMap.put("Variable3", "C");
   }
 
   private void initializeTesting() {
 
      SharedMapReader reader1 = new SharedMapReader("01", "Variable1");
      SharedMapReader reader2 = new SharedMapReader("02", "Variable2");
      SharedMapReader reader3 = new SharedMapReader("03", "Variable3");
      SharedMapReader reader4 = new SharedMapReader("04", "Variable1");
      SharedMapReader reader5 = new SharedMapReader("05", "Variable2");
      SharedMapReader reader6 = new SharedMapReader("06", "Variable3");
      SharedMapReader reader7 = new SharedMapReader("07", "Variable1");
      SharedMapReader reader8 = new SharedMapReader("08", "Variable3");
      SharedMapReader reader9 = new SharedMapReader("09", "Variable1");
      SharedMapReader reader10 = new SharedMapReader("10", "Variable2");
      SharedMapReader reader11 = new SharedMapReader("11", "Variable3");
      SharedMapReader reader12 = new SharedMapReader("12", "Variable1");
 
      SharedMapWriter writer1 = new SharedMapWriter("01", "Variable1", "X");
      SharedMapWriter writer2 = new SharedMapWriter("02", "Variable2", "Y");
      SharedMapWriter writer3 = new SharedMapWriter("03", "Variable3", "Z");
 
      new Thread(reader1).start();
      new Thread(reader10).start();
      new Thread(writer1).start();
      new Thread(reader2).start();
      new Thread(reader3).start();
      new Thread(reader8).start();
      new Thread(reader9).start();
      new Thread(writer2).start();
      new Thread(reader11).start();
      new Thread(reader4).start();
      new Thread(writer3).start();
      new Thread(reader5).start();
      new Thread(reader6).start();
      new Thread(reader7).start();
      new Thread(reader12).start();
 
   }
 
   private class SharedMapReader implements Runnable {
      private String name;
      private String key;
 
      public SharedMapReader(String theName, String theKey) {
         name = theName;
         key = theKey;
      }
 
      public void run() {
         try {
            theLock.readLock().lock();
            String value = (String) sharedMap.get(key);
            System.out.println("#### The Reader " + name + " has read "
                  + key + " and value is " + value);
            try {
               Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
         } finally {
            theLock.readLock().unlock();
         }
      }
   }
 
   private class SharedMapWriter implements Runnable {
 
      private String name;
      private String key;
      private String value;
 
      public SharedMapWriter(String theName, String theKey, String theValue) {
         name = theName;
         key = theKey;
         value = theValue;
      }
 
      public void run() {
         try {
            theLock.writeLock().lock();
            sharedMap.put(key, value);
            System.out.println("@@@@ The Writer " + name + " has written "
                  + key + " value  is " + value);
            try {
               Thread.sleep(4000);
            } catch (InterruptedException e) {
            }
         } finally {
            theLock.writeLock().unlock();
         }
 
      }
   }
}