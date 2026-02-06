package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class zzfva implements Serializable {
    public static zzfva c() {
        return zzfug.X;
    }

    public static zzfva d(Object obj) {
        if (obj == null) {
            return zzfug.X;
        }
        return new zzfvh(obj);
    }

    public abstract zzfva a(zzfur zzfurVar);

    public abstract Object b(Object obj);
}
