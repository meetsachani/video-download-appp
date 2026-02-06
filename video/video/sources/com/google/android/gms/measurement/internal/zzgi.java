package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC10697xN2;

/* loaded from: classes3.dex */
public final class zzgi {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ zzgd e;

    public zzgi(zzgd zzgdVar, String str, long j) {
        this.e = zzgdVar;
        Preconditions.l(str);
        this.a = str;
        this.b = j;
    }

    @InterfaceC10697xN2
    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.F().getLong(this.a, this.b);
        }
        return this.d;
    }

    @InterfaceC10697xN2
    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.F().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
