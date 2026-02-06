package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.InterfaceC10697xN2;
import o.JK1;

/* loaded from: classes3.dex */
public final class zzls extends zzmo {
    public final Map<String, zzlr> d;
    public final zzgi e;
    public final zzgi f;
    public final zzgi g;
    public final zzgi h;
    public final zzgi i;

    public zzls(zzmp zzmpVar) {
        super(zzmpVar);
        this.d = new HashMap();
        zzgd h = h();
        h.getClass();
        this.e = new zzgi(h, "last_delete_stale", 0L);
        zzgd h2 = h();
        h2.getClass();
        this.f = new zzgi(h2, "backoff", 0L);
        zzgd h3 = h();
        h3.getClass();
        this.g = new zzgi(h3, "last_upload", 0L);
        zzgd h4 = h();
        h4.getClass();
        this.h = new zzgi(h4, "last_upload_attempt", 0L);
        zzgd h5 = h();
        h5.getClass();
        this.i = new zzgi(h5, "midnight_offset", 0L);
    }

    @InterfaceC10697xN2
    @Deprecated
    private final Pair<String, Boolean> y(String str) {
        zzlr zzlrVar;
        AdvertisingIdClient.Info info;
        n();
        long b = b().b();
        zzlr zzlrVar2 = this.d.get(str);
        if (zzlrVar2 != null && b < zzlrVar2.c) {
            return new Pair<>(zzlrVar2.a, Boolean.valueOf(zzlrVar2.b));
        }
        AdvertisingIdClient.d(true);
        long C = d().C(str) + b;
        try {
            long x = d().x(str, zzbi.d);
            if (x > 0) {
                try {
                    info = AdvertisingIdClient.a(a());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (zzlrVar2 != null && b < zzlrVar2.c + x) {
                        return new Pair<>(zzlrVar2.a, Boolean.valueOf(zzlrVar2.b));
                    }
                    info = null;
                }
            } else {
                info = AdvertisingIdClient.a(a());
            }
        } catch (Exception e) {
            j().F().b("Unable to get advertising id", e);
            zzlrVar = new zzlr("", false, C);
        }
        if (info == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String a = info.a();
        if (a != null) {
            zzlrVar = new zzlr(a, info.b(), C);
        } else {
            zzlrVar = new zzlr("", info.b(), C);
        }
        this.d.put(str, zzlrVar);
        AdvertisingIdClient.d(false);
        return new Pair<>(zzlrVar.a, Boolean.valueOf(zzlrVar.b));
    }

    @InterfaceC10697xN2
    @Deprecated
    public final String A(String str, boolean z) {
        String str2;
        n();
        if (z) {
            str2 = (String) y(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest T0 = zznd.T0();
        if (T0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, T0.digest(str2.getBytes())));
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

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final boolean x() {
        return false;
    }

    @InterfaceC10697xN2
    public final Pair<String, Boolean> z(String str, zzih zzihVar) {
        if (zzihVar.x()) {
            return y(str);
        }
        return new Pair<>("", Boolean.FALSE);
    }
}
