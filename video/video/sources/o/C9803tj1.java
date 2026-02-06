package o;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.InterfaceC6986iD2;
import o.T12;

/* renamed from: o.tj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9803tj1 {
    public static final String g = "MeteringRepeating";
    public D10 a;
    public T12 b;
    public final Size d;
    public final c f;
    public final C2949Fh2 e = new C2949Fh2();
    public final b c = new b();

    /* renamed from: o.tj1$a */
    /* loaded from: classes.dex */
    public class a implements XB0<Void> {
        public final /* synthetic */ Surface a;
        public final /* synthetic */ SurfaceTexture b;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.a = surface;
            this.b = surfaceTexture;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r1) {
            this.a.release();
            this.b.release();
        }
    }

    /* renamed from: o.tj1$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC6743hD2<androidx.camera.core.m> {
        public final HJ K;

        public b() {
            C2569Bn1 u0 = C2569Bn1.u0();
            u0.h0(InterfaceC6743hD2.B, new C2892Ev());
            this.K = u0;
        }

        @Override // o.CO1
        public HJ d() {
            return this.K;
        }

        @Override // o.InterfaceC6743hD2
        public InterfaceC6986iD2.b g0() {
            return InterfaceC6986iD2.b.METERING_REPEATING;
        }
    }

    /* renamed from: o.tj1$c */
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    public C9803tj1(C7641kw c7641kw, C10376w40 c10376w40, c cVar) {
        this.f = cVar;
        Size f = f(c7641kw, c10376w40);
        this.d = f;
        C7433k41.a(g, "MeteringSession SurfaceTexture size: " + f);
        this.b = d();
    }

    public static /* synthetic */ void a(C9803tj1 c9803tj1, T12 t12, T12.f fVar) {
        c9803tj1.b = c9803tj1.d();
        c cVar = c9803tj1.f;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void c() {
        C7433k41.a(g, "MeteringRepeating clear!");
        D10 d10 = this.a;
        if (d10 != null) {
            d10.d();
        }
        this.a = null;
    }

    public T12 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.d.getWidth(), this.d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        T12.b s = T12.b.s(this.c, this.d);
        s.z(1);
        MN0 mn0 = new MN0(surface);
        this.a = mn0;
        C7221jC0.b(mn0.k(), new a(surface, surfaceTexture), C5211ay.b());
        s.n(this.a);
        s.g(new T12.c() { // from class: o.rj1
            @Override // o.T12.c
            public final void a(T12 t12, T12.f fVar) {
                C9803tj1.a(C9803tj1.this, t12, fVar);
            }
        });
        return s.q();
    }

    public String e() {
        return g;
    }

    public final Size f(C7641kw c7641kw, C10376w40 c10376w40) {
        Size[] b2 = c7641kw.c().b(34);
        if (b2 == null) {
            C7433k41.c(g, "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] a2 = this.e.a(b2);
        List asList = Arrays.asList(a2);
        Collections.sort(asList, new Comparator() { // from class: o.sj1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int signum;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
                return signum;
            }
        });
        Size f = c10376w40.f();
        long min = Math.min(f.getWidth() * f.getHeight(), 307200L);
        int length = a2.length;
        Size size = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Size size2 = a2[i];
            int i2 = ((size2.getWidth() * size2.getHeight()) > min ? 1 : ((size2.getWidth() * size2.getHeight()) == min ? 0 : -1));
            if (i2 == 0) {
                return size2;
            }
            if (i2 > 0) {
                if (size != null) {
                    return size;
                }
            } else {
                i++;
                size = size2;
            }
        }
        return (Size) asList.get(0);
    }

    public T12 g() {
        return this.b;
    }

    public InterfaceC6743hD2<?> h() {
        return this.c;
    }
}
