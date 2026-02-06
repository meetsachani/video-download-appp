package com.google.android.gms.internal.ads;

import android.app.Activity;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzebk extends zzecg {
    public final Activity a;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.overlay.zzm b;
    @InterfaceC11300zs1
    public final String c;
    @InterfaceC11300zs1
    public final String d;

    public /* synthetic */ zzebk(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, zzebj zzebjVar) {
        this.a = activity;
        this.b = zzmVar;
        this.c = str;
        this.d = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzecg
    public final Activity a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzecg
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.overlay.zzm b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzecg
    @InterfaceC11300zs1
    public final String c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzecg
    @InterfaceC11300zs1
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzecg) {
            zzecg zzecgVar = (zzecg) obj;
            if (this.a.equals(zzecgVar.a()) && ((zzmVar = this.b) != null ? zzmVar.equals(zzecgVar.b()) : zzecgVar.b() == null) && ((str = this.c) != null ? str.equals(zzecgVar.c()) : zzecgVar.c() == null) && ((str2 = this.d) != null ? str2.equals(zzecgVar.d()) : zzecgVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.b;
        int i = 0;
        if (zzmVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzmVar.hashCode();
        }
        int i2 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        String str = this.c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.b;
        String obj = this.a.toString();
        String valueOf = String.valueOf(zzmVar);
        return "OfflineUtilsParams{activity=" + obj + ", adOverlay=" + valueOf + ", gwsQueryId=" + this.c + ", uri=" + this.d + "}";
    }
}
