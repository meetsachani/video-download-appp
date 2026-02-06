package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AbstractC3069Gn0;

/* renamed from: o.Kd1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3422Kd1 extends AbstractC8896q1<b> {
    public static final a a1 = new a(null);
    public final List<b> Y0;
    public final InterfaceC10269ve1 Z;
    public final List<C6523gJ1> Z0;

    /* renamed from: o.Kd1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final C3422Kd1 a(InterfaceC10269ve1 interfaceC10269ve1, C8774pV1 c8774pV1) {
            List list;
            C6562gT0.p(interfaceC10269ve1, "measurer");
            C6562gT0.p(c8774pV1, "polygon");
            ArrayList<C6302fS> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = c8774pV1.j().size();
            for (int i = 0; i < size; i++) {
                AbstractC3069Gn0 abstractC3069Gn0 = c8774pV1.j().get(i);
                int size2 = abstractC3069Gn0.a().size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if ((abstractC3069Gn0 instanceof AbstractC3069Gn0.a) && i2 == abstractC3069Gn0.a().size() / 2) {
                        arrayList2.add(C6670gv2.a(abstractC3069Gn0, Integer.valueOf(arrayList.size())));
                    }
                    arrayList.add(abstractC3069Gn0.a().get(i2));
                }
            }
            Float valueOf = Float.valueOf(0.0f);
            int b0 = C8466oF.b0(arrayList, 9);
            if (b0 == 0) {
                list = C7979mF.k(valueOf);
            } else {
                ArrayList arrayList3 = new ArrayList(b0 + 1);
                arrayList3.add(valueOf);
                for (C6302fS c6302fS : arrayList) {
                    float floatValue = valueOf.floatValue();
                    float a = interfaceC10269ve1.a(c6302fS);
                    if (a >= 0.0f) {
                        C7458kA2 c7458kA2 = C7458kA2.a;
                        valueOf = Float.valueOf(floatValue + a);
                        arrayList3.add(valueOf);
                    } else {
                        throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                    }
                }
                list = arrayList3;
            }
            float floatValue2 = ((Number) C10662xF.s3(list)).floatValue();
            C4725Xm1 c4725Xm1 = new C4725Xm1(list.size());
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                c4725Xm1.X(((Number) list.get(i3)).floatValue() / floatValue2);
            }
            C9928uE1.a();
            List i4 = C7979mF.i();
            int size4 = arrayList2.size();
            for (int i5 = 0; i5 < size4; i5++) {
                int intValue = ((Number) ((C4180Rx1) arrayList2.get(i5)).f()).intValue();
                i4.add(new C6523gJ1((c4725Xm1.s(intValue) + c4725Xm1.s(intValue + 1)) / 2, (AbstractC3069Gn0) ((C4180Rx1) arrayList2.get(i5)).e()));
            }
            return new C3422Kd1(interfaceC10269ve1, C7979mF.a(i4), arrayList, c4725Xm1, null);
        }

        public a() {
        }
    }

    /* renamed from: o.Kd1$b */
    /* loaded from: classes.dex */
    public final class b {
        public final C6302fS a;
        public final float b;
        public float c;
        public float d;
        public final /* synthetic */ C3422Kd1 e;

        public b(C3422Kd1 c3422Kd1, C6302fS c6302fS, float f, float f2) {
            C6562gT0.p(c6302fS, "cubic");
            this.e = c3422Kd1;
            this.a = c6302fS;
            if (f2 >= f) {
                this.b = c3422Kd1.Z.a(c6302fS);
                this.c = f;
                this.d = f2;
                return;
            }
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }

        public static /* synthetic */ void g(b bVar, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = bVar.c;
            }
            if ((i & 2) != 0) {
                f2 = bVar.d;
            }
            bVar.f(f, f2);
        }

        public final C4180Rx1<b, b> a(float f) {
            float H = C5075aO1.H(f, this.c, this.d);
            float f2 = this.d;
            float f3 = this.c;
            float b = this.e.Z.b(this.a, ((H - f3) / (f2 - f3)) * this.b);
            if (0.0f <= b && b <= 1.0f) {
                C9928uE1.a();
                C4180Rx1<C6302fS, C6302fS> r = this.a.r(b);
                return C6670gv2.a(new b(this.e, r.a(), this.c, H), new b(this.e, r.b(), H, this.d));
            }
            throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
        }

        public final C6302fS b() {
            return this.a;
        }

        public final float c() {
            return this.d;
        }

        public final float d() {
            return this.b;
        }

        public final float e() {
            return this.c;
        }

        public final void f(float f, float f2) {
            if (f2 >= f) {
                this.c = f;
                this.d = f2;
                return;
            }
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }

        public String toString() {
            return "MeasuredCubic(outlineProgress=[" + this.c + " .. " + this.d + "], size=" + this.b + ", cubic=" + this.a + ')';
        }
    }

    public /* synthetic */ C3422Kd1(InterfaceC10269ve1 interfaceC10269ve1, List list, List list2, AbstractC9115qv0 abstractC9115qv0, C9516sY c9516sY) {
        this(interfaceC10269ve1, list, list2, abstractC9115qv0);
    }

    @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return i((b) obj);
    }

    @Override // o.AbstractC8896q1, o.AbstractC7901m0
    public int e() {
        return this.Y0.size();
    }

    public /* bridge */ boolean i(b bVar) {
        return super.contains(bVar);
    }

    @Override // o.AbstractC8896q1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof b)) {
            return -1;
        }
        return p((b) obj);
    }

    public final C3422Kd1 j(float f) {
        float m;
        if (0.0f <= f && f <= 1.0f) {
            if (f < 1.0E-4f) {
                return this;
            }
            Iterator<b> it = this.Y0.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    b next = it.next();
                    float e = next.e();
                    if (f <= next.c() && e <= f) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            C4180Rx1<b, b> a2 = this.Y0.get(i).a(f);
            b a3 = a2.a();
            C9928uE1.a();
            List S = C8222nF.S(a2.b().b());
            int size = this.Y0.size();
            for (int i2 = 1; i2 < size; i2++) {
                List<b> list = this.Y0;
                S.add(list.get((i2 + i) % list.size()).b());
            }
            S.add(a3.b());
            C4725Xm1 c4725Xm1 = new C4725Xm1(this.Y0.size() + 2);
            int size2 = this.Y0.size() + 2;
            for (int i3 = 0; i3 < size2; i3++) {
                if (i3 == 0) {
                    m = 0.0f;
                } else if (i3 == this.Y0.size() + 1) {
                    m = 1.0f;
                } else {
                    m = C5764dE2.m(this.Y0.get(((i + i3) - 1) % this.Y0.size()).c() - f, 1.0f);
                }
                c4725Xm1.X(m);
            }
            List i4 = C7979mF.i();
            int size3 = this.Z0.size();
            for (int i5 = 0; i5 < size3; i5++) {
                i4.add(new C6523gJ1(C5764dE2.m(this.Z0.get(i5).f() - f, 1.0f), this.Z0.get(i5).e()));
            }
            return new C3422Kd1(this.Z, C7979mF.a(i4), S, c4725Xm1);
        }
        throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
    }

    @Override // o.AbstractC8896q1, java.util.List
    /* renamed from: k */
    public b get(int i) {
        return this.Y0.get(i);
    }

    public final List<C6523gJ1> l() {
        return this.Z0;
    }

    @Override // o.AbstractC8896q1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof b)) {
            return -1;
        }
        return r((b) obj);
    }

    public /* bridge */ int p(b bVar) {
        return super.indexOf(bVar);
    }

    public /* bridge */ int r(b bVar) {
        return super.lastIndexOf(bVar);
    }

    public C3422Kd1(InterfaceC10269ve1 interfaceC10269ve1, List<C6523gJ1> list, List<? extends C6302fS> list2, AbstractC9115qv0 abstractC9115qv0) {
        if (abstractC9115qv0.w() == list2.size() + 1) {
            if (abstractC9115qv0.i() == 0.0f) {
                if (abstractC9115qv0.R() == 1.0f) {
                    this.Z = interfaceC10269ve1;
                    this.Z0 = list;
                    ArrayList arrayList = new ArrayList();
                    int size = list2.size();
                    int i = 0;
                    float f = 0.0f;
                    while (i < size) {
                        int i2 = i + 1;
                        if (abstractC9115qv0.s(i2) - abstractC9115qv0.s(i) > 1.0E-4f) {
                            arrayList.add(new b(this, list2.get(i), f, abstractC9115qv0.s(i2)));
                            f = abstractC9115qv0.s(i2);
                        }
                        i = i2;
                    }
                    b.g((b) arrayList.get(C8222nF.J(arrayList)), 0.0f, 1.0f, 1, null);
                    this.Y0 = arrayList;
                    return;
                }
                throw new IllegalArgumentException("Last outline progress value is expected to be one");
            }
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
    }
}
