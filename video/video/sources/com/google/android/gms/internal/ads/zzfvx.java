package com.google.android.gms.internal.ads;

import o.C9811tl1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfvx implements zzfvu {
    public static final zzfvu Y0 = new zzfvu() { // from class: com.google.android.gms.internal.ads.zzfvw
        @Override // com.google.android.gms.internal.ads.zzfvu
        public final Object a() {
            throw new IllegalStateException();
        }
    };
    public final zzfwb X = new zzfwb();
    public volatile zzfvu Y;
    public Object Z;

    public zzfvx(zzfvu zzfvuVar) {
        this.Y = zzfvuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvu
    public final Object a() {
        zzfvu zzfvuVar = this.Y;
        zzfvu zzfvuVar2 = Y0;
        if (zzfvuVar != zzfvuVar2) {
            synchronized (this.X) {
                try {
                    if (this.Y != zzfvuVar2) {
                        Object a = this.Y.a();
                        this.Z = a;
                        this.Y = zzfvuVar2;
                        return a;
                    }
                } finally {
                }
            }
        }
        return this.Z;
    }

    public final String toString() {
        Object obj = this.Y;
        if (obj == Y0) {
            obj = "<supplier that returned " + String.valueOf(this.Z) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + C9811tl1.d;
    }
}
