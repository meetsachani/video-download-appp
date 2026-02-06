package o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o.AbstractC3069Gn0;

/* renamed from: o.In0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3265In0 {
    public static final String a = "FeatureMapping";

    /* renamed from: o.In0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements HA0<C4180Rx1<? extends Float, ? extends Float>, CharSequence> {
        public static final a X = new a();

        public a() {
            super(1);
        }

        @Override // o.HA0
        /* renamed from: c */
        public final CharSequence invoke(C4180Rx1<Float, Float> c4180Rx1) {
            C6562gT0.p(c4180Rx1, "it");
            return c4180Rx1.e().floatValue() + B8.d + c4180Rx1.f().floatValue();
        }
    }

    /* renamed from: o.In0$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC8052mY0 implements HA0<Integer, CharSequence> {
        public final /* synthetic */ C6952i50 X;
        public final /* synthetic */ int Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6952i50 c6952i50, int i) {
            super(1);
            this.X = c6952i50;
            this.Y = i;
        }

        public final CharSequence c(int i) {
            return C3400Jx0.a(this.X.a(i / this.Y));
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return c(num.intValue());
        }
    }

    /* renamed from: o.In0$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC8052mY0 implements HA0<Integer, CharSequence> {
        public final /* synthetic */ C6952i50 X;
        public final /* synthetic */ int Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6952i50 c6952i50, int i) {
            super(1);
            this.X = c6952i50;
            this.Y = i;
        }

        public final CharSequence c(int i) {
            return C3400Jx0.a(this.X.b(i / this.Y));
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return c(num.intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<C6523gJ1> a(List<C6523gJ1> list, List<C6523gJ1> list2) {
        int size;
        int i;
        C6562gT0.p(list, "f1");
        C6562gT0.p(list2, "f2");
        Iterator<Integer> it = C8222nF.I(list2).iterator();
        if (it.hasNext()) {
            AbstractC8515oR0 abstractC8515oR0 = (AbstractC8515oR0) it;
            int nextInt = abstractC8515oR0.nextInt();
            if (it.hasNext()) {
                float b2 = b(list.get(0).e(), list2.get(nextInt).e());
                do {
                    int nextInt2 = abstractC8515oR0.nextInt();
                    float b3 = b(list.get(0).e(), list2.get(nextInt2).e());
                    if (Float.compare(b2, b3) > 0) {
                        nextInt = nextInt2;
                        b2 = b3;
                    }
                } while (it.hasNext());
                size = list.size();
                int size2 = list2.size();
                List<C6523gJ1> S = C8222nF.S(list2.get(nextInt));
                int i2 = nextInt;
                while (i < size) {
                }
                return S;
            }
            size = list.size();
            int size22 = list2.size();
            List<C6523gJ1> S2 = C8222nF.S(list2.get(nextInt));
            int i22 = nextInt;
            for (i = 1; i < size; i++) {
                int i3 = nextInt - (size - i);
                if (i3 <= i22) {
                    i3 += size22;
                }
                Iterator<Integer> it2 = new C11197zR0(i22 + 1, i3).iterator();
                if (it2.hasNext()) {
                    AbstractC8515oR0 abstractC8515oR02 = (AbstractC8515oR0) it2;
                    int nextInt3 = abstractC8515oR02.nextInt();
                    if (!it2.hasNext()) {
                        i22 = nextInt3;
                        S2.add(list2.get(i22 % size22));
                    } else {
                        float b4 = b(list.get(i).e(), list2.get(nextInt3 % size22).e());
                        do {
                            int nextInt4 = abstractC8515oR02.nextInt();
                            float b5 = b(list.get(i).e(), list2.get(nextInt4 % size22).e());
                            if (Float.compare(b4, b5) > 0) {
                                nextInt3 = nextInt4;
                                b4 = b5;
                            }
                        } while (it2.hasNext());
                        i22 = nextInt3;
                        S2.add(list2.get(i22 % size22));
                    }
                } else {
                    throw new NoSuchElementException();
                }
            }
            return S2;
        }
        throw new NoSuchElementException();
    }

    public static final float b(AbstractC3069Gn0 abstractC3069Gn0, AbstractC3069Gn0 abstractC3069Gn02) {
        C6562gT0.p(abstractC3069Gn0, "f1");
        C6562gT0.p(abstractC3069Gn02, "f2");
        if ((abstractC3069Gn0 instanceof AbstractC3069Gn0.a) && (abstractC3069Gn02 instanceof AbstractC3069Gn0.a) && ((AbstractC3069Gn0.a) abstractC3069Gn0).c() != ((AbstractC3069Gn0.a) abstractC3069Gn02).c()) {
            return Float.MAX_VALUE;
        }
        float f = ((((C6302fS) C10662xF.E2(abstractC3069Gn0.a())).f() + ((C6302fS) C10662xF.s3(abstractC3069Gn0.a())).h()) / 2.0f) - ((((C6302fS) C10662xF.E2(abstractC3069Gn02.a())).f() + ((C6302fS) C10662xF.s3(abstractC3069Gn02.a())).h()) / 2.0f);
        float g = ((((C6302fS) C10662xF.E2(abstractC3069Gn0.a())).g() + ((C6302fS) C10662xF.s3(abstractC3069Gn0.a())).i()) / 2.0f) - ((((C6302fS) C10662xF.E2(abstractC3069Gn02.a())).g() + ((C6302fS) C10662xF.s3(abstractC3069Gn02.a())).i()) / 2.0f);
        return (f * f) + (g * g);
    }

    public static final C6952i50 c(List<C6523gJ1> list, List<C6523gJ1> list2) {
        C4180Rx1 a2;
        C6562gT0.p(list, "features1");
        C6562gT0.p(list2, "features2");
        List i = C7979mF.i();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).e() instanceof AbstractC3069Gn0.a) {
                i.add(list.get(i2));
            }
        }
        List a3 = C7979mF.a(i);
        List i3 = C7979mF.i();
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (list2.get(i4).e() instanceof AbstractC3069Gn0.a) {
                i3.add(list2.get(i4));
            }
        }
        List a4 = C7979mF.a(i3);
        if (a3.size() > a4.size()) {
            a2 = C6670gv2.a(a(a4, a3), a4);
        } else {
            a2 = C6670gv2.a(a3, a(a3, a4));
        }
        List list3 = (List) a2.a();
        List list4 = (List) a2.b();
        List i5 = C7979mF.i();
        int size3 = list3.size();
        for (int i6 = 0; i6 < size3 && i6 != list4.size(); i6++) {
            i5.add(C6670gv2.a(Float.valueOf(((C6523gJ1) list3.get(i6)).f()), Float.valueOf(((C6523gJ1) list4.get(i6)).f())));
        }
        C4180Rx1[] c4180Rx1Arr = (C4180Rx1[]) C7979mF.a(i5).toArray(new C4180Rx1[0]);
        return new C6952i50((C4180Rx1[]) Arrays.copyOf(c4180Rx1Arr, c4180Rx1Arr.length));
    }
}
