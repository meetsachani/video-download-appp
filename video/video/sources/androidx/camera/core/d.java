package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.c;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import o.AN0;
import o.C3590Lv1;
import o.C3679Mt;
import o.C4133Rk2;
import o.C5433bs2;
import o.C7221jC0;
import o.C7433k41;
import o.C8985qN0;
import o.F22;
import o.InterfaceC8499oN0;
import o.InterfaceFutureC8411o11;
import o.ZN0;

/* loaded from: classes.dex */
public abstract class d implements InterfaceC8499oN0.a {
    public static final String t = "ImageAnalysisAnalyzer";
    public c.a a;
    public volatile int b;
    public volatile int c;
    public volatile boolean e;
    public volatile boolean f;
    public Executor g;
    public l h;
    public ImageWriter i;
    public ByteBuffer n;

    /* renamed from: o  reason: collision with root package name */
    public ByteBuffer f13o;
    public ByteBuffer p;
    public ByteBuffer q;
    public volatile int d = 1;
    public Rect j = new Rect();
    public Rect k = new Rect();
    public Matrix l = new Matrix();
    public Matrix m = new Matrix();
    public final Object r = new Object();
    public boolean s = true;

    public static /* synthetic */ void b(d dVar, g gVar, Matrix matrix, g gVar2, Rect rect, c.a aVar, C3679Mt.a aVar2) {
        int i;
        if (dVar.s) {
            C4133Rk2 a = gVar.I4().a();
            long c = gVar.I4().c();
            if (dVar.e) {
                i = 0;
            } else {
                i = dVar.b;
            }
            F22 f22 = new F22(gVar2, ZN0.f(a, c, i, matrix));
            if (!rect.isEmpty()) {
                f22.b2(rect);
            }
            aVar.d(f22);
            aVar2.c(null);
            return;
        }
        aVar2.f(new C3590Lv1("ImageAnalysis is detached"));
    }

