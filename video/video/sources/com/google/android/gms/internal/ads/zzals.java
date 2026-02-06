package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzals implements zzakl {
    public final zzek a = new zzek();
    public final zzek b = new zzek();
    public final zzalr c;
    @InterfaceC11300zs1
    public Inflater d;

    public zzals(List list) {
        zzalr zzalrVar = new zzalr();
        this.c = zzalrVar;
        zzalrVar.b(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void a(byte[] bArr, int i, int i2, zzakk zzakkVar, zzdk zzdkVar) {
        zzfyc F;
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
        zzalr zzalrVar = this.c;
        zzalrVar.d();
        int u = zzekVar.u();
        zzcu zzcuVar = null;
        if (u >= 2 && zzekVar.K() == u) {
            zzalrVar.c(zzekVar);
            zzcuVar = zzalrVar.a(zzekVar);
        }
        if (zzcuVar != null) {
            F = zzfyc.G(zzcuVar);
        } else {
            F = zzfyc.F();
        }
        zzdkVar.b(new zzakd(F, C10323vs.b, 5000000L));
    }
}
