package lib;

/**
 *
 * @author sentinel
 * @param <T>
 */
public class Node <T extends Number> {
    
    private T data;
    private Node previous;

    public Node(T data) {
        this.data = data;
        this.previous = null;
    }

    public Node(T data, Node previous) {
        this.data = data;
        this.previous = previous;
    }
    
    public static double sum(Node node1, Node node2) {
        return node1.data.doubleValue() + node2.getData().doubleValue();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    
}
