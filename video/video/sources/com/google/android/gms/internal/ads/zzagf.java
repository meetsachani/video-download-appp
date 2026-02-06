package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzagf extends zzaea {
    public final /* synthetic */ zzaem b;
    public final /* synthetic */ zzagg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzagf(zzagg zzaggVar, zzaem zzaemVar, zzaem zzaemVar2) {
        super(zzaemVar);
        this.b = zzaemVar2;
        this.c = zzaggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaea, com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        long j2;
        long j3;
        zzaek t = this.b.t(j);
        zzaen zzaenVar = t.a;
        long j4 = zzaenVar.b;
        zzagg zzaggVar = this.c;
        j2 = zzaggVar.X;
        zzaen zzaenVar2 = new zzaen(zzaenVar.a, j4 + j2);
        zzaen zzaenVar3 = t.b;
        long j5 = zzaenVar3.b;
        j3 = zzaggVar.X;
        return new zzaek(zzaenVar2, new zzaen(zzaenVar3.a, j5 + j3));
    }
}
