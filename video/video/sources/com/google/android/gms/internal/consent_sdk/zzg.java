package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import o.C10101ux0;

/* loaded from: classes3.dex */
public final class zzg extends Exception {
    public final int X;

    public zzg(int i, String str) {
        super(str);
        this.X = i;
    }

    public final C10101ux0 a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new C10101ux0(this.X, super.getMessage());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public zzg(int i, String str, Throwable th) {
        super(str, th);
        this.X = i;
    }
}
