package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzael implements zzaem {
    public final long a;
    public final zzaek b;

    public zzael(long j, long j2) {
        zzaen zzaenVar;
        this.a = j;
        if (j2 == 0) {
            zzaenVar = zzaen.c;
        } else {
            zzaenVar = new zzaen(0L, j2);
        }
        this.b = new zzaek(zzaenVar, zzaenVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        return this.b;
    }
}
