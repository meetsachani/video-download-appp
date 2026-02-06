package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zztp {
    public final String a;
    public final boolean b;
    public final boolean c;

    public zztp(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zztp.class) {
            zztp zztpVar = (zztp) obj;
            if (TextUtils.equals(this.a, zztpVar.a) && this.b == zztpVar.b && this.c == zztpVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() + 31;
        int i2 = 1231;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 31) + i) * 31;
        if (true != this.c) {
            i2 = 1237;
        }
        return i3 + i2;
    }
}
