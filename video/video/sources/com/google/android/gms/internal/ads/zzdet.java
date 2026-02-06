package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdet extends zzdbo {
    public boolean Y;

    public zzdet(Set set) {
        super(set);
    }

    public final void a() {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzdeq
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).a();
            }
        });
    }

    public final void b() {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzdep
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).c();
            }
        });
    }

    public final synchronized void c() {
        try {
            if (!this.Y) {
                g1(new zzder());
                this.Y = true;
            }
            g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzdes
                @Override // com.google.android.gms.internal.ads.zzdbn
                public final void b(Object obj) {
                    ((VideoController.VideoLifecycleCallbacks) obj).d();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f() {
        g1(new zzder());
        this.Y = true;
    }
}
