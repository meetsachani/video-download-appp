package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class zzgeg {
    public final OutputStream a;

    public zzgeg(OutputStream outputStream) {
        this.a = outputStream;
    }

    public static zzgeg b(OutputStream outputStream) {
        return new zzgeg(outputStream);
    }

    public final void a(zzgty zzgtyVar) throws IOException {
        try {
            zzgtyVar.a1(this.a);
        } finally {
            this.a.close();
        }
    }
}
