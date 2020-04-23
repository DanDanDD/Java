package dan.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Dennis
 * @date: 2020/4/23 19:20
 */

@Getter
@Setter
public class Duck {

    private String name;
    private Integer age;

    public Duck(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
