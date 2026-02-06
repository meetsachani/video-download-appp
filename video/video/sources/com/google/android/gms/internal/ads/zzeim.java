package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import o.InterfaceC5056aJ2;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeim implements zzedf {
    public final zzedh a;
    public final zzedl b;
    public final zzfgt c;
    public final zzgdj d;

    public zzeim(zzfgt zzfgtVar, zzgdj zzgdjVar, zzedh zzedhVar, zzedl zzedlVar) {
        this.c = zzfgtVar;
        this.d = zzgdjVar;
        this.b = zzedlVar;
        this.a = zzedhVar;
    }

    @InterfaceC5056aJ2
    public static final String e(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final boolean a(zzfcg zzfcgVar, zzfbu zzfbuVar) {
        if (!zzfbuVar.t.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final InterfaceFutureC8411o11 b(final zzfcg zzfcgVar, final zzfbu zzfbuVar) {
        final zzedi zzediVar;
        Iterator it = zzfbuVar.t.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    zzediVar = this.a.a((String) it.next(), zzfbuVar.v);
                    break;
                } catch (zzfcw unused) {
                }
            } else {
                zzediVar = null;
                break;
            }
        }
        if (zzediVar == null) {
            return zzgcy.g(new zzegc("Unable to instantiate mediation adapter class."));
        }
        zzcaf zzcafVar = new zzcaf();
        zzediVar.c.g1(new zzeil(this, zzediVar, zzcafVar));
        if (zzfbuVar.M) {
            Bundle bundle = zzfcgVar.a.a.d.h1;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfgt zzfgtVar = this.c;
        return zzfgd.d(new zzffy() { // from class: com.google.android.gms.internal.ads.zzeij
            @Override // com.google.android.gms.internal.ads.zzffy
            public final void a() {
                zzeim.this.b.a(zzfcgVar, zzfbuVar, zzediVar);
            }
        }, this.d, zzfgn.ADAPTER_LOAD_AD_SYN, zzfgtVar).b(zzfgn.ADAPTER_LOAD_AD_ACK).d(zzcafVar).b(zzfgn.ADAPTER_WRAP_ADAPTER).e(new zzffx() { // from class: com.google.android.gms.internal.ads.zzeik
            @Override // com.google.android.gms.internal.ads.zzffx
            public final Object b(Object obj) {
                Object b;
                Void r5 = (Void) obj;
                b = zzeim.this.b.b(zzfcgVar, zzfbuVar, zzediVar);
                return b;
            }
        }).a();
    }
}
