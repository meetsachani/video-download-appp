package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.facebook.shimmer.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C6516gH2;
import o.InterfaceC2501Av0;
import o.JF;
import o.PK1;

/* loaded from: classes2.dex */
public class c {
    public static final int v = 4;
    public final float[] a = new float[4];
    public final int[] b = new int[4];
    public final RectF c = new RectF();
    public int d = 0;
    @JF
    public int e = -1;
    @JF
    public int f = 1291845631;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public float j = 1.0f;
    public float k = 1.0f;
    public float l = 0.0f;
    public float m = 0.5f;
    public float n = 20.0f;

    /* renamed from: o  reason: collision with root package name */
    public boolean f159o = true;
    public boolean p = true;
    public boolean q = true;
    public int r = -1;
    public int s = 1;
    public long t = 1000;
    public long u;

    /* loaded from: classes2.dex */
    public static class a extends b<a> {
        public a() {
            this.a.q = true;
        }

        @Override // com.facebook.shimmer.c.b
        /* renamed from: x */
        public a f() {
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b<T extends b<T>> {
        public final c a = new c();

        public static float b(float f, float f2, float f3) {
            return Math.min(f2, Math.max(f, f3));
        }

        public c a() {
            this.a.c();
            this.a.d();
            return this.a;
        }

        public T c(Context context, AttributeSet attributeSet) {
            return d(context.obtainStyledAttributes(attributeSet, b.c.a, 0, 0));
        }

        public T d(TypedArray typedArray) {
            int i = b.c.e;
            if (typedArray.hasValue(i)) {
                i(typedArray.getBoolean(i, this.a.f159o));
            }
            int i2 = b.c.b;
            if (typedArray.hasValue(i2)) {
                g(typedArray.getBoolean(i2, this.a.p));
            }
            int i3 = b.c.c;
            if (typedArray.hasValue(i3)) {
                h(typedArray.getFloat(i3, 0.3f));
            }
            int i4 = b.c.m;
            if (typedArray.hasValue(i4)) {
                p(typedArray.getFloat(i4, 1.0f));
            }
            int i5 = b.c.i;
            if (typedArray.hasValue(i5)) {
                l(typedArray.getInt(i5, (int) this.a.t));
            }
            int i6 = b.c.p;
            if (typedArray.hasValue(i6)) {
                r(typedArray.getInt(i6, this.a.r));
            }
            int i7 = b.c.q;
            if (typedArray.hasValue(i7)) {
                s(typedArray.getInt(i7, (int) this.a.u));
            }
            int i8 = b.c.r;
            if (typedArray.hasValue(i8)) {
                t(typedArray.getInt(i8, this.a.s));
            }
            int i9 = b.c.g;
            if (typedArray.hasValue(i9)) {
                int i10 = typedArray.getInt(i9, this.a.d);
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            j(0);
                        } else {
                            j(3);
                        }
                    } else {
                        j(2);
                    }
                } else {
                    j(1);
                }
            }
            int i11 = b.c.s;
            if (typedArray.hasValue(i11)) {
                if (typedArray.getInt(i11, this.a.g) != 1) {
                    u(0);
                } else {
                    u(1);
                }
            }
            int i12 = b.c.h;
            if (typedArray.hasValue(i12)) {
                k(typedArray.getFloat(i12, this.a.m));
            }
            int i13 = b.c.k;
            if (typedArray.hasValue(i13)) {
                n(typedArray.getDimensionPixelSize(i13, this.a.h));
            }
            int i14 = b.c.j;
            if (typedArray.hasValue(i14)) {
                m(typedArray.getDimensionPixelSize(i14, this.a.i));
            }
            int i15 = b.c.f158o;
            if (typedArray.hasValue(i15)) {
                q(typedArray.getFloat(i15, this.a.l));
            }
            int i16 = b.c.u;
            if (typedArray.hasValue(i16)) {
                w(typedArray.getFloat(i16, this.a.j));
            }
            int i17 = b.c.l;
            if (typedArray.hasValue(i17)) {
                o(typedArray.getFloat(i17, this.a.k));
            }
            int i18 = b.c.t;
            if (typedArray.hasValue(i18)) {
                v(typedArray.getFloat(i18, this.a.n));
            }
            return f();
        }

        public T e(c cVar) {
            j(cVar.d);
            u(cVar.g);
            n(cVar.h);
            m(cVar.i);
            w(cVar.j);
            o(cVar.k);
            q(cVar.l);
            k(cVar.m);
            v(cVar.n);
            i(cVar.f159o);
            g(cVar.p);
            r(cVar.r);
            t(cVar.s);
            s(cVar.u);
            l(cVar.t);
            c cVar2 = this.a;
            cVar2.f = cVar.f;
            cVar2.e = cVar.e;
            return f();
        }

