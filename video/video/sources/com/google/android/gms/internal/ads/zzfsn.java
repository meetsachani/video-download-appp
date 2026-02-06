package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzfsn extends zzftp {
    public final int a;
    @InterfaceC11300zs1
    public final String b;

    public /* synthetic */ zzfsn(int i, String str, zzfsm zzfsmVar) {
        this.a = i;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    @InterfaceC11300zs1
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftp) {
            zzftp zzftpVar = (zzftp) obj;
            if (this.a == zzftpVar.a() && ((str = this.b) != null ? str.equals(zzftpVar.b()) : zzftpVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.a + ", sessionToken=" + this.b + "}";
    }
}
