package com.google.android.gms.internal.common;

import o.C10671xH0;

/* loaded from: classes2.dex */
final class zzl extends zzk {
    public final char a;

    public zzl(char c) {
        this.a = c;
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean a(char c) {
        return c == this.a;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.a;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = C10671xH0.b.charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return "CharMatcher.is('" + copyValueOf + "')";
    }
}
