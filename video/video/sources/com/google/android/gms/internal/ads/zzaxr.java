package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaxr extends zzayb {
    public List h;
    public final Context i;

    public zzaxr(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2, Context context) {
        super(zzawoVar, "G1O+5tqulLBNCxZxcYiJSAGrazgAMWmQ49z8g8PEPhhOgnBizp9p2UWwJMiSx+ju", "xfUFYLaeYlsk7z1gy27YVxCq/UzpfsdVkNtosT4BuNc=", zzaskVar, i, 31);
        this.h = null;
        this.i = context;
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        zzask zzaskVar = this.d;
        zzaskVar.u2(-1L);
        zzaskVar.q2(-1L);
        Context context = this.i;
        if (context == null) {
            context = this.a.b();
        }
        if (this.h == null) {
            this.h = (List) this.e.invoke(null, context);
        }
        List list = this.h;
        if (list != null && list.size() == 2) {
            synchronized (zzaskVar) {
                zzaskVar.u2(((Long) this.h.get(0)).longValue());
                zzaskVar.q2(((Long) this.h.get(1)).longValue());
            }
        }
    }
}
