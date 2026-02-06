package com.google.android.gms.internal.ads;

import java.util.Collections;
import o.C4128Rj1;

/* loaded from: classes2.dex */
final class zzaft extends zzafx {
    public static final int[] e = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public zzaft(zzaet zzaetVar) {
        super(zzaetVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final boolean a(zzek zzekVar) throws zzafw {
        String str;
        if (!this.b) {
            int G = zzekVar.G();
            int i = G >> 4;
            this.d = i;
            if (i == 2) {
                int i2 = e[(G >> 2) & 3];
                zzx zzxVar = new zzx();
                zzxVar.e(C4128Rj1.v);
                zzxVar.E(C4128Rj1.I);
                zzxVar.b(1);
                zzxVar.F(i2);
                this.a.e(zzxVar.K());
                this.c = true;
            } else if (i != 7 && i != 8) {
                if (i != 10) {
                    throw new zzafw("Audio format not supported: " + i);
                }
            } else {
                zzx zzxVar2 = new zzx();
                zzxVar2.e(C4128Rj1.v);
                if (i == 7) {
                    str = C4128Rj1.O;
                } else {
                    str = C4128Rj1.P;
                }
                zzxVar2.E(str);
                zzxVar2.b(1);
                zzxVar2.F(8000);
                this.a.e(zzxVar2.K());
                this.c = true;
            }
            this.b = true;
        } else {
            zzekVar.m(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final boolean b(zzek zzekVar, long j) throws zzaz {
        if (this.d == 2) {
            int u = zzekVar.u();
            zzaet zzaetVar = this.a;
            zzaetVar.d(zzekVar, u);
            zzaetVar.c(j, 1, u, 0, null);
            return true;
        }
        int G = zzekVar.G();
        if (G == 0 && !this.c) {
            int u2 = zzekVar.u();
            byte[] bArr = new byte[u2];
            zzekVar.h(bArr, 0, u2);
            zzaci a = zzack.a(bArr);
            zzx zzxVar = new zzx();
            zzxVar.e(C4128Rj1.v);
            zzxVar.E("audio/mp4a-latm");
            zzxVar.c(a.c);
            zzxVar.b(a.b);
            zzxVar.F(a.a);
            zzxVar.p(Collections.singletonList(bArr));
            this.a.e(zzxVar.K());
            this.c = true;
            return false;
        } else if (this.d == 10 && G != 1) {
            return false;
        } else {
            int u3 = zzekVar.u();
            zzaet zzaetVar2 = this.a;
            zzaetVar2.d(zzekVar, u3);
            zzaetVar2.c(j, 1, u3, 0, null);
            return true;
        }
    }
}
