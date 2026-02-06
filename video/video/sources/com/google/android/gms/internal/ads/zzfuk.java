package com.google.android.gms.internal.ads;

import o.C10671xH0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfuk extends zzfuj {
    public final char X;

    public zzfuk(char c) {
        this.X = c;
    }

    @Override // com.google.android.gms.internal.ads.zzfun
    public final boolean a(char c) {
        return c == this.X;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.X;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = C10671xH0.b.charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return "CharMatcher.is('" + copyValueOf + "')";
    }
}
