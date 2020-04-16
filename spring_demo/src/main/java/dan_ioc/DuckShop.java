package dan_ioc;

import java.util.List;

/**
 * @author: Dennis
 * @date: 2020/4/16 19:48
 */

public class DuckShop {

    private String name;

    private List<Duck> ducks;

    @Override
    public String toString() {
        return "DuckShop{" +
                "name='" + name + '\'' +
                ", ducks=" + ducks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Duck> getDucks() {
        return ducks;
    }

    public void setDucks(List<Duck> ducks) {
        this.ducks = ducks;
    }
}
