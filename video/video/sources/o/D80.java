package o;

import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import o.D80;
import o.X9;

/* loaded from: classes.dex */
public abstract class D80<T extends D80<T>> implements X9.c {
    public static final float B = 1.0f;
    public static final float C = 0.1f;
    public static final float D = 0.00390625f;
    public static final float E = 0.002f;
    public static final float F = Float.MAX_VALUE;
    public static final float G = 0.75f;
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final AbstractC11311zv0 e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList<q> k;
    public final ArrayList<r> l;
    public X9 m;
    public static final s n = new g("translationX");

    /* renamed from: o  reason: collision with root package name */
    public static final s f436o = new h("translationY");
    public static final s p = new i("translationZ");
    public static final s q = new j("scaleX");
    public static final s r = new k("scaleY");
    public static final s s = new l(AbstractC6818hX0.i);
    public static final s t = new m("rotationX");
    public static final s u = new n("rotationY");
    public static final s v = new o("x");
    public static final s w = new a(C5738d80.b);
    public static final s x = new b(W12.r);
    public static final s y = new c("alpha");
    public static final s z = new d("scrollX");
    public static final s A = new e("scrollY");

    /* loaded from: classes.dex */
    public class a extends s {
        public a(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return view.getY();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            view.setY(f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends s {
        public b(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return C6516gH2.K0(view);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            C6516gH2.L2(view, f);
        }
    }

    /* loaded from: classes.dex */
    public class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return view.getAlpha();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* loaded from: classes.dex */
    public class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return view.getScrollX();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* loaded from: classes.dex */
    public class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return view.getScrollY();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* loaded from: classes.dex */
    public class f extends AbstractC11311zv0 {
        public final /* synthetic */ C3100Gv0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, C3100Gv0 c3100Gv0) {
            super(str);
            this.b = c3100Gv0;
        }

        @Override // o.AbstractC11311zv0
        public float b(Object obj) {
            return this.b.a();
        }

        @Override // o.AbstractC11311zv0
        public void c(Object obj, float f) {
            this.b.b(f);
        }
    }

    /* loaded from: classes.dex */
    public class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return view.getTranslationX();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* loaded from: classes.dex */
    public class h extends s {
        public h(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return view.getTranslationY();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* loaded from: classes.dex */
    public class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return C6516gH2.F0(view);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            C6516gH2.H2(view, f);
        }
    }

    /* loaded from: classes.dex */
    public class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return view.getScaleX();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* loaded from: classes.dex */
    public class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return view.getScaleY();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* loaded from: classes.dex */
    public class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return view.getRotation();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            view.setRotation(f);
        }
    }

    /* loaded from: classes.dex */
    public class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return view.getRotationX();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* loaded from: classes.dex */
    public class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return view.getRotationY();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* loaded from: classes.dex */
    public class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(View view) {
            return view.getX();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(View view, float f) {
            view.setX(f);
        }
    }

    /* loaded from: classes.dex */
    public static class p {
        public float a;
        public float b;
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(D80 d80, boolean z, float f, float f2);
    }

    /* loaded from: classes.dex */
    public interface r {
        void q(D80 d80, float f, float f2);
    }

    /* loaded from: classes.dex */
    public static abstract class s extends AbstractC11311zv0<View> {
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        public s(String str) {
            super(str);
        }
    }

    public D80(C3100Gv0 c3100Gv0) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -Float.MAX_VALUE;
        this.i = 0L;
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.d = null;
        this.e = new f("FloatValueHolder", c3100Gv0);
        this.j = 1.0f;
    }

    public static <T> void o(ArrayList<T> arrayList, T t2) {
        int indexOf = arrayList.indexOf(t2);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    public static <T> void p(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void A() {
        if (!this.f) {
            this.f = true;
            if (!this.c) {
                this.b = i();
            }
            float f2 = this.b;
            if (f2 <= this.g && f2 >= this.h) {
                g().d(this, 0L);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
    }

    public abstract boolean B(long j2);

    @Override // o.X9.c
    public boolean a(long j2) {
        long j3;
        long j4 = this.i;
        if (j4 == 0) {
            this.i = j2;
            u(this.b);
            return false;
        }
        long j5 = j2 - j4;
        this.i = j2;
        float g2 = g().g();
        if (g2 == 0.0f) {
            j3 = 2147483647L;
        } else {
            j3 = ((float) j5) / g2;
        }
        boolean B2 = B(j3);
        float min = Math.min(this.b, this.g);
        this.b = min;
        float max = Math.max(min, this.h);
        this.b = max;
        u(max);
        if (B2) {
            e(false);
        }
        return B2;
    }

    public T b(q qVar) {
        if (!this.k.contains(qVar)) {
            this.k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (!m()) {
            if (!this.l.contains(rVar)) {
                this.l.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public void d() {
        if (g().k()) {
            if (this.f) {
                e(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
    }

    public final void e(boolean z2) {
        this.f = false;
        g().l(this);
        this.i = 0L;
        this.c = false;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (this.k.get(i2) != null) {
                this.k.get(i2).a(this, z2, this.b, this.a);
            }
        }
        p(this.k);
    }

    public abstract float f(float f2, float f3);

    public X9 g() {
        X9 x9 = this.m;
        if (x9 != null) {
            return x9;
        }
        return X9.h();
    }

    public float h() {
        return this.j;
    }

    public final float i() {
        return this.e.b(this.d);
    }

    public InterfaceC3991Pz0 j() {
        X9 x9 = this.m;
        if (x9 != null) {
            return x9.i();
        }
        return X9.h().i();
    }

    public float k() {
        return this.j * 0.75f;
    }

    public abstract boolean l(float f2, float f3);

    public boolean m() {
        return this.f;
    }

    public void n(q qVar) {
        o(this.k, qVar);
    }

    public void q(r rVar) {
        o(this.l, rVar);
    }

    public T r(float f2) {
        this.g = f2;
        return this;
    }

    public T s(float f2) {
        this.h = f2;
        return this;
    }

    public T t(float f2) {
        if (f2 > 0.0f) {
            this.j = f2;
            y(f2 * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public void u(float f2) {
        this.e.c(this.d, f2);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (this.l.get(i2) != null) {
                this.l.get(i2).q(this, this.b, this.a);
            }
        }
        p(this.l);
    }

    public void v(InterfaceC3991Pz0 interfaceC3991Pz0) {
        X9 x9 = this.m;
        if (x9 != null && x9.i() == interfaceC3991Pz0) {
            return;
        }
        if (!this.f) {
            this.m = new X9(interfaceC3991Pz0);
            return;
        }
        throw new AndroidRuntimeException("Animations are still running and the animationhandler should not be set at this timming");
    }

    public T w(float f2) {
        this.b = f2;
        this.c = true;
        return this;
    }

    public T x(float f2) {
        this.a = f2;
        return this;
    }

    public abstract void y(float f2);

    public void z() {
        if (g().k()) {
            if (!this.f) {
                A();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
    }

    public <K> D80(K k2, AbstractC11311zv0<K> abstractC11311zv0) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -Float.MAX_VALUE;
        this.i = 0L;
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.d = k2;
        this.e = abstractC11311zv0;
        if (abstractC11311zv0 != s && abstractC11311zv0 != t && abstractC11311zv0 != u) {
            if (abstractC11311zv0 == y) {
                this.j = 0.00390625f;
                return;
            } else if (abstractC11311zv0 != q && abstractC11311zv0 != r) {
                this.j = 1.0f;
                return;
            } else {
                this.j = 0.002f;
                return;
            }
        }
        this.j = 0.1f;
    }
}
