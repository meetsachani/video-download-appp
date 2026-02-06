package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzfmz {
    public final zzfma a;
    public final ArrayList b;

    public zzfmz(zzfma zzfmaVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = zzfmaVar;
        arrayList.add(str);
    }

    public final zzfma a() {
        return this.a;
    }

    public final ArrayList b() {
        return this.b;
    }

    public final void c(String str) {
        this.b.add(str);
    }
}
