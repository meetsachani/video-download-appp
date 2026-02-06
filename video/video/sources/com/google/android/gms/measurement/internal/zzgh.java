package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC10697xN2;
import o.InterfaceC5299bJ2;

/* loaded from: classes3.dex */
public final class zzgh {
    @InterfaceC5299bJ2
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ zzgd e;

    @InterfaceC10697xN2
    public final Pair<String, Long> a() {
        long abs;
        this.e.n();
        this.e.n();
        long c = c();
        if (c == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c - this.e.b().a());
        }
        long j = this.d;
        if (abs < j) {
            return null;
        }
        if (abs > (j << 1)) {
            d();
            return null;
        }
        String string = this.e.F().getString(this.c, null);
        long j2 = this.e.F().getLong(this.b, 0L);
        d();
        if (string != null && j2 > 0) {
            return new Pair<>(string, Long.valueOf(j2));
        }
        return zzgd.z;
    }

    @InterfaceC10697xN2
    public final void b(String str, long j) {
        boolean z;
        this.e.n();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.F().getLong(this.b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.e.F().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1L);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        if ((this.e.i().U0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            z = true;
        } else {
            z = false;
        }
        SharedPreferences.Editor edit2 = this.e.F().edit();
        if (z) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j3);
        edit2.apply();
    }

    @InterfaceC10697xN2
    public final long c() {
        return this.e.F().getLong(this.a, 0L);
    }

    @InterfaceC10697xN2
    public final void d() {
        this.e.n();
        long a = this.e.b().a();
        SharedPreferences.Editor edit = this.e.F().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, a);
        edit.apply();
    }

    public zzgh(zzgd zzgdVar, String str, long j) {
        this.e = zzgdVar;
        Preconditions.l(str);
        Preconditions.a(j > 0);
        this.a = str + ":start";
        this.b = str + ":count";
        this.c = str + ":value";
        this.d = j;
    }
}
