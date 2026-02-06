package com.google.android.gms.internal.ads;

import java.util.List;
import o.C4128Rj1;

/* loaded from: classes2.dex */
final class zzaoi {
    public final List a;
    public final String b = C4128Rj1.f601o;
    public final zzaet[] c;

    public zzaoi(List list, String str) {
        this.a = list;
        this.c = new zzaet[list.size()];
    }

    public final void a(long j, zzek zzekVar) {
        if (zzekVar.u() >= 9) {
            int A = zzekVar.A();
            int A2 = zzekVar.A();
            int G = zzekVar.G();
            if (A == 434 && A2 == 1195456820 && G == 3) {
                zzada.b(j, zzekVar, this.c);
            }
        }
    }

    public final void b(zzadq zzadqVar, zzaof zzaofVar) {
        int i = 0;
        while (true) {
            zzaet[] zzaetVarArr = this.c;
            if (i < zzaetVarArr.length) {
                zzaofVar.c();
                zzaet O = zzadqVar.O(zzaofVar.a(), 3);
                zzz zzzVar = (zzz) this.a.get(i);
                String str = zzzVar.f301o;
                boolean z = true;
                if (!C4128Rj1.x0.equals(str) && !C4128Rj1.y0.equals(str)) {
                    z = false;
                }
                zzdc.e(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
                zzx zzxVar = new zzx();
                zzxVar.o(zzaofVar.b());
                zzxVar.e(this.b);
                zzxVar.E(str);
                zzxVar.G(zzzVar.e);
                zzxVar.s(zzzVar.d);
                zzxVar.u0(zzzVar.J);
                zzxVar.p(zzzVar.r);
                O.e(zzxVar.K());
                zzaetVarArr[i] = O;
                i++;
            } else {
                return;
            }
        }
    }
}
