package com.google.android.gms.internal.ads;

import java.util.Set;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzcyh extends zzdbo {
    public boolean Y;

    @InterfaceC5056aJ2
    public zzcyh(Set set) {
        super(set);
        this.Y = false;
    }

    public final synchronized void a() {
        if (!this.Y) {
            g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcyg
                @Override // com.google.android.gms.internal.ads.zzdbn
                public final void b(Object obj) {
                    ((zzcyj) obj).t();
                }
            });
            this.Y = true;
        }
    }
}
