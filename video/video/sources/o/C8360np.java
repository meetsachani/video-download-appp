package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.np  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8360np implements Iterator {
    public int X;
    public int Y;
    public final /* synthetic */ C8847pp Y0;
    public boolean Z;

    public C8360np(C8847pp c8847pp) {
        int i;
        boolean z;
        this.Y0 = c8847pp;
        i = c8847pp.Y;
        this.X = i;
        this.Y = -1;
        z = c8847pp.Y0;
        this.Z = z;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        if (!this.Z) {
            int i2 = this.X;
            i = this.Y0.Z;
            if (i2 == i) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // java.util.Iterator
    public Object next() {
        int w;
        Object[] objArr;
        if (hasNext()) {
            this.Z = false;
            int i = this.X;
            this.Y = i;
            w = this.Y0.w(i);
            this.X = w;
            objArr = this.Y0.X;
            return objArr[this.Y];
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0020 */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void remove() {
        int i;
        int i2;
        int i3;
        int r;
        Object[] objArr;
        int i4;
        int r2;
        int i5;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        int i6 = this.Y;
        if (i6 != -1) {
            i = this.Y0.Y;
            if (i6 == i) {
                this.Y0.remove();
                this.Y = -1;
                return;
            }
            int i7 = this.Y;
            while (true) {
                i7++;
                while (i7 != i2) {
                    i5 = this.Y0.Z0;
                    if (i7 >= i5) {
                        objArr4 = this.Y0.X;
                        objArr5 = this.Y0.X;
                        objArr4[i7 - 1] = objArr5[0];
                        i7 = 0;
                    }
                }
                this.Y = -1;
                C8847pp c8847pp = this.Y0;
                i3 = c8847pp.Z;
                r = c8847pp.r(i3);
                c8847pp.Z = r;
                objArr = this.Y0.X;
                i4 = this.Y0.Z;
                objArr[i4] = null;
                this.Y0.Y0 = false;
                r2 = this.Y0.r(this.X);
                this.X = r2;
                return;
                objArr2 = this.Y0.X;
                objArr3 = this.Y0.X;
                objArr2[i7 - 1] = objArr3[i7];
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
