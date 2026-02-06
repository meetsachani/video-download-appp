package o;

import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import java.util.List;

/* renamed from: o.pV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8774pV1 {
    public static final a e = new a(null);
    public final List<AbstractC3069Gn0> a;
    public final float b;
    public final float c;
    public final List<C6302fS> d;

    /* renamed from: o.pV1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: o.pV1$b */
    /* loaded from: classes.dex */
    public static final class b implements YD1 {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;

        public b(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        @Override // o.YD1
        public final long a(float f, float f2) {
            float f3 = f + this.a;
            float f4 = this.b;
            return C7638kv0.d(f3 / f4, (f2 + this.c) / f4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8774pV1(List<? extends AbstractC3069Gn0> list, float f, float f2) {
        List<C6302fS> list2;
        List<C6302fS> list3;
        C6302fS c6302fS;
        List<C6302fS> a2;
        C6562gT0.p(list, SettingsJsonConstants.d);
        this.a = list;
        this.b = f;
        this.c = f2;
        List i = C7979mF.i();
        int i2 = 0;
        C6302fS c6302fS2 = null;
        if (list.size() > 0 && ((AbstractC3069Gn0) list.get(0)).a().size() == 3) {
            C4180Rx1<C6302fS, C6302fS> r = ((AbstractC3069Gn0) list.get(0)).a().get(1).r(0.5f);
            list3 = C8222nF.S(((AbstractC3069Gn0) list.get(0)).a().get(0), r.a());
            list2 = C8222nF.S(r.b(), ((AbstractC3069Gn0) list.get(0)).a().get(2));
        } else {
            list2 = null;
            list3 = null;
        }
        int size = list.size();
        if (size >= 0) {
            int i3 = 0;
            C6302fS c6302fS3 = null;
            while (true) {
                if (i3 == 0 && list2 != null) {
                    a2 = list2;
                } else if (i3 == this.a.size()) {
                    if (list3 == null) {
                        break;
                    }
                    a2 = list3;
                } else {
                    a2 = this.a.get(i3).a();
                }
                int size2 = a2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    C6302fS c6302fS4 = a2.get(i4);
                    if (!c6302fS4.x()) {
                        if (c6302fS3 != null) {
                            i.add(c6302fS3);
                        }
                        if (c6302fS2 == null) {
                            c6302fS2 = c6302fS4;
                            c6302fS3 = c6302fS2;
                        } else {
                            c6302fS3 = c6302fS4;
                        }
                    } else if (c6302fS3 != null) {
                        c6302fS3.n()[6] = c6302fS4.h();
                        c6302fS3.n()[7] = c6302fS4.i();
                    }
                }
                if (i3 == size) {
                    break;
                }
                i3++;
            }
            c6302fS = c6302fS2;
            c6302fS2 = c6302fS3;
        } else {
            c6302fS = null;
        }
        if (c6302fS2 != null && c6302fS != null) {
            i.add(C6800hS.a(c6302fS2.f(), c6302fS2.g(), c6302fS2.j(), c6302fS2.k(), c6302fS2.l(), c6302fS2.m(), c6302fS.f(), c6302fS.g()));
        }
        List<C6302fS> a3 = C7979mF.a(i);
        this.d = a3;
        C6302fS c6302fS5 = a3.get(a3.size() - 1);
        int size3 = a3.size();
        while (i2 < size3) {
            C6302fS c6302fS6 = this.d.get(i2);
            C6302fS c6302fS7 = c6302fS5;
            if (Math.abs(c6302fS6.f() - c6302fS7.h()) <= 1.0E-4f && Math.abs(c6302fS6.g() - c6302fS7.i()) <= 1.0E-4f) {
                i2++;
                c6302fS5 = c6302fS6;
            } else {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
        }
    }

    public static /* synthetic */ float[] d(C8774pV1 c8774pV1, float[] fArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = new float[4];
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return c8774pV1.c(fArr, z);
    }

    public static /* synthetic */ float[] f(C8774pV1 c8774pV1, float[] fArr, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = new float[4];
        }
        return c8774pV1.e(fArr);
    }

    public final float[] a() {
        return d(this, null, false, 3, null);
    }

    public final float[] b(float[] fArr) {
        C6562gT0.p(fArr, "bounds");
        return d(this, fArr, false, 2, null);
    }

    public final float[] c(float[] fArr, boolean z) {
        C6562gT0.p(fArr, "bounds");
        if (fArr.length >= 4) {
            int size = this.d.size();
            float f = Float.MIN_VALUE;
            float f2 = Float.MAX_VALUE;
            float f3 = Float.MAX_VALUE;
            float f4 = Float.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                this.d.get(i).a(fArr, z);
                f2 = Math.min(f2, fArr[0]);
                f3 = Math.min(f3, fArr[1]);
                f = Math.max(f, fArr[2]);
                f4 = Math.max(f4, fArr[3]);
            }
            fArr[0] = f2;
            fArr[1] = f3;
            fArr[2] = f;
            fArr[3] = f4;
            return fArr;
        }
        throw new IllegalArgumentException("Required bounds size of 4");
    }

    public final float[] e(float[] fArr) {
        C6562gT0.p(fArr, "bounds");
        if (fArr.length >= 4) {
            int size = this.d.size();
            float f = 0.0f;
            for (int i = 0; i < size; i++) {
                C6302fS c6302fS = this.d.get(i);
                float f2 = C5764dE2.f(c6302fS.f() - this.b, c6302fS.g() - this.c);
                long p = c6302fS.p(0.5f);
                f = Math.max(f, Math.max(f2, C5764dE2.f(UD1.j(p) - this.b, UD1.k(p) - this.c)));
            }
            float sqrt = (float) Math.sqrt(f);
            float f3 = this.b;
            fArr[0] = f3 - sqrt;
            float f4 = this.c;
            fArr[1] = f4 - sqrt;
            fArr[2] = f3 + sqrt;
            fArr[3] = f4 + sqrt;
            return fArr;
        }
        throw new IllegalArgumentException("Required bounds size of 4");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8774pV1)) {
            return false;
        }
        return C6562gT0.g(this.a, ((C8774pV1) obj).a);
    }

    public final float g() {
        return this.b;
    }

    public final float h() {
        return this.c;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final List<C6302fS> i() {
        return this.d;
    }

    public final List<AbstractC3069Gn0> j() {
        return this.a;
    }

    public final C8774pV1 k() {
        float[] d = d(this, null, false, 3, null);
        float f = d[2] - d[0];
        float f2 = d[3] - d[1];
        float max = Math.max(f, f2);
        float f3 = 2;
        return l(new b(((max - f) / f3) - d[0], max, ((max - f2) / f3) - d[1]));
    }

    public final C8774pV1 l(YD1 yd1) {
        C6562gT0.p(yd1, "f");
        long q = UD1.q(C7638kv0.d(this.b, this.c), yd1);
        List i = C7979mF.i();
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            i.add(this.a.get(i2).b(yd1));
        }
        return new C8774pV1(C7979mF.a(i), UD1.j(q), UD1.k(q));
    }

    public String toString() {
        return "[RoundedPolygon. Cubics = " + C10662xF.p3(this.d, null, null, null, 0, null, null, 63, null) + " || Features = " + C10662xF.p3(this.a, null, null, null, 0, null, null, 63, null) + " || Center = (" + this.b + C6566gU0.h + this.c + ")]";
    }
}
