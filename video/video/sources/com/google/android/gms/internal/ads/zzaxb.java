package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import o.C2638Cg0;

/* loaded from: classes2.dex */
public final class zzaxb extends zzayb {
    public static final zzayc i = new zzayc();
    public final Context h;

    public zzaxb(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i2, int i3, Context context) {
        super(zzawoVar, "agDdf5wrmtJ0cP5XVK0JCsJ4BViR17o/n9P6hmH0muvYwmpx2DZ552/tAJvOo6qR", "48yXjRp5G93PEoVZx8WBMAeqgOhil0yQSUdmW98nZyI=", zzaskVar, i2, 29);
        this.h = context;
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.d.R2(C2638Cg0.S4);
        Context context = this.h;
        AtomicReference a = i.a(context.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                try {
                    if (a.get() == null) {
                        a.set((String) this.e.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) a.get();
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            zzaskVar.R2(zzauc.a(str.getBytes(), true));
        }
    }
}
