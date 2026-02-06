package o;

import java.util.Iterator;

/* renamed from: o.vm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10299vm implements Iterator {
    public final /* synthetic */ Iterator X;
    public final /* synthetic */ C3162Hm Y;

    public C10299vm(C3162Hm c3162Hm, Iterator it) {
        this.Y = c3162Hm;
        this.X = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.Y.get(this.X.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() not supported for BeanMap");
    }
}
