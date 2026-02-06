package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* loaded from: classes2.dex */
public final class zzbcx {
    public static Object a(zzfvu zzfvuVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzfvuVar.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
