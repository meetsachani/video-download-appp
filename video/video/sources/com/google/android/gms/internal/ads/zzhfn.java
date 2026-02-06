package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzhfn {
    public static zzhfn b(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzhfi(cls.getSimpleName());
        }
        return new zzhfk(cls.getSimpleName());
    }

    public abstract void a(String str);
}
