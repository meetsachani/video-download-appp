package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzakz implements zzakl {
    public final zzek a = new zzek();
    public final zzek b = new zzek();
    public final zzaky c = new zzaky();
    @InterfaceC11300zs1
    public Inflater d;

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void a(byte[] bArr, int i, int i2, zzakk zzakkVar, zzdk zzdkVar) {
        zzek zzekVar = this.a;
        zzekVar.j(bArr, i2 + i);
        zzekVar.l(i);
        if (this.d == null) {
            this.d = new Inflater();
        }
        zzek zzekVar2 = this.b;
        if (zzeu.o(zzekVar, zzekVar2, this.d)) {
            zzekVar.j(zzekVar2.n(), zzekVar2.x());
        }
        zzaky zzakyVar = this.c;
        zzakyVar.e();
        ArrayList arrayList = new ArrayList();
        while (zzekVar.u() >= 3) {
            int x = zzekVar.x();
            int G = zzekVar.G();
            int K = zzekVar.K();
            int w = zzekVar.w() + K;
            zzcu zzcuVar = null;
            if (w > x) {
                zzekVar.l(x);
            } else {
                if (G != 128) {
                    switch (G) {
                        case 20:
                            zzaky.d(zzakyVar, zzekVar, K);
                            break;
                        case 21:
                            zzaky.b(zzakyVar, zzekVar, K);
                            break;
                        case 22:
                            zzaky.c(zzakyVar, zzekVar, K);
                            break;
                    }
                } else {
                    zzcuVar = zzakyVar.a();
                    zzakyVar.e();
                }
                zzekVar.l(w);
            }
            if (zzcuVar != null) {
                arrayList.add(zzcuVar);
            }
        }
        zzdkVar.b(new zzakd(arrayList, C10323vs.b, C10323vs.b));
    }
}
