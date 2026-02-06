package com.google.android.gms.internal.ads;

import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbt {
    public static final zzbt b = new zzbt(zzfyc.F());
    public final zzfyc a;

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
    }

    public zzbt(List list) {
        this.a = zzfyc.B(list);
    }

    public final zzfyc a() {
        return this.a;
    }

    public final boolean b(int i) {
        int i2 = 0;
        while (true) {
            zzfyc zzfycVar = this.a;
            if (i2 >= zzfycVar.size()) {
                return false;
            }
            zzbs zzbsVar = (zzbs) zzfycVar.get(i2);
            if (zzbsVar.c() && zzbsVar.a() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbt.class == obj.getClass()) {
            return this.a.equals(((zzbt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
