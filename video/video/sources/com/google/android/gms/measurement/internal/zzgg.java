package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC10697xN2;

/* loaded from: classes3.dex */
public final class zzgg {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ zzgd e;

    public zzgg(zzgd zzgdVar, String str, boolean z) {
        this.e = zzgdVar;
        Preconditions.l(str);
        this.a = str;
        this.b = z;
    }

    @InterfaceC10697xN2
    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.e.F().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }

    @InterfaceC10697xN2
    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.F().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
