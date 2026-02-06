package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzavl;
import com.google.android.gms.internal.ads.zzavm;
import com.google.android.gms.internal.ads.zzbcm;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbea;
import com.google.android.gms.internal.ads.zzbeo;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzbyu;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzchb;
import com.google.android.gms.internal.ads.zzcva;
import com.google.android.gms.internal.ads.zzdbp;
import com.google.android.gms.internal.ads.zzdns;
import com.google.android.gms.internal.ads.zzdrl;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzfcn;
import com.google.android.gms.internal.ads.zzfct;
import com.google.android.gms.internal.ads.zzfdo;
import com.google.android.gms.internal.ads.zzfhb;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfhn;
import com.google.android.gms.internal.ads.zzfhq;
import com.google.android.gms.internal.ads.zzfjr;
import com.google.android.gms.internal.ads.zzfur;
import com.google.android.gms.internal.ads.zzfvt;
import com.google.android.gms.internal.ads.zzgce;
import com.google.android.gms.internal.ads.zzgcf;
import com.google.android.gms.internal.ads.zzgcp;
import com.google.android.gms.internal.ads.zzgcy;
import com.google.android.gms.internal.ads.zzgdj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.C9500sT;
import o.C9743tT;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceFutureC8411o11;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzau extends zzbyu {
    public static final List B1 = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final List C1 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final List D1 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final List E1 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int F1 = 0;
    public final zzf A1;
    public final zzchb X;
    public Context Y;
    public final zzfct Y0;
    public final zzavl Z;
    public final zzfdo Z0;
    public final zzgdj a1;
    public final ScheduledExecutorService b1;
    @InterfaceC11300zs1
    public zzbud c1;
    public final zzdsi f1;
    public final zzfjr g1;
    public final VersionInfoParcel o1;
    public String p1;
    public final List r1;
    public final List s1;
    public final List t1;
    public final List u1;
    public final zzbea y1;
    public final zzo z1;
    public Point d1 = new Point();
    public Point e1 = new Point();
    public final AtomicInteger n1 = new AtomicInteger(0);
    public final AtomicBoolean v1 = new AtomicBoolean(false);
    public final AtomicBoolean w1 = new AtomicBoolean(false);
    public final AtomicInteger x1 = new AtomicInteger(0);
    public final boolean h1 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.t7)).booleanValue();
    public final boolean i1 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s7)).booleanValue();
    public final boolean j1 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v7)).booleanValue();
    public final boolean k1 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x7)).booleanValue();
    public final String l1 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w7);
    public final String m1 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y7);
    public final String q1 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z7);

    public zzau(zzchb zzchbVar, Context context, zzavl zzavlVar, zzfdo zzfdoVar, zzgdj zzgdjVar, ScheduledExecutorService scheduledExecutorService, zzdsi zzdsiVar, zzfjr zzfjrVar, VersionInfoParcel versionInfoParcel, zzbea zzbeaVar, zzfct zzfctVar, zzo zzoVar, zzf zzfVar) {
        List list;
        this.X = zzchbVar;
        this.Y = context;
        this.Z = zzavlVar;
        this.Y0 = zzfctVar;
        this.Z0 = zzfdoVar;
        this.a1 = zzgdjVar;
        this.b1 = scheduledExecutorService;
        this.f1 = zzdsiVar;
        this.g1 = zzfjrVar;
        this.o1 = versionInfoParcel;
        this.y1 = zzbeaVar;
        this.z1 = zzoVar;
        this.A1 = zzfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A7)).booleanValue()) {
            this.r1 = v8((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.B7));
            this.s1 = v8((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C7));
            this.t1 = v8((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D7));
            list = v8((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E7));
        } else {
            this.r1 = B1;
            this.s1 = C1;
            this.t1 = D1;
            list = E1;
        }
        this.u1 = list;
    }

    public static /* bridge */ /* synthetic */ zzfhn E8(InterfaceFutureC8411o11 interfaceFutureC8411o11, zzbyz zzbyzVar) {
        String str;
        if (!zzfhq.a() || !((Boolean) zzbeo.e.e()).booleanValue()) {
            return null;
        }
        try {
            zzfhn a = ((zzac) zzgcy.p(interfaceFutureC8411o11)).a();
            a.d(new ArrayList(Collections.singletonList(zzbyzVar.Y)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzbyzVar.Y0;
            if (zzmVar == null) {
                str = "";
            } else {
                str = zzmVar.k1;
            }
            a.b(str);
            a.f(zzmVar.h1);
            return a;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public static /* synthetic */ InterfaceFutureC8411o11 J8(zzau zzauVar, zzdns[] zzdnsVarArr, String str, zzdns zzdnsVar) {
        zzdnsVarArr[0] = zzdnsVar;
        Context context = zzauVar.Y;
        zzbud zzbudVar = zzauVar.c1;
        Map map = zzbudVar.Y;
        JSONObject d = zzbv.d(context, map, map, zzbudVar.X, null);
        JSONObject h = zzbv.h(zzauVar.Y, zzauVar.c1.X);
        JSONObject g = zzbv.g(zzauVar.c1.X);
        JSONObject e = zzbv.e(zzauVar.Y, zzauVar.c1.X);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", d);
        jSONObject.put("ad_view_signal", h);
        jSONObject.put("scroll_view_signal", g);
        jSONObject.put("lock_screen_signal", e);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbv.c(null, zzauVar.Y, zzauVar.e1, zzauVar.d1));
        }
        return zzdnsVar.g(str, jSONObject);
    }

    public static /* synthetic */ ArrayList Z7(zzau zzauVar, List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzauVar.n8(uri) && !TextUtils.isEmpty(str)) {
                arrayList.add(w8(uri, "nas", str));
            } else {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ ArrayList a8(zzau zzauVar, List list, IObjectWrapper iObjectWrapper) {
        String str;
        zzavl zzavlVar = zzauVar.Z;
        if (zzavlVar.c() != null) {
            str = zzavlVar.c().i(zzauVar.Y, (View) ObjectWrapper.o1(iObjectWrapper), null);
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzauVar.n8(uri)) {
                    String valueOf = String.valueOf(uri);
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Not a Google URL: ".concat(valueOf));
                    arrayList.add(uri);
                } else {
                    arrayList.add(w8(uri, "ms", str));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    public static /* synthetic */ void e8(zzau zzauVar, zzdns[] zzdnsVarArr) {
        zzdns zzdnsVar = zzdnsVarArr[0];
        if (zzdnsVar != null) {
            zzauVar.Z0.b(zzgcy.h(zzdnsVar));
        }
    }

    public static /* bridge */ /* synthetic */ void g8(zzau zzauVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzauVar.m8((Uri) it.next())) {
                zzauVar.n1.getAndIncrement();
                return;
            }
        }
    }

    private final boolean l0() {
        Map map;
        zzbud zzbudVar = this.c1;
        if (zzbudVar != null && (map = zzbudVar.Y) != null && !map.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean u8(@InterfaceC5670cr1 Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    public static final List v8(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfvt.d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static final Uri w8(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    public static /* synthetic */ Uri y8(zzau zzauVar, Uri uri, String str) {
        if (!TextUtils.isEmpty(str)) {
            return w8(uri, "nas", str);
        }
        return uri;
    }

    public static /* synthetic */ Uri z8(zzau zzauVar, Uri uri, IObjectWrapper iObjectWrapper) {
        zzfct zzfctVar;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.nc)).booleanValue() && (zzfctVar = zzauVar.Y0) != null) {
                uri = zzfctVar.a(uri, zzauVar.Y, (View) ObjectWrapper.o1(iObjectWrapper), null);
            } else {
                uri = zzauVar.Z.a(uri, zzauVar.Y, (View) ObjectWrapper.o1(iObjectWrapper), null);
            }
        } catch (zzavm e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void E3(IObjectWrapper iObjectWrapper, final zzbyz zzbyzVar, @InterfaceC11300zs1 zzbys zzbysVar) {
        zzbyz zzbyzVar2;
        InterfaceFutureC8411o11 h;
        InterfaceFutureC8411o11 b;
        InterfaceFutureC8411o11 n;
        InterfaceFutureC8411o11 interfaceFutureC8411o11;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue()) {
            bundle.putLong(zzdrl.PUBLIC_API_CALL.e(), zzbyzVar.Y0.u1);
            bundle.putLong(zzdrl.DYNAMITE_ENTER.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        this.Y = context;
        zzfhc a = zzfhb.a(context, 22);
        a.i();
        int i = 0;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J7)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzbyzVar.Y0;
            if (zzmVar.Z.getBoolean("optimize_for_app_start", false) && Objects.equals(zzaa.c(zzmVar), "requester_type_8")) {
                i = 2;
                if (zzbyzVar.Z0 != 2) {
                    i = 1;
                }
            }
        }
        final int i2 = i;
        String str = zzbyzVar.Y;
        if ("UNKNOWN".equals(str)) {
            List arrayList = new ArrayList();
            zzbcm zzbcmVar = zzbcv.I7;
            if (!((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).split(","));
            }
            if (arrayList.contains(zzaa.c(zzbyzVar.Y0))) {
                h = zzgcy.g(new IllegalArgumentException("Unknown format is no longer supported."));
                b = zzgcy.g(new IllegalArgumentException("Unknown format is no longer supported."));
                zzbyzVar2 = zzbyzVar;
                interfaceFutureC8411o11 = h;
                n = b;
                zzgcy.r(n, new zzaq(this, interfaceFutureC8411o11, zzbyzVar2, zzbysVar, a), this.X.b());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.sb)).booleanValue()) {
            zzgdj zzgdjVar = zzcaa.a;
            InterfaceFutureC8411o11 I2 = zzgdjVar.I2(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzac o8;
                    o8 = r0.o8(zzau.this.Y, r1.X, r1.Y, r1.Z, r1.Y0, i2, r1.a1, bundle, zzbyzVar);
                    return o8;
                }
            });
            n = zzgcy.n(I2, new zzgcf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
                @Override // com.google.android.gms.internal.ads.zzgcf
                public final InterfaceFutureC8411o11 b(Object obj) {
                    return ((zzac) obj).b();
                }
            }, zzgdjVar);
            zzbyzVar2 = zzbyzVar;
            interfaceFutureC8411o11 = I2;
            zzgcy.r(n, new zzaq(this, interfaceFutureC8411o11, zzbyzVar2, zzbysVar, a), this.X.b());
        }
        zzac o8 = o8(this.Y, zzbyzVar.X, str, zzbyzVar.Z, zzbyzVar.Y0, i2, zzbyzVar.a1, bundle, zzbyzVar);
        zzbyzVar2 = zzbyzVar;
        h = zzgcy.h(o8);
        b = o8.b();
        interfaceFutureC8411o11 = h;
        n = b;
        zzgcy.r(n, new zzaq(this, interfaceFutureC8411o11, zzbyzVar2, zzbysVar, a), this.X.b());
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void O3(List list, IObjectWrapper iObjectWrapper, zzbua zzbuaVar) {
        s8(list, iObjectWrapper, zzbuaVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void R3(List list, IObjectWrapper iObjectWrapper, zzbua zzbuaVar) {
        t8(list, iObjectWrapper, zzbuaVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void V1(List list, IObjectWrapper iObjectWrapper, zzbua zzbuaVar) {
        s8(list, iObjectWrapper, zzbuaVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final IObjectWrapper V2(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ea)).booleanValue()) {
            return ObjectWrapper.V3(null);
        }
        zzbea zzbeaVar = this.y1;
        zzbeaVar.g((Context) ObjectWrapper.o1(iObjectWrapper), (C9743tT) ObjectWrapper.o1(iObjectWrapper2), str, (C9500sT) ObjectWrapper.o1(iObjectWrapper3));
        if (((Boolean) zzbfa.e.e()).booleanValue()) {
            this.z1.e();
        }
        if (((Boolean) zzbfa.c.e()).booleanValue()) {
            this.A1.b(null);
        }
        return ObjectWrapper.V3(zzbeaVar.b());
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void a6(List list, IObjectWrapper iObjectWrapper, zzbua zzbuaVar) {
        t8(list, iObjectWrapper, zzbuaVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void b0(IObjectWrapper iObjectWrapper) {
        View view;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q7)).booleanValue()) {
            return;
        }
        MotionEvent motionEvent = (MotionEvent) ObjectWrapper.o1(iObjectWrapper);
        zzbud zzbudVar = this.c1;
        if (zzbudVar == null) {
            view = null;
        } else {
            view = zzbudVar.X;
        }
        this.d1 = zzbv.a(motionEvent, view);
        if (motionEvent.getAction() == 0) {
            this.e1 = this.d1;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.d1;
        obtain.setLocation(point.x, point.y);
        this.Z.d(obtain);
        obtain.recycle();
    }

    @InterfaceC5056aJ2
    public final boolean m8(@InterfaceC5670cr1 Uri uri) {
        return u8(uri, this.r1, this.s1);
    }

    @InterfaceC5056aJ2
    public final boolean n8(@InterfaceC5670cr1 Uri uri) {
        return u8(uri, this.t1, this.u1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzac o8(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, int i, @InterfaceC11300zs1 String str3, Bundle bundle, @InterfaceC11300zs1 zzbyz zzbyzVar) {
        com.google.android.gms.ads.internal.client.zzm zzmVar2;
        com.google.android.gms.ads.internal.client.zzr zzrVar2;
        char c;
        zzfcn zzfcnVar = new zzfcn();
        if ("REWARDED".equals(str2)) {
            zzfcnVar.L().a(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfcnVar.L().a(3);
        }
        zzab t = this.X.t();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.f(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfcnVar.P(str);
        if (zzmVar == null) {
            zzmVar2 = new com.google.android.gms.ads.internal.client.zzn().a();
        } else {
            zzmVar2 = zzmVar;
        }
        zzfcnVar.h(zzmVar2);
        if (zzrVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1 && c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            zzrVar2 = new com.google.android.gms.ads.internal.client.zzr();
                        } else {
                            zzrVar2 = com.google.android.gms.ads.internal.client.zzr.B0();
                        }
                    } else {
                        zzrVar2 = com.google.android.gms.ads.internal.client.zzr.E0();
                    }
                } else {
                    zzrVar2 = com.google.android.gms.ads.internal.client.zzr.G0();
                }
            } else {
                zzrVar2 = new com.google.android.gms.ads.internal.client.zzr(context, AdSize.k);
            }
        } else {
            zzrVar2 = zzrVar;
        }
        zzfcnVar.O(zzrVar2);
        zzfcnVar.V(true);
        zzfcnVar.a(bundle);
        zzcvaVar.k(zzfcnVar.j());
        zzcvaVar.i(i);
        t.a(zzcvaVar.l());
        zzax zzaxVar = new zzax();
        zzaxVar.b(str2);
        zzaxVar.c(str3);
        zzaxVar.d(zzbyzVar);
        t.b(new zzaz(zzaxVar, null));
        new zzdbp();
        return t.c();
    }

    public final InterfaceFutureC8411o11 p8(final String str) {
        final zzdns[] zzdnsVarArr = new zzdns[1];
        InterfaceFutureC8411o11 a = this.Z0.a();
        zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzau.J8(zzau.this, zzdnsVarArr, str, (zzdns) obj);
            }
        };
        zzgdj zzgdjVar = this.a1;
        InterfaceFutureC8411o11 n = zzgcy.n(a, zzgcfVar, zzgdjVar);
        n.h4(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
            @Override // java.lang.Runnable
            public final void run() {
                zzau.e8(zzau.this, zzdnsVarArr);
            }
        }, zzgdjVar);
        return (zzgcp) zzgcy.e((zzgcp) zzgcy.m((zzgcp) zzgcy.o(zzgcp.A(n), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R7)).intValue(), TimeUnit.MILLISECONDS, this.b1), new zzfur() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                int i = zzau.F1;
                return ((JSONObject) obj).optString("nas");
            }
        }, zzgdjVar), Exception.class, new zzfur() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                int i = zzau.F1;
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("", (Exception) obj);
                return null;
            }
        }, zzgdjVar);
    }

    public final void q8() {
        zzau zzauVar;
        InterfaceFutureC8411o11 b;
        if (((Boolean) zzbfa.e.e()).booleanValue()) {
            this.z1.e();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.sb)).booleanValue()) {
            b = zzgcy.k(new zzgce() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
                @Override // com.google.android.gms.internal.ads.zzgce
                public final InterfaceFutureC8411o11 a() {
                    InterfaceFutureC8411o11 b2;
                    b2 = r0.o8(zzau.this.Y, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).b();
                    return b2;
                }
            }, zzcaa.a);
            zzauVar = this;
        } else {
            zzauVar = this;
            b = zzauVar.o8(this.Y, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).b();
        }
        zzgcy.r(b, new zzat(this), zzauVar.X.b());
    }

    public final void r8() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R9)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.U9)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Y9)).booleanValue() || !this.v1.getAndSet(true)) {
                    q8();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    @SuppressLint({"AddJavascriptInterface"})
    public final void s0(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q9)).booleanValue()) {
            zzbcm zzbcmVar = zzbcv.H7;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                r8();
            }
            WebView webView = (WebView) ObjectWrapper.o1(iObjectWrapper);
            if (webView == null) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.d("The webView cannot be null.");
                return;
            }
            zzf zzfVar = this.A1;
            final zzj zzjVar = new zzj(webView, zzfVar, zzcaa.f);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.Z, this.f1, this.g1, this.Y0, this.z1, zzfVar, zzjVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.aa)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.t().t();
            }
            if (((Boolean) zzbfa.c.e()).booleanValue()) {
                zzfVar.b(webView);
                if (((Boolean) zzbfa.d.e()).booleanValue()) {
                    zzcaa.d.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzj.this.c();
                        }
                    }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ba)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                r8();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void s4(zzbud zzbudVar) {
        this.c1 = zzbudVar;
        this.Z0.c(1);
    }

    public final void s8(List list, final IObjectWrapper iObjectWrapper, zzbua zzbuaVar, boolean z) {
        InterfaceFutureC8411o11 I2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q7)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("The updating URL feature is not enabled.");
            try {
                zzbuaVar.u("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (m8((Uri) it.next())) {
                i2++;
            }
        }
        if (i2 > 1) {
            String valueOf = String.valueOf(list);
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Multiple google urls found: ".concat(valueOf));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (!m8(uri)) {
                String valueOf2 = String.valueOf(uri);
                int i4 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Not a Google URL: ".concat(valueOf2));
                I2 = zzgcy.h(uri);
            } else {
                zzgdj zzgdjVar = this.a1;
                I2 = zzgdjVar.I2(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzau.z8(zzau.this, uri, iObjectWrapper);
                    }
                });
                if (l0()) {
                    I2 = zzgcy.n(I2, new zzgcf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                        @Override // com.google.android.gms.internal.ads.zzgcf
                        public final InterfaceFutureC8411o11 b(Object obj) {
                            InterfaceFutureC8411o11 m;
                            m = zzgcy.m(r0.p8("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfur() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
                                @Override // com.google.android.gms.internal.ads.zzfur
                                public final Object apply(Object obj2) {
                                    return zzau.y8(zzau.this, r2, (String) obj2);
                                }
                            }, zzau.this.a1);
                            return m;
                        }
                    }, zzgdjVar);
                } else {
                    int i5 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.f("Asset view map is empty.");
                }
            }
            arrayList.add(I2);
        }
        zzgcy.r(zzgcy.d(arrayList), new zzas(this, zzbuaVar, z), this.X.b());
    }

    public final void t8(final List list, final IObjectWrapper iObjectWrapper, zzbua zzbuaVar, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q7)).booleanValue()) {
            try {
                zzbuaVar.u("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("", e);
                return;
            }
        }
        zzgdj zzgdjVar = this.a1;
        InterfaceFutureC8411o11 I2 = zzgdjVar.I2(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzau.a8(zzau.this, list, iObjectWrapper);
            }
        });
        if (l0()) {
            I2 = zzgcy.n(I2, new zzgcf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
                @Override // com.google.android.gms.internal.ads.zzgcf
                public final InterfaceFutureC8411o11 b(Object obj) {
                    InterfaceFutureC8411o11 m;
                    m = zzgcy.m(r0.p8("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfur() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
                        @Override // com.google.android.gms.internal.ads.zzfur
                        public final Object apply(Object obj2) {
                            return zzau.Z7(zzau.this, r2, (String) obj2);
                        }
                    }, zzau.this.a1);
                    return m;
                }
            }, zzgdjVar);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.f("Asset view map is empty.");
        }
        zzgcy.r(I2, new zzar(this, zzbuaVar, z), this.X.b());
    }
}
