package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzin {
    public static final zzim<?> a = new zzio();
    public static final zzim<?> b = c();

    public static zzim<?> a() {
        zzim<?> zzimVar = b;
        if (zzimVar != null) {
            return zzimVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzim<?> b() {
        return a;
    }

    public static zzim<?> c() {
        try {
            return (zzim) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
