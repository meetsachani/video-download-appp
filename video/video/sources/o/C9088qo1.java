package o;

import java.util.Arrays;

@Deprecated
/* renamed from: o.qo1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9088qo1 {
    public final int a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;

    public C9088qo1(int i, int i2) {
        this.a = i;
        byte[] bArr = new byte[i2 + 3];
        this.d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (!this.b) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i4 = this.e;
        if (length < i4 + i3) {
            this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
        }
        System.arraycopy(bArr, i, this.d, this.e, i3);
        this.e += i3;
    }

    public boolean b(int i) {
        if (!this.b) {
            return false;
        }
        this.e -= i;
        this.b = false;
        this.c = true;
        return true;
    }

    public boolean c() {
        return this.c;
    }

    public void d() {
        this.b = false;
        this.c = false;
    }

    public void e(int i) {
        boolean z = true;
        C9542sf.i(!this.b);
        if (i != this.a) {
            z = false;
        }
        this.b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }
}
