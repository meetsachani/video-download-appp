package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import o.AbstractServiceC6956i60;
import o.C9500sT;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.SQ0;

/* loaded from: classes2.dex */
public final class zzdrh implements zzdas, com.google.android.gms.ads.internal.client.zza, zzcwn, zzcvx, zzcyj {
    public final Context X;
    public final zzfdh Y;
    public final zzfcg Y0;
    public final zzdsd Z;
    public final zzfbu Z0;
    public final zzebt a1;
    public final String b1;
    @InterfaceC11300zs1
    public Boolean d1;
    public long c1 = -1;
    @InterfaceC5056aJ2
    public final AtomicBoolean f1 = new AtomicBoolean(false);
    @InterfaceC5056aJ2
    public final AtomicBoolean g1 = new AtomicBoolean(false);
    public final boolean e1 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.W6)).booleanValue();

    public zzdrh(Context context, zzfdh zzfdhVar, zzdsd zzdsdVar, zzfcg zzfcgVar, zzfbu zzfbuVar, zzebt zzebtVar, String str) {
        this.X = context;
        this.Y = zzfdhVar;
        this.Z = zzdsdVar;
        this.Y0 = zzfcgVar;
        this.Z0 = zzfbuVar;
        this.a1 = zzebtVar;
        this.b1 = str;
    }

    private final boolean e() {
        String str;
        if (this.d1 == null) {
            synchronized (this) {
                if (this.d1 == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F1);
                    com.google.android.gms.ads.internal.zzv.v();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzs.W(this.X);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (str2 != null && str != null) {
                        try {
                            z = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzv.t().x(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.d1 = Boolean.valueOf(z);
                }
            }
        }
        return this.d1.booleanValue();
    }

    public final zzdsc a(String str) {
        String str2;
        zzfcg zzfcgVar = this.Y0;
        zzfcf zzfcfVar = zzfcgVar.b;
        zzdsc a = this.Z.a();
        a.d(zzfcfVar.b);
        zzfbu zzfbuVar = this.Z0;
        a.c(zzfbuVar);
        a.b("action", str);
        a.b(FirebaseAnalytics.Param.b, this.b1.toUpperCase(Locale.ROOT));
        List list = zzfbuVar.t;
        if (!list.isEmpty()) {
            a.b("ancn", (String) list.get(0));
        }
        if (zzfbuVar.b()) {
            if (true != com.google.android.gms.ads.internal.zzv.t().a(this.X)) {
                str2 = "offline";
            } else {
                str2 = C9500sT.g;
            }
            a.b("device_connectivity", str2);
            a.b("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzv.d().a()));
            a.b("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d7)).booleanValue()) {
            boolean f = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.f(zzfcgVar);
            a.b("scar", String.valueOf(f));
            if (f) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcgVar.a.a.d;
                a.b("ragent", zzmVar.k1);
                a.b("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.b(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.c(zzmVar)));
            }
        }
        return a;
    }

    public final void b(zzdsc zzdscVar) {
        if (this.Z0.b()) {
            this.a1.h(new zzebv(com.google.android.gms.ads.internal.zzv.d().a(), this.Y0.b.b.b, zzdscVar.e(), 2));
            return;
        }
        zzdscVar.j();
    }

    public final boolean c() {
        int i = this.Z0.b;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void f() {
        if (!this.e1) {
            return;
        }
        zzdsc a = a("ifts");
        a.b(SQ0.n, "blocked");
        a.j();
    }

    @Override // com.google.android.gms.internal.ads.zzdas
    public final void g() {
        String str;
        if (!e()) {
            return;
        }
        zzdsc a = a("adapter_impression");
        String str2 = "0";
        if (this.g1.get()) {
            a.b("po", "1");
            a.b("pil", String.valueOf(com.google.android.gms.ads.internal.zzv.d().a() - this.c1));
        } else {
            a.b("po", "0");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Dd)).booleanValue() && c()) {
            com.google.android.gms.ads.internal.zzv.v();
            if (true == com.google.android.gms.ads.internal.util.zzs.h(this.X)) {
                str = "0";
            } else {
                str = "1";
            }
            a.b(AbstractServiceC6956i60.s1, str);
            if (true == this.f1.get()) {
                str2 = "1";
            }
            a.b("fg_show", str2);
        }
        a.j();
    }

    @Override // com.google.android.gms.internal.ads.zzdas
    public final void h() {
        if (!e()) {
            return;
        }
        a("adapter_shown").j();
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void k(zzdgh zzdghVar) {
        if (!this.e1) {
            return;
        }
        zzdsc a = a("ifts");
        a.b(SQ0.n, "exception");
        if (!TextUtils.isEmpty(zzdghVar.getMessage())) {
            a.b("msg", zzdghVar.getMessage());
        }
        a.j();
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void k1(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (!this.e1) {
            return;
        }
        zzdsc a = a("ifts");
        a.b(SQ0.n, "adapter");
        int i = zzeVar.X;
        String str = zzeVar.Y;
        if (zzeVar.Z.equals(MobileAds.a) && (zzeVar2 = zzeVar.Y0) != null && !zzeVar2.Z.equals(MobileAds.a)) {
            com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.Y0;
            i = zzeVar3.X;
            str = zzeVar3.Y;
        }
        if (i >= 0) {
            a.b("arec", String.valueOf(i));
        }
        String a2 = this.Y.a(str);
        if (a2 != null) {
            a.b("areec", a2);
        }
        a.j();
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void s() {
        String str;
        if (!e() && !this.Z0.b()) {
            return;
        }
        zzdsc a = a(AdSDKNotificationListener.IMPRESSION_EVENT);
        if (this.c1 > 0) {
            a.b("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzv.d().a() - this.c1));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Dd)).booleanValue() && c()) {
            com.google.android.gms.ads.internal.zzv.v();
            String str2 = "0";
            if (true == com.google.android.gms.ads.internal.util.zzs.h(this.X)) {
                str = "0";
            } else {
                str = "1";
            }
            a.b(AbstractServiceC6956i60.s1, str);
            if (true == this.f1.get()) {
                str2 = "1";
            }
            a.b("fg_show", str2);
        }
        b(a);
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final void t() {
        String str;
        if (!e()) {
            return;
        }
        this.g1.set(true);
        this.c1 = com.google.android.gms.ads.internal.zzv.d().a();
        zzdsc a = a("presentation");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Dd)).booleanValue() && c()) {
            AtomicBoolean atomicBoolean = this.f1;
            com.google.android.gms.ads.internal.zzv.v();
            atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.h(this.X));
            if (true != atomicBoolean.get()) {
                str = "0";
            } else {
                str = "1";
            }
            a.b(AbstractServiceC6956i60.s1, str);
        }
        a.j();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void y() {
        if (!this.Z0.b()) {
            return;
        }
        b(a("click"));
    }
}
