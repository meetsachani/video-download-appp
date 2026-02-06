package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzagp extends zzagx {
    public final byte[] b;

    public zzagp(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagp.class == obj.getClass()) {
            zzagp zzagpVar = (zzagp) obj;
            if (this.a.equals(zzagpVar.a) && Arrays.equals(this.b, zzagpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b);
    }
}
