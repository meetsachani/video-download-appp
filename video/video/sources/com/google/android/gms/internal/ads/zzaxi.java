package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaxi extends zzayb {
    public final Map h;
    public final View i;
    public final Context j;

    public zzaxi(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2, Map map, View view, Context context) {
        super(zzawoVar, "q8irn8XqClynUBOsRuq73Jawzwc3gJeVDnk3iDYtMcevrbEAuNWFzcNhN+feXrfp", "dam+Wb9GR7yMSr36KIsK6PGM3yrtzGfNR9lAtk4lliE=", zzaskVar, i, 85);
        this.h = map;
        this.i = view;
        this.j = context;
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {b(1), b(2)};
        Context context = this.j;
        if (context == null) {
            context = this.a.b();
        }
        long[] jArr2 = (long[]) this.e.invoke(null, jArr, context, this.i);
        long j = jArr2[0];
        Map map = this.h;
        map.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        map.put(2, Long.valueOf(jArr2[3]));
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            zzaskVar.X2(j);
            zzaskVar.W2(j2);
        }
    }

    public final long b(int i) {
        Map map = this.h;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) map.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }
}
