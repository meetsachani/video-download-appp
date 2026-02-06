package o;

import java.util.Iterator;
import o.C3162Hm;

/* renamed from: o.xm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10788xm implements Iterator {
    public final /* synthetic */ Iterator X;
    public final /* synthetic */ C3162Hm Y;

    public C10788xm(C3162Hm c3162Hm, Iterator it) {
        this.Y = c3162Hm;
        this.X = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.X.next();
        return new C3162Hm.a(this.Y, next, this.Y.get(next));
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() not supported for BeanMap");
    }
}
