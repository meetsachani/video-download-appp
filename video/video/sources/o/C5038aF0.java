package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: o.aF0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5038aF0<E> extends T2<E> {
    private static final long serialVersionUID = -3620001881672L;

    public C5038aF0() {
        super(new ArrayList());
    }

    public static <E> C5038aF0<E> h(List<E> list) {
        return new C5038aF0<>(list);
    }

    @Override // o.AbstractC9145r1, java.util.List
    public void add(int i, E e) {
        int size = d().size();
        if (i > size) {
            d().addAll(Collections.nCopies(i - size, null));
        }
        d().add(i, e);
    }

    @Override // o.AbstractC9145r1, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        boolean z;
        int size = d().size();
        if (i > size) {
            d().addAll(Collections.nCopies(i - size, null));
            z = true;
        } else {
            z = false;
        }
        if (d().addAll(i, collection) || z) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC9145r1, java.util.List
    public E set(int i, E e) {
        int size = d().size();
        if (i >= size) {
            d().addAll(Collections.nCopies((i - size) + 1, null));
        }
        return d().set(i, e);
    }

    public C5038aF0(int i) {
        super(new ArrayList(i));
    }

    public C5038aF0(List<E> list) {
        super(list);
    }
}
