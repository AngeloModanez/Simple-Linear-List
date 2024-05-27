package eddls;

public class ListaLinearSimples {

    private Node top;
    private Node bottom;
    private long size;

    public ListaLinearSimples() {
        this.top = null;
        this.bottom = null;
        this.size = 0;
    }

    private boolean empty() {
        return (this.top == null && this.bottom == null);
    }

    private long length() {
        return this.size;
    }

    private void addSize() {
        this.size++;
    }

    private void decSize() {
        this.size--;
    }

    public void add(Node node) {
        if (this.empty()) {
            this.top = this.bottom = node;
        } else {
            Node aux = this.top;
            this.top = node;
            this.top.setNext(aux);
        }
        this.addSize();
    }

    public void append(Node node) {
        if (this.empty()) {
            this.top = this.bottom = node;
        } else {
            Node aux = this.bottom;
            this.bottom = node;
            aux.setNext(node);
        }
        this.addSize();
    }

    public void clear() {
        while (!this.empty()) {
            this.pop();
        }
    }

    public Node remove() {
        Node retNode = null;
        Node aux = null;
        if (this.empty()) {
            return null;
        }

        if (this.length() <= 1) {
            retNode = this.top;
            this.top = this.bottom = null;
        } else {
            retNode = this.top;
            aux = retNode.getNext();
            retNode.setNext(null);
            this.top = aux;
        }

        this.decSize();

        return retNode;
    }

    public Node pop() {
        Node retNode = null;
        Node aux = null;
        if (this.empty()) {
            return null;
        }

        if (this.length() <= 1) {
            retNode = this.top;
            this.top = this.bottom = null;
        } else {
            retNode = this.bottom;
            aux = this.searchPosN(this.length() - 1);
            aux.setNext(null);
            this.bottom = aux;
        }

        this.decSize();

        return retNode;
    }

    public void insertPosN(long pos, Node node) {
        if (this.empty() && pos != 1) {
            return;
        }
        if (pos > this.length() && pos != 1) {
            return;
        }
        if (pos == 1) {
            this.add(node);
            return;
        }

        Node nodePrev = this.searchPosN(pos - 1);
        Node nodePos = nodePrev.getNext();
        node.setNext(nodePos);
        nodePrev.setNext(node);
        this.addSize();
    }

    public void insertInOrd() {

    }

    public Node removePosN(long pos) {
        if (this.empty()) {
            return null;
        }
        if (pos == 1) {
            return this.remove();
        }
        if (this.length() == pos) {
            return this.pop();
        }
        if (pos != 1 && this.length() <= 1) {
            return null;
        }
        if (pos > this.length()) {
            return null;
        }
        Node ant = this.searchPosN(pos - 1);
        Node aux = ant.getNext();

        ant.setNext(aux.getNext());
        aux.setNext(null);

        this.decSize();
        return aux;
    }

    private Node searchPosN(long position) {
        if (this.empty() || position > this.length()) {
            return null;
        }

        Node aux = this.top;
        for (int indx = 1; position != indx && aux != null; indx++) {
            aux = aux.getNext();
        }
        return aux;
    }

    public Node searchWithClone(long position) {
        if (this.empty() || position > this.length()) {
            return null;
        }

        Node aux = this.top;
        for (int indx = 1; position != indx && aux != null; indx++) {
            aux = aux.getNext();
        }

        Node retNode = new Node(aux.getId(), aux.getValue());

        return retNode;
    }

    public NodeValue searchWithInterface(long position) {
        if (this.empty() || position > this.length()) {
            return null;
        }

        Node aux = this.top;
        while (aux != null) {
            if (aux.equals(aux.getId())) {
                break;
            }
            aux = aux.getNext();
        }
        return aux;
    }

    public void show() {
        Node aux = this.top;
        while (aux != this.bottom) {
            System.out.print(" --> " + aux.getValue().toString());
            aux = aux.getNext();
        }
        if (aux != null) {
            System.out.print(" --> " + aux.getValue());
        }
    }
}
