package pojo;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor

public class User implements Serializable {
  public int id;
  public String name;
  public String course;
  public String email;
  public int age;

  @Override
  public String toString(){
    return
            "ResponseDTO{" +
                    "name = '" + name + '\'' +
                    ",cource = '" + course + '\'' +
                    ",email = '" + email + '\'' +
                    ",age = '" + age + '\'' +
                    "}";
  }
}