    public static /* synthetic */ Object c(final d dVar, Executor executor, final g gVar, final Matrix matrix, final g gVar2, final Rect rect, final c.a aVar, final C3679Mt.a aVar2) {
        dVar.getClass();
        executor.execute(new Runnable() { // from class: o.mM0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.d.b(androidx.camera.core.d.this, gVar, matrix, gVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    public static l i(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int i6;
        if (i3 != 90 && i3 != 270) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i6 = i2;
        } else {
            i6 = i;
        }
        if (!z) {
            i = i2;
        }
        return new l(C8985qN0.a(i6, i, i4, i5));
    }

    public static Matrix k(int i, int i2, int i3, int i4, int i5) {
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i, i2), C5433bs2.a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i5);
            matrix.postConcat(C5433bs2.c(new RectF(0.0f, 0.0f, i3, i4)));
        }
        return matrix;
    }

    public static Rect l(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @Override // o.InterfaceC8499oN0.a
    public void a(InterfaceC8499oN0 interfaceC8499oN0) {
        try {
            g d = d(interfaceC8499oN0);
            if (d != null) {
                m(d);
            }
        } catch (IllegalStateException e) {
            C7433k41.d(t, "Failed to acquire image.", e);
        }
    }

    public abstract g d(InterfaceC8499oN0 interfaceC8499oN0);

    /* JADX WARN: Removed duplicated region for block: B:51:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceFutureC8411o11<Void> e(final g gVar) {
        int i;
        Object obj;
        final Executor executor;
        final c.a aVar;
        boolean z;
        l lVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        g gVar2;
        final g gVar3;
        g n;
        boolean z2 = false;
        if (this.e) {
            i = this.b;
        } else {
            i = 0;
        }
        Object obj2 = this.r;
        synchronized (obj2) {
            try {
                try {
                    executor = this.g;
                    aVar = this.a;
                    if (this.e && i != this.c) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        o(gVar, i);
                    }
                    if (this.e) {
                        h(gVar);
                    }
                    try {
                        lVar = this.h;
                        try {
                            imageWriter = this.i;
                            byteBuffer = this.n;
                            try {
                                byteBuffer2 = this.f13o;
                                byteBuffer3 = this.p;
                                byteBuffer4 = this.q;
                            } catch (Throwable th) {
                                th = th;
                                obj = obj2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (aVar != null && executor != null && this.s) {
            if (lVar != null) {
                if (this.d == 2) {
                    n = ImageProcessingUtil.g(gVar, lVar, byteBuffer, i, this.f);
                } else if (this.d == 1) {
                    if (this.f) {
                        ImageProcessingUtil.c(gVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        n = ImageProcessingUtil.n(gVar, lVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                gVar2 = n;
                if (gVar2 == null) {
                    z2 = true;
                }
                if (!z2) {
                    gVar3 = gVar;
                } else {
                    gVar3 = gVar2;
                }
                final Rect rect = new Rect();
                final Matrix matrix = new Matrix();
                synchronized (this.r) {
                    if (z && !z2) {
                        try {
                            n(gVar.getWidth(), gVar.getHeight(), gVar3.getWidth(), gVar3.getHeight());
                        } finally {
                        }
                    }
                    this.c = i;
                    rect.set(this.k);
                    matrix.set(this.m);
                }
                return C3679Mt.a(new C3679Mt.c() { // from class: o.nM0
                    @Override // o.C3679Mt.c
                    public final Object a(C3679Mt.a aVar2) {
                        return androidx.camera.core.d.c(androidx.camera.core.d.this, executor, gVar, matrix, gVar3, rect, aVar, aVar2);
                    }
                });
            }
            gVar2 = null;
            if (gVar2 == null) {
            }
            if (!z2) {
            }
            final Rect rect2 = new Rect();
            final Matrix matrix2 = new Matrix();
            synchronized (this.r) {
            }
        } else {
            return C7221jC0.f(new C3590Lv1("No analyzer or executor currently set."));
        }
    }

    public void f() {
        this.s = true;
    }

    public abstract void g();

    public final void h(g gVar) {
        if (this.d == 1) {
            if (this.f13o == null) {
                this.f13o = ByteBuffer.allocateDirect(gVar.getWidth() * gVar.getHeight());
            }
            this.f13o.position(0);
            if (this.p == null) {
                this.p = ByteBuffer.allocateDirect((gVar.getWidth() * gVar.getHeight()) / 4);
            }
            this.p.position(0);
            if (this.q == null) {
                this.q = ByteBuffer.allocateDirect((gVar.getWidth() * gVar.getHeight()) / 4);
            }
            this.q.position(0);
        } else if (this.d == 2 && this.n == null) {
            this.n = ByteBuffer.allocateDirect(gVar.getWidth() * gVar.getHeight() * 4);
        }
    }

    public void j() {
        this.s = false;
        g();
    }

    public abstract void m(g gVar);

    public final void n(int i, int i2, int i3, int i4) {
        Matrix k = k(i, i2, i3, i4, this.b);
        this.k = l(this.j, k);
        this.m.setConcat(this.l, k);
    }

    public final void o(g gVar, int i) {
        l lVar = this.h;
        if (lVar != null) {
            lVar.l();
            this.h = i(gVar.getWidth(), gVar.getHeight(), i, this.h.c(), this.h.e());
            if (this.d == 1) {
                ImageWriter imageWriter = this.i;
                if (imageWriter != null) {
                    AN0.a(imageWriter);
                }
                this.i = AN0.c(this.h.getSurface(), this.h.e());
            }
        }
    }

    public void p(Executor executor, c.a aVar) {
        if (aVar == null) {
            g();
        }
        synchronized (this.r) {
            this.a = aVar;
            this.g = executor;
        }
    }

    public void q(boolean z) {
        this.f = z;
    }

    public void r(int i) {
        this.d = i;
    }

    public void s(boolean z) {
        this.e = z;
    }

    public void t(l lVar) {
        synchronized (this.r) {
            this.h = lVar;
        }
    }

    public void u(int i) {
        this.b = i;
    }

    public void v(Matrix matrix) {
        synchronized (this.r) {
            this.l = matrix;
            this.m = new Matrix(this.l);
        }
    }

    public void w(Rect rect) {
        synchronized (this.r) {
            this.j = rect;
            this.k = new Rect(this.j);
        }
    }
}
