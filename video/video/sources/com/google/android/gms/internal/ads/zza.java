package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;
import o.BR0;
import o.C10323vs;
import o.InterfaceC11300zs1;
import o.OB;

/* loaded from: classes2.dex */
public final class zza {
    public final long a;
    public final int b;
    @Deprecated
    public final Uri[] c;
    public final zzap[] d;
    public final int[] e;
    public final long[] f;
    public final String[] g;
    public final long h;
    public final boolean i;

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
    }

    public zza(long j) {
        this(0L, -1, -1, new int[0], new zzap[0], new long[0], 0L, false, new String[0], false);
    }

    public final int a(@BR0(from = -1) int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    @OB
    public final zza b(int i) {
        int[] iArr = this.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, (long) C10323vs.b);
        return new zza(0L, 0, -1, copyOf, (zzap[]) Arrays.copyOf(this.d, 0), copyOf2, 0L, false, (String[]) Arrays.copyOf(this.g, 0), false);
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zza.class == obj.getClass()) {
            zza zzaVar = (zza) obj;
            if (this.b == zzaVar.b && Arrays.equals(this.d, zzaVar.d) && Arrays.equals(this.e, zzaVar.e) && Arrays.equals(this.f, zzaVar.f) && Arrays.equals(this.g, zzaVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.b * 31) - 1) * 961) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f)) * 29791) + Arrays.hashCode(this.g)) * 31;
    }

    public zza(long j, int i, int i2, int[] iArr, zzap[] zzapVarArr, long[] jArr, long j2, boolean z, String[] strArr, boolean z2) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzapVarArr.length;
        int i3 = 0;
        zzdc.d(length == length2);
        this.a = 0L;
        this.b = i;
        this.e = iArr;
        this.d = zzapVarArr;
        this.f = jArr;
        this.h = 0L;
        this.i = false;
        this.c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.c;
            if (i3 >= uriArr.length) {
                this.g = strArr;
                return;
            }
            zzap zzapVar = zzapVarArr[i3];
            if (zzapVar == null) {
                uri = null;
            } else {
                zzak zzakVar = zzapVar.b;
                zzakVar.getClass();
                uri = zzakVar.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }
}
