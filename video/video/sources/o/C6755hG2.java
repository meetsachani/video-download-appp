package o;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

@Deprecated
/* renamed from: o.hG2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6755hG2 {
    public static final String r = "VideoFrameReleaseHelper";
    public static final long s = 5000000000L;
    public static final float t = 0.02f;
    public static final float u = 1.0f;
    public static final int v = 30;
    public static final long w = 500;
    public static final long x = 20000000;
    public static final long y = 80;
    public final C9603su0 a = new C9603su0();
    @InterfaceC11300zs1
    public final b b;
    @InterfaceC11300zs1
    public final e c;
    public boolean d;
    @InterfaceC11300zs1
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f756o;
    public long p;
    public long q;

    @ES1(30)
    /* renamed from: o.hG2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @K40
        public static void a(Surface surface, float f) {
            int i;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = 1;
            }
            try {
                surface.setFrameRate(f, i);
            } catch (IllegalStateException e) {
                I31.e(C6755hG2.r, "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* renamed from: o.hG2$b */
    /* loaded from: classes2.dex */
    public interface b {

        /* renamed from: o.hG2$b$a */
        /* loaded from: classes2.dex */
        public interface a {
            void a(@InterfaceC11300zs1 Display display);
        }

        void a();

        void b(a aVar);
    }

    /* renamed from: o.hG2$e */
    /* loaded from: classes2.dex */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {
        public static final int a1 = 0;
        public static final int b1 = 1;
        public static final int c1 = 2;
        public static final e d1 = new e();
        public volatile long X = C10323vs.b;
        public final Handler Y;
        public Choreographer Y0;
        public final HandlerThread Z;
        public int Z0;

        public e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.Z = handlerThread;
            handlerThread.start();
            Handler B = TD2.B(handlerThread.getLooper(), this);
            this.Y = B;
            B.sendEmptyMessage(0);
        }

        public static e d() {
            return d1;
        }

        public void a() {
            this.Y.sendEmptyMessage(1);
        }

        public final void b() {
            Choreographer choreographer = this.Y0;
            if (choreographer != null) {
                int i = this.Z0 + 1;
                this.Z0 = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public final void c() {
            try {
                this.Y0 = Choreographer.getInstance();
            } catch (RuntimeException e) {
                I31.o(C6755hG2.r, "Vsync sampling disabled due to platform error", e);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.X = j;
            ((Choreographer) C9542sf.g(this.Y0)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.Y.sendEmptyMessage(2);
        }

        public final void f() {
            Choreographer choreographer = this.Y0;
            if (choreographer != null) {
                int i = this.Z0 - 1;
                this.Z0 = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.X = C10323vs.b;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    f();
                    return true;
                }
                b();
                return true;
            }
            c();
            return true;
        }
    }

    public C6755hG2(@InterfaceC11300zs1 Context context) {
        e eVar;
        b f = f(context);
        this.b = f;
        if (f != null) {
            eVar = e.d();
        } else {
            eVar = null;
        }
        this.c = eVar;
        this.k = C10323vs.b;
        this.l = C10323vs.b;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static boolean c(long j, long j2) {
        if (Math.abs(j - j2) <= x) {
            return true;
        }
        return false;
    }

    public static long e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j3 + j5;
            j4 = j5;
            j5 = j6;
        }
        if (j5 - j < j - j4) {
            return j5;
        }
        return j4;
    }

    @InterfaceC11300zs1
    public static b f(@InterfaceC11300zs1 Context context) {
        b bVar = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (TD2.a >= 17) {
                bVar = d.d(applicationContext);
            }
            if (bVar == null) {
                return c.c(applicationContext);
            }
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long b(long j) {
        long j2;
        e eVar;
        long j3;
        if (this.p != -1 && this.a.e()) {
            long a2 = this.q + (((float) (this.a.a() * (this.m - this.p))) / this.i);
            if (c(j, a2)) {
                j2 = a2;
                this.n = this.m;
                this.f756o = j2;
                eVar = this.c;
                if (eVar != null && this.k != C10323vs.b) {
                    j3 = eVar.X;
                    if (j3 != C10323vs.b) {
                        return e(j2, j3, this.k) - this.l;
                    }
                }
                return j2;
            }
            n();
        }
        j2 = j;
        this.n = this.m;
        this.f756o = j2;
        eVar = this.c;
        if (eVar != null) {
            j3 = eVar.X;
            if (j3 != C10323vs.b) {
            }
        }
        return j2;
    }

    public final void d() {
        Surface surface;
        if (TD2.a >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE && this.h != 0.0f) {
            this.h = 0.0f;
            a.a(surface, 0.0f);
        }
    }

    public void g(float f) {
        this.f = f;
        this.a.g();
        q();
    }

    public void h(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.f756o;
        }
        this.m++;
        this.a.f(j * 1000);
        q();
    }

    public void i(float f) {
        this.i = f;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.d = true;
        n();
        if (this.b != null) {
            ((e) C9542sf.g(this.c)).a();
            this.b.b(new b.a() { // from class: o.fG2
                @Override // o.C6755hG2.b.a
                public final void a(Display display) {
                    C6755hG2.this.p(display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.d = false;
        b bVar = this.b;
        if (bVar != null) {
            bVar.a();
            ((e) C9542sf.g(this.c)).e();
        }
        d();
    }

    public void m(@InterfaceC11300zs1 Surface surface) {
        if (surface instanceof C6742hD1) {
            surface = null;
        }
        if (this.e == surface) {
            return;
        }
        d();
        this.e = surface;
        r(true);
    }

    public final void n() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    public void o(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        r(true);
    }

    public final void p(@InterfaceC11300zs1 Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.k = refreshRate;
            this.l = (refreshRate * 80) / 100;
            return;
        }
        I31.n(r, "Unable to query display refresh rate");
        this.k = C10323vs.b;
        this.l = C10323vs.b;
    }

    public final void q() {
        float f;
        float f2;
        if (TD2.a >= 30 && this.e != null) {
            if (this.a.e()) {
                f = this.a.b();
            } else {
                f = this.f;
            }
            float f3 = this.g;
            if (f != f3) {
                int i = (f > (-1.0f) ? 1 : (f == (-1.0f) ? 0 : -1));
                if (i != 0 && f3 != -1.0f) {
                    if (this.a.e() && this.a.d() >= s) {
                        f2 = 0.02f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (Math.abs(f - this.g) < f2) {
                        return;
                    }
                } else if (i == 0 && this.a.c() < 30) {
                    return;
                }
                this.g = f;
                r(false);
            }
        }
    }

    public final void r(boolean z) {
        Surface surface;
        float f;
        if (TD2.a >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE) {
            if (this.d) {
                float f2 = this.g;
                if (f2 != -1.0f) {
                    f = f2 * this.i;
                    if (!z || this.h != f) {
                        this.h = f;
                        a.a(surface, f);
                    }
                    return;
                }
            }
            f = 0.0f;
            if (!z) {
            }
            this.h = f;
            a.a(surface, f);
        }
    }

    /* renamed from: o.hG2$c */
    /* loaded from: classes2.dex */
    public static final class c implements b {
        public final WindowManager a;

        public c(WindowManager windowManager) {
            this.a = windowManager;
        }

        @InterfaceC11300zs1
        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // o.C6755hG2.b
        public void b(b.a aVar) {
            aVar.a(this.a.getDefaultDisplay());
        }

        @Override // o.C6755hG2.b
        public void a() {
        }
    }

    @ES1(17)
    /* renamed from: o.hG2$d */
    /* loaded from: classes2.dex */
    public static final class d implements b, DisplayManager.DisplayListener {
        public final DisplayManager a;
        @InterfaceC11300zs1
        public b.a b;

        public d(DisplayManager displayManager) {
            this.a = displayManager;
        }

        @InterfaceC11300zs1
        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // o.C6755hG2.b
        public void a() {
            this.a.unregisterDisplayListener(this);
            this.b = null;
        }

        @Override // o.C6755hG2.b
        public void b(b.a aVar) {
            this.b = aVar;
            this.a.registerDisplayListener(this, TD2.C());
            aVar.a(c());
        }

        public final Display c() {
            return this.a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            b.a aVar = this.b;
            if (aVar != null && i == 0) {
                aVar.a(c());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }
}
