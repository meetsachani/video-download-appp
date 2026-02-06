package o;

import java.util.ArrayList;
import java.util.EmptyStackException;

@Deprecated
/* renamed from: o.Ne  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3717Ne<E> extends ArrayList<E> {
    private static final long serialVersionUID = 2130079159931574599L;

    public C3717Ne() {
    }

    public boolean d() {
        return isEmpty();
    }

    public E e(int i) throws EmptyStackException {
        int size = (size() - i) - 1;
        if (size >= 0) {
            return get(size);
        }
        throw new EmptyStackException();
    }

    public E f(E e) {
        add(e);
        return e;
    }

    public int h(Object obj) {
        int i = 1;
        int size = size() - 1;
        while (size >= 0) {
            E e = get(size);
            if ((obj == null && e == null) || (obj != null && obj.equals(e))) {
                return i;
            }
            size--;
            i++;
        }
        return -1;
    }

    public E peek() throws EmptyStackException {
        int size = size();
        if (size > 0) {
            return get(size - 1);
        }
        throw new EmptyStackException();
    }

    public E pop() throws EmptyStackException {
        int size = size();
        if (size > 0) {
            return remove(size - 1);
        }
        throw new EmptyStackException();
    }

    public C3717Ne(int i) {
        super(i);
    }
}
