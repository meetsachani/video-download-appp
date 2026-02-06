package com.google.android.gms.measurement.internal;

import o.C2638Cg0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfu implements Runnable {
    public final /* synthetic */ int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ Object Y0;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object Z0;
    public final /* synthetic */ zzfr a1;

    public zzfu(zzfr zzfrVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.a1 = zzfrVar;
        this.X = i;
        this.Y = str;
        this.Z = obj;
        this.Y0 = obj2;
        this.Z0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        zzgd F = this.a1.a.F();
        if (F.r()) {
            c = this.a1.c;
            if (c == 0) {
                if (this.a1.d().T()) {
                    this.a1.c = 'C';
                } else {
                    this.a1.c = 'c';
                }
            }
            j = this.a1.d;
            if (j < 0) {
                this.a1.d = 82001L;
            }
            char charAt = "01VDIWEA?".charAt(this.X);
            c2 = this.a1.c;
            j2 = this.a1.d;
            String str = C2638Cg0.Y4 + charAt + c2 + j2 + ":" + zzfr.x(true, this.Y, this.Z, this.Y0, this.Z0);
            if (str.length() > 1024) {
                str = this.Y.substring(0, 1024);
            }
            zzgh zzghVar = F.d;
            if (zzghVar != null) {
                zzghVar.b(str, 1L);
                return;
            }
            return;
        }
        this.a1.y(6, "Persisted config not initialized. Not logging error/warn");
    }
}
