package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
abstract class zzgci extends zzgby {
    public List k1;

    public zzgci(zzfxx zzfxxVar, boolean z) {
        super(zzfxxVar, z, true);
        List a;
        if (zzfxxVar.isEmpty()) {
            a = Collections.EMPTY_LIST;
        } else {
            a = zzfys.a(zzfxxVar.size());
        }
        for (int i = 0; i < zzfxxVar.size(); i++) {
            a.add(null);
        }
        this.k1 = a;
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final void D(int i) {
        super.D(i);
        this.k1 = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final void M(int i, Object obj) {
        List list = this.k1;
        if (list != null) {
            list.set(i, new zzgch(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final void N() {
        List list = this.k1;
        if (list != null) {
            l(P(list));
        }
    }

    public abstract Object P(List list);
}
