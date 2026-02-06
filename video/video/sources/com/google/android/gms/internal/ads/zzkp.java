package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzkp extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzkp(int i) {
        super(r2);
        String str;
        if (i != 1) {
            if (i != 2) {
                str = "Detaching surface timed out.";
            } else {
                str = "Setting foreground mode timed out.";
            }
        } else {
            str = "Player release timed out.";
        }
    }
}
