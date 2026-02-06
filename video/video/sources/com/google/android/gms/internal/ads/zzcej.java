package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzcej extends zzcbn implements zzhg, zzmm {
    public static final /* synthetic */ int r1 = 0;
    public final zzcdu Y0;
    public final Context Z;
    public final zzyo Z0;
    public final zzcbv a1;
    public final WeakReference b1;
    public final zzwi c1;
    @InterfaceC11300zs1
    public zziv d1;
    public ByteBuffer e1;
    public boolean f1;
    public zzcbm g1;
    public int h1;
    public int i1;
    public long j1;
    public final String k1;
    public final int l1;
    @InterfaceC11300zs1
    public Integer n1;
    public final ArrayList o1;
    @InterfaceC11300zs1
    public volatile zzcdw p1;
    public final Object m1 = new Object();
    public final Set q1 = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e3, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(com.google.android.gms.internal.ads.zzbcv.c2)).booleanValue() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e6, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ea, code lost:
        if (r5.i == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ef, code lost:
        if (r5.l == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f1, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcea();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f9, code lost:
        if (r5.h <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00fb, code lost:
        r6 = new com.google.android.gms.internal.ads.zzceb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0101, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcec();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0108, code lost:
        if (r5.i == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010a, code lost:
        r5 = new com.google.android.gms.internal.ads.zzced();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0111, code lost:
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0112, code lost:
        r4 = r3.e1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0114, code lost:
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x011a, code lost:
        if (r4.limit() <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011c, code lost:
        r4 = new byte[r3.e1.limit()];
        r3.e1.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcee();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcej(Context context, zzcbv zzcbvVar, zzcbw zzcbwVar, @InterfaceC11300zs1 Integer num) {
        int i;
        final zzgf zzgfVar;
        zzads zzadsVar;
        this.Z = context;
        this.a1 = zzcbvVar;
        this.n1 = num;
        this.b1 = new WeakReference(zzcbwVar);
        zzcdu zzcduVar = new zzcdu();
        this.Y0 = zzcduVar;
        zzyo zzyoVar = new zzyo(context);
        this.Z0 = zzyoVar;
        if (com.google.android.gms.ads.internal.util.zze.m()) {
            com.google.android.gms.ads.internal.util.zze.k("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzcbn.u().incrementAndGet();
        zzme zzmeVar = new zzme(context, new zzceh(this));
        zzmeVar.b(zzyoVar);
        zzmeVar.a(zzcduVar);
        zzmf c = zzmeVar.c();
        this.d1 = c;
        c.b(this);
        final boolean z = false;
        this.h1 = 0;
        this.j1 = 0L;
        this.i1 = 0;
        this.o1 = new ArrayList();
        this.p1 = null;
        this.k1 = (String) zzfva.d(zzcbwVar != null ? zzcbwVar.x() : null).b("");
        if (zzcbwVar != null) {
            i = zzcbwVar.e();
        } else {
            i = 0;
        }
        this.l1 = i;
        final String I = com.google.android.gms.ads.internal.zzv.v().I(context, zzcbwVar.m().X);
        if (this.f1 && this.e1.limit() > 0) {
            final byte[] bArr = new byte[this.e1.limit()];
            this.e1.get(bArr);
            zzgfVar = new zzgf() { // from class: com.google.android.gms.internal.ads.zzcdy
                @Override // com.google.android.gms.internal.ads.zzgf
                public final zzgg a() {
                    int i2 = zzcej.r1;
                    return new zzgb(bArr);
                }
            };
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k2)).booleanValue()) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.m)).booleanValue()) {
            zzadsVar = new zzads() { // from class: com.google.android.gms.internal.ads.zzcei
                @Override // com.google.android.gms.internal.ads.zzads
                public final /* synthetic */ zzadn[] a(Uri uri, Map map) {
                    int i2 = zzcej.r1;
                    return new zzadn[]{new zzajb(), new zzahq(), new zzaiv(zzakj.a, 32, null, null, zzfyc.F(), null)};
                }
            };
        } else {
            zzadsVar = new zzads() { // from class: com.google.android.gms.internal.ads.zzcdz
                @Override // com.google.android.gms.internal.ads.zzads
                public final /* synthetic */ zzadn[] a(Uri uri, Map map) {
                    int i2 = zzcej.r1;
                    return new zzadn[]{new zzajb(), new zzahq()};
                }
            };
        }
        this.c1 = new zzwi(zzgfVar, new zzwh(zzadsVar));
    }

    public static /* synthetic */ zzgg W(zzcej zzcejVar, String str, boolean z) {
        zzcej zzcejVar2;
        if (true != z) {
            zzcejVar2 = null;
        } else {
            zzcejVar2 = zzcejVar;
        }
        zzcbv zzcbvVar = zzcejVar.a1;
        return new zzcem(str, zzcejVar2, zzcbvVar.d, zzcbvVar.e, zzcbvVar.m, zzcbvVar.n);
    }

    public static /* synthetic */ zzgg X(zzcej zzcejVar, String str, boolean z) {
        zzcej zzcejVar2;
        if (true != z) {
            zzcejVar2 = null;
        } else {
            zzcejVar2 = zzcejVar;
        }
        zzcbv zzcbvVar = zzcejVar.a1;
        zzcdt zzcdtVar = new zzcdt(str, zzcejVar2, zzcbvVar.d, zzcbvVar.e, zzcbvVar.h);
        zzcejVar.q1.add(new WeakReference(zzcdtVar));
        return zzcdtVar;
    }

    public static /* synthetic */ zzgg Y(zzcej zzcejVar, String str, boolean z) {
        zzcej zzcejVar2;
        zzgo zzgoVar = new zzgo();
        zzgoVar.f(str);
        if (true != z) {
            zzcejVar2 = null;
        } else {
            zzcejVar2 = zzcejVar;
        }
        zzgoVar.e(zzcejVar2);
        zzcbv zzcbvVar = zzcejVar.a1;
        zzgoVar.c(zzcbvVar.d);
        zzgoVar.d(zzcbvVar.e);
        zzgoVar.b(true);
        return zzgoVar.a();
    }

    public static /* synthetic */ zzgg Z(zzcej zzcejVar, zzgf zzgfVar) {
        zzgg a = zzgfVar.a();
        zzceg zzcegVar = new zzceg(zzcejVar);
        return new zzcdw(zzcejVar.Z, a, zzcejVar.k1, zzcejVar.l1, zzcejVar, zzcegVar);
    }

    public static /* synthetic */ void b0(zzcej zzcejVar, boolean z, long j) {
        zzcbm zzcbmVar = zzcejVar.g1;
        if (zzcbmVar != null) {
            zzcbmVar.d(z, j);
        }
    }

    public static /* synthetic */ zzlv[] c0(zzcej zzcejVar, Handler handler, zzacc zzaccVar, zzqb zzqbVar, zzxh zzxhVar, zztz zztzVar) {
        zztl zztlVar = zztl.a;
        Context context = zzcejVar.Z;
        zzro zzroVar = new zzro(context, new zzsr(context, null, null), zztlVar, false, handler, zzqbVar, new zzqw(context).c());
        zzaas zzaasVar = new zzaas(context);
        zzaasVar.g(zztlVar);
        zzaasVar.e(handler);
        zzaasVar.f(zzaccVar);
        return new zzlv[]{zzroVar, zzaasVar.h()};
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void A(int i) {
        this.Y0.l(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void B(int i) {
        this.Y0.m(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void C(zzcbm zzcbmVar) {
        this.g1 = zzcbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void D(int i) {
        this.Y0.n(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void E(int i) {
        this.Y0.o(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void F(boolean z) {
        this.d1.x(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void G(@InterfaceC11300zs1 Integer num) {
        this.n1 = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void H(boolean z) {
        if (this.d1 != null) {
            int i = 0;
            while (true) {
                this.d1.w();
                if (i < 2) {
                    zzyo zzyoVar = this.Z0;
                    zzyb c = zzyoVar.n().c();
                    c.D(i, !z);
                    zzyoVar.r(c);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void I(int i) {
        for (WeakReference weakReference : this.q1) {
            zzcdt zzcdtVar = (zzcdt) weakReference.get();
            if (zzcdtVar != null) {
                zzcdtVar.m(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void J(Surface surface, boolean z) {
        zziv zzivVar = this.d1;
        if (zzivVar != null) {
            zzivVar.a(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void K(float f, boolean z) {
        zziv zzivVar = this.d1;
        if (zzivVar != null) {
            zzivVar.S(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void L() {
        this.d1.t();
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final boolean M() {
        return this.d1 != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final int N() {
        return this.i1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final int P() {
        return this.d1.g();
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final long R() {
        return this.d1.j();
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final long S() {
        return this.h1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final long T() {
        if (d0() && this.p1.p()) {
            return Math.min(this.h1, this.p1.k());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final long U() {
        return this.d1.l();
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final long V() {
        return this.d1.m();
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final long a() {
        if (!d0()) {
            return this.h1;
        }
        return 0L;
    }

    @InterfaceC5056aJ2
    public final zzvd a0(Uri uri) {
        zzad zzadVar = new zzad();
        zzadVar.b(uri);
        zzap c = zzadVar.c();
        zzwi zzwiVar = this.c1;
        zzwiVar.a(this.a1.f);
        return zzwiVar.b(c);
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void b(zzmk zzmkVar, int i) {
        zzcbm zzcbmVar = this.g1;
        if (zzcbmVar != null) {
            zzcbmVar.b(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void c(zzmk zzmkVar, Object obj, long j) {
        zzcbm zzcbmVar = this.g1;
        if (zzcbmVar != null) {
            zzcbmVar.q();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void d(zzmk zzmkVar, zzz zzzVar, @InterfaceC11300zs1 zzib zzibVar) {
        zzcbw zzcbwVar = (zzcbw) this.b1.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue() && zzcbwVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzzVar.x));
            hashMap.put("bitRate", String.valueOf(zzzVar.j));
            int i = zzzVar.v;
            int i2 = zzzVar.w;
            hashMap.put("resolution", i + "x" + i2);
            String str = zzzVar.n;
            if (str != null) {
                hashMap.put("videoMime", str);
            }
            String str2 = zzzVar.f301o;
            if (str2 != null) {
                hashMap.put("videoSampleMime", str2);
            }
            String str3 = zzzVar.k;
            if (str3 != null) {
                hashMap.put("videoCodec", str3);
            }
            zzcbwVar.q("onMetadataEvent", hashMap);
        }
    }

    public final boolean d0() {
        if (this.p1 != null && this.p1.q()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void e(zzmk zzmkVar, zzcd zzcdVar) {
        zzcbm zzcbmVar = this.g1;
        if (zzcbmVar != null) {
            zzcbmVar.a(zzcdVar.a, zzcdVar.b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void f(zzgg zzggVar, zzgl zzglVar, boolean z, int i) {
        this.h1 += i;
    }

    public final void finalize() {
        zzcbn.u().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.m()) {
            com.google.android.gms.ads.internal.util.zze.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void g(zzmk zzmkVar, zzz zzzVar, @InterfaceC11300zs1 zzib zzibVar) {
        zzcbw zzcbwVar = (zzcbw) this.b1.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue() && zzcbwVar != null) {
            HashMap hashMap = new HashMap();
            String str = zzzVar.n;
            if (str != null) {
                hashMap.put("audioMime", str);
            }
            String str2 = zzzVar.f301o;
            if (str2 != null) {
                hashMap.put("audioSampleMime", str2);
            }
            String str3 = zzzVar.k;
            if (str3 != null) {
                hashMap.put("audioCodec", str3);
            }
            zzcbwVar.q("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void h(zzgg zzggVar, zzgl zzglVar, boolean z) {
        if (zzggVar instanceof zzhb) {
            synchronized (this.m1) {
                this.o1.add((zzhb) zzggVar);
            }
        } else if (zzggVar instanceof zzcdw) {
            this.p1 = (zzcdw) zzggVar;
            final zzcbw zzcbwVar = (zzcbw) this.b1.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue() && zzcbwVar != null && this.p1.n()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.p1.p()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.p1.o()));
                com.google.android.gms.ads.internal.util.zzs.l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = zzcej.r1;
                        zzcbw.this.q("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void i(zzgg zzggVar, zzgl zzglVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void j(zzgg zzggVar, zzgl zzglVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void k(zzmk zzmkVar, zzux zzuxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void l(zzmk zzmkVar, zzbf zzbfVar, zzbf zzbfVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void m(zzmk zzmkVar, zzia zziaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void n(zzmk zzmkVar, zzba zzbaVar) {
        zzcbm zzcbmVar = this.g1;
        if (zzcbmVar != null) {
            zzcbmVar.e("onPlayerError", zzbaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void o(zzmk zzmkVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void p(zzmk zzmkVar, zzus zzusVar, zzux zzuxVar, IOException iOException, boolean z) {
        zzcbm zzcbmVar = this.g1;
        if (zzcbmVar != null) {
            if (this.a1.j) {
                zzcbmVar.c("onLoadException", iOException);
            } else {
                zzcbmVar.e("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final /* synthetic */ void q(zzbh zzbhVar, zzml zzmlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void r(zzmk zzmkVar, int i, long j) {
        this.i1 += i;
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final long s() {
        if (!d0()) {
            synchronized (this.m1) {
                while (true) {
                    ArrayList arrayList = this.o1;
                    if (!arrayList.isEmpty()) {
                        long j = this.j1;
                        Map d = ((zzhb) arrayList.remove(0)).d();
                        long j2 = 0;
                        if (d != null) {
                            Iterator it = d.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                if (entry != null) {
                                    try {
                                        if (entry.getKey() != null && zzfui.c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                            j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                            break;
                                        }
                                    } catch (NumberFormatException unused) {
                                        continue;
                                    }
                                }
                            }
                        }
                        this.j1 = j + j2;
                    }
                }
            }
            return this.j1;
        }
        return this.p1.l();
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    @InterfaceC11300zs1
    public final Integer t() {
        return this.n1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void w(Uri[] uriArr, String str) {
        x(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzvd zzvtVar;
        if (this.d1 != null) {
            this.e1 = byteBuffer;
            this.f1 = z;
            int length = uriArr.length;
            if (length == 1) {
                zzvtVar = a0(uriArr[0]);
            } else {
                zzvd[] zzvdVarArr = new zzvd[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzvdVarArr[i] = a0(uriArr[i]);
                }
                zzvtVar = new zzvt(false, false, new zzum(), zzvdVarArr);
            }
            this.d1.u(zzvtVar);
            this.d1.r();
            zzcbn.v().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void y() {
        zziv zzivVar = this.d1;
        if (zzivVar != null) {
            zzivVar.v(this);
            this.d1.L();
            this.d1 = null;
            zzcbn.v().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbn
    public final void z(long j) {
        this.d1.s(j);
    }
}
