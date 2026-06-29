import java.util.List;
import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> myTest = new HashSet<>(myCollection);
        Set<String> theirTest = new HashSet<>(theirCollection);
        myTest.removeAll(theirCollection);
        theirTest.removeAll(myCollection);
        return !myTest.isEmpty() && !theirTest.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> test = new HashSet<>(collections.getFirst());
        for(Set<String> set : collections){
            test.retainAll(set);
        }
        return test;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> test = new HashSet<>(collections.getFirst());
        for(Set<String> set : collections){
            test.addAll(set);
        }
        return test;
    }
}
