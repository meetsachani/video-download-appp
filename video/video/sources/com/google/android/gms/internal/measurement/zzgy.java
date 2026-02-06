package com.google.android.gms.internal.measurement;

import o.C10664xF1;

/* loaded from: classes3.dex */
public final class zzgy {
    public final boolean a;

    public zzgy(zzhb zzhbVar) {
        C10664xF1.F(zzhbVar, "BuildInfo must be non-null");
        this.a = !zzhbVar.a();
    }

    public final boolean a(String str) {
        C10664xF1.F(str, "flagName must not be null");
        if (!this.a) {
            return true;
        }
        return zzha.a.get().containsValue(str);
    }
}
