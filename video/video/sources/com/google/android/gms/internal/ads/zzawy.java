package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzawy extends zzayb {
    public final Activity h;
    public final View i;

    public zzawy(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2, View view, Activity activity) {
        super(zzawoVar, "YX3pd3fZ/j0e82Z3yXv98nYqAI3nsN+d0YAKVHjoLLbjd+BRZ45hNatoujYNmZM/", "2IfMUy5zOuVT1ilWAqZrt9PNbHCY94WGDxwYlYOFZTM=", zzaskVar, i, 62);
        this.i = view;
        this.h = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        View view = this.i;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S2);
        boolean booleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.e.invoke(null, view, this.h, bool);
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            try {
                zzaskVar.G2(((Long) objArr[0]).longValue());
                zzaskVar.I2(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    zzaskVar.H2((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
