package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzkt {
    public static final zzkr a = c();
    public static final zzkr b = new zzku();

    public static zzkr a() {
        return a;
    }

    public static zzkr b() {
        return b;
    }

    public static zzkr c() {
        try {
            return (zzkr) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
