package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o.C9811tl1;

/* loaded from: classes2.dex */
public final class zzadb implements zzaem {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public zzadb(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
            return;
        }
        this.f = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        long[] jArr = this.e;
        int y = zzeu.y(jArr, j, true, true);
        long j2 = jArr[y];
        long[] jArr2 = this.c;
        zzaen zzaenVar = new zzaen(j2, jArr2[y]);
        if (zzaenVar.a < j && y != this.a - 1) {
            int i = y + 1;
            return new zzaek(zzaenVar, new zzaen(jArr[i], jArr2[i]));
        }
        return new zzaek(zzaenVar, zzaenVar);
    }

    public final String toString() {
        long[] jArr = this.d;
        long[] jArr2 = this.e;
        long[] jArr3 = this.c;
        String arrays = Arrays.toString(this.b);
        String arrays2 = Arrays.toString(jArr3);
        String arrays3 = Arrays.toString(jArr2);
        String arrays4 = Arrays.toString(jArr);
        return "ChunkIndex(length=" + this.a + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + C9811tl1.d;
    }
}
