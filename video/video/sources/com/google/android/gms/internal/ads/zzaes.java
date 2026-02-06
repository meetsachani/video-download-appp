package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaes {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public zzaes(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaes.class == obj.getClass()) {
            zzaes zzaesVar = (zzaes) obj;
            if (this.a == zzaesVar.a && this.c == zzaesVar.c && this.d == zzaesVar.d && Arrays.equals(this.b, zzaesVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
