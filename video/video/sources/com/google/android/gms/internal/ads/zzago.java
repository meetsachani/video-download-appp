package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import o.C2617Cb;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzago extends zzagx {
    public final String b;
    @InterfaceC11300zs1
    public final String c;
    public final int d;
    public final byte[] e;

    public zzago(String str, @InterfaceC11300zs1 String str2, int i, byte[] bArr) {
        super(C2617Cb.a1);
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzagx, com.google.android.gms.internal.ads.zzau
    public final void a(zzar zzarVar) {
        zzarVar.x(this.e, this.d);
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzago.class == obj.getClass()) {
            zzago zzagoVar = (zzago) obj;
            if (this.d == zzagoVar.d && Objects.equals(this.b, zzagoVar.b) && Objects.equals(this.c, zzagoVar.c) && Arrays.equals(this.e, zzagoVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = this.d;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((((((i3 + 527) * 31) + i) * 31) + i2) * 31) + Arrays.hashCode(this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzagx
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
