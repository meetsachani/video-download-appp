package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import o.UE;

/* loaded from: classes2.dex */
public final class zzew {
    public final String a;

    public zzew(int i, int i2, String str) {
        this.a = str;
    }

    @InterfaceC11300zs1
    public static zzew a(zzek zzekVar) {
        String str;
        String str2;
        zzekVar.m(2);
        int G = zzekVar.G();
        int i = G >> 1;
        int i2 = G & 1;
        int G2 = zzekVar.G() >> 3;
        if (i != 4 && i != 5 && i != 7 && i != 8) {
            if (i == 9) {
                str = "dvav";
            } else if (i == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        int i3 = G2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str3 = UE.h;
        if (i < 10) {
            str2 = ".0";
        } else {
            str2 = UE.h;
        }
        sb.append(str2);
        sb.append(i);
        if (i3 < 10) {
            str3 = ".0";
        }
        sb.append(str3);
        sb.append(i3);
        return new zzew(i, i3, sb.toString());
    }
}
