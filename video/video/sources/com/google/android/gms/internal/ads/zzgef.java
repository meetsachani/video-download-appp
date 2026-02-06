package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzgef {
    public final InputStream a;

    public zzgef(InputStream inputStream) {
        this.a = inputStream;
    }

    public static zzgef b(byte[] bArr) {
        return new zzgef(new ByteArrayInputStream(bArr));
    }

    public final zzgty a() throws IOException {
        try {
            return zzgty.v2(this.a, zzgyc.a());
        } finally {
            this.a.close();
        }
    }
}
