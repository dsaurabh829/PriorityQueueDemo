import java.util.Comparator;

public class Pair implements Comparable<Pair> {
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
    public int compareTo(Pair p)
    {
        return this.first - p.first;
    }

    @Override
    public String toString() {
        return "Pair has " + this.first + " <--> " + this.second;
    }
}
