package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import o.HH1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzahb extends zzagx {
    public final String b;
    public final byte[] c;

    public zzahb(String str, byte[] bArr) {
        super(HH1.Y0);
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahb.class == obj.getClass()) {
            zzahb zzahbVar = (zzahb) obj;
            if (Objects.equals(this.b, zzahbVar.b) && Arrays.equals(this.c, zzahbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 527) * 31) + Arrays.hashCode(this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzagx
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
