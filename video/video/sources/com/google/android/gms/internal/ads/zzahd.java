package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzahd extends zzagx {
    @InterfaceC11300zs1
    public final String b;
    public final String c;

    public zzahd(String str, @InterfaceC11300zs1 String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahd.class == obj.getClass()) {
            zzahd zzahdVar = (zzahd) obj;
            if (this.a.equals(zzahdVar.a) && Objects.equals(this.b, zzahdVar.b) && Objects.equals(this.c, zzahdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() + 527;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((hashCode * 31) + i) * 31) + this.c.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzagx
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
