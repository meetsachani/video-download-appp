package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.AI0;
import o.C6516gH2;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;
import o.TD0;
import o.V12;
import o.WS2;
import o.XS2;

@InterfaceC5056aJ2(otherwise = 3)
@InterfaceC5940dy1
/* loaded from: classes2.dex */
public class zzcfj extends WebViewClient implements zzcgt {
    public static final /* synthetic */ int C1 = 0;
    @InterfaceC11300zs1
    public final zzece A1;
    public View.OnAttachStateChangeListener B1;
    public final zzcfb X;
    @InterfaceC11300zs1
    public final zzbbt Y;
    public com.google.android.gms.ads.internal.client.zza Z0;
    public com.google.android.gms.ads.internal.overlay.zzr a1;
    public zzcgr b1;
    public zzcgs c1;
    public zzbim d1;
    public zzbio e1;
    public zzddy f1;
    public boolean g1;
    public boolean h1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public com.google.android.gms.ads.internal.overlay.zzad p1;
    @InterfaceC11300zs1
    public zzbso q1;
    public com.google.android.gms.ads.internal.zzb r1;
    @InterfaceC11300zs1
    public zzbxv t1;
    @InterfaceC11300zs1
    public zzdsd u1;
    public boolean v1;
    public boolean w1;
    public int x1;
    public boolean y1;
    public final HashMap Z = new HashMap();
    public final Object Y0 = new Object();
    public int i1 = 0;
    public String j1 = "";
    public String k1 = "";
    public zzbsj s1 = null;
    public final HashSet z1 = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T5)).split(",")));

    @InterfaceC5056aJ2
    public zzcfj(zzcfb zzcfbVar, @InterfaceC11300zs1 zzbbt zzbbtVar, boolean z, zzbso zzbsoVar, @InterfaceC11300zs1 zzbsj zzbsjVar, @InterfaceC11300zs1 zzece zzeceVar) {
        this.Y = zzbbtVar;
        this.X = zzcfbVar;
        this.l1 = z;
        this.q1 = zzbsoVar;
        this.A1 = zzeceVar;
    }

    public static final boolean C(zzcfb zzcfbVar) {
        if (zzcfbVar.F() != null && zzcfbVar.F().b()) {
            return true;
        }
        return false;
    }

    public static final boolean Q(boolean z, zzcfb zzcfbVar) {
        if (z && !zzcfbVar.H().i() && !zzcfbVar.X().equals("interstitial_mb")) {
            return true;
        }
        return false;
    }

    private final void e0() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.B1;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.X).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public static /* synthetic */ void r0(zzcfj zzcfjVar) {
        zzcfb zzcfbVar = zzcfjVar.X;
        zzcfbVar.b0();
        com.google.android.gms.ads.internal.overlay.zzm J = zzcfbVar.J();
        if (J != null) {
            J.C();
        }
    }

    @InterfaceC11300zs1
    public static WebResourceResponse u() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Y0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public final void B(final View view, final zzbxv zzbxvVar, final int i) {
        if (zzbxvVar.i() && i > 0) {
            zzbxvVar.c(view);
            if (zzbxvVar.i()) {
                com.google.android.gms.ads.internal.util.zzs.l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcfj.this.B(view, zzbxvVar, i - 1);
                    }
                }, 100L);
            }
        }
    }

    public final void C0() {
        if (this.b1 != null && ((this.v1 && this.x1 <= 0) || this.w1 || this.h1)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue()) {
                zzcfb zzcfbVar = this.X;
                if (zzcfbVar.l() != null) {
                    zzbdc.a(zzcfbVar.l().a(), zzcfbVar.k(), "awfllc");
                }
            }
            zzcgr zzcgrVar = this.b1;
            boolean z = false;
            if (!this.w1 && !this.h1) {
                z = true;
            }
            zzcgrVar.a(z, this.i1, this.j1, this.k1);
            this.b1 = null;
        }
        this.X.Y();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void D() {
        synchronized (this.Y0) {
            this.g1 = false;
            this.l1 = true;
            zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfd
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfj.r0(zzcfj.this);
                }
            });
        }
    }

    public final void D0() {
        zzbxv zzbxvVar = this.t1;
        if (zzbxvVar != null) {
            zzbxvVar.e();
            this.t1 = null;
        }
        e0();
        synchronized (this.Y0) {
            try {
                this.Z.clear();
                this.Z0 = null;
                this.a1 = null;
                this.b1 = null;
                this.c1 = null;
                this.d1 = null;
                this.e1 = null;
                this.g1 = false;
                this.l1 = false;
                this.m1 = false;
                this.n1 = false;
                this.p1 = null;
                this.r1 = null;
                this.q1 = null;
                zzbsj zzbsjVar = this.s1;
                if (zzbsjVar != null) {
                    zzbsjVar.i(true);
                    this.s1 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void E0(boolean z) {
        this.y1 = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void H0(boolean z) {
        synchronized (this.Y0) {
            this.m1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void I0(boolean z) {
        synchronized (this.Y0) {
            this.n1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void J0(zzcmn zzcmnVar, @InterfaceC11300zs1 zzebt zzebtVar, @InterfaceC11300zs1 zzfjr zzfjrVar) {
        e("/click");
        if (zzebtVar != null && zzfjrVar != null) {
            b("/click", new zzfcx(this.f1, zzcmnVar, zzfjrVar, zzebtVar));
            return;
        }
        zzddy zzddyVar = this.f1;
        zzbjw zzbjwVar = zzbjv.a;
        b("/click", new zzbiu(zzddyVar, zzcmnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void K0(zzcmn zzcmnVar) {
        e("/click");
        zzddy zzddyVar = this.f1;
        zzbjw zzbjwVar = zzbjv.a;
        b("/click", new zzbiu(zzddyVar, zzcmnVar));
    }

    public final void M0(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        boolean z3;
        boolean z4;
        com.google.android.gms.ads.internal.client.zza zzaVar;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        zzcfb zzcfbVar = this.X;
        boolean j0 = zzcfbVar.j0();
        boolean z5 = false;
        if (Q(j0, zzcfbVar) || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || !z) {
            z4 = j0;
            z5 = true;
        } else {
            z4 = j0;
        }
        zzddy zzddyVar = null;
        if (z3) {
            zzaVar = null;
        } else {
            zzaVar = this.Z0;
        }
        if (z4) {
            zzrVar = null;
        } else {
            zzrVar = this.a1;
        }
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.p1;
        VersionInfoParcel m = zzcfbVar.m();
        if (!z5) {
            zzddyVar = this.f1;
        }
        W0(new AdOverlayInfoParcel(zzcVar, zzaVar, zzrVar, zzadVar, m, zzcfbVar, zzddyVar, str));
    }

    public final void N0(String str, String str2, int i) {
        zzece zzeceVar = this.A1;
        zzcfb zzcfbVar = this.X;
        W0(new AdOverlayInfoParcel(zzcfbVar, zzcfbVar.m(), str, str2, 14, zzeceVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void O0(@InterfaceC11300zs1 com.google.android.gms.ads.internal.zzb zzbVar) {
        this.r1 = zzbVar;
    }

    public final void Q0(boolean z, int i, boolean z2) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzddy zzddyVar;
        zzddy zzddyVar2;
        zzece zzeceVar;
        int i2;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z3;
        zzcfb zzcfbVar = this.X;
        boolean Q = Q(zzcfbVar.j0(), zzcfbVar);
        boolean z4 = true;
        if (!Q && z2) {
            z4 = false;
        }
        if (Q) {
            zzaVar = null;
            zzddyVar = null;
        } else {
            zzaVar = this.Z0;
            zzddyVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.a1;
        zzece zzeceVar2 = zzddyVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.p1;
        VersionInfoParcel m = zzcfbVar.m();
        if (z4) {
            zzddyVar2 = zzeceVar2;
        } else {
            zzddyVar2 = this.f1;
        }
        if (C(zzcfbVar)) {
            zzeceVar = this.A1;
            z3 = z;
            i2 = i;
            zzaVar2 = zzaVar;
        } else {
            zzeceVar = zzeceVar2;
            i2 = i;
            zzaVar2 = zzaVar;
            z3 = z;
        }
        W0(new AdOverlayInfoParcel(zzaVar2, zzrVar, zzadVar, zzcfbVar, z3, i2, m, zzddyVar2, zzeceVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void R0(Uri uri) {
        final String str;
        com.google.android.gms.ads.internal.util.zze.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.Z;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S5)).booleanValue() && this.z1.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.U5)).intValue()) {
                    com.google.android.gms.ads.internal.util.zze.k("Parsing gmsg query params on BG thread: ".concat(path));
                    zzgcy.r(com.google.android.gms.ads.internal.zzv.v().H(uri), new zzcfh(this, list, path, uri), zzcaa.f);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzv.v();
            x(com.google.android.gms.ads.internal.util.zzs.q(uri), list, path);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S6)).booleanValue() && com.google.android.gms.ads.internal.zzv.t().h() != null) {
            if (path != null && path.length() >= 2) {
                str = path.substring(1);
            } else {
                str = "null";
            }
            zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfe
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzcfj.C1;
                    com.google.android.gms.ads.internal.zzv.t().h().e(str);
                }
            });
        }
    }

    public final ViewTreeObserver.OnScrollChangedListener S() {
        synchronized (this.Y0) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void S0(zzbxv zzbxvVar) {
        this.t1 = zzbxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void T0(zzcmn zzcmnVar, @InterfaceC11300zs1 zzebt zzebtVar, @InterfaceC11300zs1 zzdsd zzdsdVar) {
        e("/open");
        b("/open", new zzbki(this.r1, this.s1, zzebtVar, zzdsdVar, zzcmnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void U0(boolean z) {
        synchronized (this.Y0) {
            this.o1 = z;
        }
    }

    public final void W0(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z;
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbsj zzbsjVar = this.s1;
        if (zzbsjVar != null) {
            z = zzbsjVar.m();
        } else {
            z = false;
        }
        com.google.android.gms.ads.internal.zzv.n();
        com.google.android.gms.ads.internal.overlay.zzn.a(this.X.getContext(), adOverlayInfoParcel, !z, this.u1);
        zzbxv zzbxvVar = this.t1;
        if (zzbxvVar != null) {
            String str = adOverlayInfoParcel.g1;
            if (str == null && (zzcVar = adOverlayInfoParcel.X) != null) {
                str = zzcVar.Y;
            }
            zzbxvVar.r0(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final void X0() {
        zzddy zzddyVar = this.f1;
        if (zzddyVar != null) {
            zzddyVar.X0();
        }
    }

    public final void a(boolean z, int i, String str, boolean z2, boolean z3) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzcfi zzcfiVar;
        zzddy zzddyVar;
        zzcfb zzcfbVar = this.X;
        boolean j0 = zzcfbVar.j0();
        boolean Q = Q(j0, zzcfbVar);
        boolean z4 = true;
        if (!Q && z2) {
            z4 = false;
        }
        if (Q) {
            zzaVar = null;
        } else {
            zzaVar = this.Z0;
        }
        if (j0) {
            zzcfiVar = null;
        } else {
            zzcfiVar = new zzcfi(zzcfbVar, this.a1);
        }
        zzbim zzbimVar = this.d1;
        zzece zzeceVar = null;
        zzbio zzbioVar = this.e1;
        boolean z5 = z4;
        zzcfi zzcfiVar2 = zzcfiVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.p1;
        VersionInfoParcel m = zzcfbVar.m();
        if (z5) {
            zzddyVar = null;
        } else {
            zzddyVar = this.f1;
        }
        if (C(zzcfbVar)) {
            zzeceVar = this.A1;
        }
        W0(new AdOverlayInfoParcel(zzaVar, zzcfiVar2, zzbimVar, zzbioVar, zzadVar, zzcfbVar, z, i, str, m, zzddyVar, zzeceVar, z3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02bb A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #13 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01be, B:50:0x0172, B:97:0x02a5, B:100:0x02b5, B:102:0x02bb, B:104:0x02c9, B:86:0x022d, B:87:0x0256, B:85:0x0205, B:49:0x014b, B:32:0x00db, B:88:0x0257, B:90:0x0261, B:92:0x0267, B:94:0x029a), top: B:112:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TRY_ENTER, TryCatch #13 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01be, B:50:0x0172, B:97:0x02a5, B:100:0x02b5, B:102:0x02bb, B:104:0x02c9, B:86:0x022d, B:87:0x0256, B:85:0x0205, B:49:0x014b, B:32:0x00db, B:88:0x0257, B:90:0x0261, B:92:0x0267, B:94:0x029a), top: B:112:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fa A[Catch: all -> 0x01b1, TryCatch #8 {all -> 0x01b1, blocks: (B:71:0x0196, B:73:0x01a8, B:77:0x01b4, B:81:0x01e8, B:83:0x01fa, B:84:0x0201), top: B:111:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0257 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #13 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01be, B:50:0x0172, B:97:0x02a5, B:100:0x02b5, B:102:0x02bb, B:104:0x02c9, B:86:0x022d, B:87:0x0256, B:85:0x0205, B:49:0x014b, B:32:0x00db, B:88:0x0257, B:90:0x0261, B:92:0x0267, B:94:0x029a), top: B:112:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a5 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #13 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01be, B:50:0x0172, B:97:0x02a5, B:100:0x02b5, B:102:0x02bb, B:104:0x02c9, B:86:0x022d, B:87:0x0256, B:85:0x0205, B:49:0x014b, B:32:0x00db, B:88:0x0257, B:90:0x0261, B:92:0x0267, B:94:0x029a), top: B:112:0x000c }] */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse a0(String str, Map map) {
        WebResourceResponse webResourceResponse;
        int i;
        InputStream inputStream;
        InputStream E0;
        Long l;
        final boolean z;
        long b;
        Future a;
        final boolean z2;
        final boolean z3;
        String str2;
        zzbbr zzbbrVar;
        try {
            Map hashMap = new HashMap();
            zzcfb zzcfbVar = this.X;
            if (zzcfbVar.F() != null) {
                hashMap = zzcfbVar.F().w0;
            }
            String c = zzbyl.c(str, zzcfbVar.getContext(), this.y1, hashMap);
            if (!c.equals(str)) {
                return v(c, map);
            }
            Parcelable.Creator<zzbbf> creator = zzbbf.CREATOR;
            zzbbf m0 = zzbbf.m0(Uri.parse(str));
            if (m0 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(AI0.T, "*");
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains(V12.q)) {
                    List f = zzfvr.b(zzfun.c('-')).f(parse.getQueryParameter(V12.q));
                    if (f.size() == 2) {
                        int parseInt = Integer.parseInt((String) f.get(0));
                        int parseInt2 = Integer.parseInt((String) f.get(1)) + 1;
                        if (parseInt > 0) {
                            m0.c1 = parseInt;
                        }
                        i = parseInt2 - parseInt;
                        String str3 = "X-Afma-Gcache-CachedBytes";
                        webResourceResponse = null;
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A4)).booleanValue()) {
                            m0.d1 = zzfvt.c(zzcfbVar.x());
                            m0.e1 = zzcfbVar.e();
                            if (m0.b1) {
                                l = (Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C4);
                            } else {
                                l = (Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.B4);
                            }
                            try {
                                long longValue = l.longValue();
                                b = com.google.android.gms.ads.internal.zzv.d().b();
                                com.google.android.gms.ads.internal.zzv.h();
                                a = zzbbq.a(zzcfbVar.getContext(), m0);
                                try {
                                    zzbbrVar = (zzbbr) a.get(longValue, TimeUnit.MILLISECONDS);
                                } catch (InterruptedException e) {
                                    e = e;
                                    E0 = null;
                                    z3 = false;
                                } catch (ExecutionException e2) {
                                    e = e2;
                                    E0 = null;
                                    z2 = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F4)).booleanValue()) {
                                    }
                                    a.cancel(true);
                                    final long b2 = com.google.android.gms.ads.internal.zzv.d().b() - b;
                                    com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzcfj.this.X.D0(z2, b2);
                                        }
                                    });
                                    str2 = "Cache connection took " + b2 + "ms";
                                    com.google.android.gms.ads.internal.util.zze.k(str2);
                                    inputStream = E0;
                                    if (inputStream != null) {
                                    }
                                    if (!com.google.android.gms.ads.internal.util.client.zzl.k()) {
                                    }
                                    return webResourceResponse;
                                } catch (TimeoutException e3) {
                                    e = e3;
                                    E0 = null;
                                    z2 = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F4)).booleanValue()) {
                                    }
                                    a.cancel(true);
                                    final long b22 = com.google.android.gms.ads.internal.zzv.d().b() - b;
                                    com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzcfj.this.X.D0(z2, b22);
                                        }
                                    });
                                    str2 = "Cache connection took " + b22 + "ms";
                                    com.google.android.gms.ads.internal.util.zze.k(str2);
                                    inputStream = E0;
                                    if (inputStream != null) {
                                    }
                                    if (!com.google.android.gms.ads.internal.util.client.zzl.k()) {
                                    }
                                    return webResourceResponse;
                                } catch (Throwable th) {
                                    th = th;
                                    z = 0;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z = str3;
                            }
                            try {
                                try {
                                    hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbbrVar.d()));
                                    hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbbrVar.f()));
                                    hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbbrVar.e()));
                                    hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbbrVar.a()));
                                    E0 = zzbbrVar.c();
                                    if (i != -1) {
                                        try {
                                            E0 = zzgas.a(E0, i);
                                        } catch (InterruptedException e4) {
                                            e = e4;
                                            z3 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F4)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzv.t().x(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            a.cancel(true);
                                            Thread.currentThread().interrupt();
                                            final long b3 = com.google.android.gms.ads.internal.zzv.d().b() - b;
                                            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzcfj.this.X.D0(z3, b3);
                                                }
                                            });
                                            str2 = "Cache connection took " + b3 + "ms";
                                            com.google.android.gms.ads.internal.util.zze.k(str2);
                                            inputStream = E0;
                                            if (inputStream != null) {
                                            }
                                            if (!com.google.android.gms.ads.internal.util.client.zzl.k()) {
                                            }
                                            return webResourceResponse;
                                        } catch (ExecutionException e5) {
                                            e = e5;
                                            z2 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F4)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzv.t().x(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            a.cancel(true);
                                            final long b222 = com.google.android.gms.ads.internal.zzv.d().b() - b;
                                            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzcfj.this.X.D0(z2, b222);
                                                }
                                            });
                                            str2 = "Cache connection took " + b222 + "ms";
                                            com.google.android.gms.ads.internal.util.zze.k(str2);
                                            inputStream = E0;
                                            if (inputStream != null) {
                                            }
                                            if (!com.google.android.gms.ads.internal.util.client.zzl.k()) {
                                            }
                                            return webResourceResponse;
                                        } catch (TimeoutException e6) {
                                            e = e6;
                                            z2 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F4)).booleanValue()) {
                                            }
                                            a.cancel(true);
                                            final long b2222 = com.google.android.gms.ads.internal.zzv.d().b() - b;
                                            com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzcfj.this.X.D0(z2, b2222);
                                                }
                                            });
                                            str2 = "Cache connection took " + b2222 + "ms";
                                            com.google.android.gms.ads.internal.util.zze.k(str2);
                                            inputStream = E0;
                                            if (inputStream != null) {
                                            }
                                            if (!com.google.android.gms.ads.internal.util.client.zzl.k()) {
                                            }
                                            return webResourceResponse;
                                        }
                                    }
                                    final long b4 = com.google.android.gms.ads.internal.zzv.d().b() - b;
                                    com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzcfj.this.X.D0(z2, b4);
                                        }
                                    });
                                    str2 = "Cache connection took " + b4 + "ms";
                                } catch (InterruptedException e7) {
                                    e = e7;
                                    E0 = null;
                                } catch (ExecutionException e8) {
                                    e = e8;
                                    E0 = null;
                                    z2 = true;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F4)).booleanValue()) {
                                    }
                                    a.cancel(true);
                                    final long b22222 = com.google.android.gms.ads.internal.zzv.d().b() - b;
                                    com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzcfj.this.X.D0(z2, b22222);
                                        }
                                    });
                                    str2 = "Cache connection took " + b22222 + "ms";
                                    com.google.android.gms.ads.internal.util.zze.k(str2);
                                    inputStream = E0;
                                    if (inputStream != null) {
                                    }
                                    if (!com.google.android.gms.ads.internal.util.client.zzl.k()) {
                                    }
                                    return webResourceResponse;
                                } catch (TimeoutException e9) {
                                    e = e9;
                                    E0 = null;
                                    z2 = true;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F4)).booleanValue()) {
                                    }
                                    a.cancel(true);
                                    final long b222222 = com.google.android.gms.ads.internal.zzv.d().b() - b;
                                    com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzcfj.this.X.D0(z2, b222222);
                                        }
                                    });
                                    str2 = "Cache connection took " + b222222 + "ms";
                                    com.google.android.gms.ads.internal.util.zze.k(str2);
                                    inputStream = E0;
                                    if (inputStream != null) {
                                    }
                                    if (!com.google.android.gms.ads.internal.util.client.zzl.k()) {
                                    }
                                    return webResourceResponse;
                                }
                                com.google.android.gms.ads.internal.util.zze.k(str2);
                            } catch (Throwable th3) {
                                th = th3;
                                z = 1;
                                final long b5 = com.google.android.gms.ads.internal.zzv.d().b() - b;
                                com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzcfj.this.X.D0(z, b5);
                                    }
                                });
                                com.google.android.gms.ads.internal.util.zze.k("Cache connection took " + b5 + "ms");
                                throw th;
                            }
                        } else {
                            zzbbc b6 = com.google.android.gms.ads.internal.zzv.g().b(m0);
                            if (b6 != null && b6.H0()) {
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(b6.G0()));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(b6.O0()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(b6.I0()));
                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(b6.m0()));
                                E0 = b6.E0();
                                if (i != -1) {
                                    E0 = zzgas.a(E0, i);
                                }
                            } else {
                                inputStream = null;
                                if (inputStream != null) {
                                    return new WebResourceResponse("", "", 200, "OK", hashMap2, inputStream);
                                }
                            }
                        }
                        inputStream = E0;
                        if (inputStream != null) {
                        }
                    }
                }
                i = -1;
                String str32 = "X-Afma-Gcache-CachedBytes";
                webResourceResponse = null;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A4)).booleanValue()) {
                }
                inputStream = E0;
                if (inputStream != null) {
                }
            } else {
                webResourceResponse = null;
            }
            if (!com.google.android.gms.ads.internal.util.client.zzl.k() && ((Boolean) zzber.b.e()).booleanValue()) {
                return v(str, map);
            }
            return webResourceResponse;
        } catch (Exception e10) {
            e = e10;
            com.google.android.gms.ads.internal.zzv.t().x(e, "AdWebViewClient.interceptRequest");
            return u();
        } catch (NoClassDefFoundError e11) {
            e = e11;
            com.google.android.gms.ads.internal.zzv.t().x(e, "AdWebViewClient.interceptRequest");
            return u();
        }
    }

    public final void b(String str, zzbjw zzbjwVar) {
        synchronized (this.Y0) {
            try {
                HashMap hashMap = this.Z;
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    hashMap.put(str, list);
                }
                list.add(zzbjwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z) {
        this.g1 = false;
    }

    public final void c1(boolean z, int i, String str, String str2, boolean z2) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzcfi zzcfiVar;
        zzddy zzddyVar;
        zzcfb zzcfbVar = this.X;
        boolean j0 = zzcfbVar.j0();
        boolean Q = Q(j0, zzcfbVar);
        boolean z3 = true;
        if (!Q && z2) {
            z3 = false;
        }
        if (Q) {
            zzaVar = null;
        } else {
            zzaVar = this.Z0;
        }
        if (j0) {
            zzcfiVar = null;
        } else {
            zzcfiVar = new zzcfi(zzcfbVar, this.a1);
        }
        zzbim zzbimVar = this.d1;
        zzece zzeceVar = null;
        zzbio zzbioVar = this.e1;
        boolean z4 = z3;
        zzcfi zzcfiVar2 = zzcfiVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.p1;
        VersionInfoParcel m = zzcfbVar.m();
        if (z4) {
            zzddyVar = null;
        } else {
            zzddyVar = this.f1;
        }
        if (C(zzcfbVar)) {
            zzeceVar = this.A1;
        }
        W0(new AdOverlayInfoParcel(zzaVar, zzcfiVar2, zzbimVar, zzbioVar, zzadVar, zzcfbVar, z, i, str, str2, m, zzddyVar, zzeceVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final zzdsd d() {
        return this.u1;
    }

    public final void e(String str) {
        synchronized (this.Y0) {
            try {
                List list = (List) this.Z.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void e1(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zza zzaVar, @InterfaceC11300zs1 zzbim zzbimVar, @InterfaceC11300zs1 com.google.android.gms.ads.internal.overlay.zzr zzrVar, @InterfaceC11300zs1 zzbio zzbioVar, @InterfaceC11300zs1 com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z, @InterfaceC11300zs1 zzbjz zzbjzVar, @InterfaceC11300zs1 com.google.android.gms.ads.internal.zzb zzbVar, @InterfaceC11300zs1 zzbsq zzbsqVar, @InterfaceC11300zs1 zzbxv zzbxvVar, @InterfaceC11300zs1 final zzebt zzebtVar, @InterfaceC11300zs1 final zzfjr zzfjrVar, @InterfaceC11300zs1 zzdsd zzdsdVar, @InterfaceC11300zs1 zzbkq zzbkqVar, @InterfaceC11300zs1 zzddy zzddyVar, @InterfaceC11300zs1 zzbkp zzbkpVar, @InterfaceC11300zs1 zzbkj zzbkjVar, @InterfaceC11300zs1 zzbjx zzbjxVar, @InterfaceC11300zs1 zzcmn zzcmnVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.X.getContext(), zzbxvVar, null) : zzbVar;
        zzcfb zzcfbVar = this.X;
        this.s1 = new zzbsj(zzcfbVar, zzbsqVar);
        this.t1 = zzbxvVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.f1)).booleanValue()) {
            b("/adMetadata", new zzbil(zzbimVar));
        }
        if (zzbioVar != null) {
            b("/appEvent", new zzbin(zzbioVar));
        }
        b("/backButton", zzbjv.j);
        b("/refresh", zzbjv.k);
        b("/canOpenApp", zzbjv.b);
        b("/canOpenURLs", zzbjv.a);
        b("/canOpenIntents", zzbjv.c);
        b("/close", zzbjv.d);
        b("/customClose", zzbjv.e);
        b("/instrument", zzbjv.n);
        b("/delayPageLoaded", zzbjv.p);
        b("/delayPageClosed", zzbjv.q);
        b("/getLocationInfo", zzbjv.r);
        b("/log", zzbjv.g);
        b("/mraid", new zzbkd(zzbVar2, this.s1, zzbsqVar));
        zzbso zzbsoVar = this.q1;
        if (zzbsoVar != null) {
            b("/mraidLoaded", zzbsoVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        b("/open", new zzbki(zzbVar3, this.s1, zzebtVar, zzdsdVar, zzcmnVar));
        b("/precache", new zzcdj());
        b("/touch", zzbjv.i);
        b("/video", zzbjv.l);
        b("/videoMeta", zzbjv.m);
        if (zzebtVar != null && zzfjrVar != null) {
            b("/click", new zzfcx(zzddyVar, zzcmnVar, zzfjrVar, zzebtVar));
            b("/httpTrack", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzfcy
                @Override // com.google.android.gms.internal.ads.zzbjw
                public final void a(Object obj, Map map) {
                    zzces zzcesVar = (zzces) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("URL missing from httpTrack GMSG.");
                        return;
                    }
                    zzfbu F = zzcesVar.F();
                    if (F != null && !F.i0) {
                        zzfjr.this.d(str, F.x0, null, null);
                        return;
                    }
                    zzfbx I = ((zzcge) zzcesVar).I();
                    if (I == null) {
                        com.google.android.gms.ads.internal.zzv.t().x(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                        return;
                    }
                    zzebtVar.h(new zzebv(com.google.android.gms.ads.internal.zzv.d().a(), I.b, str, 2));
                }
            });
        } else {
            b("/click", new zzbiu(zzddyVar, zzcmnVar));
            b("/httpTrack", zzbjv.f);
        }
        if (com.google.android.gms.ads.internal.zzv.s().p(zzcfbVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcfbVar.F() != null) {
                hashMap = zzcfbVar.F().w0;
            }
            b("/logScionEvent", new zzbkc(zzcfbVar.getContext(), hashMap));
        }
        if (zzbjzVar != null) {
            b("/setInterstitialProperties", new zzbjy(zzbjzVar));
        }
        if (zzbkqVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j9)).booleanValue()) {
                b("/inspectorNetworkExtras", zzbkqVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C9)).booleanValue() && zzbkpVar != null) {
            b("/shareSheet", zzbkpVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H9)).booleanValue() && zzbkjVar != null) {
            b("/inspectorOutOfContextTest", zzbkjVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.L9)).booleanValue() && zzbjxVar != null) {
            b("/inspectorStorage", zzbjxVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ob)).booleanValue()) {
            b("/bindPlayStoreOverlay", zzbjv.u);
            b("/presentPlayStoreOverlay", zzbjv.v);
            b("/expandPlayStoreOverlay", zzbjv.w);
            b("/collapsePlayStoreOverlay", zzbjv.x);
            b("/closePlayStoreOverlay", zzbjv.y);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.B3)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", zzbjv.A);
            b("/resetPAID", zzbjv.z);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ic)).booleanValue() && zzcfbVar.F() != null && zzcfbVar.F().r0) {
            b("/writeToLocalStorage", zzbjv.B);
            b("/clearLocalStorageKeys", zzbjv.C);
        }
        this.Z0 = zzaVar;
        this.a1 = zzrVar;
        this.d1 = zzbimVar;
        this.e1 = zzbioVar;
        this.p1 = zzadVar;
        this.r1 = zzbVar3;
        this.f1 = zzddyVar;
        this.u1 = zzdsdVar;
        this.g1 = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final com.google.android.gms.ads.internal.zzb f() {
        return this.r1;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void f1(zzcgr zzcgrVar) {
        this.b1 = zzcgrVar;
    }

    public final void g(String str, zzbjw zzbjwVar) {
        synchronized (this.Y0) {
            try {
                List list = (List) this.Z.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbjwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(String str, Predicate predicate) {
        synchronized (this.Y0) {
            try {
                List<zzbjw> list = (List) this.Z.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzbjw zzbjwVar : list) {
                    if (predicate.apply(zzbjwVar)) {
                        arrayList.add(zzbjwVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final boolean i0() {
        boolean z;
        synchronized (this.Y0) {
            z = this.l1;
        }
        return z;
    }

    public final boolean k() {
        boolean z;
        synchronized (this.Y0) {
            z = this.n1;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void m1(zzfbu zzfbuVar) {
        zzcfb zzcfbVar = this.X;
        if (com.google.android.gms.ads.internal.zzv.s().p(zzcfbVar.getContext())) {
            e("/logScionEvent");
            new HashMap();
            b("/logScionEvent", new zzbkc(zzcfbVar.getContext(), zzfbuVar.w0));
        }
    }

    public final boolean n() {
        boolean z;
        synchronized (this.Y0) {
            z = this.o1;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void o() {
        synchronized (this.Y0) {
        }
        this.x1++;
        C0();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void o0(int i, int i2, boolean z) {
        zzbso zzbsoVar = this.q1;
        if (zzbsoVar != null) {
            zzbsoVar.h(i, i2);
        }
        zzbsj zzbsjVar = this.s1;
        if (zzbsjVar != null) {
            zzbsjVar.k(i, i2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            R0(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.Y0) {
            try {
                zzcfb zzcfbVar = this.X;
                if (zzcfbVar.L()) {
                    com.google.android.gms.ads.internal.util.zze.k("Blank page loaded, 1...");
                    zzcfbVar.V();
                    return;
                }
                this.v1 = true;
                zzcgs zzcgsVar = this.c1;
                if (zzcgsVar != null) {
                    zzcgsVar.a();
                    this.c1 = null;
                }
                C0();
                zzcfb zzcfbVar2 = this.X;
                if (zzcfbVar2.J() != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.jc)).booleanValue()) {
                        zzcfbVar2.J().b8(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.h1 = true;
        this.i1 = i;
        this.j1 = str;
        this.k1 = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.X.w0(WS2.a(renderProcessGoneDetail), XS2.a(renderProcessGoneDetail));
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void p() {
        zzbbt zzbbtVar = this.Y;
        if (zzbbtVar != null) {
            zzbbtVar.c(10005);
        }
        this.w1 = true;
        this.i1 = 10004;
        this.j1 = "Page loaded delay cancel.";
        C0();
        this.X.destroy();
    }

    public final boolean q() {
        boolean z;
        synchronized (this.Y0) {
            z = this.m1;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void r() {
        this.x1--;
        C0();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void s() {
        zzbxv zzbxvVar = this.t1;
        if (zzbxvVar != null) {
            zzcfb zzcfbVar = this.X;
            WebView N = zzcfbVar.N();
            if (C6516gH2.T0(N)) {
                B(N, zzbxvVar, 10);
                return;
            }
            e0();
            zzcfg zzcfgVar = new zzcfg(this, zzbxvVar);
            this.B1 = zzcfgVar;
            ((View) zzcfbVar).addOnAttachStateChangeListener(zzcfgVar);
        }
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC11300zs1
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a0(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        com.google.android.gms.ads.internal.util.zze.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            R0(parse);
        } else {
            if (this.g1 && webView == this.X.N()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.Z0;
                    if (zzaVar != null) {
                        zzaVar.y();
                        zzbxv zzbxvVar = this.t1;
                        if (zzbxvVar != null) {
                            zzbxvVar.r0(str);
                        }
                        this.Z0 = null;
                    }
                    zzddy zzddyVar = this.f1;
                    if (zzddyVar != null) {
                        zzddyVar.X0();
                        this.f1 = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzcfb zzcfbVar = this.X;
            if (!zzcfbVar.N().willNotDraw()) {
                try {
                    zzavl D = zzcfbVar.D();
                    zzfct s0 = zzcfbVar.s0();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.nc)).booleanValue() && s0 != null) {
                        if (D != null && D.f(parse)) {
                            parse = s0.a(parse, zzcfbVar.getContext(), (View) zzcfbVar, zzcfbVar.i());
                        }
                    } else if (D != null && D.f(parse)) {
                        parse = D.a(parse, zzcfbVar.getContext(), (View) zzcfbVar, zzcfbVar.i());
                    }
                } catch (zzavm unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.r1;
                if (zzbVar != null && !zzbVar.c()) {
                    zzbVar.b(str);
                } else {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    zzcfb zzcfbVar2 = this.X;
                    if (zzcfbVar2 != null) {
                        str2 = zzcfbVar2.x();
                    } else {
                        str2 = "";
                    }
                    M0(zzcVar, true, false, str2);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzddy
    public final void t() {
        zzddy zzddyVar = this.f1;
        if (zzddyVar != null) {
            zzddyVar.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void t0(int i, int i2) {
        zzbsj zzbsjVar = this.s1;
        if (zzbsjVar != null) {
            zzbsjVar.l(i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
        com.google.android.gms.ads.internal.zzv.v();
        com.google.android.gms.ads.internal.zzv.v();
        r0 = r10.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0113, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0115, code lost:
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
        r12 = r0.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
        com.google.android.gms.ads.internal.zzv.v();
        r0 = r10.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012d, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
        r13 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0131, code lost:
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0136, code lost:
        if (r0.length != 1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0139, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
        if (r2 >= r0.length) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
        if (r0[r2].trim().startsWith(o.C4317Th1.g) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
        r5 = r0[r2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0158, code lost:
        if (r5.length <= 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015a, code lost:
        r6 = r5[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0161, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0164, code lost:
        r0 = r10.getHeaderFields();
        r2 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017d, code lost:
        if (r0.hasNext() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017f, code lost:
        r3 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0189, code lost:
        if (r3.getKey() == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018f, code lost:
        if (r3.getValue() == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019b, code lost:
        if (r3.getValue().isEmpty() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x019d, code lost:
        r2.put(r3.getKey(), r3.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b3, code lost:
        r6 = com.google.android.gms.ads.internal.zzv.w().b(r12, r13, r10.getResponseCode(), r10.getResponseMessage(), r2, r10.getInputStream());
     */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse v(String str, Map map) throws IOException {
        WebResourceResponse webResourceResponse;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    int i2 = zzfqp.a;
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                        com.google.android.gms.ads.internal.util.zzs v = com.google.android.gms.ads.internal.zzv.v();
                        try {
                            zzcfb zzcfbVar = this.X;
                            v.M(zzcfbVar.getContext(), zzcfbVar.m().X, false, httpURLConnection, false, 60000);
                            webResourceResponse = null;
                            com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                            zzlVar.c(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            zzlVar.e(httpURLConnection, responseCode);
                            if (responseCode < 300 || responseCode >= 400) {
                                break;
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField != null) {
                                if (headerField.startsWith("tel:")) {
                                    break;
                                }
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    int i3 = com.google.android.gms.ads.internal.util.zze.b;
                                    com.google.android.gms.ads.internal.util.client.zzo.g("Protocol is null");
                                    webResourceResponse = u();
                                    break;
                                } else if (!protocol.equals("http") && !protocol.equals("https")) {
                                    int i4 = com.google.android.gms.ads.internal.util.zze.b;
                                    com.google.android.gms.ads.internal.util.client.zzo.g("Unsupported scheme: " + protocol);
                                    webResourceResponse = u();
                                    break;
                                } else {
                                    String str2 = "Redirecting to " + headerField;
                                    int i5 = com.google.android.gms.ads.internal.util.zze.b;
                                    com.google.android.gms.ads.internal.util.client.zzo.b(str2);
                                    httpURLConnection.disconnect();
                                    url = url2;
                                }
                            } else {
                                throw new IOException("Missing Location header in redirect");
                            }
                        } catch (Throwable th) {
                            th = th;
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            TrafficStats.clearThreadStatsTag();
            return webResourceResponse;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void v0(zzcgs zzcgsVar) {
        this.c1 = zzcgsVar;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener w() {
        synchronized (this.Y0) {
        }
        return null;
    }

    public final void x(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.m()) {
            com.google.android.gms.ads.internal.util.zze.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.k(TD0.a.Y0 + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbjw) it.next()).a(this.X, map);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void y() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.Z0;
        if (zzaVar != null) {
            zzaVar.y();
        }
    }
}
