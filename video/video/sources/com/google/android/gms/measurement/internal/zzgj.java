package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC10697xN2;

/* loaded from: classes3.dex */
public final class zzgj {
    public final String a;
    public final String b;
    public boolean c;
    public String d;
    public final /* synthetic */ zzgd e;

    public zzgj(zzgd zzgdVar, String str, String str2) {
        this.e = zzgdVar;
        Preconditions.l(str);
        this.a = str;
        this.b = null;
    }

    @InterfaceC10697xN2
    public final String a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.F().getString(this.a, null);
        }
        return this.d;
    }

    @InterfaceC10697xN2
    public final void b(String str) {
        SharedPreferences.Editor edit = this.e.F().edit();
        edit.putString(this.a, str);
        edit.apply();
        this.d = str;
    }
}
