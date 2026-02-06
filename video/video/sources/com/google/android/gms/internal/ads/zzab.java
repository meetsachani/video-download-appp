package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzab {
    @InterfaceC11300zs1
    public final String a;
    public final String b;

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzab(@InterfaceC11300zs1 String str, String str2) {
        this.a = zzeu.e(str);
        this.b = str2;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzab.class == obj.getClass()) {
            zzab zzabVar = (zzab) obj;
            if (Objects.equals(this.a, zzabVar.a) && Objects.equals(this.b, zzabVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
