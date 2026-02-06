package com.google.android.gms.internal.ads;

import java.util.Set;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
public final class zzcwf extends zzdbo implements zzcvx {
    @InterfaceC5056aJ2
    public zzcwf(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void f() {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcwd
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((zzcwj) obj).w(zzfdq.d(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void k(final zzdgh zzdghVar) {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcwc
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                zzcwj zzcwjVar = (zzcwj) obj;
                String message = zzdgh.this.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzcwjVar.w(zzfdq.d(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void k1(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        g1(new zzdbn() { // from class: com.google.android.gms.internal.ads.zzcwe
            @Override // com.google.android.gms.internal.ads.zzdbn
            public final void b(Object obj) {
                ((zzcwj) obj).w(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }
}
