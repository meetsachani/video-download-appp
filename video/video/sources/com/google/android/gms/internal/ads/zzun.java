package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzun {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public zzgf c;

    public zzun(zzads zzadsVar, zzakj zzakjVar) {
    }

    public final void a(zzgf zzgfVar) {
        if (zzgfVar != this.c) {
            this.c = zzgfVar;
            this.a.clear();
            this.b.clear();
        }
    }
}
