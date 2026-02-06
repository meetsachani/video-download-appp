package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbm;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgcd extends zzgbm.zzf {
    public static final zzgbz e1;
    public static final zzgdh f1 = new zzgdh(zzgcd.class);
    public volatile Set<Throwable> c1 = null;
    public volatile int d1;

    static {
        Throwable th;
        zzgbz zzgcbVar;
        try {
            zzgcbVar = new zzgca(null);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzgcbVar = new zzgcb(null);
        }
        e1 = zzgcbVar;
        if (th != null) {
            f1.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzgcd(int i) {
        this.d1 = i;
    }

    public final int A() {
        return e1.a(this);
    }

    public final Set B() {
        Set<Throwable> set = this.c1;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            C(newSetFromMap);
            e1.b(this, null, newSetFromMap);
            Set<Throwable> set2 = this.c1;
            Objects.requireNonNull(set2);
            return set2;
        }
        return set;
    }

    public abstract void C(Set set);
}
