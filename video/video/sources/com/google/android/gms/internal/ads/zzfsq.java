package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzfsq extends zzfts {
    @InterfaceC11300zs1
    public final String a;
    @InterfaceC11300zs1
    public final String b;

    public /* synthetic */ zzfsq(String str, String str2, zzfsp zzfspVar) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    @InterfaceC11300zs1
    public final String a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    @InterfaceC11300zs1
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfts) {
            zzfts zzftsVar = (zzfts) obj;
            String str = this.a;
            if (str != null ? str.equals(zzftsVar.b()) : zzftsVar.b() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(zzftsVar.a()) : zzftsVar.a() == null) {
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
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.a + ", appId=" + this.b + "}";
    }
}
