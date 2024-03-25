package pojo;

import java.util.List;

public class UserData {
  public static List<User> userData() {
    return List.of(
            User.builder().id(1).name("Ivanova Olga").cource("Java QA").email("OlgaIvanova@gmail.com").age(23).build(),
            User.builder().id(2).name("Timofeev Serge").cource("Java").email("STimofeev@gmail.com").age(26).build()
    );
  }

  public static Score scoreData() {
    return Score.builder()
            .name("Ivanova Olga")
            .score(78)
            .build();
  }

  public static List<Courses> courseData() {
    return List.of(
            Courses.builder().name("QA java").price(15000).build(),
            Courses.builder().name("Java").price(12000).build()
    );
  }
}
