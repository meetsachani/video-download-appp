package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.InterfaceC11300zs1;
import o.KG;

/* loaded from: classes2.dex */
public final class zzags extends zzagx {
    public final String b;
    public final String c;
    public final String d;

    public zzags(String str, String str2, String str3) {
        super(KG.Z0);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzags.class == obj.getClass()) {
            zzags zzagsVar = (zzags) obj;
            if (Objects.equals(this.c, zzagsVar.c) && Objects.equals(this.b, zzagsVar.b) && Objects.equals(this.d, zzagsVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.b.hashCode() + 527) * 31) + this.c.hashCode();
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (hashCode * 31) + i;
    }

    @Override // com.google.android.gms.internal.ads.zzagx
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
