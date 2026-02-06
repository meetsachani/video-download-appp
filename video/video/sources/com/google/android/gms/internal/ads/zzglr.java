package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzglr {
    public static boolean a(int i) {
        if (i - 1 != 0) {
            if (zzgls.b() && !zzgls.a().booleanValue()) {
                return false;
            }
            return true;
        } else if (zzgls.b()) {
            return false;
        } else {
            return true;
        }
    }
}
