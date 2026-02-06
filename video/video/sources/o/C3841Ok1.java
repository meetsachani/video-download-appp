package o;

import java.util.ArrayList;
import java.util.List;
import o.C3422Kd1;

/* renamed from: o.Ok1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3841Ok1 {
    public static final a d = new a(null);
    public final C8774pV1 a;
    public final C8774pV1 b;
    public final List<C4180Rx1<C6302fS, C6302fS>> c;

    /* renamed from: o.Ok1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final List<C4180Rx1<C6302fS, C6302fS>> a(C8774pV1 c8774pV1, C8774pV1 c8774pV12) {
            float c;
            float b;
            C4180Rx1<C3422Kd1.b, C3422Kd1.b> a;
            C4180Rx1<C3422Kd1.b, C3422Kd1.b> a2;
            C6562gT0.p(c8774pV1, "p1");
            C6562gT0.p(c8774pV12, "p2");
            C3422Kd1.a aVar = C3422Kd1.a1;
            C3422Kd1 a3 = aVar.a(new C7955m9(c8774pV1.g(), c8774pV1.h()), c8774pV1);
            C3422Kd1 a4 = aVar.a(new C7955m9(c8774pV12.g(), c8774pV12.h()), c8774pV12);
            C6952i50 c2 = C3265In0.c(a3.l(), a4.l());
            float a5 = c2.a(0.0f);
            C3938Pk1.a();
            C3422Kd1 j = a4.j(a5);
            ArrayList arrayList = new ArrayList();
            C3422Kd1.b bVar = (C3422Kd1.b) C10662xF.Z2(a3, 0);
            C3422Kd1.b bVar2 = (C3422Kd1.b) C10662xF.Z2(j, 0);
            int i = 1;
            int i2 = 1;
            while (bVar != null && bVar2 != null) {
                if (i == a3.size()) {
                    c = 1.0f;
                } else {
                    c = bVar.c();
                }
                if (i2 == j.size()) {
                    b = 1.0f;
                } else {
                    b = c2.b(C5764dE2.m(bVar2.c() + a5, 1.0f));
                }
                float min = Math.min(c, b);
                C3938Pk1.a();
                float f = 1.0E-6f + min;
                if (c > f) {
                    C3938Pk1.a();
                    a = bVar.a(min);
                } else {
                    a = C6670gv2.a(bVar, C10662xF.Z2(a3, i));
                    i++;
                }
                C3422Kd1.b a6 = a.a();
                bVar = a.b();
                if (b > f) {
                    C3938Pk1.a();
                    a2 = bVar2.a(C5764dE2.m(c2.a(min) - a5, 1.0f));
                } else {
                    a2 = C6670gv2.a(bVar2, C10662xF.Z2(j, i2));
                    i2++;
                }
                bVar2 = a2.b();
                C3938Pk1.a();
                arrayList.add(C6670gv2.a(a6.b(), a2.a().b()));
            }
            if (bVar == null && bVar2 == null) {
                return arrayList;
            }
            throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
        }

        public a() {
        }
    }

    public C3841Ok1(C8774pV1 c8774pV1, C8774pV1 c8774pV12) {
        C6562gT0.p(c8774pV1, "start");
        C6562gT0.p(c8774pV12, "end");
        this.a = c8774pV1;
        this.b = c8774pV12;
        this.c = d.a(c8774pV1, c8774pV12);
    }

    public static /* synthetic */ float[] e(C3841Ok1 c3841Ok1, float[] fArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = new float[4];
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return c3841Ok1.d(fArr, z);
    }

    public static /* synthetic */ float[] g(C3841Ok1 c3841Ok1, float[] fArr, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = new float[4];
        }
        return c3841Ok1.f(fArr);
    }

    public static /* synthetic */ void j(C3841Ok1 c3841Ok1, float f, C4043Qm1 c4043Qm1, HA0 ha0, int i, Object obj) {
        if ((i & 2) != 0) {
            c4043Qm1 = new C4043Qm1();
        }
        C6562gT0.p(c4043Qm1, "mutableCubic");
        C6562gT0.p(ha0, "callback");
        int size = c3841Ok1.k().size();
        for (int i2 = 0; i2 < size; i2++) {
            c4043Qm1.y(c3841Ok1.k().get(i2).e(), c3841Ok1.k().get(i2).f(), f);
            ha0.invoke(c4043Qm1);
        }
    }

    @InterfaceC9511sW0
    public static final List<C4180Rx1<C6302fS, C6302fS>> m(C8774pV1 c8774pV1, C8774pV1 c8774pV12) {
        return d.a(c8774pV1, c8774pV12);
    }

    public final List<C6302fS> a(float f) {
        List i = C7979mF.i();
        int size = this.c.size();
        C6302fS c6302fS = null;
        C6302fS c6302fS2 = null;
        int i2 = 0;
        while (i2 < size) {
            float[] fArr = new float[8];
            for (int i3 = 0; i3 < 8; i3++) {
                fArr[i3] = C5764dE2.l(this.c.get(i2).e().n()[i3], this.c.get(i2).f().n()[i3], f);
            }
            C6302fS c6302fS3 = new C6302fS(fArr);
            if (c6302fS2 == null) {
                c6302fS2 = c6302fS3;
            }
            if (c6302fS != null) {
                i.add(c6302fS);
            }
            i2++;
            c6302fS = c6302fS3;
        }
        if (c6302fS != null && c6302fS2 != null) {
            i.add(C6800hS.a(c6302fS.f(), c6302fS.g(), c6302fS.j(), c6302fS.k(), c6302fS.l(), c6302fS.m(), c6302fS2.f(), c6302fS2.g()));
        }
        return C7979mF.a(i);
    }

    public final float[] b() {
        return e(this, null, false, 3, null);
    }

    public final float[] c(float[] fArr) {
        C6562gT0.p(fArr, "bounds");
        return e(this, fArr, false, 2, null);
    }

    public final float[] d(float[] fArr, boolean z) {
        C6562gT0.p(fArr, "bounds");
        this.a.c(fArr, z);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        this.b.c(fArr, z);
        fArr[0] = Math.min(f, fArr[0]);
        fArr[1] = Math.min(f2, fArr[1]);
        fArr[2] = Math.max(f3, fArr[2]);
        fArr[3] = Math.max(f4, fArr[3]);
        return fArr;
    }

    public final float[] f(float[] fArr) {
        C6562gT0.p(fArr, "bounds");
        this.a.e(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        this.b.e(fArr);
        fArr[0] = Math.min(f, fArr[0]);
        fArr[1] = Math.min(f2, fArr[1]);
        fArr[2] = Math.max(f3, fArr[2]);
        fArr[3] = Math.max(f4, fArr[3]);
        return fArr;
    }

    public final void h(float f, HA0<? super C4043Qm1, C7458kA2> ha0) {
        C6562gT0.p(ha0, "callback");
        C4043Qm1 c4043Qm1 = new C4043Qm1();
        int size = k().size();
        for (int i = 0; i < size; i++) {
            c4043Qm1.y(k().get(i).e(), k().get(i).f(), f);
            ha0.invoke(c4043Qm1);
        }
    }

    public final void i(float f, C4043Qm1 c4043Qm1, HA0<? super C4043Qm1, C7458kA2> ha0) {
        C6562gT0.p(c4043Qm1, "mutableCubic");
        C6562gT0.p(ha0, "callback");
        int size = k().size();
        for (int i = 0; i < size; i++) {
            c4043Qm1.y(k().get(i).e(), k().get(i).f(), f);
            ha0.invoke(c4043Qm1);
        }
    }

    public final List<C4180Rx1<C6302fS, C6302fS>> k() {
        return this.c;
    }

    public static /* synthetic */ void l() {
    }
}
