package pojo;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@Builder
@AllArgsConstructor

public class User {
  public int id;
  public String name;
  public String cource;
  public String email;
  public int age;
}
