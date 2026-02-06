package o;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ll  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7840ll<K, A> {
    public final d<K> c;
    public O61<A> e;
    public final List<b> a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public A f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    /* renamed from: o.ll$b */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* renamed from: o.ll$c */
    /* loaded from: classes.dex */
    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // o.AbstractC7840ll.d
        public boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // o.AbstractC7840ll.d
        public LX0<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // o.AbstractC7840ll.d
        public boolean c(float f) {
            return false;
        }

        @Override // o.AbstractC7840ll.d
        public float d() {
            return 0.0f;
        }

        @Override // o.AbstractC7840ll.d
        public float e() {
            return 1.0f;
        }

        @Override // o.AbstractC7840ll.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: o.ll$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        boolean a(float f);

        LX0<T> b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    /* renamed from: o.ll$e */
    /* loaded from: classes.dex */
    public static final class e<T> implements d<T> {
        public final List<? extends LX0<T>> a;
        public LX0<T> c = null;
        public float d = -1.0f;
        public LX0<T> b = f(0.0f);

        public e(List<? extends LX0<T>> list) {
            this.a = list;
        }

        @Override // o.AbstractC7840ll.d
        public boolean a(float f) {
            LX0<T> lx0 = this.c;
            LX0<T> lx02 = this.b;
            if (lx0 == lx02 && this.d == f) {
                return true;
            }
            this.c = lx02;
            this.d = f;
            return false;
        }

        @Override // o.AbstractC7840ll.d
        public LX0<T> b() {
            return this.b;
        }

        @Override // o.AbstractC7840ll.d
        public boolean c(float f) {
            if (this.b.a(f)) {
                return !this.b.i();
            }
            this.b = f(f);
            return true;
        }

        @Override // o.AbstractC7840ll.d
        public float d() {
            return this.a.get(0).f();
        }

        @Override // o.AbstractC7840ll.d
        public float e() {
            List<? extends LX0<T>> list = this.a;
            return list.get(list.size() - 1).c();
        }

        public final LX0<T> f(float f) {
            List<? extends LX0<T>> list = this.a;
            LX0<T> lx0 = list.get(list.size() - 1);
            if (f >= lx0.f()) {
                return lx0;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                LX0<T> lx02 = this.a.get(size);
                if (this.b != lx02 && lx02.a(f)) {
                    return lx02;
                }
            }
            return this.a.get(0);
        }

        @Override // o.AbstractC7840ll.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: o.ll$f */
    /* loaded from: classes.dex */
    public static final class f<T> implements d<T> {
        public final LX0<T> a;
        public float b = -1.0f;

        public f(List<? extends LX0<T>> list) {
            this.a = list.get(0);
        }

        @Override // o.AbstractC7840ll.d
        public boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // o.AbstractC7840ll.d
        public LX0<T> b() {
            return this.a;
        }

        @Override // o.AbstractC7840ll.d
        public boolean c(float f) {
            return !this.a.i();
        }

        @Override // o.AbstractC7840ll.d
        public float d() {
            return this.a.f();
        }

        @Override // o.AbstractC7840ll.d
        public float e() {
            return this.a.c();
        }

        @Override // o.AbstractC7840ll.d
        public boolean isEmpty() {
            return false;
        }
    }

    public AbstractC7840ll(List<? extends LX0<K>> list) {
        this.c = q(list);
    }

    public static <T> d<T> q(List<? extends LX0<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    public LX0<K> b() {
        if (ZX0.h()) {
            ZX0.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        LX0<K> b2 = this.c.b();
        if (ZX0.h()) {
            ZX0.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return b2;
    }

    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.e();
        }
        return this.h;
    }

    public float d() {
        Interpolator interpolator;
        LX0<K> b2 = b();
        if (b2 != null && !b2.i() && (interpolator = b2.d) != null) {
            return interpolator.getInterpolation(e());
        }
        return 0.0f;
    }

    public float e() {
        if (this.b) {
            return 0.0f;
        }
        LX0<K> b2 = b();
        if (b2.i()) {
            return 0.0f;
        }
        return (this.d - b2.f()) / (b2.c() - b2.f());
    }

    public float f() {
        return this.d;
    }

    public final float g() {
        if (this.g == -1.0f) {
            this.g = this.c.d();
        }
        return this.g;
    }

    public A h() {
        A i;
        float e2 = e();
        if (this.e == null && this.c.a(e2) && !p()) {
            return this.f;
        }
        LX0<K> b2 = b();
        Interpolator interpolator = b2.e;
        if (interpolator != null && b2.f != null) {
            i = j(b2, e2, interpolator.getInterpolation(e2), b2.f.getInterpolation(e2));
        } else {
            i = i(b2, d());
        }
        this.f = i;
        return i;
    }

    public abstract A i(LX0<K> lx0, float f2);

    public A j(LX0<K> lx0, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public void l() {
        if (ZX0.h()) {
            ZX0.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
        if (ZX0.h()) {
            ZX0.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.b = true;
    }

    public void n(float f2) {
        if (ZX0.h()) {
            ZX0.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.c.isEmpty()) {
            if (ZX0.h()) {
                ZX0.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f2 < g()) {
            f2 = g();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 == this.d) {
            if (ZX0.h()) {
                ZX0.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        this.d = f2;
        if (this.c.c(f2)) {
            l();
        }
        if (ZX0.h()) {
            ZX0.c("BaseKeyframeAnimation#setProgress");
        }
    }

    public void o(O61<A> o61) {
        O61<A> o612 = this.e;
        if (o612 != null) {
            o612.c(null);
        }
        this.e = o61;
        if (o61 != null) {
            o61.c(this);
        }
    }

    public boolean p() {
        return false;
    }
}
