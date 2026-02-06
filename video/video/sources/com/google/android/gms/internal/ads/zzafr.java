package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzafr extends zzacz {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzafr(final zzady zzadyVar, int i, long j, long j2) {
        super(r1, r2, r3, 0L, r7, j, j2, r5, Math.max(6, zzadyVar.c));
        long j3;
        Objects.requireNonNull(zzadyVar);
        zzacw zzacwVar = new zzacw() { // from class: com.google.android.gms.internal.ads.zzafo
            @Override // com.google.android.gms.internal.ads.zzacw
            public final long s(long j4) {
                return zzady.this.b(j4);
            }
        };
        zzafp zzafpVar = new zzafp(zzadyVar, i, null);
        long a = zzadyVar.a();
        long j4 = zzadyVar.j;
        int i2 = zzadyVar.d;
        if (i2 > 0) {
            j3 = ((i2 + zzadyVar.c) / 2) + 1;
        } else {
            int i3 = zzadyVar.a;
            int i4 = zzadyVar.b;
            long j5 = PlaybackStateCompat.t1;
            if (i3 == i4 && i3 > 0) {
                j5 = i3;
            }
            j3 = 64 + (((j5 * zzadyVar.g) * zzadyVar.h) / 8);
        }
    }
}
