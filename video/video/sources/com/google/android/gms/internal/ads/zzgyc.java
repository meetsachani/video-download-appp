package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgyc {
    public static volatile boolean b = false;
    public static volatile zzgyc c;
    public static final zzgyc d = new zzgyc(true);
    public static final /* synthetic */ int e = 0;
    public final Map a;

    public zzgyc() {
        this.a = new HashMap();
    }

    public static zzgyc a() {
        int i = zzhan.d;
        return d;
    }

    public static zzgyc b() {
        zzgyc zzgycVar = c;
        if (zzgycVar != null) {
            return zzgycVar;
        }
        synchronized (zzgyc.class) {
            try {
                zzgyc zzgycVar2 = c;
                if (zzgycVar2 != null) {
                    return zzgycVar2;
                }
                int i = zzhan.d;
                zzgyc b2 = zzgyk.b(zzgyc.class);
                c = b2;
                return b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzgyq c(zzhad zzhadVar, int i) {
        return (zzgyq) this.a.get(new zzgyb(zzhadVar, i));
    }

    public zzgyc(boolean z) {
        this.a = Collections.EMPTY_MAP;
    }
}
