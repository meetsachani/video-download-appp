package o;

import java.util.ArrayList;
import java.util.EmptyStackException;

/* renamed from: o.Oe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3815Oe extends ArrayList implements InterfaceC5664cq {
    private static final long serialVersionUID = 2130079159931574599L;

    public C3815Oe() {
    }

    public boolean d() {
        return isEmpty();
    }

    public Object e(int i) throws EmptyStackException {
        int size = (size() - i) - 1;
        if (size >= 0) {
            return get(size);
        }
        throw new EmptyStackException();
    }

    public Object f(Object obj) {
        add(obj);
        return obj;
    }

    @Override // o.InterfaceC5664cq
    public Object get() {
        int size = size();
        if (size != 0) {
            return get(size - 1);
        }
        throw new C7860lq();
    }

    public int h(Object obj) {
        int i = 1;
        int size = size() - 1;
        while (size >= 0) {
            Object obj2 = get(size);
            if ((obj == null && obj2 == null) || (obj != null && obj.equals(obj2))) {
                return i;
            }
            size--;
            i++;
        }
        return -1;
    }

    public Object peek() throws EmptyStackException {
        int size = size();
        if (size > 0) {
            return get(size - 1);
        }
        throw new EmptyStackException();
    }

    public Object pop() throws EmptyStackException {
        int size = size();
        if (size > 0) {
            return remove(size - 1);
        }
        throw new EmptyStackException();
    }

    @Override // o.InterfaceC5664cq
    public Object remove() {
        int size = size();
        if (size != 0) {
            return remove(size - 1);
        }
        throw new C7860lq();
    }

    public C3815Oe(int i) {
        super(i);
    }
}
