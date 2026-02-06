package com.google.android.gms.internal.ads;

import android.os.IBinder;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzfsk extends zzftn {
    public final IBinder a;
    @InterfaceC11300zs1
    public final String b;
    public final int c;
    public final float d;
    public final int e;
    @InterfaceC11300zs1
    public final String f;

    public /* synthetic */ zzfsk(IBinder iBinder, String str, int i, float f, int i2, int i3, String str2, int i4, String str3, String str4, String str5, zzfsj zzfsjVar) {
        this.a = iBinder;
        this.b = str;
        this.c = i;
        this.d = f;
        this.e = i4;
        this.f = str4;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    public final float a() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    public final int c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftn) {
            zzftn zzftnVar = (zzftn) obj;
            if (this.a.equals(zzftnVar.f()) && ((str = this.b) != null ? str.equals(zzftnVar.h()) : zzftnVar.h() == null) && this.c == zzftnVar.c() && Float.floatToIntBits(this.d) == Float.floatToIntBits(zzftnVar.a())) {
                zzftnVar.b();
                zzftnVar.d();
                zzftnVar.j();
                if (this.e == zzftnVar.e()) {
                    zzftnVar.i();
                    String str2 = this.f;
                    if (str2 != null ? str2.equals(zzftnVar.g()) : zzftnVar.g() == null) {
                        zzftnVar.k();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    public final IBinder f() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    @InterfaceC11300zs1
    public final String g() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    @InterfaceC11300zs1
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int floatToIntBits = (((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d);
        int i2 = this.e;
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((floatToIntBits * 1525764945) ^ i2) * (-721379959)) ^ i) * 1000003;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    @InterfaceC11300zs1
    public final String i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    @InterfaceC11300zs1
    public final String j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    @InterfaceC11300zs1
    public final String k() {
        return null;
    }

    public final String toString() {
        String obj = this.a.toString();
        return "OverlayDisplayShowRequest{windowToken=" + obj + ", appId=" + this.b + ", layoutGravity=" + this.c + ", layoutVerticalMargin=" + this.d + ", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=" + this.e + ", deeplinkUrl=null, adFieldEnifd=" + this.f + ", thirdPartyAuthCallerId=null}";
    }
}
