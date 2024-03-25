package pojo;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class Score {
  public String name;
  public int score;
}
