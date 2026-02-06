package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzoq {
    public final String a;
    public int b;
    public long c;
    public zzvb d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ zzor g;

    public zzoq(zzor zzorVar, String str, @InterfaceC11300zs1 int i, zzvb zzvbVar) {
        this.g = zzorVar;
        this.a = str;
        this.b = i;
        this.c = zzvbVar == null ? -1L : zzvbVar.d;
        if (zzvbVar == null || !zzvbVar.b()) {
            return;
        }
        this.d = zzvbVar;
    }

    public final void g(int i, @InterfaceC11300zs1 zzvb zzvbVar) {
        if (this.c == -1 && i == this.b && zzvbVar != null) {
            zzor zzorVar = this.g;
            long j = zzvbVar.d;
            if (j >= zzor.h(zzorVar)) {
                this.c = j;
            }
        }
    }

    public final boolean j(int i, @InterfaceC11300zs1 zzvb zzvbVar) {
        if (zzvbVar == null) {
            return i == this.b;
        }
        zzvb zzvbVar2 = this.d;
        return zzvbVar2 == null ? !zzvbVar.b() && zzvbVar.d == this.c : zzvbVar.d == zzvbVar2.d && zzvbVar.b == zzvbVar2.b && zzvbVar.c == zzvbVar2.c;
    }

    public final boolean k(zzmk zzmkVar) {
        zzvb zzvbVar = zzmkVar.d;
        if (zzvbVar == null) {
            if (this.b != zzmkVar.c) {
                return true;
            }
            return false;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        long j2 = zzvbVar.d;
        if (j2 > j) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        zzbl zzblVar = zzmkVar.b;
        int a = zzblVar.a(zzvbVar.a);
        int a2 = zzblVar.a(this.d.a);
        zzvb zzvbVar2 = this.d;
        if (j2 < zzvbVar2.d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        if (zzvbVar.b()) {
            int i = zzvbVar.b;
            int i2 = zzvbVar.c;
            int i3 = zzvbVar2.b;
            if (i > i3) {
                return true;
            }
            if (i == i3 && i2 > zzvbVar2.c) {
                return true;
            }
            return false;
        }
        int i4 = zzvbVar.e;
        if (i4 == -1 || i4 > zzvbVar2.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r9.c()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(zzbl zzblVar, zzbl zzblVar2) {
        int i = this.b;
        if (i < zzblVar.c()) {
            zzor zzorVar = this.g;
            zzblVar.e(i, zzor.j(zzorVar), 0L);
            for (int i2 = zzor.j(zzorVar).m; i2 <= zzor.j(zzorVar).n; i2++) {
                int a = zzblVar2.a(zzblVar.f(i2));
                if (a != -1) {
                    i = zzblVar2.d(a, zzor.i(zzorVar), false).c;
                    break;
                }
            }
            i = -1;
        }
        this.b = i;
        if (i == -1) {
            return false;
        }
        zzvb zzvbVar = this.d;
        if (zzvbVar != null && zzblVar2.a(zzvbVar.a) == -1) {
            return false;
        }
        return true;
    }
}
