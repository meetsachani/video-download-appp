package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaev {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public zzaev(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
    }

    public final int a() {
        return (this.c * 8) + this.d;
    }

    public final int b(int i) {
        int i2 = this.c;
        int i3 = i2 + 1;
        byte[] bArr = this.a;
        int min = Math.min(i, 8 - this.d);
        int i4 = ((bArr[i2] & 255) >> this.d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (bArr[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        c(i);
        return i5;
    }

    public final void c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.c + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 * 8));
        this.d = i5;
        if (i5 > 7) {
            i4++;
            this.c = i4;
            i5 -= 8;
            this.d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        zzdc.f(z);
    }

    public final boolean d() {
        c(1);
        if (1 == (((this.a[this.c] & 255) >> this.d) & 1)) {
            return true;
        }
        return false;
    }
}
