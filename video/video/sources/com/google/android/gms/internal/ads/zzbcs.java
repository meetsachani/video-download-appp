package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbcs implements zzbfk {
    public final /* synthetic */ SharedPreferences a;

    public zzbcs(zzbct zzbctVar, SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final String a(String str, String str2) {
        return this.a.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final Double b(String str, double d) {
        try {
            return Double.valueOf(this.a.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.a.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final Long c(String str, long j) {
        try {
            return Long.valueOf(this.a.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.a.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final Boolean d(String str, boolean z) {
        try {
            return Boolean.valueOf(this.a.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.a.getString(str, String.valueOf(z)));
        }
    }
}
