package o;

import java.util.Iterator;

/* renamed from: o.mD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7971mD implements Iterator<Class<?>> {
    public final /* synthetic */ C10551wn1 X;

    public C7971mD(C10551wn1 c10551wn1) {
        this.X = c10551wn1;
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public Class<?> next() {
        Class<?> cls = (Class) this.X.getValue();
        this.X.setValue(cls.getSuperclass());
        return cls;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.X.getValue() != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
