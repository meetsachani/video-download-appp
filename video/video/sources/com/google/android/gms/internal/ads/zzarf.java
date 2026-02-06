package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import o.C9811tl1;

/* loaded from: classes2.dex */
public final class zzarf extends zzhfg implements Closeable {
    static {
        zzhfn.b(zzarf.class);
    }

    public zzarf(zzhfh zzhfhVar, zzare zzareVar) throws IOException {
        i(zzhfhVar, zzhfhVar.c(), zzareVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhfg
    public final String toString() {
        String obj = this.Y.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(C9811tl1.d);
        return sb.toString();
    }
}
