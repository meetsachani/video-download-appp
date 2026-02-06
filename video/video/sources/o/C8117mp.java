package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.mp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8117mp implements Iterator {
    public int X;
    public int Y;
    public final /* synthetic */ C8604op Y0;
    public boolean Z;

    public C8117mp(C8604op c8604op) {
        int i;
        boolean z;
        this.Y0 = c8604op;
        i = c8604op.Y;
        this.X = i;
        this.Y = -1;
        z = c8604op.Y0;
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

    /* JADX WARN: Incorrect condition in loop: B:14:0x004b */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void remove() {
        int i;
        int i2;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        int r;
        Object[] objArr4;
        int i5;
        int r2;
        Object[] objArr5;
        int i6;
        int r3;
        int i7;
        Object[] objArr6;
        Object[] objArr7;
        int i8;
        int i9 = this.Y;
        if (i9 != -1) {
            i = this.Y0.Y;
            if (i9 == i) {
                this.Y0.remove();
                this.Y = -1;
                return;
            }
            int i10 = this.Y + 1;
            i2 = this.Y0.Y;
            if (i2 < this.Y) {
                i7 = this.Y0.Z;
                if (i10 < i7) {
                    objArr6 = this.Y0.X;
                    objArr7 = this.Y0.X;
                    int i11 = this.Y;
                    i8 = this.Y0.Z;
                    System.arraycopy(objArr6, i10, objArr7, i11, i8 - i10);
                    this.Y = -1;
                    C8604op c8604op = this.Y0;
                    i5 = c8604op.Z;
                    r2 = c8604op.r(i5);
                    c8604op.Z = r2;
                    objArr5 = this.Y0.X;
                    i6 = this.Y0.Z;
                    objArr5[i6] = null;
                    this.Y0.Y0 = false;
                    r3 = this.Y0.r(this.X);
                    this.X = r3;
                    return;
                }
            }
            while (i10 != i3) {
                i4 = this.Y0.Z0;
                if (i10 >= i4) {
                    objArr = this.Y0.X;
                    objArr2 = this.Y0.X;
                    objArr[i10 - 1] = objArr2[0];
                    i10 = 0;
                } else {
                    objArr3 = this.Y0.X;
                    r = this.Y0.r(i10);
                    objArr4 = this.Y0.X;
                    objArr3[r] = objArr4[i10];
                    i10 = this.Y0.w(i10);
                }
            }
            this.Y = -1;
            C8604op c8604op2 = this.Y0;
            i5 = c8604op2.Z;
            r2 = c8604op2.r(i5);
            c8604op2.Z = r2;
            objArr5 = this.Y0.X;
            i6 = this.Y0.Z;
            objArr5[i6] = null;
            this.Y0.Y0 = false;
            r3 = this.Y0.r(this.X);
            this.X = r3;
            return;
        }
        throw new IllegalStateException();
    }
}
