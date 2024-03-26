package pojo;

import java.util.List;

public class UserData {
  public static List<User> userData() {
    return List.of(
            User.builder().id(1).name("Ivanova Olga").course("QA Java").email("OlgaIvanova@Kmail.com").age(23).build(),
            User.builder().id(2).name("Timofeev Serge").course("Java").email("STimofeev@Kmail.com").age(26).build()
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
            Courses.builder().name("QA Java").price(15000).build(),
            Courses.builder().name("Java").price(12000).build()
    );
  }
}
