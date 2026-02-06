package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzfvt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o.C6566gU0;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzet {
    public static final Set j = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    public static zzet k;
    public zzcy g;
    public final Object a = new Object();
    public final Object b = new Object();
    public boolean d = false;
    public boolean e = false;
    public final Object f = new Object();
    @InterfaceC11300zs1
    public OnAdInspectorClosedListener h = null;
    @InterfaceC5670cr1
    public RequestConfiguration i = new RequestConfiguration.Builder().a();
    public final ArrayList c = new ArrayList();

    private zzet() {
    }

    public static InitializationStatus a(List list) {
        AdapterStatus.State state;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzblu zzbluVar = (zzblu) it.next();
            String str = zzbluVar.X;
            if (zzbluVar.Y) {
                state = AdapterStatus.State.READY;
            } else {
                state = AdapterStatus.State.NOT_READY;
            }
            hashMap.put(str, new zzbmc(state, zzbluVar.Y0, zzbluVar.Z));
        }
        return new zzbmd(hashMap);
    }

    public static zzet j() {
        zzet zzetVar;
        synchronized (zzet.class) {
            try {
                if (k == null) {
                    k = new zzet();
                }
                zzetVar = k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzetVar;
    }

    public static /* bridge */ /* synthetic */ PreloadConfiguration k(zzet zzetVar, zzfp zzfpVar) {
        String str = zzfpVar.X;
        AdFormat e = AdFormat.e(zzfpVar.Y);
        if (e == null) {
            return null;
        }
        zzm zzmVar = zzfpVar.Z;
        AdRequest.Builder builder = new AdRequest.Builder();
        List<String> list = zzmVar.Z0;
        if (list != null) {
            for (String str2 : list) {
                builder.d(str2);
            }
        }
        builder.n(zzmVar.h1);
        Bundle bundle = zzmVar.i1;
        for (String str3 : bundle.keySet()) {
            builder.b(str3, bundle.getString(str3));
        }
        builder.g(zzmVar.s1);
        String str4 = zzmVar.g1;
        if (str4 != null) {
            builder.h(str4);
        }
        builder.j(zzmVar.q1);
        builder.k(zzmVar.k1);
        AdRequest p = builder.p();
        PreloadConfiguration.Builder builder2 = new PreloadConfiguration.Builder(str, e);
        builder2.b(p);
        builder2.c(zzfpVar.Y0);
        return builder2.a();
    }

    public static /* synthetic */ void p(zzet zzetVar, Context context, String str) {
        synchronized (zzetVar.f) {
            zzetVar.b(context, null);
        }
    }

    public static /* synthetic */ void q(zzet zzetVar, Context context, String str) {
        synchronized (zzetVar.f) {
            zzetVar.b(context, null);
        }
    }

    public final void A(String str) {
        boolean z;
        synchronized (this.f) {
            if (this.g != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.y(z, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.g.B4(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to set plugin.", e);
            }
        }
    }

    public final void B(@InterfaceC5670cr1 RequestConfiguration requestConfiguration) {
        boolean z;
        if (requestConfiguration != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.b(z, "Null passed to setRequestConfiguration.");
        synchronized (this.f) {
            try {
                RequestConfiguration requestConfiguration2 = this.i;
                this.i = requestConfiguration;
                if (this.g == null) {
                    return;
                }
                if (requestConfiguration2.c() != requestConfiguration.c() || requestConfiguration2.d() != requestConfiguration.d()) {
                    d(requestConfiguration);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean C() {
        synchronized (this.f) {
            zzcy zzcyVar = this.g;
            boolean z = false;
            if (zzcyVar == null) {
                return false;
            }
            try {
                z = zzcyVar.q();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to get app mute state.", e);
            }
            return z;
        }
    }

    public final boolean D(boolean z) {
        boolean z2;
        String str;
        synchronized (this.f) {
            try {
                if (this.g != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Preconditions.y(z2, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
                try {
                    this.g.n0(z);
                } catch (RemoteException e) {
                    if (z) {
                        str = "enable";
                    } else {
                        str = "disable";
                    }
                    com.google.android.gms.ads.internal.util.client.zzo.e("Unable to " + str + " the publisher first-party ID.", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void b(Context context, @InterfaceC11300zs1 String str) {
        try {
            zzbpd.a().b(context, null);
            this.g.k();
            this.g.d3(null, ObjectWrapper.V3(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.h("MobileAdsSettingManager initialization failed", e);
        }
    }

    public final void c(Context context) {
        if (this.g == null) {
            this.g = (zzcy) new zzau(zzbb.a(), context).d(context, false);
        }
    }

    public final void d(@InterfaceC5670cr1 RequestConfiguration requestConfiguration) {
        try {
            this.g.y1(new zzfr(requestConfiguration));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Unable to set request configuration parcel.", e);
        }
    }

    public final float e() {
        synchronized (this.f) {
            zzcy zzcyVar = this.g;
            float f = 1.0f;
            if (zzcyVar == null) {
                return 1.0f;
            }
            try {
                f = zzcyVar.d();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to get app volume.", e);
            }
            return f;
        }
    }

    @InterfaceC5670cr1
    public final RequestConfiguration g() {
        return this.i;
    }

    public final InitializationStatus i() {
        boolean z;
        InitializationStatus a;
        synchronized (this.f) {
            try {
                if (this.g != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.y(z, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    a = a(this.g.g());
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.d("Unable to get Initialization status.");
                    return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzel
                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map a() {
                            HashMap hashMap = new HashMap();
                            hashMap.put("com.google.android.gms.ads.MobileAds", new zzep(zzet.this));
                            return hashMap;
                        }
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public final Status l(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 List list, @InterfaceC5670cr1 PreloadCallback preloadCallback) {
        Status status;
        int d;
        int intValue;
        int intValue2;
        boolean z = false;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String str = String.valueOf(preloadConfiguration.a()) + "#" + preloadConfiguration.c();
            hashMap.put(str, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.j(hashMap, str, 0)).intValue() + 1));
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                    hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat a = preloadConfiguration2.a();
            if (!j.contains(preloadConfiguration2.a())) {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.a())));
            } else {
                hashMap2.put(a, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.j(hashMap2, a, 0)).intValue() + 1));
                if (preloadConfiguration2.d() > 15) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", 15, a.name()));
                } else if (preloadConfiguration2.d() < 0) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size less than 0 for %s", a.name()));
                }
            }
            z = true;
        }
        EnumMap enumMap = new EnumMap(AdFormat.class);
        enumMap.put((EnumMap) AdFormat.APP_OPEN_AD, (AdFormat) ((Integer) zzbd.c().b(zzbcv.L4)));
        enumMap.put((EnumMap) AdFormat.INTERSTITIAL, (AdFormat) ((Integer) zzbd.c().b(zzbcv.J4)));
        enumMap.put((EnumMap) AdFormat.REWARDED, (AdFormat) ((Integer) zzbd.c().b(zzbcv.K4)));
        for (Map.Entry entry : hashMap2.entrySet()) {
            AdFormat adFormat = (AdFormat) entry.getKey();
            int intValue3 = ((Integer) entry.getValue()).intValue();
            Integer num = (Integer) com.google.android.gms.ads.internal.util.client.zzf.j(enumMap, adFormat, 0);
            if (intValue3 > num.intValue()) {
                hashSet.add(String.format(Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", num, adFormat.name()));
                z = true;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb.append((String) it4.next());
                if (it4.hasNext()) {
                    sb.append(C6566gU0.h);
                }
            }
            String sb2 = sb.toString();
            com.google.android.gms.ads.internal.util.client.zzo.d(sb2);
            status = new Status(13, sb2);
        } else {
            status = Status.a1;
        }
        String G0 = status.G0();
        if (G0 == null) {
            G0 = "";
        }
        Preconditions.b(status.S0(), G0);
        zzbcv.a(context);
        synchronized (this.b) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    PreloadConfiguration preloadConfiguration3 = (PreloadConfiguration) it5.next();
                    zzm a2 = zzq.a.a(context, preloadConfiguration3.b().j());
                    a2.Z.putBoolean("is_sdk_preload", true);
                    if (preloadConfiguration3.d() <= 0) {
                        int ordinal = preloadConfiguration3.a().ordinal();
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 5) {
                                    d = 1;
                                } else {
                                    d = ((Integer) zzbd.c().b(zzbcv.H)).intValue();
                                }
                            } else {
                                d = ((Integer) zzbd.c().b(zzbcv.J)).intValue();
                            }
                        } else {
                            d = ((Integer) zzbd.c().b(zzbcv.I)).intValue();
                        }
                    } else {
                        d = preloadConfiguration3.d();
                    }
                    int ordinal2 = preloadConfiguration3.a().ordinal();
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 5) {
                                intValue = 1;
                            } else {
                                intValue = ((Integer) zzbd.c().b(zzbcv.E)).intValue();
                            }
                        } else {
                            intValue = ((Integer) zzbd.c().b(zzbcv.G)).intValue();
                        }
                    } else {
                        intValue = ((Integer) zzbd.c().b(zzbcv.F)).intValue();
                    }
                    int max = Math.max(Math.min(intValue, 15), 1);
                    int ordinal3 = preloadConfiguration3.a().ordinal();
                    if (ordinal3 != 1) {
                        if (ordinal3 != 2) {
                            if (ordinal3 != 5) {
                                intValue2 = 1;
                            } else {
                                intValue2 = ((Integer) zzbd.c().b(zzbcv.K)).intValue();
                            }
                        } else {
                            intValue2 = ((Integer) zzbd.c().b(zzbcv.M)).intValue();
                        }
                    } else {
                        intValue2 = ((Integer) zzbd.c().b(zzbcv.L)).intValue();
                    }
                    arrayList.add(new zzfp(preloadConfiguration3.c(), preloadConfiguration3.a().g(), a2, Math.max(Math.min(d, max), Math.min(intValue2, max))));
                }
                try {
                    com.google.android.gms.ads.zzb.a(context).P2(arrayList, new zzeo(this, preloadCallback));
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.e("Unable to start preload.", e);
                    return Status.c1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Status.a1;
    }

    public final String n() {
        boolean z;
        String c;
        synchronized (this.f) {
            try {
                if (this.g != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.y(z, "MobileAds.initialize() must be called prior to getting version string.");
                try {
                    c = zzfvt.c(this.g.e());
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.e("Unable to get internal version.", e);
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public final void t(Context context) {
        synchronized (this.f) {
            c(context);
            try {
                this.g.i();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.d("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x007e A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:87:0x0034, B:89:0x0054, B:99:0x006d, B:101:0x007e, B:103:0x0090, B:110:0x00d3, B:104:0x00a0, B:106:0x00ae, B:108:0x00c0, B:109:0x00cb, B:96:0x0062, B:98:0x0068), top: B:118:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00ae A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:87:0x0034, B:89:0x0054, B:99:0x006d, B:101:0x007e, B:103:0x0090, B:110:0x00d3, B:104:0x00a0, B:106:0x00ae, B:108:0x00c0, B:109:0x00cb, B:96:0x0062, B:98:0x0068), top: B:118:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Context context, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.a) {
            try {
                if (this.d) {
                    if (onInitializationCompleteListener != null) {
                        this.c.add(onInitializationCompleteListener);
                    }
                } else if (this.e) {
                    if (onInitializationCompleteListener != null) {
                        onInitializationCompleteListener.a(i());
                    }
                } else {
                    this.d = true;
                    if (onInitializationCompleteListener != null) {
                        this.c.add(onInitializationCompleteListener);
                    }
                    if (context != null) {
                        synchronized (this.f) {
                            try {
                                c(context);
                                this.g.u4(new zzer(this, null));
                                this.g.b6(new zzbph());
                            } catch (RemoteException e) {
                                com.google.android.gms.ads.internal.util.client.zzo.h("MobileAdsSettingManager initialization failed", e);
                            } finally {
                            }
                            if (this.i.c() == -1) {
                                if (this.i.d() != -1) {
                                }
                                zzbcv.a(context);
                                if (((Boolean) zzbet.a.e()).booleanValue()) {
                                    if (((Boolean) zzbd.c().b(zzbcv.wb)).booleanValue()) {
                                        com.google.android.gms.ads.internal.util.client.zzo.b("Initializing on bg thread");
                                        com.google.android.gms.ads.internal.util.client.zzb.a.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.zzem
                                            public final /* synthetic */ Context Y;

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzet.q(zzet.this, this.Y, null);
                                            }
                                        });
                                    }
                                }
                                if (((Boolean) zzbet.b.e()).booleanValue()) {
                                    if (((Boolean) zzbd.c().b(zzbcv.wb)).booleanValue()) {
                                        com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.zzen
                                            public final /* synthetic */ Context Y;

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzet.p(zzet.this, this.Y, null);
                                            }
                                        });
                                    }
                                }
                                com.google.android.gms.ads.internal.util.client.zzo.b("Initializing on calling thread");
                                b(context, null);
                            }
                            d(this.i);
                            zzbcv.a(context);
                            if (((Boolean) zzbet.a.e()).booleanValue()) {
                            }
                            if (((Boolean) zzbet.b.e()).booleanValue()) {
                            }
                            com.google.android.gms.ads.internal.util.client.zzo.b("Initializing on calling thread");
                            b(context, null);
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Context cannot be null.");
                }
            } finally {
            }
        }
    }

    public final void v(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.f) {
            c(context);
            this.h = onAdInspectorClosedListener;
            try {
                this.g.I4(new zzeq(null));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.d("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.a(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.a));
                }
            }
        }
    }

    public final void w(Context context, String str) {
        boolean z;
        synchronized (this.f) {
            if (this.g != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.y(z, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.g.P6(ObjectWrapper.V3(context), str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to open debug menu.", e);
            }
        }
    }

    public final void x(Class cls) {
        synchronized (this.f) {
            try {
                this.g.r0(cls.getCanonicalName());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void y(boolean z) {
        boolean z2;
        synchronized (this.f) {
            if (this.g != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.y(z2, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.g.T7(z);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to set app mute state.", e);
            }
        }
    }

    public final void z(float f) {
        boolean z;
        boolean z2 = true;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.b(z, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f) {
            if (this.g == null) {
                z2 = false;
            }
            Preconditions.y(z2, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.g.D6(f);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to set app volume.", e);
            }
        }
    }
}
