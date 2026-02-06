package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Set;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzemo implements zzetv {
    public final Set a;

    public zzemo(Set set) {
        this.a = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.a) {
            arrayList.add(str);
        }
        return zzgcy.h(new zzemm(arrayList, null));
    }
}
