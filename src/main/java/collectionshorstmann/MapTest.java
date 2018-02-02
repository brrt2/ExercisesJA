package collectionshorstmann;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

  public static void main(String[] args) {
      Map<String,Employee> staff = new HashMap<>();
      staff.put("144-25-9546",new Employee("Harry Hacker"));
      staff.put("567-24-9646",new Employee("Gary Cooper"));
      staff.put("157-62-9126",new Employee("Francesca Criz"));
      staff.put("157-62-9436",new Employee("Amy Lee"));

//    System.out.println(staff.getOrDefault("45",new Employee("Nie ma takiego pracownika")).toString());
    System.out.println(staff);

    staff.remove("144-25-9546");
    staff.put("157-62-9436",new Employee("Chris Johnson"));
    System.out.println(staff.get("157-62-9126"));

    staff.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));

  }
}
