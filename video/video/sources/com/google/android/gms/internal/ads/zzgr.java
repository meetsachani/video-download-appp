package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzgr extends zzfxs {
    public final Map X;

    public zzgr(Map map) {
        this.X = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, java.util.Map
    public final boolean containsKey(@InterfaceC11300zs1 Object obj) {
        if (obj != null && super.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, java.util.Map
    public final boolean containsValue(@InterfaceC11300zs1 Object obj) {
        return super.j(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxt
    public final /* synthetic */ Object e() {
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, java.util.Map
    public final Set entrySet() {
        return zzgae.c(this.X.entrySet(), new zzfvd() { // from class: com.google.android.gms.internal.ads.zzgp
            @Override // com.google.android.gms.internal.ads.zzfvd
            public final boolean b(Object obj) {
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, java.util.Map
    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj != null && super.l(obj)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    public final Map g() {
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, java.util.Map
    @InterfaceC11300zs1
    public final /* synthetic */ Object get(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.X.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, java.util.Map
    public final int hashCode() {
        return super.i();
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, java.util.Map
    public final boolean isEmpty() {
        if (this.X.isEmpty()) {
            return true;
        }
        if (super.size() == 1 && super.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, java.util.Map
    public final Set keySet() {
        return zzgae.c(this.X.keySet(), new zzfvd() { // from class: com.google.android.gms.internal.ads.zzgq
            @Override // com.google.android.gms.internal.ads.zzfvd
            public final boolean b(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
