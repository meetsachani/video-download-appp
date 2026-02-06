package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.tJ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9705tJ1 {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 2;
    public static final int i = 3;
    public final b a;
    public final b b;
    public final int c;
    public final boolean d;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.tJ1$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* renamed from: o.tJ1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final c[] a;

        public b(c... cVarArr) {
            this.a = cVarArr;
        }

        public c a(int i) {
            return this.a[i];
        }

        public int b() {
            return this.a.length;
        }
    }

    /* renamed from: o.tJ1$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public static final int e = 0;
        public final int a;
        public final int b;
        public final float[] c;
        public final float[] d;

        public c(int i, float[] fArr, float[] fArr2, int i2) {
            boolean z;
            this.a = i;
            if (fArr.length * 2 == fArr2.length * 3) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.c = fArr;
            this.d = fArr2;
            this.b = i2;
        }

        public int a() {
            return this.c.length / 3;
        }
    }

    public C9705tJ1(b bVar, int i2) {
        this(bVar, bVar, i2);
    }

    public static C9705tJ1 a(float f2, int i2, int i3, float f3, float f4, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        float f5;
        int i5;
        int i6 = i2;
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        if (i6 >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.a(z2);
        if (i3 >= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C9542sf.a(z3);
        if (f3 > 0.0f && f3 <= 180.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        C9542sf.a(z4);
        if (f4 > 0.0f && f4 <= 360.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        C9542sf.a(z5);
        float radians = (float) Math.toRadians(f3);
        float radians2 = (float) Math.toRadians(f4);
        float f6 = radians / i6;
        float f7 = radians2 / i3;
        int i7 = i3 + 1;
        int i8 = ((i7 * 2) + 2) * i6;
        float[] fArr = new float[i8 * 3];
        float[] fArr2 = new float[i8 * 2];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < i6) {
            float f8 = radians / 2.0f;
            float f9 = (i9 * f6) - f8;
            int i12 = i9 + 1;
            float f10 = (i12 * f6) - f8;
            int i13 = 0;
            while (i13 < i7) {
                float f11 = radians;
                float f12 = radians2;
                int i14 = 0;
                int i15 = 2;
                while (i14 < i15) {
                    if (i14 == 0) {
                        f5 = f9;
                    } else {
                        f5 = f10;
                    }
                    float f13 = f6;
                    float f14 = i13 * f7;
                    float f15 = f7;
                    float f16 = f9;
                    double d = f2;
                    double d2 = (f14 + 3.1415927f) - (f12 / 2.0f);
                    double d3 = f5;
                    fArr[i10] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                    fArr[i10 + 1] = (float) (d * Math.sin(d3));
                    int i16 = i10 + 3;
                    fArr[i10 + 2] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    fArr2[i11] = f14 / f12;
                    int i17 = i11 + 2;
                    fArr2[i11 + 1] = ((i9 + i14) * f13) / f11;
                    if ((i13 == 0 && i14 == 0) || (i13 == i3 && i14 == 1)) {
                        System.arraycopy(fArr, i10, fArr, i16, 3);
                        i10 += 6;
                        i5 = 2;
                        System.arraycopy(fArr2, i11, fArr2, i17, 2);
                        i11 += 4;
                    } else {
                        i5 = 2;
                        i10 = i16;
                        i11 = i17;
                    }
                    i14++;
                    i15 = i5;
                    f6 = f13;
                    f7 = f15;
                    f9 = f16;
                }
                i13++;
                radians2 = f12;
                radians = f11;
                f6 = f6;
            }
            i6 = i2;
            i9 = i12;
        }
        return new C9705tJ1(new b(new c(0, fArr, fArr2, 1)), i4);
    }

    public static C9705tJ1 b(int i2) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i2);
    }

    public C9705tJ1(b bVar, b bVar2, int i2) {
        this.a = bVar;
        this.b = bVar2;
        this.c = i2;
        this.d = bVar == bVar2;
    }
}
