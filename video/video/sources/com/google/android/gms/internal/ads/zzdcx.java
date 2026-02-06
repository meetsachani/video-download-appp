package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdcx extends zzdbo implements zzdcz {
    public zzdcx(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void Q(final String str) {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzdct
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((zzdcz) obj).Q(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void d() {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzdcw
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((zzdcz) obj).d();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void e() {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzdcs
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((zzdcz) obj).e();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void p0(final String str) {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzdcv
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((zzdcz) obj).p0(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void u(final String str, final String str2) {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzdcu
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((zzdcz) obj).u(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void w(String str) {
        g1(new zzdbn("MalformedJson") { // from class: com.google.android.gms.internal.ads.zzdcr
            public final /* synthetic */ String a = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((zzdcz) obj).w(this.a);
            }
        });
    }
}
