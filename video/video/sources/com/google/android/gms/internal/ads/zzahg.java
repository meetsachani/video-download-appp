package com.google.android.gms.internal.ads;

import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzahg implements zzau {
    public final List a;

    public zzahg(List list) {
        this.a = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((zzahf) list.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (((zzahf) list.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((zzahf) list.get(i)).b;
                    i++;
                }
            }
        }
        zzdc.d(!z);
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void a(zzar zzarVar) {
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahg.class == obj.getClass()) {
            return this.a.equals(((zzahg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.a.toString());
    }
}
