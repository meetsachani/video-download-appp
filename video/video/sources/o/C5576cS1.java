package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: o.cS1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5576cS1<TranscodeType> extends AbstractC2962Fl<C5576cS1<TranscodeType>> implements Cloneable, InterfaceC10050uk1<C5576cS1<TranscodeType>> {
    public static final C8520oS1 e2 = new C8520oS1().s(AbstractC4994a40.c).D0(EnumC10672xH1.LOW).P0(true);
    public final Context Q1;
    public final ComponentCallbacks2C7772lS1 R1;
    public final Class<TranscodeType> S1;
    public final com.bumptech.glide.a T1;
    public final com.bumptech.glide.c U1;
    public AbstractC10819xt2<?, ? super TranscodeType> V1;
    public Object W1;
    public List<InterfaceC7529kS1<TranscodeType>> X1;
    public C5576cS1<TranscodeType> Y1;
    public C5576cS1<TranscodeType> Z1;
    public Float a2;
    public boolean b2;
    public boolean c2;
    public boolean d2;

    /* renamed from: o.cS1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[EnumC10672xH1.values().length];
            b = iArr;
            try {
                iArr[EnumC10672xH1.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[EnumC10672xH1.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[EnumC10672xH1.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[EnumC10672xH1.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C5576cS1(com.bumptech.glide.a aVar, ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1, Class<TranscodeType> cls, Context context) {
        this.b2 = true;
        this.T1 = aVar;
        this.R1 = componentCallbacks2C7772lS1;
        this.S1 = cls;
        this.Q1 = context;
        this.V1 = componentCallbacks2C7772lS1.G(cls);
        this.U1 = aVar.k();
        w1(componentCallbacks2C7772lS1.E());
        e(componentCallbacks2C7772lS1.F());
    }

    public <Y extends InterfaceC2856El2<TranscodeType>> Y A1(Y y, InterfaceC7529kS1<TranscodeType> interfaceC7529kS1, Executor executor) {
        return (Y) B1(y, interfaceC7529kS1, this, executor);
    }

    public final <Y extends InterfaceC2856El2<TranscodeType>> Y B1(Y y, InterfaceC7529kS1<TranscodeType> interfaceC7529kS1, AbstractC2962Fl<?> abstractC2962Fl, Executor executor) {
        C10175vF1.e(y);
        if (this.c2) {
            InterfaceC5334bS1 g1 = g1(y, interfaceC7529kS1, abstractC2962Fl, executor);
            InterfaceC5334bS1 j = y.j();
            if (g1.h(j) && !D1(abstractC2962Fl, j)) {
                if (!((InterfaceC5334bS1) C10175vF1.e(j)).isRunning()) {
                    j.i();
                }
                return y;
            }
            this.R1.z(y);
            y.q(g1);
            this.R1.a0(y, g1);
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public AbstractC7247jI2<ImageView, TranscodeType> C1(ImageView imageView) {
        C5576cS1<TranscodeType> c5576cS1;
        SD2.b();
        C10175vF1.e(imageView);
        if (!m0() && k0() && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    c5576cS1 = clone().q0();
                    break;
                case 2:
                    c5576cS1 = clone().r0();
                    break;
                case 3:
                case 4:
                case 5:
                    c5576cS1 = clone().t0();
                    break;
                case 6:
                    c5576cS1 = clone().r0();
                    break;
            }
            return (AbstractC7247jI2) B1(this.U1.a(imageView, this.S1), null, c5576cS1, C8325ng0.b());
        }
        c5576cS1 = this;
        return (AbstractC7247jI2) B1(this.U1.a(imageView, this.S1), null, c5576cS1, C8325ng0.b());
    }

    public final boolean D1(AbstractC2962Fl<?> abstractC2962Fl, InterfaceC5334bS1 interfaceC5334bS1) {
        if (!abstractC2962Fl.d0() && interfaceC5334bS1.g()) {
            return true;
        }
        return false;
    }

    public C5576cS1<TranscodeType> E1(InterfaceC7529kS1<TranscodeType> interfaceC7529kS1) {
        if (Y()) {
            return m().E1(interfaceC7529kS1);
        }
        this.X1 = null;
        return d1(interfaceC7529kS1);
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: F1 */
    public C5576cS1<TranscodeType> l(Bitmap bitmap) {
        return P1(bitmap).e(C8520oS1.i1(AbstractC4994a40.b));
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: G1 */
    public C5576cS1<TranscodeType> g(Drawable drawable) {
        return P1(drawable).e(C8520oS1.i1(AbstractC4994a40.b));
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: H1 */
    public C5576cS1<TranscodeType> c(Uri uri) {
        return Q1(uri, P1(uri));
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: J1 */
    public C5576cS1<TranscodeType> f(File file) {
        return P1(file);
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: K1 */
    public C5576cS1<TranscodeType> p(Integer num) {
        return f1(P1(num));
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: L1 */
    public C5576cS1<TranscodeType> n(Object obj) {
        return P1(obj);
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: M1 */
    public C5576cS1<TranscodeType> r(String str) {
        return P1(str);
    }

    @Override // o.InterfaceC10050uk1
    @Deprecated
    /* renamed from: N1 */
    public C5576cS1<TranscodeType> b(URL url) {
        return P1(url);
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: O1 */
    public C5576cS1<TranscodeType> d(byte[] bArr) {
        C5576cS1<TranscodeType> P1 = P1(bArr);
        if (!P1.Z()) {
            P1 = P1.e(C8520oS1.i1(AbstractC4994a40.b));
        }
        if (!P1.j0()) {
            return P1.e(C8520oS1.C1(true));
        }
        return P1;
    }

    public final C5576cS1<TranscodeType> P1(Object obj) {
        if (Y()) {
            return m().P1(obj);
        }
        this.W1 = obj;
        this.c2 = true;
        return L0();
    }

    public final C5576cS1<TranscodeType> Q1(Uri uri, C5576cS1<TranscodeType> c5576cS1) {
        if (uri != null && C10977yY.t.equals(uri.getScheme())) {
            return f1(c5576cS1);
        }
        return c5576cS1;
    }

    public final InterfaceC5334bS1 R1(Object obj, InterfaceC2856El2<TranscodeType> interfaceC2856El2, InterfaceC7529kS1<TranscodeType> interfaceC7529kS1, AbstractC2962Fl<?> abstractC2962Fl, InterfaceC6304fS1 interfaceC6304fS1, AbstractC10819xt2<?, ? super TranscodeType> abstractC10819xt2, EnumC10672xH1 enumC10672xH1, int i, int i2, Executor executor) {
        Context context = this.Q1;
        com.bumptech.glide.c cVar = this.U1;
        return C9905u82.y(context, cVar, obj, this.W1, this.S1, abstractC2962Fl, i, i2, enumC10672xH1, interfaceC2856El2, interfaceC7529kS1, this.X1, interfaceC6304fS1, cVar.f(), abstractC10819xt2.d(), executor);
    }

    public InterfaceC2856El2<TranscodeType> S1() {
        return U1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public InterfaceC2856El2<TranscodeType> U1(int i, int i2) {
        return z1(JG1.b(this.R1, i, i2));
    }

    public InterfaceFutureC6239fC0<TranscodeType> V1() {
        return W1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public InterfaceFutureC6239fC0<TranscodeType> W1(int i, int i2) {
        C7286jS1 c7286jS1 = new C7286jS1(i, i2);
        return (InterfaceFutureC6239fC0) A1(c7286jS1, c7286jS1, C8325ng0.a());
    }

    @Deprecated
    public C5576cS1<TranscodeType> X1(float f) {
        if (Y()) {
            return m().X1(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.a2 = Float.valueOf(f);
            return L0();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    public C5576cS1<TranscodeType> Y1(List<C5576cS1<TranscodeType>> list) {
        C5576cS1<TranscodeType> c5576cS1 = null;
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C5576cS1<TranscodeType> c5576cS12 = list.get(size);
                if (c5576cS12 != null) {
                    if (c5576cS1 == null) {
                        c5576cS1 = c5576cS12;
                    } else {
                        c5576cS1 = c5576cS12.Z1(c5576cS1);
                    }
                }
            }
            return Z1(c5576cS1);
        }
        return Z1(null);
    }

    public C5576cS1<TranscodeType> Z1(C5576cS1<TranscodeType> c5576cS1) {
        if (Y()) {
            return m().Z1(c5576cS1);
        }
        this.Y1 = c5576cS1;
        return L0();
    }

    public C5576cS1<TranscodeType> a2(C5576cS1<TranscodeType>... c5576cS1Arr) {
        if (c5576cS1Arr != null && c5576cS1Arr.length != 0) {
            return Y1(Arrays.asList(c5576cS1Arr));
        }
        return Z1(null);
    }

    public C5576cS1<TranscodeType> b2(AbstractC10819xt2<?, ? super TranscodeType> abstractC10819xt2) {
        if (Y()) {
            return m().b2(abstractC10819xt2);
        }
        this.V1 = (AbstractC10819xt2) C10175vF1.e(abstractC10819xt2);
        this.b2 = false;
        return L0();
    }

    public C5576cS1<TranscodeType> d1(InterfaceC7529kS1<TranscodeType> interfaceC7529kS1) {
        if (Y()) {
            return m().d1(interfaceC7529kS1);
        }
        if (interfaceC7529kS1 != null) {
            if (this.X1 == null) {
                this.X1 = new ArrayList();
            }
            this.X1.add(interfaceC7529kS1);
        }
        return L0();
    }

    @Override // o.AbstractC2962Fl
    /* renamed from: e1 */
    public C5576cS1<TranscodeType> e(AbstractC2962Fl<?> abstractC2962Fl) {
        C10175vF1.e(abstractC2962Fl);
        return (C5576cS1) super.e(abstractC2962Fl);
    }

    @Override // o.AbstractC2962Fl
    public boolean equals(Object obj) {
        if (obj instanceof C5576cS1) {
            C5576cS1 c5576cS1 = (C5576cS1) obj;
            if (super.equals(c5576cS1) && Objects.equals(this.S1, c5576cS1.S1) && this.V1.equals(c5576cS1.V1) && Objects.equals(this.W1, c5576cS1.W1) && Objects.equals(this.X1, c5576cS1.X1) && Objects.equals(this.Y1, c5576cS1.Y1) && Objects.equals(this.Z1, c5576cS1.Z1) && Objects.equals(this.a2, c5576cS1.a2) && this.b2 == c5576cS1.b2 && this.c2 == c5576cS1.c2) {
                return true;
            }
        }
        return false;
    }

    public final C5576cS1<TranscodeType> f1(C5576cS1<TranscodeType> c5576cS1) {
        return c5576cS1.Q0(this.Q1.getTheme()).N0(C6226f9.c(this.Q1));
    }

    public final InterfaceC5334bS1 g1(InterfaceC2856El2<TranscodeType> interfaceC2856El2, InterfaceC7529kS1<TranscodeType> interfaceC7529kS1, AbstractC2962Fl<?> abstractC2962Fl, Executor executor) {
        return h1(new Object(), interfaceC2856El2, interfaceC7529kS1, null, this.V1, abstractC2962Fl.Q(), abstractC2962Fl.N(), abstractC2962Fl.M(), abstractC2962Fl, executor);
    }

    public final InterfaceC5334bS1 h1(Object obj, InterfaceC2856El2<TranscodeType> interfaceC2856El2, InterfaceC7529kS1<TranscodeType> interfaceC7529kS1, InterfaceC6304fS1 interfaceC6304fS1, AbstractC10819xt2<?, ? super TranscodeType> abstractC10819xt2, EnumC10672xH1 enumC10672xH1, int i, int i2, AbstractC2962Fl<?> abstractC2962Fl, Executor executor) {
        C9782te0 c9782te0;
        C9782te0 c9782te02;
        Object obj2;
        InterfaceC2856El2<TranscodeType> interfaceC2856El22;
        InterfaceC7529kS1<TranscodeType> interfaceC7529kS12;
        AbstractC10819xt2<?, ? super TranscodeType> abstractC10819xt22;
        EnumC10672xH1 enumC10672xH12;
        int i3;
        int i4;
        AbstractC2962Fl<?> abstractC2962Fl2;
        Executor executor2;
        C5576cS1<TranscodeType> c5576cS1;
        if (this.Z1 != null) {
            c9782te0 = new C9782te0(obj, interfaceC6304fS1);
            c9782te02 = c9782te0;
            c5576cS1 = this;
            obj2 = obj;
            interfaceC2856El22 = interfaceC2856El2;
            interfaceC7529kS12 = interfaceC7529kS1;
            abstractC10819xt22 = abstractC10819xt2;
            enumC10672xH12 = enumC10672xH1;
            i3 = i;
            i4 = i2;
            abstractC2962Fl2 = abstractC2962Fl;
            executor2 = executor;
        } else {
            c9782te0 = null;
            c9782te02 = interfaceC6304fS1;
            obj2 = obj;
            interfaceC2856El22 = interfaceC2856El2;
            interfaceC7529kS12 = interfaceC7529kS1;
            abstractC10819xt22 = abstractC10819xt2;
            enumC10672xH12 = enumC10672xH1;
            i3 = i;
            i4 = i2;
            abstractC2962Fl2 = abstractC2962Fl;
            executor2 = executor;
            c5576cS1 = this;
        }
        InterfaceC5334bS1 i1 = c5576cS1.i1(obj2, interfaceC2856El22, interfaceC7529kS12, c9782te02, abstractC10819xt22, enumC10672xH12, i3, i4, abstractC2962Fl2, executor2);
        if (c9782te0 == null) {
            return i1;
        }
        int N = this.Z1.N();
        int M = this.Z1.M();
        if (SD2.x(i, i2) && !this.Z1.n0()) {
            N = abstractC2962Fl.N();
            M = abstractC2962Fl.M();
        }
        C5576cS1<TranscodeType> c5576cS12 = this.Z1;
        C9782te0 c9782te03 = c9782te0;
        c9782te03.o(i1, c5576cS12.h1(obj, interfaceC2856El2, interfaceC7529kS1, c9782te03, c5576cS12.V1, c5576cS12.Q(), N, M, this.Z1, executor));
        return c9782te03;
    }

    @Override // o.AbstractC2962Fl
    public int hashCode() {
        return SD2.t(this.c2, SD2.t(this.b2, SD2.r(this.a2, SD2.r(this.Z1, SD2.r(this.Y1, SD2.r(this.X1, SD2.r(this.W1, SD2.r(this.V1, SD2.r(this.S1, super.hashCode())))))))));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [o.Fl] */
    public final InterfaceC5334bS1 i1(Object obj, InterfaceC2856El2<TranscodeType> interfaceC2856El2, InterfaceC7529kS1<TranscodeType> interfaceC7529kS1, InterfaceC6304fS1 interfaceC6304fS1, AbstractC10819xt2<?, ? super TranscodeType> abstractC10819xt2, EnumC10672xH1 enumC10672xH1, int i, int i2, AbstractC2962Fl<?> abstractC2962Fl, Executor executor) {
        AbstractC10819xt2<?, ? super TranscodeType> abstractC10819xt22;
        EnumC10672xH1 v1;
        C5576cS1<TranscodeType> c5576cS1 = this.Y1;
        if (c5576cS1 != null) {
            if (!this.d2) {
                AbstractC10819xt2<?, ? super TranscodeType> abstractC10819xt23 = c5576cS1.V1;
                if (c5576cS1.b2) {
                    abstractC10819xt22 = abstractC10819xt2;
                } else {
                    abstractC10819xt22 = abstractC10819xt23;
                }
                if (c5576cS1.f0()) {
                    v1 = this.Y1.Q();
                } else {
                    v1 = v1(enumC10672xH1);
                }
                EnumC10672xH1 enumC10672xH12 = v1;
                int N = this.Y1.N();
                int M = this.Y1.M();
                if (SD2.x(i, i2) && !this.Y1.n0()) {
                    N = abstractC2962Fl.N();
                    M = abstractC2962Fl.M();
                }
                C10067uo2 c10067uo2 = new C10067uo2(obj, interfaceC6304fS1);
                InterfaceC5334bS1 R1 = R1(obj, interfaceC2856El2, interfaceC7529kS1, abstractC2962Fl, c10067uo2, abstractC10819xt2, enumC10672xH1, i, i2, executor);
                this.d2 = true;
                C5576cS1<TranscodeType> c5576cS12 = this.Y1;
                InterfaceC5334bS1 h1 = c5576cS12.h1(obj, interfaceC2856El2, interfaceC7529kS1, c10067uo2, abstractC10819xt22, enumC10672xH12, N, M, c5576cS12, executor);
                this.d2 = false;
                c10067uo2.n(R1, h1);
                return c10067uo2;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.a2 != null) {
            C10067uo2 c10067uo22 = new C10067uo2(obj, interfaceC6304fS1);
            c10067uo22.n(R1(obj, interfaceC2856El2, interfaceC7529kS1, abstractC2962Fl, c10067uo22, abstractC10819xt2, enumC10672xH1, i, i2, executor), R1(obj, interfaceC2856El2, interfaceC7529kS1, abstractC2962Fl.clone().O0(this.a2.floatValue()), c10067uo22, abstractC10819xt2, v1(enumC10672xH1), i, i2, executor));
            return c10067uo22;
        } else {
            return R1(obj, interfaceC2856El2, interfaceC7529kS1, abstractC2962Fl, interfaceC6304fS1, abstractC10819xt2, enumC10672xH1, i, i2, executor);
        }
    }

    @Override // o.AbstractC2962Fl
    /* renamed from: j1 */
    public C5576cS1<TranscodeType> m() {
        C5576cS1<TranscodeType> c5576cS1 = (C5576cS1) super.clone();
        c5576cS1.V1 = (AbstractC10819xt2<?, ? super TranscodeType>) c5576cS1.V1.clone();
        if (c5576cS1.X1 != null) {
            c5576cS1.X1 = new ArrayList(c5576cS1.X1);
        }
        C5576cS1<TranscodeType> c5576cS12 = c5576cS1.Y1;
        if (c5576cS12 != null) {
            c5576cS1.Y1 = c5576cS12.m();
        }
        C5576cS1<TranscodeType> c5576cS13 = c5576cS1.Z1;
        if (c5576cS13 != null) {
            c5576cS1.Z1 = c5576cS13.m();
        }
        return c5576cS1;
    }

    public final C5576cS1<TranscodeType> k1() {
        return m().o1(null).Z1(null);
    }

    @Deprecated
    public InterfaceFutureC6239fC0<File> l1(int i, int i2) {
        return s1().W1(i, i2);
    }

    @Deprecated
    public <Y extends InterfaceC2856El2<File>> Y m1(Y y) {
        return (Y) s1().z1(y);
    }

    public C5576cS1<TranscodeType> n1(Object obj) {
        if (obj == null) {
            return o1(null);
        }
        return o1(k1().n(obj));
    }

    public C5576cS1<TranscodeType> o1(C5576cS1<TranscodeType> c5576cS1) {
        if (Y()) {
            return m().o1(c5576cS1);
        }
        this.Z1 = c5576cS1;
        return L0();
    }

    public <Y extends InterfaceC2856El2<TranscodeType>> Y p1(Y y) {
        return (Y) A1(y, null, C8325ng0.c());
    }

    public AbstractC7247jI2<ImageView, TranscodeType> q1(ImageView imageView) {
        C5576cS1<TranscodeType> c5576cS1;
        SD2.b();
        C10175vF1.e(imageView);
        if (!m0() && k0() && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    c5576cS1 = clone().q0();
                    break;
                case 2:
                    c5576cS1 = clone().r0();
                    break;
                case 3:
                case 4:
                case 5:
                    c5576cS1 = clone().t0();
                    break;
                case 6:
                    c5576cS1 = clone().r0();
                    break;
            }
            return (AbstractC7247jI2) B1(this.U1.a(imageView, this.S1), null, c5576cS1, C8325ng0.c());
        }
        c5576cS1 = this;
        return (AbstractC7247jI2) B1(this.U1.a(imageView, this.S1), null, c5576cS1, C8325ng0.c());
    }

    public InterfaceC2856El2<TranscodeType> r1(int i, int i2) {
        return p1(JG1.b(this.R1, i, i2));
    }

    public C5576cS1<File> s1() {
        return new C5576cS1(File.class, this).e(e2);
    }

    public Object t1() {
        return this.W1;
    }

    public ComponentCallbacks2C7772lS1 u1() {
        return this.R1;
    }

    public final EnumC10672xH1 v1(EnumC10672xH1 enumC10672xH1) {
        int i = a.b[enumC10672xH1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalArgumentException("unknown priority: " + Q());
                }
                return EnumC10672xH1.IMMEDIATE;
            }
            return EnumC10672xH1.HIGH;
        }
        return EnumC10672xH1.NORMAL;
    }

    public final void w1(List<InterfaceC7529kS1<Object>> list) {
        for (InterfaceC7529kS1<Object> interfaceC7529kS1 : list) {
            d1(interfaceC7529kS1);
        }
    }

    @Deprecated
    public InterfaceFutureC6239fC0<TranscodeType> y1(int i, int i2) {
        return W1(i, i2);
    }

    public <Y extends InterfaceC2856El2<TranscodeType>> Y z1(Y y) {
        return (Y) A1(y, null, C8325ng0.b());
    }

    public C5576cS1(Class<TranscodeType> cls, C5576cS1<?> c5576cS1) {
        this(c5576cS1.T1, c5576cS1.R1, cls, c5576cS1.Q1);
        this.W1 = c5576cS1.W1;
        this.c2 = c5576cS1.c2;
        e(c5576cS1);
    }
}
