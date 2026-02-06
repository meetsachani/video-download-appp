package o;

import java.util.Collection;

/* loaded from: classes4.dex */
public class BC extends C8604op {
    private static final long serialVersionUID = -8423413834657610406L;

    public BC() {
        super(32);
    }

    @Override // o.C8604op, java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        if (s()) {
            remove();
        }
        return super.add(obj);
    }

    public BC(int i) {
        super(i);
    }

    public BC(Collection collection) {
        super(collection);
    }
}
