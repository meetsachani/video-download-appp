package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzfzx extends zzfwd {
    public final /* synthetic */ Set Y0;
    public final Iterator Z;
    public final /* synthetic */ Set Z0;

    public zzfzx(zzfzy zzfzyVar, Set set, Set set2) {
        this.Y0 = set;
        this.Z0 = set2;
        this.Z = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final Object b() {
        Set set;
        Object next;
        do {
            Iterator it = this.Z;
            if (it.hasNext()) {
                set = this.Z0;
                next = it.next();
            } else {
                c();
                return null;
            }
        } while (!set.contains(next));
        return next;
    }
}
