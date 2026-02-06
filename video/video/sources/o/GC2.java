package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.AbstractC10291vk;
import o.HT1;
import o.InterfaceC8826pj2;
import o.N31;

/* loaded from: classes2.dex */
public class GC2 {
    public static final String j = "Uploader";
    public static final String k = "GDT_CLIENT_METRICS";
    public final Context a;
    public final InterfaceC9562sk b;
    public final InterfaceC4207Se0 c;
    public final InterfaceC8257nN2 d;
    public final Executor e;
    public final InterfaceC8826pj2 f;
    public final ND g;
    public final ND h;
    public final GD i;

    @RP0
    public GC2(Context context, InterfaceC9562sk interfaceC9562sk, InterfaceC4207Se0 interfaceC4207Se0, InterfaceC8257nN2 interfaceC8257nN2, Executor executor, InterfaceC8826pj2 interfaceC8826pj2, @InterfaceC10438wJ2 ND nd, @InterfaceC3058Gk1 ND nd2, GD gd) {
        this.a = context;
        this.b = interfaceC9562sk;
        this.c = interfaceC4207Se0;
        this.d = interfaceC8257nN2;
        this.e = executor;
        this.f = interfaceC8826pj2;
        this.g = nd;
        this.h = nd2;
        this.i = gd;
    }

    public static /* synthetic */ Object b(GC2 gc2, Iterable iterable, Nt2 nt2, long j2) {
        gc2.c.L2(iterable);
        gc2.c.Z2(nt2, gc2.g.a() + j2);
        return null;
    }

    public static /* synthetic */ Object c(GC2 gc2) {
        gc2.i.d();
        return null;
    }

    public static /* synthetic */ Object e(GC2 gc2, Iterable iterable) {
        gc2.c.z0(iterable);
        return null;
    }

    public static /* synthetic */ Object f(GC2 gc2, Nt2 nt2, int i) {
        gc2.d.b(nt2, i + 1);
        return null;
    }

    public static /* synthetic */ Object g(GC2 gc2, Nt2 nt2, long j2) {
        gc2.c.Z2(nt2, gc2.g.a() + j2);
        return null;
    }

