package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.C8858pr2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaji {
    public final boolean a;
    @InterfaceC11300zs1
    public final String b;
    public final zzaes c;
    public final int d;
    @InterfaceC11300zs1
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r6.equals("cenc") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaji(boolean z, @InterfaceC11300zs1 String str, int i, byte[] bArr, int i2, int i3, @InterfaceC11300zs1 byte[] bArr2) {
        boolean z2;
        boolean z3;
        char c = 0;
        int i4 = 1;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bArr2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzdc.d(z2 ^ z3);
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals(C10323vs.a2)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3046671:
                    if (str.equals(C10323vs.c2)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049879:
                    break;
                case 3049895:
                    if (str.equals(C10323vs.b2)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0 && c != 1) {
                if (c != 2 && c != 3) {
                    zzdx.f(C8858pr2.f, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                } else {
                    i4 = 2;
                }
            }
        }
        this.c = new zzaes(i4, bArr, i2, i3);
    }
}
