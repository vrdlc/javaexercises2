import java.util.HashMap;

public class HashMapPractice {
  public static void main(String[] args) {

    HashMap addressBook = new HashMap();

    addressBook.put("Jeremy","5980 Main St.");
    addressBook.put("Alyssa","8391 Tacoma Ave.");

    for (Object key: addressBook.keySet()) {
      System.out.println(key + ": " + addressBook.get(key));
    }
}
}
