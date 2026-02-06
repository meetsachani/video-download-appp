package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
abstract class zzjs {
    public static final zzjs a = new zzjr();
    public static final zzjs b = new zzjt();

    public static zzjs a() {
        return a;
    }

    public static zzjs d() {
        return b;
    }

    public abstract <L> List<L> b(Object obj, long j);

    public abstract <L> void c(Object obj, Object obj2, long j);

    public abstract void e(Object obj, long j);

    private zzjs() {
    }
}
