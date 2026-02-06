package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: o.sl1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9568sl1 {
    public long a;
    public long b;
    @InterfaceC11300zs1
    public TimeInterpolator c;
    public int d;
    public int e;

    public C9568sl1(long j, long j2) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
    }

    @InterfaceC5670cr1
    public static C9568sl1 b(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
        C9568sl1 c9568sl1 = new C9568sl1(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        c9568sl1.d = valueAnimator.getRepeatCount();
        c9568sl1.e = valueAnimator.getRepeatMode();
        return c9568sl1;
    }

    public void a(@InterfaceC5670cr1 Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(f());
            valueAnimator.setRepeatMode(g());
        }
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    @InterfaceC11300zs1
    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return C5600ca.b;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9568sl1)) {
            return false;
        }
        C9568sl1 c9568sl1 = (C9568sl1) obj;
        if (c() != c9568sl1.c() || d() != c9568sl1.d() || f() != c9568sl1.f() || g() != c9568sl1.g()) {
            return false;
        }
        return e().getClass().equals(c9568sl1.e().getClass());
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    @InterfaceC5670cr1
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public C9568sl1(long j, long j2, @InterfaceC5670cr1 TimeInterpolator timeInterpolator) {
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }
}
