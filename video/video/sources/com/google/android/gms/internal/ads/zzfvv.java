package com.google.android.gms.internal.ads;

import java.io.Serializable;
import o.C9811tl1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfvv implements Serializable, zzfvu {
    public final transient zzfwb X = new zzfwb();
    public final zzfvu Y;
    public transient Object Y0;
    public volatile transient boolean Z;

    public zzfvv(zzfvu zzfvuVar) {
        this.Y = zzfvuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvu
    public final Object a() {
        if (!this.Z) {
            synchronized (this.X) {
                try {
                    if (!this.Z) {
                        Object a = this.Y.a();
                        this.Y0 = a;
                        this.Z = true;
                        return a;
                    }
                } finally {
                }
            }
        }
        return this.Y0;
    }

    public final String toString() {
        Object obj;
        if (this.Z) {
            obj = "<supplier that returned " + String.valueOf(this.Y0) + ">";
        } else {
            obj = this.Y;
        }
        return "Suppliers.memoize(" + obj.toString() + C9811tl1.d;
    }
}
