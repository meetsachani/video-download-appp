package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzerp implements zzetu {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public zzerp(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((zzcuv) obj).b;
        String str = this.a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z = this.b;
        bundle.putInt("test_mode", z ? 1 : 0);
        boolean z2 = this.c;
        bundle.putInt("linked_device", z2 ? 1 : 0);
        if (z || z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        String str = this.a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z = this.b;
        bundle.putInt("test_mode", z ? 1 : 0);
        boolean z2 = this.c;
        bundle.putInt("linked_device", z2 ? 1 : 0);
        if (z || z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z9)).booleanValue()) {
                bundle.putInt("risd", !this.d ? 1 : 0);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.e);
            }
        }
    }
}
