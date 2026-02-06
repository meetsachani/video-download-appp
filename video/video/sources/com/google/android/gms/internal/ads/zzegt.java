package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o.InterfaceC11300zs1;
import o.UE;

/* loaded from: classes2.dex */
final class zzegt {
    public final String a;
    public final String b;
    public int c;
    public long d;
    @InterfaceC11300zs1
    public final Integer e;

    public zzegt(String str, String str2, int i, long j, @InterfaceC11300zs1 Integer num) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = num;
    }

    public final String toString() {
        Integer num;
        String str = this.a + UE.h + this.c + UE.h + this.d;
        String str2 = this.b;
        if (!TextUtils.isEmpty(str2)) {
            str = str + UE.h + str2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O1)).booleanValue() && (num = this.e) != null && !TextUtils.isEmpty(str2)) {
            return str + UE.h + num;
        }
        return str;
    }
}
