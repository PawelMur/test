package algorytmy;

import java.util.Comparator;

public class VertexComparator implements Comparator<Vertex> {
    @Override
    public int compare (Vertex o1, Vertex o2){
        if (o1.getWeight() < o2.getWeight()){
            return -1;
        }else if (o1.getWeight() > o2.getWeight()){
            return 1;
        }else {
            return 0;
        }
    }
}
