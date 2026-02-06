package o;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import o.X9;

/* loaded from: classes.dex */
public class X9 {
    public static final ThreadLocal<X9> j = new ThreadLocal<>();
    public InterfaceC3991Pz0 e;
    public e i;
    public final C9654t62<c, Long> a = new C9654t62<>();
    public final ArrayList<c> b = new ArrayList<>();
    public final b c = new b();
    public final Runnable d = new Runnable() { // from class: o.W9
        @Override // java.lang.Runnable
        public final void run() {
            X9.a(X9.this);
        }
    };
    public long f = 0;
    public boolean g = false;
    public float h = 1.0f;

    /* loaded from: classes.dex */
    public class b {
        public b() {
            X9.this = r1;
        }

        public void a() {
            X9.this.f = SystemClock.uptimeMillis();
            X9 x9 = X9.this;
            x9.f(x9.f);
            if (X9.this.b.size() > 0) {
                X9.this.e.a(X9.this.d);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(long j);
    }

    /* loaded from: classes.dex */
    public class d implements e {
        public ValueAnimator.DurationScaleChangeListener a;

        public d() {
            X9.this = r1;
        }

        public static /* synthetic */ void c(d dVar, float f) {
            X9.this.h = f;
        }

        @Override // o.X9.e
        public boolean a() {
            boolean unregisterDurationScaleChangeListener;
            unregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.a);
            this.a = null;
            return unregisterDurationScaleChangeListener;
        }

        @Override // o.X9.e
        public boolean b() {
            boolean registerDurationScaleChangeListener;
            if (this.a == null) {
                ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: o.aa
                    public final void onChanged(float f) {
                        X9.d.c(X9.d.this, f);
                    }
                };
                this.a = durationScaleChangeListener;
                registerDurationScaleChangeListener = ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
                return registerDurationScaleChangeListener;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static final class f implements InterfaceC3991Pz0 {
        public final Choreographer a = Choreographer.getInstance();
        public final Looper b = Looper.myLooper();

        public static /* synthetic */ void c(Runnable runnable, long j) {
            runnable.run();
        }

        @Override // o.InterfaceC3991Pz0
        public void a(final Runnable runnable) {
            this.a.postFrameCallback(new Choreographer.FrameCallback() { // from class: o.ba
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    X9.f.c(runnable, j);
                }
            });
        }

        @Override // o.InterfaceC3991Pz0
        public boolean b() {
            if (Thread.currentThread() == this.b.getThread()) {
                return true;
            }
            return false;
        }
    }

    public X9(InterfaceC3991Pz0 interfaceC3991Pz0) {
        this.e = interfaceC3991Pz0;
    }

    public static /* synthetic */ void a(X9 x9) {
        x9.c.a();
    }

    public static X9 h() {
        ThreadLocal<X9> threadLocal = j;
        if (threadLocal.get() == null) {
            threadLocal.set(new X9(new f()));
        }
        return threadLocal.get();
    }

    public void d(c cVar, long j2) {
        float durationScale;
        if (this.b.size() == 0) {
            this.e.a(this.d);
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                this.h = durationScale;
                if (this.i == null) {
                    this.i = new d();
                }
                this.i.b();
            }
        }
        if (!this.b.contains(cVar)) {
            this.b.add(cVar);
        }
        if (j2 > 0) {
            this.a.put(cVar, Long.valueOf(SystemClock.uptimeMillis() + j2));
        }
    }

    public final void e() {
        if (this.g) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size) == null) {
                    this.b.remove(size);
                }
            }
            if (this.b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.i.a();
            }
            this.g = false;
        }
    }

    public void f(long j2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.b.size(); i++) {
            c cVar = this.b.get(i);
            if (cVar != null && j(cVar, uptimeMillis)) {
                cVar.a(j2);
            }
        }
        e();
    }

    public float g() {
        return this.h;
    }

    public InterfaceC3991Pz0 i() {
        return this.e;
    }

    public final boolean j(c cVar, long j2) {
        Long l = this.a.get(cVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() < j2) {
            this.a.remove(cVar);
            return true;
        }
        return false;
    }

    public boolean k() {
        return this.e.b();
    }

    public void l(c cVar) {
        this.a.remove(cVar);
        int indexOf = this.b.indexOf(cVar);
        if (indexOf >= 0) {
            this.b.set(indexOf, null);
            this.g = true;
        }
    }
}
