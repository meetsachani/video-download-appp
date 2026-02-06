package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdzu extends zzbuy {
    public final Context X;
    public final zzgdj Y;
    public final zzcla Y0;
    public final zzeac Z;
    public final ArrayDeque Z0;
    public final zzfhq a1;
    public final zzbvt b1;

    public zzdzu(Context context, zzgdj zzgdjVar, zzbvt zzbvtVar, zzcla zzclaVar, zzeac zzeacVar, ArrayDeque arrayDeque, zzdzz zzdzzVar, zzfhq zzfhqVar) {
        zzbcv.a(context);
        this.X = context;
        this.Y = zzgdjVar;
        this.b1 = zzbvtVar;
        this.Z = zzeacVar;
        this.Y0 = zzclaVar;
        this.Z0 = arrayDeque;
        this.a1 = zzfhqVar;
    }

    public static /* synthetic */ InputStream a8(zzdzu zzdzuVar, InterfaceFutureC8411o11 interfaceFutureC8411o11, InterfaceFutureC8411o11 interfaceFutureC8411o112, zzbvl zzbvlVar, zzfhc zzfhcVar) {
        String e = ((zzbvn) interfaceFutureC8411o11.get()).e();
        String str = zzbvlVar.c1;
        zzdzuVar.e8(new zzdzr((zzbvn) interfaceFutureC8411o11.get(), (JSONObject) interfaceFutureC8411o112.get(), str, e, zzfhcVar));
        return new ByteArrayInputStream(e.getBytes(StandardCharsets.UTF_8));
    }

    public static InterfaceFutureC8411o11 c8(InterfaceFutureC8411o11 interfaceFutureC8411o11, zzfgt zzfgtVar, zzbon zzbonVar, zzfhn zzfhnVar, zzfhc zzfhcVar) {
        zzbod a = zzbonVar.a("AFMA_getAdDictionary", zzbok.b, new zzbof() { // from class: com.google.android.gms.internal.ads.zzdzl
            @Override // com.google.android.gms.internal.ads.zzbof
            public final Object a(JSONObject jSONObject) {
                return new zzbvn(jSONObject);
            }
        });
        zzfhm.d(interfaceFutureC8411o11, zzfhcVar);
        zzffz a2 = zzfgtVar.b(zzfgn.BUILD_URL, interfaceFutureC8411o11).f(a).a();
        zzfhm.c(a2, zzfhnVar, zzfhcVar);
        return a2;
    }

    public static InterfaceFutureC8411o11 d8(final zzbvl zzbvlVar, zzfgt zzfgtVar, final zzeuy zzeuyVar) {
        zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdzf
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzeuy.this.b().a(com.google.android.gms.ads.internal.client.zzbb.b().o((Bundle) obj), zzbvlVar.h1, false);
            }
        };
        return zzfgtVar.b(zzfgn.GMS_SIGNALS, zzgcy.h(zzbvlVar.X)).f(zzgcfVar).e(new zzffx() { // from class: com.google.android.gms.internal.ads.zzdzg
            @Override // com.google.android.gms.internal.ads.zzffx
            public final Object b(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.k("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).a();
    }

    private final synchronized void o() {
        int intValue = ((Long) zzbfc.b.e()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.Z0;
            if (arrayDeque.size() >= intValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void K4(zzbuv zzbuvVar, zzbve zzbveVar) {
        if (!((Boolean) zzbfj.a.e()).booleanValue()) {
            try {
                zzbveVar.r4("", zzbuvVar);
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.l("Service can't call client", e);
                return;
            }
        }
        this.Y0.F();
        String str = zzbuvVar.X;
        zzgcy.r(zzgcy.h(null), new zzdzo(this, zzbveVar, zzbuvVar), zzcaa.g);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void Q2(String str, zzbvd zzbvdVar) {
        f8(Z7(str), zzbvdVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void V4(zzbvl zzbvlVar, zzbvd zzbvdVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue() && (bundle = zzbvlVar.h1) != null) {
            bundle.putLong(zzdrl.SERVICE_CONNECTED.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        InterfaceFutureC8411o11 X7 = X7(zzbvlVar, Binder.getCallingUid());
        f8(X7, zzbvdVar, zzbvlVar);
        if (((Boolean) zzbev.e.e()).booleanValue()) {
            zzeac zzeacVar = this.Z;
            Objects.requireNonNull(zzeacVar);
            X7.h4(new zzdzk(zzeacVar), this.Y);
        }
    }

    public final InterfaceFutureC8411o11 W7(final zzbvl zzbvlVar, int i) {
        if (!((Boolean) zzbfc.a.e()).booleanValue()) {
            return zzgcy.g(new Exception("Split request is disabled."));
        }
        zzfej zzfejVar = zzbvlVar.d1;
        if (zzfejVar == null) {
            return zzgcy.g(new Exception("Pool configuration missing from request."));
        }
        if (zzfejVar.Z0 != 0 && zzfejVar.a1 != 0) {
            Context context = this.X;
            zzbon b = com.google.android.gms.ads.internal.zzv.k().b(context, VersionInfoParcel.m0(), this.a1);
            zzeuy a = this.Y0.a(zzbvlVar, i);
            zzfgt c = a.c();
            final InterfaceFutureC8411o11 d8 = d8(zzbvlVar, c, a);
            zzfhn d = a.d();
            final zzfhc a2 = zzfhb.a(context, 9);
            final InterfaceFutureC8411o11 c8 = c8(d8, c, b, d, a2);
            return c.a(zzfgn.GET_URL_AND_CACHE_KEY, d8, c8).a(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdzu.a8(zzdzu.this, c8, d8, zzbvlVar, a2);
                }
            }).a();
        }
        return zzgcy.g(new Exception("Caching is disabled."));
    }

    public final InterfaceFutureC8411o11 X7(final zzbvl zzbvlVar, int i) {
        zzdzr b8;
        zzfhc zzfhcVar;
        zzffz a;
        zzboe k = com.google.android.gms.ads.internal.zzv.k();
        Context context = this.X;
        zzbon b = k.b(context, VersionInfoParcel.m0(), this.a1);
        zzeuy a2 = this.Y0.a(zzbvlVar, i);
        zzbod a3 = b.a("google.afma.response.normalize", zzdzt.d, zzbok.c);
        if (!((Boolean) zzbfc.a.e()).booleanValue()) {
            String str = zzbvlVar.e1;
            b8 = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.k("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            b8 = b8(zzbvlVar.c1);
            if (b8 == null) {
                com.google.android.gms.ads.internal.util.zze.k("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (b8 == null) {
            zzfhcVar = zzfhb.a(context, 9);
        } else {
            zzfhcVar = b8.d;
        }
        zzfhn d = a2.d();
        d.d(zzbvlVar.X.getStringArrayList("ad_types"));
        zzeab zzeabVar = new zzeab(zzbvlVar.b1, d, zzfhcVar);
        zzdzy zzdzyVar = new zzdzy(context, zzbvlVar.Y.X, this.b1, i);
        zzfgt c = a2.c();
        zzfhc a4 = zzfhb.a(context, 11);
        if (b8 == null) {
            final InterfaceFutureC8411o11 d8 = d8(zzbvlVar, c, a2);
            final InterfaceFutureC8411o11 c8 = c8(d8, c, b, d, zzfhcVar);
            zzfhc a5 = zzfhb.a(context, 10);
            final zzffz a6 = c.a(zzfgn.HTTP, c8, d8).a(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    zzbvn zzbvnVar = (zzbvn) InterfaceFutureC8411o11.this.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue() && (bundle = zzbvlVar.h1) != null) {
                        bundle.putLong(zzdrl.GET_AD_DICTIONARY_SDKCORE_START.e(), zzbvnVar.c());
                        bundle.putLong(zzdrl.GET_AD_DICTIONARY_SDKCORE_END.e(), zzbvnVar.b());
                    }
                    return new zzeaa((JSONObject) d8.get(), zzbvnVar);
                }
            }).e(zzeabVar).e(new zzfhi(a5)).e(zzdzyVar).a();
            zzfhm.a(a6, d, a5);
            zzfhm.d(a6, a4);
            a = c.a(zzfgn.PRE_PROCESS, d8, c8, a6).a(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue() && (bundle = zzbvl.this.h1) != null) {
                        bundle.putLong(zzdrl.HTTP_RESPONSE_READY.e(), com.google.android.gms.ads.internal.zzv.d().a());
                    }
                    return new zzdzt((zzdzx) a6.get(), (JSONObject) d8.get(), (zzbvn) c8.get());
                }
            }).f(a3).a();
        } else {
            zzeaa zzeaaVar = new zzeaa(b8.b, b8.a);
            zzfhc a7 = zzfhb.a(context, 10);
            final zzffz a8 = c.b(zzfgn.HTTP, zzgcy.h(zzeaaVar)).e(zzeabVar).e(new zzfhi(a7)).e(zzdzyVar).a();
            zzfhm.a(a8, d, a7);
            final InterfaceFutureC8411o11 h = zzgcy.h(b8);
            zzfhm.d(a8, a4);
            a = c.a(zzfgn.PRE_PROCESS, a8, h).a(new Callable() { // from class: com.google.android.gms.internal.ads.zzdze
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceFutureC8411o11 interfaceFutureC8411o11 = h;
                    return new zzdzt((zzdzx) InterfaceFutureC8411o11.this.get(), ((zzdzr) interfaceFutureC8411o11.get()).b, ((zzdzr) interfaceFutureC8411o11.get()).a);
                }
            }).f(a3).a();
        }
        zzfhm.a(a, d, a4);
        return a;
    }

    public final InterfaceFutureC8411o11 Y7(final zzbvl zzbvlVar, int i) {
        zzboe k = com.google.android.gms.ads.internal.zzv.k();
        Context context = this.X;
        zzbon b = k.b(context, VersionInfoParcel.m0(), this.a1);
        if (!((Boolean) zzbfh.a.e()).booleanValue()) {
            return zzgcy.g(new Exception("Signal collection disabled."));
        }
        zzeuy a = this.Y0.a(zzbvlVar, i);
        final zzety a2 = a.a();
        zzbod a3 = b.a("google.afma.request.getSignals", zzbok.b, zzbok.c);
        zzfhc a4 = zzfhb.a(context, 22);
        zzfgt c = a.c();
        zzfgn zzfgnVar = zzfgn.GET_SIGNALS;
        Bundle bundle = zzbvlVar.X;
        zzffz a5 = c.b(zzfgnVar, zzgcy.h(bundle)).e(new zzfhi(a4)).f(new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdzn
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzety.this.a(com.google.android.gms.ads.internal.client.zzbb.b().o((Bundle) obj), zzbvlVar.h1, false);
            }
        }).b(zzfgn.JS_SIGNALS).f(a3).a();
        zzfhn d = a.d();
        d.d(bundle.getStringArrayList("ad_types"));
        d.f(bundle.getBundle("extras"));
        zzfhm.b(a5, d, a4);
        if (((Boolean) zzbev.f.e()).booleanValue()) {
            zzeac zzeacVar = this.Z;
            Objects.requireNonNull(zzeacVar);
            a5.h4(new zzdzk(zzeacVar), this.Y);
        }
        return a5;
    }

    public final InterfaceFutureC8411o11 Z7(String str) {
        if (!((Boolean) zzbfc.a.e()).booleanValue()) {
            return zzgcy.g(new Exception("Split request is disabled."));
        }
        zzdzp zzdzpVar = new zzdzp(this);
        if (b8(str) == null) {
            return zzgcy.g(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzgcy.h(zzdzpVar);
    }

    @InterfaceC11300zs1
    public final synchronized zzdzr b8(String str) {
        Iterator it = this.Z0.iterator();
        while (it.hasNext()) {
            zzdzr zzdzrVar = (zzdzr) it.next();
            if (zzdzrVar.c.equals(str)) {
                it.remove();
                return zzdzrVar;
            }
        }
        return null;
    }

    public final synchronized void e8(zzdzr zzdzrVar) {
        o();
        this.Z0.addLast(zzdzrVar);
    }

    public final void f8(InterfaceFutureC8411o11 interfaceFutureC8411o11, zzbvd zzbvdVar, zzbvl zzbvlVar) {
        zzgcy.r(zzgcy.n(interfaceFutureC8411o11, new zzgcf(this) { // from class: com.google.android.gms.internal.ads.zzdzm
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
                zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdp
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputStream inputStream2 = inputStream;
                        try {
                            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                            IOUtils.c(inputStream2, autoCloseOutputStream);
                            autoCloseOutputStream.close();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
                return zzgcy.h(parcelFileDescriptor);
            }
        }, zzcaa.a), new zzdzq(this, zzbvlVar, zzbvdVar), zzcaa.g);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void t7(zzbvl zzbvlVar, zzbvd zzbvdVar) {
        f8(W7(zzbvlVar, Binder.getCallingUid()), zzbvdVar, zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void w5(zzbvl zzbvlVar, zzbvd zzbvdVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q2)).booleanValue() && (bundle = zzbvlVar.h1) != null) {
            bundle.putLong(zzdrl.SERVICE_CONNECTED.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        f8(Y7(zzbvlVar, Binder.getCallingUid()), zzbvdVar, zzbvlVar);
    }
}
