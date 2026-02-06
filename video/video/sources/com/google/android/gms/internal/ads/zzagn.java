package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzagn implements zzau {
    public final int a;
    @InterfaceC11300zs1
    public final String b;
    @InterfaceC11300zs1
    public final String c;
    @InterfaceC11300zs1
    public final String d;
    public final boolean e;
    public final int f;

    public zzagn(int i, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        zzdc.d(z2);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final void a(zzar zzarVar) {
        String str = this.c;
        if (str != null) {
            zzarVar.N(str);
        }
        String str2 = this.b;
        if (str2 != null) {
            zzarVar.G(str2);
        }
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagn.class == obj.getClass()) {
            zzagn zzagnVar = (zzagn) obj;
            if (this.a == zzagnVar.a && Objects.equals(this.b, zzagnVar.b) && Objects.equals(this.c, zzagnVar.c) && Objects.equals(this.d, zzagnVar.d) && this.e == zzagnVar.e && this.f == zzagnVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = this.a;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = ((i4 + 527) * 31) + i;
        String str3 = this.d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return (((((((i5 * 31) + i2) * 31) + i3) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }
}