        public abstract T f();

        public T g(boolean z) {
            this.a.p = z;
            return f();
        }

        public T h(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
            c cVar = this.a;
            cVar.f = (((int) (b(0.0f, 1.0f, f) * 255.0f)) << 24) | (cVar.f & C6516gH2.x);
            return f();
        }

        public T i(boolean z) {
            this.a.f159o = z;
            return f();
        }

        public T j(int i) {
            this.a.d = i;
            return f();
        }

        public T k(float f) {
            if (f >= 0.0f) {
                this.a.m = f;
                return f();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f);
        }

        public T l(long j) {
            if (j >= 0) {
                this.a.t = j;
                return f();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j);
        }

        public T m(@PK1 int i) {
            if (i >= 0) {
                this.a.i = i;
                return f();
            }
            throw new IllegalArgumentException("Given invalid height: " + i);
        }

        public T n(@PK1 int i) {
            if (i >= 0) {
                this.a.h = i;
                return f();
            }
            throw new IllegalArgumentException("Given invalid width: " + i);
        }

        public T o(float f) {
            if (f >= 0.0f) {
                this.a.k = f;
                return f();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f);
        }

        public T p(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
            c cVar = this.a;
            cVar.e = (((int) (b(0.0f, 1.0f, f) * 255.0f)) << 24) | (cVar.e & C6516gH2.x);
            return f();
        }

        public T q(float f) {
            if (f >= 0.0f) {
                this.a.l = f;
                return f();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }

        public T r(int i) {
            this.a.r = i;
            return f();
        }

        public T s(long j) {
            if (j >= 0) {
                this.a.u = j;
                return f();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j);
        }

        public T t(int i) {
            this.a.s = i;
            return f();
        }

        public T u(int i) {
            this.a.g = i;
            return f();
        }

        public T v(float f) {
            this.a.n = f;
            return f();
        }

        public T w(float f) {
            if (f >= 0.0f) {
                this.a.j = f;
                return f();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f);
        }
    }

    /* renamed from: com.facebook.shimmer.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0091c extends b<C0091c> {
        public C0091c() {
            this.a.q = false;
        }

        public C0091c A(@JF int i) {
            this.a.e = i;
            return f();
        }

        @Override // com.facebook.shimmer.c.b
        /* renamed from: x */
        public C0091c d(TypedArray typedArray) {
            super.d(typedArray);
            int i = b.c.d;
            if (typedArray.hasValue(i)) {
                z(typedArray.getColor(i, this.a.f));
            }
            int i2 = b.c.n;
            if (typedArray.hasValue(i2)) {
                A(typedArray.getColor(i2, this.a.e));
            }
            return f();
        }

        @Override // com.facebook.shimmer.c.b
        /* renamed from: y */
        public C0091c f() {
            return this;
        }

        public C0091c z(@JF int i) {
            c cVar = this.a;
            cVar.f = (i & C6516gH2.x) | (cVar.f & (-16777216));
            return f();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface d {
        public static final int j = 0;
        public static final int k = 1;
        public static final int l = 2;
        public static final int m = 3;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface e {
        public static final int n = 0;

        /* renamed from: o  reason: collision with root package name */
        public static final int f160o = 1;
    }

    public int a(int i) {
        int i2 = this.i;
        if (i2 > 0) {
            return i2;
        }
        return Math.round(this.k * i);
    }

    public void b(int i, int i2) {
        int round;
        double max = Math.max(i, i2);
        float f = -(Math.round(((float) ((max / Math.sin(1.5707963267948966d - Math.toRadians(this.n % 90.0f))) - max)) / 2.0f) * 3);
        this.c.set(f, f, e(i) + round, a(i2) + round);
    }

    public void c() {
        if (this.g != 1) {
            int[] iArr = this.b;
            int i = this.f;
            iArr[0] = i;
            int i2 = this.e;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.b;
        int i3 = this.e;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.f;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    public void d() {
        if (this.g != 1) {
            this.a[0] = Math.max(((1.0f - this.l) - this.m) / 2.0f, 0.0f);
            this.a[1] = Math.max(((1.0f - this.l) - 0.001f) / 2.0f, 0.0f);
            this.a[2] = Math.min(((this.l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.a[3] = Math.min(((this.l + 1.0f) + this.m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.l, 1.0f);
        this.a[2] = Math.min(this.l + this.m, 1.0f);
        this.a[3] = 1.0f;
    }

    public int e(int i) {
        int i2 = this.h;
        if (i2 > 0) {
            return i2;
        }
        return Math.round(this.j * i);
    }
}
