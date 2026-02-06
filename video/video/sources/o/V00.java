package o;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C3051Gi2;
import o.C3679Mt;
import o.InterfaceC7588ki2;

/* loaded from: classes.dex */
public class V00 implements InterfaceC8822pi2, SurfaceTexture.OnFrameAvailableListener {
    public static final String g1 = "DefaultSurfaceProcessor";
    public final C3003Fv1 X;
    public final HandlerThread Y;
    public final Handler Y0;
    public final Executor Z;
    public final AtomicBoolean Z0;
    public final float[] a1;
    public final float[] b1;
    public final Map<InterfaceC7588ki2, Surface> c1;
    public int d1;
    public boolean e1;
    public final List<b> f1;

    /* loaded from: classes.dex */
    public static class a {
        public static InterfaceC6490gB0<N80, InterfaceC8822pi2> a = new InterfaceC6490gB0() { // from class: o.U00
            @Override // o.InterfaceC6490gB0
            public final Object apply(Object obj) {
                return new V00((N80) obj);
            }
        };

        public static InterfaceC8822pi2 a(N80 n80) {
            return a.apply(n80);
        }

        public static void b(InterfaceC6490gB0<N80, InterfaceC8822pi2> interfaceC6490gB0) {
            a = interfaceC6490gB0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public static C2743Di d(int i, int i2, C3679Mt.a<Void> aVar) {
            return new C2743Di(i, i2, aVar);
        }

        public abstract C3679Mt.a<Void> a();

        public abstract int b();

        public abstract int c();
    }

