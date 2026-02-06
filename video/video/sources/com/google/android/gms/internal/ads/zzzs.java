package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzzs extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzzs(Throwable th) {
        super("Unexpected " + r0 + r1, th);
        String str;
        String simpleName = th.getClass().getSimpleName();
        if (th.getMessage() != null) {
            str = ": ".concat(String.valueOf(th.getMessage()));
        } else {
            str = "";
        }
    }
}
