package ss9_dsa_list.bai_tap;

import java.util.Arrays;

public class MyList<E> {
    public int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    /**
     * mảng chứa các phần tử
     */
    Object elements[];

    /**
     * sức chứa mặc định khi truyền vào một constructor không tham số
     */
    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * phương thức constructor với sức chứa được truyền vào
     *
     * @param capacity
     */
    public MyList(int capacity) {
        if (capacity >= 0) {
            this.elements = new Object[capacity];
        } else {
            throw new IndexOutOfBoundsException("Capacity: " + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    /**
     * phương thức add 1 phần tử vào MyArrayList
     *
     * @param element
     * @return
     */
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index: " + index);
        } else if (elements.length == size) {
            ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        }
    }

    /**
     * phuong thuc tang kich thuoc cua mang
     *
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity" + minCapacity);
        }
    }

    public E get(int i) {
        return (E) elements[i];
    }

    /**
     * phương thức lấy index của một phần tử
     *
     * @param o
     * @return
     */
    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * phương thức kiểm tra phần  có trong MyArrayList hay không
     *
     * @param element
     * @return
     */
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    /**
     * Phương thức tạo ra một bản sao của MyArrayList hiện tại
     *
     * @return
     */
    public MyList<E> clone() {
        MyList<E> e = new MyList<>();
        e.elements = Arrays.copyOf(this.elements, this.size);
        e.size = this.size;
        return e;
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for(int i = index ; i < elements.length - 1 ; i++){
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}