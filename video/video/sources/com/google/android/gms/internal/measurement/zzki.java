package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzki {
    public static final zzkg a = c();
    public static final zzkg b = new zzkf();

    public static zzkg a() {
        return a;
    }

    public static zzkg b() {
        return b;
    }

    public static zzkg c() {
        try {
            return (zzkg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
