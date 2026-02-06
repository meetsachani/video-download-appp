package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzhgg {
    public final List a;
    public final List b;

    public /* synthetic */ zzhgg(int i, int i2, zzhgf zzhgfVar) {
        this.a = zzhfs.c(i);
        this.b = zzhfs.c(i2);
    }

    public final zzhgg a(zzhge zzhgeVar) {
        this.b.add(zzhgeVar);
        return this;
    }

    public final zzhgg b(zzhge zzhgeVar) {
        this.a.add(zzhgeVar);
        return this;
    }

    public final zzhgh c() {
        return new zzhgh(this.a, this.b, null);
    }
}
