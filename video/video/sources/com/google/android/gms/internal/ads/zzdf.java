package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes2.dex */
public final class zzdf {
    public final zzdq a;
    public final zzdq b;
    public Object c;
    public final zzjh d;

    public zzdf(Object obj, Looper looper, Looper looper2, zzdg zzdgVar, zzjh zzjhVar) {
        this.a = zzdgVar.d(looper, null);
        this.b = zzdgVar.d(looper2, null);
        this.c = obj;
        this.d = zzjhVar;
    }

    public static /* synthetic */ void a(zzdf zzdfVar, Object obj) {
        Object obj2 = zzdfVar.c;
        zzdfVar.c = obj;
        if (!obj2.equals(obj)) {
            zzdfVar.d.a(obj2, obj);
        }
    }

    public final void b(Runnable runnable) {
        this.a.h(runnable);
    }

    public final void c(final Object obj) {
        this.b.h(new Runnable() { // from class: com.google.android.gms.internal.ads.zzde
            @Override // java.lang.Runnable
            public final void run() {
                zzdf.a(zzdf.this, obj);
            }
        });
    }
}
