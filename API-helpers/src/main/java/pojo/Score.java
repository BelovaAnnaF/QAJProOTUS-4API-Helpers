package pojo;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Score implements Serializable {
  public String name;
  public int score;

  @Override
  public String toString(){
    return
            "Score{" +
                    "name = '" + name + '\'' +
                    ",score = '" + score + '\'' +
                    "}";
  }
}
