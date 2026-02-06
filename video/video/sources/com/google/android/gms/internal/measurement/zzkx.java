package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkx {
    public static final zzkx c = new zzkx();
    public final ConcurrentMap<Class<?>, zzlb<?>> b = new ConcurrentHashMap();
    public final zzle a = new zzjx();

    private zzkx() {
    }

    public static zzkx a() {
        return c;
    }

    public final <T> zzlb<T> b(Class<T> cls) {
        zziz.f(cls, "messageType");
        zzlb<T> zzlbVar = (zzlb<T>) this.b.get(cls);
        if (zzlbVar == null) {
            zzlbVar = this.a.a(cls);
            zziz.f(cls, "messageType");
            zziz.f(zzlbVar, "schema");
            zzlb putIfAbsent = this.b.putIfAbsent(cls, zzlbVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return zzlbVar;
    }

    public final <T> zzlb<T> c(T t) {
        return b(t.getClass());
    }
}
