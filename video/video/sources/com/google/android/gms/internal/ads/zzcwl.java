package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcwl extends zzdbo {
    public boolean Y;

    public zzcwl(Set set) {
        super(set);
        this.Y = false;
    }

    public final synchronized void a() {
        if (!this.Y) {
            g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcwk
                @Override // com.google.android.gms.internal.ads.zzdbn
                public final void b(Object obj) {
                    ((zzcwn) obj).s();
                }
            });
            this.Y = true;
        }
    }
}
