package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzfsh extends zzfss {
    @InterfaceC11300zs1
    public final String a;
    @InterfaceC11300zs1
    public final String b;

    public /* synthetic */ zzfsh(String str, String str2, zzfsg zzfsgVar) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfss
    @InterfaceC11300zs1
    public final String a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzfss
    @InterfaceC11300zs1
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfss) {
            zzfss zzfssVar = (zzfss) obj;
            String str = this.a;
            if (str != null ? str.equals(zzfssVar.b()) : zzfssVar.b() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(zzfssVar.a()) : zzfssVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.a + ", appId=" + this.b + "}";
    }
}