    public static /* synthetic */ Object h(GC2 gc2, Map map) {
        gc2.getClass();
        for (Map.Entry entry : map.entrySet()) {
            gc2.i.f(((Integer) entry.getValue()).intValue(), N31.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final GC2 gc2, final Nt2 nt2, final int i, Runnable runnable) {
        gc2.getClass();
        try {
            try {
                InterfaceC8826pj2 interfaceC8826pj2 = gc2.f;
                final InterfaceC4207Se0 interfaceC4207Se0 = gc2.c;
                Objects.requireNonNull(interfaceC4207Se0);
                interfaceC8826pj2.a(new InterfaceC8826pj2.a() { // from class: o.vC2
                    @Override // o.InterfaceC8826pj2.a
                    public final Object execute() {
                        return Integer.valueOf(InterfaceC4207Se0.this.J());
                    }
                });
                if (!gc2.k()) {
                    gc2.f.a(new InterfaceC8826pj2.a() { // from class: o.xC2
                        @Override // o.InterfaceC8826pj2.a
                        public final Object execute() {
                            return GC2.f(GC2.this, nt2, i);
                        }
                    });
                } else {
                    gc2.l(nt2, i);
                }
                runnable.run();
            } catch (C8583oj2 unused) {
                gc2.d.b(nt2, i + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    @InterfaceC5056aJ2
    public AbstractC3033Ge0 j(InterfaceC3682Mt2 interfaceC3682Mt2) {
        InterfaceC8826pj2 interfaceC8826pj2 = this.f;
        final GD gd = this.i;
        Objects.requireNonNull(gd);
        return interfaceC3682Mt2.b(AbstractC3033Ge0.a().i(this.g.a()).k(this.h.a()).j(k).h(new C10988yb0(C3123Hc0.b("proto"), ((ID) interfaceC8826pj2.a(new InterfaceC8826pj2.a() { // from class: o.zC2
            @Override // o.InterfaceC8826pj2.a
            public final Object execute() {
                return GD.this.h();
            }
        })).i())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @HT1({HT1.a.Y})
    public AbstractC10291vk l(final Nt2 nt2, int i) {
        AbstractC10291vk a;
        InterfaceC3682Mt2 m = this.b.m(nt2.b());
        AbstractC10291vk e = AbstractC10291vk.e(0L);
        final long j2 = 0;
        while (((Boolean) this.f.a(new InterfaceC8826pj2.a() { // from class: o.AC2
            @Override // o.InterfaceC8826pj2.a
            public final Object execute() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(GC2.this.c.p5(nt2));
                return valueOf;
            }
        })).booleanValue()) {
            final Iterable<MC1> iterable = (Iterable) this.f.a(new InterfaceC8826pj2.a() { // from class: o.BC2
                @Override // o.InterfaceC8826pj2.a
                public final Object execute() {
                    Iterable n5;
                    n5 = GC2.this.c.n5(nt2);
                    return n5;
                }
            });
            if (!iterable.iterator().hasNext()) {
                return e;
            }
            if (m == null) {
                C7676l41.c(j, "Unknown backend for %s, deleting event batch for it...", nt2);
                a = AbstractC10291vk.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (MC1 mc1 : iterable) {
                    arrayList.add(mc1.b());
                }
                if (nt2.e()) {
                    arrayList.add(j(m));
                }
                a = m.a(AbstractC10048uk.a().b(arrayList).c(nt2.c()).a());
            }
            e = a;
            if (e.c() == AbstractC10291vk.a.TRANSIENT_ERROR) {
                final Nt2 nt22 = nt2;
                this.f.a(new InterfaceC8826pj2.a() { // from class: o.CC2
                    @Override // o.InterfaceC8826pj2.a
                    public final Object execute() {
                        return GC2.b(GC2.this, iterable, nt22, j2);
                    }
                });
                this.d.a(nt22, i + 1, true);
                return e;
            }
            Nt2 nt23 = nt2;
            this.f.a(new InterfaceC8826pj2.a() { // from class: o.DC2
                @Override // o.InterfaceC8826pj2.a
                public final Object execute() {
                    return GC2.e(GC2.this, iterable);
                }
            });
            if (e.c() == AbstractC10291vk.a.OK) {
                long max = Math.max(j2, e.b());
                if (nt23.e()) {
                    this.f.a(new InterfaceC8826pj2.a() { // from class: o.EC2
                        @Override // o.InterfaceC8826pj2.a
                        public final Object execute() {
                            return GC2.c(GC2.this);
                        }
                    });
                }
                j2 = max;
            } else if (e.c() == AbstractC10291vk.a.INVALID_PAYLOAD) {
                final HashMap hashMap = new HashMap();
                for (MC1 mc12 : iterable) {
                    String l = mc12.b().l();
                    if (!hashMap.containsKey(l)) {
                        hashMap.put(l, 1);
                    } else {
                        hashMap.put(l, Integer.valueOf(((Integer) hashMap.get(l)).intValue() + 1));
                    }
                }
                this.f.a(new InterfaceC8826pj2.a() { // from class: o.FC2
                    @Override // o.InterfaceC8826pj2.a
                    public final Object execute() {
                        return GC2.h(GC2.this, hashMap);
                    }
                });
            }
            nt2 = nt23;
        }
        final Nt2 nt24 = nt2;
        this.f.a(new InterfaceC8826pj2.a() { // from class: o.wC2
            @Override // o.InterfaceC8826pj2.a
            public final Object execute() {
                return GC2.g(GC2.this, nt24, j2);
            }
        });
        return e;
    }

    public void m(final Nt2 nt2, final int i, final Runnable runnable) {
        this.e.execute(new Runnable() { // from class: o.yC2
            @Override // java.lang.Runnable
            public final void run() {
                GC2.i(GC2.this, nt2, i, runnable);
            }
        });
    }
}
