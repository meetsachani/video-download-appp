package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class zzc {
    public static final ClassLoader a = zzc.class.getClassLoader();

    private zzc() {
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
