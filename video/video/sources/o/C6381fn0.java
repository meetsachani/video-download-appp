package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: o.fn0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6381fn0 {
    public final ViewPager2 a;
    public final androidx.viewpager2.widget.e b;
    public final RecyclerView c;
    public VelocityTracker d;
    public int e;
    public float f;
    public int g;
    public long h;

    public C6381fn0(ViewPager2 viewPager2, androidx.viewpager2.widget.e eVar, RecyclerView recyclerView) {
        this.a = viewPager2;
        this.b = eVar;
        this.c = recyclerView;
    }

    public final void a(long j, int i, float f, float f2) {
        MotionEvent obtain = MotionEvent.obtain(this.h, j, i, f, f2, 0);
        this.d.addMovement(obtain);
        obtain.recycle();
    }

    public boolean b() {
        if (this.b.i()) {
            return false;
        }
        this.g = 0;
        this.f = 0;
        this.h = SystemClock.uptimeMillis();
        c();
        this.b.m();
        if (!this.b.k()) {
            this.c.Z1();
        }
        a(this.h, 0, 0.0f, 0.0f);
        return true;
    }

    public final void c() {
        VelocityTracker velocityTracker = this.d;
        if (velocityTracker == null) {
            this.d = VelocityTracker.obtain();
            this.e = ViewConfiguration.get(this.a.getContext()).getScaledMaximumFlingVelocity();
            return;
        }
        velocityTracker.clear();
    }

    public boolean d() {
        if (!this.b.j()) {
            return false;
        }
        this.b.o();
        VelocityTracker velocityTracker = this.d;
        velocityTracker.computeCurrentVelocity(1000, this.e);
        if (!this.c.p0((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            this.a.v();
            return true;
        }
        return true;
    }

    public boolean e(float f) {
        boolean z;
        int i;
        float f2;
        int i2 = 0;
        if (!this.b.j()) {
            return false;
        }
        float f3 = this.f - f;
        this.f = f3;
        int round = Math.round(f3 - this.g);
        this.g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.a.getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = round;
        } else {
            i = 0;
        }
        if (!z) {
            i2 = round;
        }
        float f4 = 0.0f;
        if (z) {
            f2 = this.f;
        } else {
            f2 = 0.0f;
        }
        if (!z) {
            f4 = this.f;
        }
        float f5 = f4;
        this.c.scrollBy(i, i2);
        a(uptimeMillis, 2, f2, f5);
        return true;
    }

    public boolean f() {
        return this.b.j();
    }
}
