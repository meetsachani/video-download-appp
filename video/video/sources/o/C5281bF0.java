package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: o.bF0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5281bF0 extends U2 {
    private static final long serialVersionUID = -3620001881672L;

    public C5281bF0() {
        super(new ArrayList());
    }

    public static List f(List list) {
        return new C5281bF0(list);
    }

    @Override // o.AbstractC9388s1, java.util.List
    public void add(int i, Object obj) {
        int size = e().size();
        if (i > size) {
            e().addAll(Collections.nCopies(i - size, null));
        }
        e().add(i, obj);
    }

    @Override // o.AbstractC9388s1, java.util.List
    public boolean addAll(int i, Collection collection) {
        boolean z;
        int size = e().size();
        if (i > size) {
            e().addAll(Collections.nCopies(i - size, null));
            z = true;
        } else {
            z = false;
        }
        return e().addAll(i, collection) | z;
    }

    @Override // o.AbstractC9388s1, java.util.List
    public Object set(int i, Object obj) {
        int size = e().size();
        if (i >= size) {
            e().addAll(Collections.nCopies((i - size) + 1, null));
        }
        return e().set(i, obj);
    }

    public C5281bF0(int i) {
        super(new ArrayList(i));
    }

    public C5281bF0(List list) {
        super(list);
    }
}
