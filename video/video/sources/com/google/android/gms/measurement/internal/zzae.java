package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class zzae {
    public final boolean a = false;

    public zzae(Context context) {
    }

    public static boolean a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
