package o;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import o.C10833xx0;
import o.C6960i70;
import o.FU;
import o.InterfaceC7201j70;
import o.InterfaceC7583kh1;
import o.InterfaceC8921q70;
import o.KY;

@ES1(18)
@Deprecated
/* renamed from: o.Ut1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4462Ut1 {
    public static final C10833xx0 f = new C10833xx0.b().O(new C6960i70(new C6960i70.b[0])).G();
    public final ConditionVariable a;
    public final KY b;
    public final HandlerThread c;
    public final Handler d;
    public final InterfaceC8921q70.a e;

    /* renamed from: o.Ut1$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC8921q70 {
        public a() {
        }

        @Override // o.InterfaceC8921q70
        public void d0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            C4462Ut1.this.a.open();
        }

        @Override // o.InterfaceC8921q70
        public void e(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            C4462Ut1.this.a.open();
        }

        @Override // o.InterfaceC8921q70
        public void n(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, Exception exc) {
            C4462Ut1.this.a.open();
        }

        @Override // o.InterfaceC8921q70
        public void u0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            C4462Ut1.this.a.open();
        }
    }

    public C4462Ut1(KY ky, InterfaceC8921q70.a aVar) {
        this.b = ky;
        this.e = aVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper());
        this.a = new ConditionVariable();
        aVar.g(new Handler(handlerThread.getLooper()), new a());
    }

    public static /* synthetic */ void a(C4462Ut1 c4462Ut1, D22 d22, InterfaceC7201j70 interfaceC7201j70) {
        c4462Ut1.getClass();
        try {
            d22.B((Pair) C9542sf.g(SK2.b(interfaceC7201j70)));
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void b(C4462Ut1 c4462Ut1, InterfaceC7201j70 interfaceC7201j70, D22 d22) {
        c4462Ut1.getClass();
        try {
            InterfaceC7201j70.a i = interfaceC7201j70.i();
            if (interfaceC7201j70.getState() == 1) {
                interfaceC7201j70.h(c4462Ut1.e);
                c4462Ut1.b.g();
            }
            d22.B(i);
        } catch (Throwable th) {
            d22.C(th);
            interfaceC7201j70.h(c4462Ut1.e);
            c4462Ut1.b.g();
        }
    }

    public static /* synthetic */ void c(C4462Ut1 c4462Ut1, D22 d22, InterfaceC7201j70 interfaceC7201j70) {
        c4462Ut1.getClass();
        try {
            d22.B(interfaceC7201j70.c());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void d(C4462Ut1 c4462Ut1, D22 d22) {
        c4462Ut1.getClass();
        try {
            c4462Ut1.b.g();
            d22.B(null);
        } catch (Throwable th) {
            d22.C(th);
        }
    }

    public static /* synthetic */ void e(C4462Ut1 c4462Ut1, int i, byte[] bArr, D22 d22, C10833xx0 c10833xx0) {
        c4462Ut1.getClass();
        try {
            c4462Ut1.b.e((Looper) C9542sf.g(Looper.myLooper()), ND1.b);
            c4462Ut1.b.m0();
            c4462Ut1.b.G(i, bArr);
            d22.B((InterfaceC7201j70) C9542sf.g(c4462Ut1.b.a(c4462Ut1.e, c10833xx0)));
        } catch (Throwable th) {
            d22.C(th);
        }
    }

    public static C4462Ut1 k(String str, FU.a aVar, InterfaceC8921q70.a aVar2) {
        return m(str, false, aVar, aVar2);
    }

    public static C4462Ut1 l(String str, boolean z, FU.a aVar, @InterfaceC11300zs1 Map<String, String> map, InterfaceC8921q70.a aVar2) {
        return new C4462Ut1(new KY.b().b(map).a(new BI0(str, z, aVar)), aVar2);
    }

    public static C4462Ut1 m(String str, boolean z, FU.a aVar, InterfaceC8921q70.a aVar2) {
        return l(str, z, aVar, null, aVar2);
    }

    public final InterfaceC7201j70 g(final int i, @InterfaceC11300zs1 final byte[] bArr, final C10833xx0 c10833xx0) throws InterfaceC7201j70.a {
        C9542sf.g(c10833xx0.j1);
        final D22 F = D22.F();
        this.a.close();
        this.d.post(new Runnable() { // from class: o.St1
            @Override // java.lang.Runnable
            public final void run() {
                C4462Ut1.e(C4462Ut1.this, i, bArr, F, c10833xx0);
            }
        });
        try {
            final InterfaceC7201j70 interfaceC7201j70 = (InterfaceC7201j70) F.get();
            this.a.block();
            final D22 F2 = D22.F();
            this.d.post(new Runnable() { // from class: o.Tt1
                @Override // java.lang.Runnable
                public final void run() {
                    C4462Ut1.b(C4462Ut1.this, interfaceC7201j70, F2);
                }
            });
            try {
                if (F2.get() == 0) {
                    return interfaceC7201j70;
                }
                throw ((InterfaceC7201j70.a) F2.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final byte[] h(int i, @InterfaceC11300zs1 byte[] bArr, C10833xx0 c10833xx0) throws InterfaceC7201j70.a {
        final InterfaceC7201j70 g = g(i, bArr, c10833xx0);
        final D22 F = D22.F();
        this.d.post(new Runnable() { // from class: o.Rt1
            @Override // java.lang.Runnable
            public final void run() {
                C4462Ut1.c(C4462Ut1.this, F, g);
            }
        });
        try {
            try {
                return (byte[]) C9542sf.g((byte[]) F.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } finally {
            p();
        }
    }

    public synchronized byte[] i(C10833xx0 c10833xx0) throws InterfaceC7201j70.a {
        boolean z;
        if (c10833xx0.j1 != null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        return h(2, null, c10833xx0);
    }

    public synchronized Pair<Long, Long> j(byte[] bArr) throws InterfaceC7201j70.a {
        Pair<Long, Long> pair;
        C9542sf.g(bArr);
        try {
            final InterfaceC7201j70 g = g(1, bArr, f);
            final D22 F = D22.F();
            this.d.post(new Runnable() { // from class: o.Pt1
                @Override // java.lang.Runnable
                public final void run() {
                    C4462Ut1.a(C4462Ut1.this, F, g);
                }
            });
            try {
                pair = (Pair) F.get();
                p();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } catch (InterfaceC7201j70.a e2) {
            if (e2.getCause() instanceof QX0) {
                return Pair.create(0L, 0L);
            }
            throw e2;
        }
        return pair;
    }

    public void n() {
        this.c.quit();
    }

    public synchronized void o(byte[] bArr) throws InterfaceC7201j70.a {
        C9542sf.g(bArr);
        h(3, bArr, f);
    }

    public final void p() {
        final D22 F = D22.F();
        this.d.post(new Runnable() { // from class: o.Qt1
            @Override // java.lang.Runnable
            public final void run() {
                C4462Ut1.d(C4462Ut1.this, F);
            }
        });
        try {
            F.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public synchronized byte[] q(byte[] bArr) throws InterfaceC7201j70.a {
        C9542sf.g(bArr);
        return h(2, bArr, f);
    }
}
