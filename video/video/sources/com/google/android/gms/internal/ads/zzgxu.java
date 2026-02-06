package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;
import o.ME;

/* loaded from: classes2.dex */
public final class zzgxu extends IOException {
    public zzgxu() {
        super(ME.f.X);
    }

    public zzgxu(long j, long j2, int i, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i))), th);
    }

    public zzgxu(Throwable th) {
        super(ME.f.X, th);
    }
}
