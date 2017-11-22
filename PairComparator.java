import java.util.Comparator;

    @Override
    public int compare(Pair<K,V> p1, Pair<K,V> p2) {
        return p1.b.compareTo(p2.b);
    }
}