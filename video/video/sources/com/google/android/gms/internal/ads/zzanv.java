package com.google.android.gms.internal.ads;

import java.util.List;
import o.C4128Rj1;

/* loaded from: classes2.dex */
public final class zzanv {
    public final List a;
    public final zzaet[] c;
    public final String b = C4128Rj1.f601o;
    public final zzfw d = new zzfw(new zzfv() { // from class: com.google.android.gms.internal.ads.zzanu
        @Override // com.google.android.gms.internal.ads.zzfv
        public final void a(long j, zzek zzekVar) {
            zzada.a(j, zzekVar, zzanv.this.c);
        }
    });

    public zzanv(List list, String str) {
        this.a = list;
        this.c = new zzaet[list.size()];
    }

    public final void b() {
        this.d.d();
    }

    public final void c(long j, zzek zzekVar) {
        this.d.b(j, zzekVar);
    }

    public final void d(zzadq zzadqVar, zzaof zzaofVar) {
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
                String str2 = zzzVar.a;
                if (str2 == null) {
                    str2 = zzaofVar.b();
                }
                zzx zzxVar = new zzx();
                zzxVar.o(str2);
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

    public final void e() {
        this.d.d();
    }

    public final void f(int i) {
        this.d.e(i);
    }
}
