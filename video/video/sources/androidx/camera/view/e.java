package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import androidx.camera.view.c;
import androidx.camera.view.e;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import o.C10201vM;
import o.C10907yF1;
import o.C3051Gi2;
import o.C7221jC0;
import o.C7433k41;
import o.InterfaceC10929yL;
import o.InterfaceFutureC8411o11;

/* loaded from: classes.dex */
public final class e extends c {
    public static final String g = "SurfaceViewImpl";
    public static final int h = 100;
    public SurfaceView e;
    public final b f;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* loaded from: classes.dex */
    public class b implements SurfaceHolder.Callback {
        public Size X;
        public C3051Gi2 Y;
        public c.a Y0;
        public C3051Gi2 Z;
        public Size Z0;
        public boolean a1 = false;
        public boolean b1 = false;

        public b() {
        }

        public static /* synthetic */ void a(c.a aVar, C3051Gi2.g gVar) {
            C7433k41.a(e.g, "Safe to release surface.");
            if (aVar != null) {
                aVar.a();
            }
        }

        public final boolean b() {
            if (!this.a1 && this.Y != null && Objects.equals(this.X, this.Z0)) {
                return true;
            }
            return false;
        }

        public final void c() {
            if (this.Y != null) {
                C7433k41.a(e.g, "Request canceled: " + this.Y);
                this.Y.w();
            }
        }

        public final void d() {
            if (this.Y != null) {
                C7433k41.a(e.g, "Surface closed " + this.Y);
                this.Y.m().d();
            }
        }

        public void e(C3051Gi2 c3051Gi2, c.a aVar) {
            c();
            if (this.b1) {
                this.b1 = false;
                c3051Gi2.r();
                return;
            }
            this.Y = c3051Gi2;
            this.Y0 = aVar;
            Size p = c3051Gi2.p();
            this.X = p;
            this.a1 = false;
            if (!f()) {
                C7433k41.a(e.g, "Wait for new Surface creation.");
                e.this.e.getHolder().setFixedSize(p.getWidth(), p.getHeight());
            }
        }

        public final boolean f() {
            Surface surface = e.this.e.getHolder().getSurface();
            if (b()) {
                C7433k41.a(e.g, "Surface set on Preview.");
                final c.a aVar = this.Y0;
                C3051Gi2 c3051Gi2 = this.Y;
                Objects.requireNonNull(c3051Gi2);
                c3051Gi2.t(surface, C10201vM.o(e.this.e.getContext()), new InterfaceC10929yL() { // from class: o.Ni2
                    @Override // o.InterfaceC10929yL
                    public final void accept(Object obj) {
                        e.b.a(c.a.this, (C3051Gi2.g) obj);
                    }
                });
                this.a1 = true;
                e.this.g();
                return true;
            }
            return false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C7433k41.a(e.g, "Surface changed. Size: " + i2 + "x" + i3);
            this.Z0 = new Size(i2, i3);
            f();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C3051Gi2 c3051Gi2;
            C7433k41.a(e.g, "Surface created.");
            if (this.b1 && (c3051Gi2 = this.Z) != null) {
                c3051Gi2.r();
                this.Z = null;
                this.b1 = false;
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C7433k41.a(e.g, "Surface destroyed.");
            if (this.a1) {
                d();
            } else {
                c();
            }
            this.b1 = true;
            C3051Gi2 c3051Gi2 = this.Y;
            if (c3051Gi2 != null) {
                this.Z = c3051Gi2;
            }
            this.a1 = false;
            this.Y = null;
            this.Y0 = null;
            this.Z0 = null;
            this.X = null;
        }
    }

    public e(FrameLayout frameLayout, androidx.camera.view.b bVar) {
        super(frameLayout, bVar);
        this.f = new b();
    }

    public static /* synthetic */ void m(Semaphore semaphore, int i) {
        if (i == 0) {
            C7433k41.a(g, "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            C7433k41.c(g, "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
        }
        semaphore.release();
    }

    public static boolean n(SurfaceView surfaceView, Size size, C3051Gi2 c3051Gi2) {
        boolean equals = Objects.equals(size, c3051Gi2.p());
        if (surfaceView != null && equals) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.view.c
    public View b() {
        return this.e;
    }

    @Override // androidx.camera.view.c
    public Bitmap c() {
        SurfaceView surfaceView = this.e;
        if (surfaceView != null && surfaceView.getHolder().getSurface() != null && this.e.getHolder().getSurface().isValid()) {
            final Semaphore semaphore = new Semaphore(0);
            Bitmap createBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
            HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
            handlerThread.start();
            a.a(this.e, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: o.Mi2
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    androidx.camera.view.e.m(semaphore, i);
                }
            }, new Handler(handlerThread.getLooper()));
            try {
                if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                    C7433k41.c(g, "Timed out while trying to acquire screenshot.");
                }
                return createBitmap;
            } catch (InterruptedException e) {
                C7433k41.d(g, "Interrupted while trying to acquire screenshot.", e);
                return createBitmap;
            } finally {
                handlerThread.quitSafely();
            }
        }
        return null;
    }

    @Override // androidx.camera.view.c
    public void d() {
        C10907yF1.l(this.b);
        C10907yF1.l(this.a);
        SurfaceView surfaceView = new SurfaceView(this.b.getContext());
        this.e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
        this.b.removeAllViews();
        this.b.addView(this.e);
        this.e.getHolder().addCallback(this.f);
    }

    @Override // androidx.camera.view.c
    public void e() {
    }

    @Override // androidx.camera.view.c
    public void f() {
    }

    @Override // androidx.camera.view.c
    public void h(final C3051Gi2 c3051Gi2, final c.a aVar) {
        if (!n(this.e, this.a, c3051Gi2)) {
            this.a = c3051Gi2.p();
            d();
        }
        if (aVar != null) {
            c3051Gi2.j(C10201vM.o(this.e.getContext()), new Runnable() { // from class: o.Ki2
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.this.a();
                }
            });
        }
        this.e.post(new Runnable() { // from class: o.Li2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.view.e.this.f.e(c3051Gi2, aVar);
            }
        });
    }

    @Override // androidx.camera.view.c
    public void j(Executor executor, PreviewView.e eVar) {
        throw new IllegalArgumentException("SurfaceView doesn't support frame update listener");
    }

    @Override // androidx.camera.view.c
    public InterfaceFutureC8411o11<Void> k() {
        return C7221jC0.h(null);
    }
}
