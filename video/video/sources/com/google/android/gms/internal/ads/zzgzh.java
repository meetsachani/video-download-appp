package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzgzh extends IOException {
    public boolean X;

    public zzgzh(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void a() {
        this.X = true;
    }

    public final boolean b() {
        return this.X;
    }

    public zzgzh(String str) {
        super(str);
    }
}
