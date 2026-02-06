package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import o.C2638Cg0;

/* loaded from: classes2.dex */
public final class zzaxo extends zzayb {
    public static volatile String h;
    public static final Object i = new Object();

    public zzaxo(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i2, int i3) {
        super(zzawoVar, "d4PN2fwB2P9jxIUN6NPwGCD1vcjTZd510+VTbYWnWivlqPuX4Pd9jb/zoaClHGV2", "B7r3opNSMuM8FMoC6aVwUNpehxdhrcT61rhsqayMJbM=", zzaskVar, i2, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.d.e3(C2638Cg0.S4);
        if (h == null) {
            synchronized (i) {
                try {
                    if (h == null) {
                        h = (String) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            zzaskVar.e3(h);
        }
    }
}
