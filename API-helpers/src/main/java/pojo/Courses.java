package pojo;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Courses implements Serializable {
  public String name;
  public int price;

  @Override
  public String toString(){
    return
            "CourseDTO{" +
                    "price = '" + price + '\'' +
                    ",name = '" + name + '\'' +
                    "}";
  }
}
