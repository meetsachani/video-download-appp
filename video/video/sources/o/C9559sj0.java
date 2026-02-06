package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import java.util.concurrent.Executor;
import o.C11306zu;
import o.C2598Bv;
import o.C3679Mt;
import o.InterfaceC9367rw;

/* renamed from: o.sj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9559sj0 {
    public static final int g = 0;
    public final C11306zu a;
    public final C10045uj0 b;
    public final Executor c;
    public boolean d = false;
    public C3679Mt.a<Integer> e;
    public C11306zu.c f;

    public C9559sj0(C11306zu c11306zu, C7641kw c7641kw, Executor executor) {
        this.a = c11306zu;
        this.b = new C10045uj0(c7641kw, 0);
        this.c = executor;
    }

    public static /* synthetic */ void a(C9559sj0 c9559sj0, final C3679Mt.a aVar, final int i) {
        boolean z;
        boolean z2 = false;
        if (!c9559sj0.d) {
            c9559sj0.b.e(0);
            aVar.f(new InterfaceC9367rw.a("Camera is not active."));
            return;
        }
        c9559sj0.d();
        if (c9559sj0.e == null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "mRunningCompleter should be null when starting set a new exposure compensation value");
        if (c9559sj0.f == null) {
            z2 = true;
        }
        C10907yF1.o(z2, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
        C11306zu.c cVar = new C11306zu.c() { // from class: o.pj0
            @Override // o.C11306zu.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C9559sj0.c(i, aVar, totalCaptureResult);
            }
        };
        c9559sj0.f = cVar;
        c9559sj0.e = aVar;
        c9559sj0.a.B(cVar);
        c9559sj0.a.j0();
    }

    public static /* synthetic */ Object b(final C9559sj0 c9559sj0, final int i, final C3679Mt.a aVar) {
        c9559sj0.c.execute(new Runnable() { // from class: o.qj0
            @Override // java.lang.Runnable
            public final void run() {
                C9559sj0.a(C9559sj0.this, aVar, i);
            }
        });
        return "setExposureCompensationIndex[" + i + C6566gU0.g;
    }

    public static /* synthetic */ boolean c(int i, C3679Mt.a aVar, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num != null && num2 != null) {
            int intValue = num.intValue();
            if ((intValue == 2 || intValue == 3 || intValue == 4) && num2.intValue() == i) {
                aVar.c(Integer.valueOf(i));
                return true;
            }
            return false;
        } else if (num2 != null && num2.intValue() == i) {
            aVar.c(Integer.valueOf(i));
            return true;
        } else {
            return false;
        }
    }

    public static InterfaceC9802tj0 e(C7641kw c7641kw) {
        return new C10045uj0(c7641kw, 0);
    }

    public final void d() {
        C3679Mt.a<Integer> aVar = this.e;
        if (aVar != null) {
            aVar.f(new InterfaceC9367rw.a("Cancelled by another setExposureCompensationIndex()"));
            this.e = null;
        }
        C11306zu.c cVar = this.f;
        if (cVar != null) {
            this.a.a0(cVar);
            this.f = null;
        }
    }

    public InterfaceC9802tj0 f() {
        return this.b;
    }

    public void g(boolean z) {
        if (z != this.d) {
            this.d = z;
            if (!z) {
                this.b.e(0);
                d();
            }
        }
    }

    public void h(C2598Bv.a aVar) {
        aVar.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.b.a()));
    }

    public InterfaceFutureC8411o11<Integer> i(final int i) {
        if (!this.b.c()) {
            return C7221jC0.f(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range<Integer> d = this.b.d();
        if (!d.contains((Range<Integer>) Integer.valueOf(i))) {
            return C7221jC0.f(new IllegalArgumentException("Requested ExposureCompensation " + i + " is not within valid range [" + d.getUpper() + ".." + d.getLower() + C6566gU0.g));
        }
        this.b.e(i);
        return C7221jC0.i(C3679Mt.a(new C3679Mt.c() { // from class: o.rj0
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C9559sj0.b(C9559sj0.this, i, aVar);
            }
        }));
    }
}
