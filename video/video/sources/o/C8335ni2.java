package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import o.C3679Mt;
import o.InterfaceC7588ki2;

/* renamed from: o.ni2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8335ni2 implements InterfaceC7588ki2 {
    public static final String o1 = "SurfaceOutputImpl";
    public final Surface Y;
    public final int Y0;
    public final int Z;
    public final Size Z0;
    public final Size a1;
    public final Rect b1;
    public final int c1;
    public final boolean d1;
    public InterfaceC10929yL<InterfaceC7588ki2.a> g1;
    public Executor h1;
    public final InterfaceFutureC8411o11<Void> k1;
    public C3679Mt.a<Void> l1;
    public InterfaceC7402jx m1;
    public Matrix n1;
    public final Object X = new Object();
    public final float[] e1 = new float[16];
    public final float[] f1 = new float[16];
    public boolean i1 = false;
    public boolean j1 = false;

    public C8335ni2(Surface surface, int i, int i2, Size size, Size size2, Rect rect, int i3, boolean z, InterfaceC7402jx interfaceC7402jx, Matrix matrix) {
        this.Y = surface;
        this.Z = i;
        this.Y0 = i2;
        this.Z0 = size;
        this.a1 = size2;
        this.b1 = new Rect(rect);
        this.d1 = z;
        this.c1 = i3;
        this.m1 = interfaceC7402jx;
        this.n1 = matrix;
        f();
        this.k1 = C3679Mt.a(new C3679Mt.c() { // from class: o.li2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C8335ni2.a(C8335ni2.this, aVar);
            }
        });
    }

    public static /* synthetic */ Object a(C8335ni2 c8335ni2, C3679Mt.a aVar) {
        c8335ni2.l1 = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    public static /* synthetic */ void d(C8335ni2 c8335ni2, AtomicReference atomicReference) {
        c8335ni2.getClass();
        ((InterfaceC10929yL) atomicReference.get()).accept(InterfaceC7588ki2.a.c(0, c8335ni2));
    }

    @Override // o.InterfaceC7588ki2
    public Matrix G5() {
        return new Matrix(this.n1);
    }

    @Override // o.InterfaceC7588ki2
    public int Q4() {
        return this.Z;
    }

    @Override // o.InterfaceC7588ki2
    public Surface T3(Executor executor, InterfaceC10929yL<InterfaceC7588ki2.a> interfaceC10929yL) {
        boolean z;
        synchronized (this.X) {
            this.h1 = executor;
            this.g1 = interfaceC10929yL;
            z = this.i1;
        }
        if (z) {
            o();
        }
        return this.Y;
    }

    @Override // o.InterfaceC7588ki2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.X) {
            try {
                if (!this.j1) {
                    this.j1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.l1.c(null);
    }

    public final void f() {
        android.opengl.Matrix.setIdentityM(this.e1, 0);
        C9779td1.e(this.e1, 0.5f);
        C9779td1.d(this.e1, this.c1, 0.5f, 0.5f);
        if (this.d1) {
            android.opengl.Matrix.translateM(this.e1, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(this.e1, 0, -1.0f, 1.0f, 1.0f);
        }
        Size s = C5433bs2.s(this.a1, this.c1);
        Matrix e = C5433bs2.e(C5433bs2.v(this.a1), C5433bs2.v(s), this.c1, this.d1);
        RectF rectF = new RectF(this.b1);
        e.mapRect(rectF);
        float width = rectF.left / s.getWidth();
        float height = ((s.getHeight() - rectF.height()) - rectF.top) / s.getHeight();
        float height2 = rectF.height() / s.getHeight();
        android.opengl.Matrix.translateM(this.e1, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(this.e1, 0, rectF.width() / s.getWidth(), height2, 1.0f);
        h();
        float[] fArr = this.e1;
        android.opengl.Matrix.multiplyMM(fArr, 0, this.f1, 0, fArr, 0);
    }

    @Override // o.InterfaceC7588ki2
    public int getFormat() {
        return this.Y0;
    }

    public final void h() {
        android.opengl.Matrix.setIdentityM(this.f1, 0);
        C9779td1.e(this.f1, 0.5f);
        InterfaceC7402jx interfaceC7402jx = this.m1;
        if (interfaceC7402jx != null) {
            C10907yF1.o(interfaceC7402jx.r(), "Camera has no transform.");
            C9779td1.d(this.f1, this.m1.c().f(), 0.5f, 0.5f);
            if (this.m1.o()) {
                android.opengl.Matrix.translateM(this.f1, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(this.f1, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        float[] fArr = this.f1;
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    @Override // o.InterfaceC7588ki2
    public Size h0() {
        return this.Z0;
    }

    public InterfaceC7402jx i() {
        return this.m1;
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this.X) {
            z = this.j1;
        }
        return z;
    }

    public InterfaceFutureC8411o11<Void> j() {
        return this.k1;
    }

    public Rect k() {
        return this.b1;
    }

    public Size l() {
        return this.a1;
    }

    public boolean m() {
        return this.d1;
    }

    public int n() {
        return this.c1;
    }

    public void o() {
        Executor executor;
        InterfaceC10929yL<InterfaceC7588ki2.a> interfaceC10929yL;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.X) {
            try {
                if (this.h1 != null && (interfaceC10929yL = this.g1) != null) {
                    if (!this.j1) {
                        atomicReference.set(interfaceC10929yL);
                        executor = this.h1;
                        this.i1 = false;
                    }
                    executor = null;
                }
                this.i1 = true;
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: o.mi2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8335ni2.d(C8335ni2.this, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e) {
                C7433k41.b(o1, "Processor executor closed. Close request not posted.", e);
            }
        }
    }

    @Override // o.InterfaceC7588ki2
    public void u3(float[] fArr, float[] fArr2) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, this.e1, 0);
    }
}
