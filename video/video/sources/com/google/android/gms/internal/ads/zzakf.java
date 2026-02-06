package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzakf {
    public static void a(zzakg zzakgVar, zzakk zzakkVar, zzdk zzdkVar) {
        for (int i = 0; i < zzakgVar.a(); i++) {
            long z = zzakgVar.z(i);
            List b = zzakgVar.b(z);
            if (!b.isEmpty()) {
                if (i != zzakgVar.a() - 1) {
                    long z2 = zzakgVar.z(i + 1) - zzakgVar.z(i);
                    if (z2 > 0) {
                        zzdkVar.b(new zzakd(b, z, z2));
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
