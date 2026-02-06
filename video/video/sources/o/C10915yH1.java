package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.yH1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10915yH1 implements Iterator {
    public int X = 1;
    public int Y = -1;
    public final /* synthetic */ C11158zH1 Z;

    public C10915yH1(C11158zH1 c11158zH1) {
        this.Z = c11158zH1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.X <= this.Z.Y) {
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
            return this.Z.X[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        int i2 = this.Y;
        if (i2 != -1) {
            C11158zH1 c11158zH1 = this.Z;
            Object[] objArr = c11158zH1.X;
            int i3 = c11158zH1.Y;
            objArr[i2] = objArr[i3];
            objArr[i3] = null;
            int i4 = i3 - 1;
            c11158zH1.Y = i4;
            if (i4 != 0 && i2 <= i4) {
                if (i2 > 1) {
                    i = c11158zH1.d(objArr[i2], objArr[i2 / 2]);
                } else {
                    i = 0;
                }
                C11158zH1 c11158zH12 = this.Z;
                if (c11158zH12.Z) {
                    int i5 = this.Y;
                    if (i5 > 1 && i < 0) {
                        c11158zH12.p(i5);
                    } else {
                        c11158zH12.j(i5);
                    }
                } else {
                    int i6 = this.Y;
                    if (i6 > 1 && i > 0) {
                        c11158zH12.k(i6);
                    } else {
                        c11158zH12.i(i6);
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
