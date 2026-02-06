package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
import o.C6566gU0;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzgbd implements Serializable {
    public final int[] X;
    public final int Y;

    public zzgbd(int[] iArr, int i, int i2) {
        this.X = iArr;
        this.Y = i2;
    }

    public static zzgbd b(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgbd(copyOf, 0, copyOf.length);
    }

    public final int a(int i) {
        zzfvc.a(i, this.Y, "index");
        return this.X[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgbd)) {
            return false;
        }
        zzgbd zzgbdVar = (zzgbd) obj;
        int i = this.Y;
        if (i != zzgbdVar.Y) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (a(i2) != zzgbdVar.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.Y; i2++) {
            i = (i * 31) + this.X[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.Y;
        if (i != 0) {
            StringBuilder sb = new StringBuilder(i * 5);
            sb.append('[');
            int[] iArr = this.X;
            sb.append(iArr[0]);
            for (int i2 = 1; i2 < i; i2++) {
                sb.append(C6566gU0.h);
                sb.append(iArr[i2]);
            }
            sb.append(']');
            return sb.toString();
        }
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
