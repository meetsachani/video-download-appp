package o;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.C11306zu;
import o.C3679Mt;
import o.InterfaceC9367rw;

/* renamed from: o.Tq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4354Tq2 {
    public static final String h = "TorchControl";
    public static final int i = 0;
    public final C11306zu a;
    public final C7364jn1<Integer> b;
    public final boolean c;
    public final Executor d;
    public boolean e;
    public C3679Mt.a<Void> f;
    public boolean g;

    public C4354Tq2(C11306zu c11306zu, C7641kw c7641kw, Executor executor) {
        this.a = c11306zu;
        this.d = executor;
        Objects.requireNonNull(c7641kw);
        this.c = C4367Tu0.a(new C5442bv(c7641kw));
        this.b = new C7364jn1<>(0);
        c11306zu.B(new C11306zu.c() { // from class: o.Rq2
            @Override // o.C11306zu.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C4354Tq2.b(C4354Tq2.this, totalCaptureResult);
            }
        });
    }

    public static /* synthetic */ Object a(final C4354Tq2 c4354Tq2, final boolean z, final C3679Mt.a aVar) {
        c4354Tq2.d.execute(new Runnable() { // from class: o.Sq2
            @Override // java.lang.Runnable
            public final void run() {
                C4354Tq2.this.e(aVar, z);
            }
        });
        return "enableTorch: " + z;
    }

    public static /* synthetic */ boolean b(C4354Tq2 c4354Tq2, TotalCaptureResult totalCaptureResult) {
        boolean z;
        if (c4354Tq2.f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z == c4354Tq2.g) {
                c4354Tq2.f.c(null);
                c4354Tq2.f = null;
            }
        }
        return false;
    }

    public InterfaceFutureC8411o11<Void> d(final boolean z) {
        if (!this.c) {
            C7433k41.a(h, "Unable to enableTorch due to there is no flash unit.");
            return C7221jC0.f(new IllegalStateException("No flash unit"));
        }
        h(this.b, Integer.valueOf(z ? 1 : 0));
        return C3679Mt.a(new C3679Mt.c() { // from class: o.Qq2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C4354Tq2.a(C4354Tq2.this, z, aVar);
            }
        });
    }

    public void e(C3679Mt.a<Void> aVar, boolean z) {
        if (!this.c) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
            }
        } else if (!this.e) {
            h(this.b, 0);
            if (aVar != null) {
                aVar.f(new InterfaceC9367rw.a("Camera is not active."));
            }
        } else {
            this.g = z;
            this.a.E(z);
            h(this.b, Integer.valueOf(z ? 1 : 0));
            C3679Mt.a<Void> aVar2 = this.f;
            if (aVar2 != null) {
                aVar2.f(new InterfaceC9367rw.a("There is a new enableTorch being set"));
            }
            this.f = aVar;
        }
    }

    public LiveData<Integer> f() {
        return this.b;
    }

    public void g(boolean z) {
        if (this.e != z) {
            this.e = z;
            if (!z) {
                if (this.g) {
                    this.g = false;
                    this.a.E(false);
                    h(this.b, 0);
                }
                C3679Mt.a<Void> aVar = this.f;
                if (aVar != null) {
                    aVar.f(new InterfaceC9367rw.a("Camera is not active."));
                    this.f = null;
                }
            }
        }
    }

    public final <T> void h(C7364jn1<T> c7364jn1, T t) {
        if (C5901do2.f()) {
            c7364jn1.r(t);
        } else {
            c7364jn1.o(t);
        }
    }
}
