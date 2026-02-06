package o;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import o.C11306zu;
import o.C2598Bv;
import o.C3679Mt;
import o.InterfaceC9367rw;

/* renamed from: o.rO2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9240rO2 {
    public static final String h = "ZoomControl";
    public static final float i = 1.0f;
    public final C11306zu a;
    public final Executor b;
    public final C9726tO2 c;
    public final C7364jn1<InterfaceC9483sO2> d;
    public final b e;
    public boolean f = false;
    public C11306zu.c g = new a();

    /* renamed from: o.rO2$a */
    /* loaded from: classes.dex */
    public class a implements C11306zu.c {
        public a() {
        }

        @Override // o.C11306zu.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            C9240rO2.this.e.a(totalCaptureResult);
            return false;
        }
    }

    /* renamed from: o.rO2$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        void c();

        float d();

        Rect e();

        void f(C2598Bv.a aVar);

        void g(float f, C3679Mt.a<Void> aVar);
    }

    public C9240rO2(C11306zu c11306zu, C7641kw c7641kw, Executor executor) {
        this.a = c11306zu;
        this.b = executor;
        b f = f(c7641kw);
        this.e = f;
        C9726tO2 c9726tO2 = new C9726tO2(f.d(), f.b());
        this.c = c9726tO2;
        c9726tO2.h(1.0f);
        this.d = new C7364jn1<>(HO0.f(c9726tO2));
        c11306zu.B(this.g);
    }

    public static /* synthetic */ Object c(final C9240rO2 c9240rO2, final InterfaceC9483sO2 interfaceC9483sO2, final C3679Mt.a aVar) {
        c9240rO2.b.execute(new Runnable() { // from class: o.pO2
            @Override // java.lang.Runnable
            public final void run() {
                C9240rO2.this.o(aVar, interfaceC9483sO2);
            }
        });
        return "setLinearZoom";
    }

    public static /* synthetic */ Object d(final C9240rO2 c9240rO2, final InterfaceC9483sO2 interfaceC9483sO2, final C3679Mt.a aVar) {
        c9240rO2.b.execute(new Runnable() { // from class: o.oO2
            @Override // java.lang.Runnable
            public final void run() {
                C9240rO2.this.o(aVar, interfaceC9483sO2);
            }
        });
        return "setZoomRatio";
    }

    public static b f(C7641kw c7641kw) {
        if (k(c7641kw)) {
            return new C5983e9(c7641kw);
        }
        return new C7039iR(c7641kw);
    }

    public static InterfaceC9483sO2 h(C7641kw c7641kw) {
        b f = f(c7641kw);
        C9726tO2 c9726tO2 = new C9726tO2(f.d(), f.b());
        c9726tO2.h(1.0f);
        return HO0.f(c9726tO2);
    }

    public static Range<Float> i(C7641kw c7641kw) {
        CameraCharacteristics.Key key;
        try {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            return (Range) c7641kw.a(key);
        } catch (AssertionError e) {
            C7433k41.q(h, "AssertionError, fail to get camera characteristic.", e);
            return null;
        }
    }

    public static boolean k(C7641kw c7641kw) {
        if (Build.VERSION.SDK_INT >= 30 && i(c7641kw) != null) {
            return true;
        }
        return false;
    }

    public void e(C2598Bv.a aVar) {
        this.e.f(aVar);
    }

    public Rect g() {
        return this.e.e();
    }

    public LiveData<InterfaceC9483sO2> j() {
        return this.d;
    }

    public void l(boolean z) {
        InterfaceC9483sO2 f;
        if (this.f != z) {
            this.f = z;
            if (!z) {
                synchronized (this.c) {
                    this.c.h(1.0f);
                    f = HO0.f(this.c);
                }
                p(f);
                this.e.c();
                this.a.j0();
            }
        }
    }

    public InterfaceFutureC8411o11<Void> m(float f) {
        final InterfaceC9483sO2 f2;
        synchronized (this.c) {
            try {
                this.c.g(f);
                f2 = HO0.f(this.c);
            } catch (IllegalArgumentException e) {
                return C7221jC0.f(e);
            }
        }
        p(f2);
        return C3679Mt.a(new C3679Mt.c() { // from class: o.qO2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C9240rO2.c(C9240rO2.this, f2, aVar);
            }
        });
    }

    public InterfaceFutureC8411o11<Void> n(float f) {
        final InterfaceC9483sO2 f2;
        synchronized (this.c) {
            try {
                this.c.h(f);
                f2 = HO0.f(this.c);
            } catch (IllegalArgumentException e) {
                return C7221jC0.f(e);
            }
        }
        p(f2);
        return C3679Mt.a(new C3679Mt.c() { // from class: o.nO2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C9240rO2.d(C9240rO2.this, f2, aVar);
            }
        });
    }

    public final void o(C3679Mt.a<Void> aVar, InterfaceC9483sO2 interfaceC9483sO2) {
        InterfaceC9483sO2 f;
        if (!this.f) {
            synchronized (this.c) {
                this.c.h(1.0f);
                f = HO0.f(this.c);
            }
            p(f);
            aVar.f(new InterfaceC9367rw.a("Camera is not active."));
            return;
        }
        this.e.g(interfaceC9483sO2.d(), aVar);
        this.a.j0();
    }

    public final void p(InterfaceC9483sO2 interfaceC9483sO2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.d.r(interfaceC9483sO2);
        } else {
            this.d.o(interfaceC9483sO2);
        }
    }
}
