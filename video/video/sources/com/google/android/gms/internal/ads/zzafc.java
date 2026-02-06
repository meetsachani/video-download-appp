package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzafc implements zzaem {
    public final long a;
    public final /* synthetic */ zzaff b;

    public zzafc(zzaff zzaffVar, long j) {
        this.b = zzaffVar;
        this.a = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0013 */
    @Override // com.google.android.gms.internal.ads.zzaem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaek t(long j) {
        zzafi[] zzafiVarArr;
        zzafi[] zzafiVarArr2;
        zzafi[] zzafiVarArr3;
        zzaff zzaffVar = this.b;
        zzafiVarArr = zzaffVar.i;
        zzaek a = zzafiVarArr[0].a(j);
        for (int i = 1; i < zzafiVarArr2.length; i++) {
            zzafiVarArr3 = zzaffVar.i;
            zzaek a2 = zzafiVarArr3[i].a(j);
            if (a2.a.b < a.a.b) {
                a = a2;
            }
        }
        return a;
    }
}
