package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzqd;
import java.util.HashMap;
import o.JK1;
import o.UE;

/* loaded from: classes3.dex */
public final class zzmn extends zzml {
    public zzmn(zzmp zzmpVar) {
        super(zzmpVar);
    }

    private final String v(String str) {
        String Q = r().Q(str);
        if (!TextUtils.isEmpty(Q)) {
            Uri parse = Uri.parse(zzbi.s.a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            String authority = parse.getAuthority();
            buildUpon.authority(Q + UE.h + authority);
            return buildUpon.build().toString();
        }
        return zzbi.s.a(null);
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzaf d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzba e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzae f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzfq g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzgd h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zznd i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzfr j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzgy l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzmz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzt p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzao q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzgp r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzls s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzmn t() {
        return super.t();
    }

    public final zzmq u(String str) {
        String str2;
        if (zzqd.a() && d().s(zzbi.A0)) {
            j().K().a("sgtm feature flag enabled.");
            zzh D0 = q().D0(str);
            if (D0 == null) {
                return new zzmq(v(str));
            }
            zzmq zzmqVar = null;
            if (D0.t()) {
                j().K().a("sgtm upload enabled in manifest.");
                zzfc.zzd L = r().L(D0.t0());
                if (L != null) {
                    String R = L.R();
                    if (!TextUtils.isEmpty(R)) {
                        String Q = L.Q();
                        zzft K = j().K();
                        if (TextUtils.isEmpty(Q)) {
                            str2 = "Y";
                        } else {
                            str2 = "N";
                        }
                        K.c("sgtm configured with upload_url, server_info", R, str2);
                        if (TextUtils.isEmpty(Q)) {
                            zzmqVar = new zzmq(R);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", Q);
                            zzmqVar = new zzmq(R, hashMap);
                        }
                    }
                }
            }
            if (zzmqVar != null) {
                return zzmqVar;
            }
        }
        return new zzmq(v(str));
    }
}
