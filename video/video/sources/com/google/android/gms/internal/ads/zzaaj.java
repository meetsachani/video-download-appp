package com.google.android.gms.internal.ads;

import o.C4128Rj1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaaj {
    public zzz a;
    public final /* synthetic */ zzaal b;

    public /* synthetic */ zzaaj(zzaal zzaalVar, zzaak zzaakVar) {
        this.b = zzaalVar;
    }

    public final void a(final zzcd zzcdVar) {
        zzx zzxVar = new zzx();
        zzxVar.J(zzcdVar.a);
        zzxVar.m(zzcdVar.b);
        zzxVar.E(C4128Rj1.C);
        this.a = zzxVar.K();
        zzaal.f(this.b).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaai
            @Override // java.lang.Runnable
            public final void run() {
                zzaal.d(zzaaj.this.b).d(zzcdVar);
            }
        });
    }

    public final void b(long j, long j2, boolean z) {
        if (z) {
            zzaal zzaalVar = this.b;
            if (zzaal.a(zzaalVar) != null) {
                zzaal.f(zzaalVar).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaag
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzaal.d(zzaaj.this.b).a();
                    }
                });
            }
        }
        zzz zzzVar = this.a;
        if (zzzVar == null) {
            zzzVar = new zzx().K();
        }
        zzz zzzVar2 = zzzVar;
        zzaal zzaalVar2 = this.b;
        zzaal.c(zzaalVar2).c(j2, j, zzzVar2, null);
        ((zzacf) zzaal.e(zzaalVar2).remove()).s(j);
    }
}
