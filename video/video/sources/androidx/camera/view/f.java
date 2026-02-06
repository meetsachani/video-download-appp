package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import androidx.camera.view.c;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.C10201vM;
import o.C10907yF1;
import o.C3051Gi2;
import o.C3679Mt;
import o.C5211ay;
import o.C6566gU0;
import o.C7221jC0;
import o.C7433k41;
import o.InterfaceC10929yL;
import o.InterfaceFutureC8411o11;
import o.XB0;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: o  reason: collision with root package name */
    public static final String f16o = "TextureViewImpl";
    public TextureView e;
    public SurfaceTexture f;
    public InterfaceFutureC8411o11<C3051Gi2.g> g;
    public C3051Gi2 h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference<C3679Mt.a<Void>> k;
    public c.a l;
    public PreviewView.e m;
    public Executor n;

    /* loaded from: classes.dex */
    public class a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0017a implements XB0<C3051Gi2.g> {
            public final /* synthetic */ SurfaceTexture a;

            public C0017a(SurfaceTexture surfaceTexture) {
                this.a = surfaceTexture;
            }

            @Override // o.XB0
            public void b(Throwable th) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            }

            @Override // o.XB0
            /* renamed from: c */
            public void a(C3051Gi2.g gVar) {
                boolean z;
                if (gVar.a() != 3) {
                    z = true;
                } else {
                    z = false;
                }
                C10907yF1.o(z, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                C7433k41.a(f.f16o, "SurfaceTexture about to manually be destroyed");
                this.a.release();
                f fVar = f.this;
                if (fVar.j != null) {
                    fVar.j = null;
                }
            }
        }

        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C7433k41.a(f.f16o, "SurfaceTexture available. Size: " + i + "x" + i2);
            f fVar = f.this;
            fVar.f = surfaceTexture;
            if (fVar.g != null) {
                C10907yF1.l(fVar.h);
                C7433k41.a(f.f16o, "Surface invalidated " + f.this.h);
                f.this.h.m().d();
                return;
            }
            fVar.r();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            f fVar = f.this;
            fVar.f = null;
            InterfaceFutureC8411o11<C3051Gi2.g> interfaceFutureC8411o11 = fVar.g;
            if (interfaceFutureC8411o11 != null) {
                C7221jC0.b(interfaceFutureC8411o11, new C0017a(surfaceTexture), C10201vM.o(f.this.e.getContext()));
                f.this.j = surfaceTexture;
                return false;
            }
            C7433k41.a(f.f16o, "SurfaceTexture about to be destroyed");
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C7433k41.a(f.f16o, "SurfaceTexture size changed: " + i + "x" + i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
            C3679Mt.a<Void> andSet = f.this.k.getAndSet(null);
            if (andSet != null) {
                andSet.c(null);
            }
            f fVar = f.this;
            final PreviewView.e eVar = fVar.m;
            Executor executor = fVar.n;
            if (eVar != null && executor != null) {
                executor.execute(new Runnable() { // from class: o.in2
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.e.this.a(surfaceTexture.getTimestamp());
                    }
                });
            }
        }
    }

    public f(FrameLayout frameLayout, b bVar) {
        super(frameLayout, bVar);
        this.i = false;
        this.k = new AtomicReference<>();
    }

    public static /* synthetic */ Object l(f fVar, Surface surface, final C3679Mt.a aVar) {
        fVar.getClass();
        C7433k41.a(f16o, "Surface set on Preview.");
        C3051Gi2 c3051Gi2 = fVar.h;
        Executor b = C5211ay.b();
        Objects.requireNonNull(aVar);
        c3051Gi2.t(surface, b, new InterfaceC10929yL() { // from class: o.fn2
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                C3679Mt.a.this.c((C3051Gi2.g) obj);
            }
        });
        return "provideSurface[request=" + fVar.h + " surface=" + surface + C6566gU0.g;
    }

    public static /* synthetic */ void m(f fVar, Surface surface, InterfaceFutureC8411o11 interfaceFutureC8411o11, C3051Gi2 c3051Gi2) {
        fVar.getClass();
        C7433k41.a(f16o, "Safe to release surface.");
        fVar.p();
        surface.release();
        if (fVar.g == interfaceFutureC8411o11) {
            fVar.g = null;
        }
        if (fVar.h == c3051Gi2) {
            fVar.h = null;
        }
    }

    public static /* synthetic */ void n(f fVar, C3051Gi2 c3051Gi2) {
        C3051Gi2 c3051Gi22 = fVar.h;
        if (c3051Gi22 != null && c3051Gi22 == c3051Gi2) {
            fVar.h = null;
            fVar.g = null;
        }
        fVar.p();
    }

    public static /* synthetic */ Object o(f fVar, C3679Mt.a aVar) {
        fVar.k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    @Override // androidx.camera.view.c
    public View b() {
        return this.e;
    }

    @Override // androidx.camera.view.c
    public Bitmap c() {
        TextureView textureView = this.e;
        if (textureView != null && textureView.isAvailable()) {
            return this.e.getBitmap();
        }
        return null;
    }

    @Override // androidx.camera.view.c
    public void d() {
        C10907yF1.l(this.b);
        C10907yF1.l(this.a);
        TextureView textureView = new TextureView(this.b.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
        this.e.setSurfaceTextureListener(new a());
        this.b.removeAllViews();
        this.b.addView(this.e);
    }

    @Override // androidx.camera.view.c
    public void e() {
        q();
    }

    @Override // androidx.camera.view.c
    public void f() {
        this.i = true;
    }

    @Override // androidx.camera.view.c
    public void h(final C3051Gi2 c3051Gi2, c.a aVar) {
        this.a = c3051Gi2.p();
        this.l = aVar;
        d();
        C3051Gi2 c3051Gi22 = this.h;
        if (c3051Gi22 != null) {
            c3051Gi22.w();
        }
        this.h = c3051Gi2;
        c3051Gi2.j(C10201vM.o(this.e.getContext()), new Runnable() { // from class: o.en2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.view.f.n(androidx.camera.view.f.this, c3051Gi2);
            }
        });
        r();
    }

    @Override // androidx.camera.view.c
    public void j(Executor executor, PreviewView.e eVar) {
        this.m = eVar;
        this.n = executor;
    }

    @Override // androidx.camera.view.c
    public InterfaceFutureC8411o11<Void> k() {
        return C3679Mt.a(new C3679Mt.c() { // from class: o.dn2
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return androidx.camera.view.f.o(androidx.camera.view.f.this, aVar);
            }
        });
    }

    public final void p() {
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
            this.l = null;
        }
    }

    public final void q() {
        if (this.i && this.j != null) {
            SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.j;
            if (surfaceTexture != surfaceTexture2) {
                this.e.setSurfaceTexture(surfaceTexture2);
                this.j = null;
                this.i = false;
            }
        }
    }

    public void r() {
        SurfaceTexture surfaceTexture;
        Size size = this.a;
        if (size != null && (surfaceTexture = this.f) != null && this.h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.a.getHeight());
            final Surface surface = new Surface(this.f);
            final C3051Gi2 c3051Gi2 = this.h;
            final InterfaceFutureC8411o11<C3051Gi2.g> a2 = C3679Mt.a(new C3679Mt.c() { // from class: o.gn2
                @Override // o.C3679Mt.c
                public final Object a(C3679Mt.a aVar) {
                    return androidx.camera.view.f.l(androidx.camera.view.f.this, surface, aVar);
                }
            });
            this.g = a2;
            a2.h4(new Runnable() { // from class: o.hn2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.view.f.m(androidx.camera.view.f.this, surface, a2, c3051Gi2);
                }
            }, C10201vM.o(this.e.getContext()));
            g();
        }
    }
}
