package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class zzbzp {
    public BigInteger a = BigInteger.ONE;
    public String b = "0";

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.a.toString();
        this.a = this.a.add(BigInteger.ONE);
        this.b = bigInteger;
        return bigInteger;
    }

    public final synchronized String b() {
        return this.b;
    }
}
