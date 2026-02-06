package com.google.android.gms.internal.common;

import o.MB;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzw extends zzj {
    public final zzo Y0;
    public final CharSequence Z;
    public final boolean Z0;
    public int a1 = 0;
    public int b1;

    public zzw(zzx zzxVar, CharSequence charSequence) {
        zzo zzoVar;
        boolean z;
        zzoVar = zzxVar.a;
        this.Y0 = zzoVar;
        z = zzxVar.b;
        this.Z0 = z;
        this.b1 = Integer.MAX_VALUE;
        this.Z = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        r3 = r5.b1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r3 != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r1 = r5.Z.length();
        r5.a1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r1 <= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r5.Z.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r5.b1 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        return r5.Z.subSequence(r0, r1).toString();
     */
    @Override // com.google.android.gms.internal.common.zzj
    @MB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object b() {
        int d;
        int i = this.a1;
        while (true) {
            int i2 = this.a1;
            if (i2 != -1) {
                int e = e(i2);
                if (e == -1) {
                    e = this.Z.length();
                    this.a1 = -1;
                    d = -1;
                } else {
                    d = d(e);
                    this.a1 = d;
                }
                if (d == i) {
                    int i3 = d + 1;
                    this.a1 = i3;
                    if (i3 > this.Z.length()) {
                        this.a1 = -1;
                    }
                } else {
                    if (i < e) {
                        this.Z.charAt(i);
                    }
                    if (i < e) {
                        this.Z.charAt(e - 1);
                    }
                    if (!this.Z0 || i != e) {
                        break;
                    }
                    i = this.a1;
                }
            } else {
                c();
                return null;
            }
        }
    }

    public abstract int d(int i);

    public abstract int e(int i);
}
