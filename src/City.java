import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Road> roads=new ArrayList<>();
    public City(String name, Road...roads){
        this.name=name;
       addRoad(roads);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void deleteByIndex(int n)
    {
        roads.remove(n);
    }
    public void deleteByRoad(Road road) {
        roads.remove(road);
    }
    private void addRoad(Road...roads){
        for(Road road:roads){
            for(Road inner:this.roads)
            {
                if(road.getWayTo()== inner.getWayTo())
                    throw new IllegalArgumentException("This way already exists");
            }
            this.roads.add(road);
        }
    }
    @Override
    public String toString() {
        return "City " + name + " has roads to " + roads;
    }
}
