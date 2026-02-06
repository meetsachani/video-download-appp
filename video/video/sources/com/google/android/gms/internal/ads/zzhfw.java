package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhfw implements zzhfv, zzhfp {
    public static final zzhfw b = new zzhfw(null);
    public final Object a;

    public zzhfw(Object obj) {
        this.a = obj;
    }

    public static zzhfv a(Object obj) {
        zzhgd.a(obj, "instance cannot be null");
        return new zzhfw(obj);
    }

    public static zzhfv c(Object obj) {
        if (obj == null) {
            return b;
        }
        return new zzhfw(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final Object b() {
        return this.a;
    }
}