    public V00(N80 n80) {
        this(n80, K22.a);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ Object e(final V00 v00, int i, int i2, final C3679Mt.a aVar) {
        v00.getClass();
        final C2743Di d = b.d(i, i2, aVar);
        v00.s(new Runnable() { // from class: o.I00
            @Override // java.lang.Runnable
            public final void run() {
                V00.this.f1.add(d);
            }
        }, new Runnable() { // from class: o.J00
            @Override // java.lang.Runnable
            public final void run() {
                C3679Mt.a.this.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    public static /* synthetic */ void f(V00 v00, InterfaceC7588ki2 interfaceC7588ki2, InterfaceC7588ki2.a aVar) {
        v00.getClass();
        interfaceC7588ki2.close();
        Surface remove = v00.c1.remove(interfaceC7588ki2);
        if (remove != null) {
            v00.X.J(remove);
        }
    }

    public static /* synthetic */ void h(final V00 v00, C3051Gi2 c3051Gi2) {
        v00.d1++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(v00.X.v());
        surfaceTexture.setDefaultBufferSize(c3051Gi2.p().getWidth(), c3051Gi2.p().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        c3051Gi2.t(surface, v00.Z, new InterfaceC10929yL() { // from class: o.S00
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                V00.n(V00.this, surfaceTexture, surface, (C3051Gi2.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(v00, v00.Y0);
    }

    public static /* synthetic */ Object k(final V00 v00, final N80 n80, final K22 k22, final C3679Mt.a aVar) {
        v00.getClass();
        v00.r(new Runnable() { // from class: o.R00
            @Override // java.lang.Runnable
            public final void run() {
                V00.m(V00.this, n80, k22, aVar);
            }
        });
        return "Init GlRenderer";
    }

    public static /* synthetic */ void l(V00 v00) {
        v00.e1 = true;
        v00.q();
    }

    public static /* synthetic */ void m(V00 v00, N80 n80, K22 k22, C3679Mt.a aVar) {
        v00.getClass();
        try {
            v00.X.w(n80, k22);
            aVar.c(null);
        } catch (RuntimeException e) {
            aVar.f(e);
        }
    }

    public static /* synthetic */ void n(V00 v00, SurfaceTexture surfaceTexture, Surface surface, C3051Gi2.g gVar) {
        v00.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        v00.d1--;
        v00.q();
    }

    public static /* synthetic */ void o(final V00 v00, final InterfaceC7588ki2 interfaceC7588ki2) {
        Surface T3 = interfaceC7588ki2.T3(v00.Z, new InterfaceC10929yL() { // from class: o.G00
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                V00.f(V00.this, interfaceC7588ki2, (InterfaceC7588ki2.a) obj);
            }
        });
        v00.X.C(T3);
        v00.c1.put(interfaceC7588ki2, T3);
    }

    public static /* synthetic */ void p(V00 v00, Runnable runnable, Runnable runnable2) {
        if (v00.e1) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    @Override // o.InterfaceC8579oi2
    public void a(final C3051Gi2 c3051Gi2) {
        if (this.Z0.get()) {
            c3051Gi2.w();
            return;
        }
        Runnable runnable = new Runnable() { // from class: o.O00
            @Override // java.lang.Runnable
            public final void run() {
                V00.h(V00.this, c3051Gi2);
            }
        };
        Objects.requireNonNull(c3051Gi2);
        s(runnable, new Runnable() { // from class: o.P00
            @Override // java.lang.Runnable
            public final void run() {
                C3051Gi2.this.w();
            }
        });
    }

    @Override // o.InterfaceC8579oi2
    public void b(final InterfaceC7588ki2 interfaceC7588ki2) {
        if (this.Z0.get()) {
            interfaceC7588ki2.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: o.L00
            @Override // java.lang.Runnable
            public final void run() {
                V00.o(V00.this, interfaceC7588ki2);
            }
        };
        Objects.requireNonNull(interfaceC7588ki2);
        s(runnable, new Runnable() { // from class: o.M00
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC7588ki2.this.close();
            }
        });
    }

    @Override // o.InterfaceC8822pi2
    public InterfaceFutureC8411o11<Void> c(final int i, final int i2) {
        return C7221jC0.i(C3679Mt.a(new C3679Mt.c() { // from class: o.K00
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return V00.e(V00.this, i, i2, aVar);
            }
        }));
    }

    @Override // o.InterfaceC8822pi2
    public void g() {
        if (this.Z0.getAndSet(true)) {
            return;
        }
        r(new Runnable() { // from class: o.T00
            @Override // java.lang.Runnable
            public final void run() {
                V00.l(V00.this);
            }
        });
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z;
        if (!this.Z0.get()) {
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(this.a1);
            Au2<Surface, Size, float[]> au2 = null;
            for (Map.Entry<InterfaceC7588ki2, Surface> entry : this.c1.entrySet()) {
                Surface value = entry.getValue();
                InterfaceC7588ki2 key = entry.getKey();
                key.u3(this.b1, this.a1);
                if (key.getFormat() == 34) {
                    try {
                        this.X.G(surfaceTexture.getTimestamp(), this.b1, value);
                    } catch (RuntimeException e) {
                        C7433k41.d(g1, "Failed to render with OpenGL.", e);
                    }
                } else {
                    boolean z2 = false;
                    if (key.getFormat() == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C10907yF1.o(z, "Unsupported format: " + key.getFormat());
                    if (au2 == null) {
                        z2 = true;
                    }
                    C10907yF1.o(z2, "Only one JPEG output is supported.");
                    au2 = new Au2<>(value, key.h0(), (float[]) this.b1.clone());
                }
            }
            try {
                w(au2);
            } catch (RuntimeException e2) {
                t(e2);
            }
        }
    }

    public final void q() {
        if (this.e1 && this.d1 == 0) {
            for (InterfaceC7588ki2 interfaceC7588ki2 : this.c1.keySet()) {
                interfaceC7588ki2.close();
            }
            for (b bVar : this.f1) {
                bVar.a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.c1.clear();
            this.X.D();
            this.Y.quit();
        }
    }

    public final void r(Runnable runnable) {
        s(runnable, new Runnable() { // from class: o.N00
            @Override // java.lang.Runnable
            public final void run() {
                V00.d();
            }
        });
    }

    public final void s(final Runnable runnable, final Runnable runnable2) {
        try {
            this.Z.execute(new Runnable() { // from class: o.Q00
                @Override // java.lang.Runnable
                public final void run() {
                    V00.p(V00.this, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e) {
            C7433k41.q(g1, "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void t(Throwable th) {
        for (b bVar : this.f1) {
            bVar.a().f(th);
        }
        this.f1.clear();
    }

    public final Bitmap u(Size size, float[] fArr, int i) {
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        C9779td1.e(fArr2, 0.5f);
        C9779td1.d(fArr2, i, 0.5f, 0.5f);
        Matrix.multiplyMM(fArr2, 0, fArr2, 0, fArr, 0);
        return this.X.H(C5433bs2.s(size, i), fArr2);
    }

    public final void v(final N80 n80, final K22 k22) {
        try {
            C3679Mt.a(new C3679Mt.c() { // from class: o.H00
                @Override // o.C3679Mt.c
                public final Object a(C3679Mt.a aVar) {
                    return V00.k(V00.this, n80, k22, aVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    public final void w(Au2<Surface, Size, float[]> au2) {
        if (this.f1.isEmpty()) {
            return;
        }
        if (au2 == null) {
            t(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator<b> it = this.f1.iterator();
            int i = -1;
            int i2 = -1;
            Bitmap bitmap = null;
            byte[] bArr = null;
            while (it.hasNext()) {
                b next = it.next();
                if (i != next.c() || bitmap == null) {
                    i = next.c();
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    bitmap = u(au2.g(), au2.h(), i);
                    i2 = -1;
                }
                if (i2 != next.b()) {
                    byteArrayOutputStream.reset();
                    i2 = next.b();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                    bArr = byteArrayOutputStream.toByteArray();
                }
                Objects.requireNonNull(bArr);
                ImageProcessingUtil.p(au2.f(), bArr);
                next.a().c(null);
                it.remove();
            }
            byteArrayOutputStream.close();
        } catch (IOException e) {
            t(e);
        }
    }

    public V00(N80 n80, K22 k22) {
        this.Z0 = new AtomicBoolean(false);
        this.a1 = new float[16];
        this.b1 = new float[16];
        this.c1 = new LinkedHashMap();
        this.d1 = 0;
        this.e1 = false;
        this.f1 = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.Y = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.Y0 = handler;
        this.Z = C5211ay.h(handler);
        this.X = new C3003Fv1();
        try {
            v(n80, k22);
        } catch (RuntimeException e) {
            g();
            throw e;
        }
    }
}
