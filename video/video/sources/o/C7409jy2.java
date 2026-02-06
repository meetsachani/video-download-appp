package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.jy2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7409jy2 implements Iterator {
    public int X;
    public int Y = -1;
    public final /* synthetic */ C7895ly2 Z;

    public C7409jy2(C7895ly2 c7895ly2) {
        this.Z = c7895ly2;
        this.X = c7895ly2.Y;
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
            C7895ly2 c7895ly2 = this.Z;
            if (i != c7895ly2.Y) {
                h = c7895ly2.h(i);
                while (true) {
                    C7895ly2 c7895ly22 = this.Z;
                    int i2 = c7895ly22.Z;
                    if (h != i2) {
                        Object[] objArr = c7895ly22.X;
                        f3 = c7895ly22.f(h);
                        C7895ly2 c7895ly23 = this.Z;
                        objArr[f3] = c7895ly23.X[h];
                        h = c7895ly23.h(h);
                    } else {
                        this.Y = -1;
                        f = c7895ly22.f(i2);
                        c7895ly22.Z = f;
                        C7895ly2 c7895ly24 = this.Z;
                        c7895ly24.X[c7895ly24.Z] = null;
                        f2 = c7895ly24.f(this.X);
                        this.X = f2;
                        return;
                    }
                }
            } else {
                c7895ly2.remove();
                this.Y = -1;
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
