package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.kn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7605kn implements Iterator {
    public int X = 1;
    public int Y = -1;
    public final /* synthetic */ C7848ln Z;

    public C7605kn(C7848ln c7848ln) {
        this.Z = c7848ln;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.X <= this.Z.X) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            int i = this.X;
            this.Y = i;
            this.X = i + 1;
            return this.Z.Y[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        int i2 = this.Y;
        if (i2 != -1) {
            C7848ln c7848ln = this.Z;
            Object[] objArr = c7848ln.Y;
            int i3 = c7848ln.X;
            objArr[i2] = objArr[i3];
            objArr[i3] = null;
            int i4 = i3 - 1;
            c7848ln.X = i4;
            if (i4 != 0 && i2 <= i4) {
                if (i2 > 1) {
                    i = c7848ln.f(objArr[i2], objArr[i2 / 2]);
                } else {
                    i = 0;
                }
                C7848ln c7848ln2 = this.Z;
                if (c7848ln2.Z) {
                    int i5 = this.Y;
                    if (i5 > 1 && i < 0) {
                        c7848ln2.p(i5);
                    } else {
                        c7848ln2.j(i5);
                    }
                } else {
                    int i6 = this.Y;
                    if (i6 > 1 && i > 0) {
                        c7848ln2.k(i6);
                    } else {
                        c7848ln2.i(i6);
                    }
                }
            }
            this.X--;
            this.Y = -1;
            return;
        }
        throw new IllegalStateException();
    }
}
