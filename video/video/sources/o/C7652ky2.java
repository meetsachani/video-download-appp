package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.ky2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7652ky2 implements Iterator {
    public int X;
    public int Y = -1;
    public final /* synthetic */ C8156my2 Z;

    public C7652ky2(C8156my2 c8156my2) {
        this.Z = c8156my2;
        this.X = c8156my2.Y;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.X != this.Z.Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        int h;
        if (hasNext()) {
            int i = this.X;
            this.Y = i;
            h = this.Z.h(i);
            this.X = h;
            return this.Z.X[this.Y];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        int h;
        int f;
        int f2;
        int f3;
        int i = this.Y;
        if (i != -1) {
            C8156my2 c8156my2 = this.Z;
            if (i != c8156my2.Y) {
                h = c8156my2.h(i);
                while (true) {
                    C8156my2 c8156my22 = this.Z;
                    int i2 = c8156my22.Z;
                    if (h != i2) {
                        Object[] objArr = c8156my22.X;
                        f3 = c8156my22.f(h);
                        C8156my2 c8156my23 = this.Z;
                        objArr[f3] = c8156my23.X[h];
                        h = c8156my23.h(h);
                    } else {
                        this.Y = -1;
                        f = c8156my22.f(i2);
                        c8156my22.Z = f;
                        C8156my2 c8156my24 = this.Z;
                        c8156my24.X[c8156my24.Z] = null;
                        f2 = c8156my24.f(this.X);
                        this.X = f2;
                        return;
                    }
                }
            } else {
                c8156my2.remove();
                this.Y = -1;
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
