package designPattern.iterator;

public class ArrIterator <T> implements Iterator{

    private ArrContainer<T> container;
    private int pos;

    public ArrIterator(ArrContainer<T> arrContainer) {
        this.container = arrContainer;
        this.pos = -1;
    }

    @Override
    public boolean hasNext() {
        if (this.pos < this.container.list.size() - 1) {
            return true;
        }
        return false;
    }

    @Override
    public T nextVal() {
        if (this.hasNext()) {
            this.pos += 1;
            return (T) this.container.list.get(this.pos);
        }
        return null;
    }
}
