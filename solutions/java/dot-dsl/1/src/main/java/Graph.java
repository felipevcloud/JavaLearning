import java.util.*;

public class Graph {

    private Collection<Node> nodes = new HashSet<>();
    private Collection<Edge> edges = new HashSet<>();
    private Map<String, String> attributes = new HashMap<>();
    
    public Graph() {
    }

    public Graph(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public Collection<Node> getNodes() {
        return nodes;
    }

    public Collection<Edge> getEdges() {
        return edges;
    }

    public Graph node(String name) {
        Node node = new Node(name);
        nodes.add(node);
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        Node node = new Node(name, attributes);
        nodes.add(node);
        return this;
    }

    public Graph edge(String start, String end) {
        Edge edge = new Edge(start, end);
        edges.add(edge);
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        Edge edge = new Edge(start, end, attributes);
        edges.add(edge);
        return this;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
}
