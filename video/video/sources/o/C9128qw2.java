package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.List;
import o.C10231vT1;
import o.C5693cx0;
import o.C5935dx0;

/* renamed from: o.qw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9128qw2 {
    public static final boolean a = false;
    public static final boolean b = true;
    public static final C10588ww2 c;
    public static final Y61<String, Typeface> d;

    /* renamed from: o.qw2$a */
    /* loaded from: classes.dex */
    public static class a extends C5935dx0.d {
        public C10231vT1.f j;

        public a(C10231vT1.f fVar) {
            this.j = fVar;
        }

        @Override // o.C5935dx0.d
        public void a(int i) {
            C10231vT1.f fVar = this.j;
            if (fVar != null) {
                fVar.f(i);
            }
        }

        @Override // o.C5935dx0.d
        public void b(Typeface typeface) {
            C10231vT1.f fVar = this.j;
            if (fVar != null) {
                fVar.g(typeface);
            }
        }
    }

    static {
        C6399fr2.c("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c = new C10345vw2();
        } else if (i >= 28) {
            c = new C10099uw2();
        } else if (i >= 26) {
            c = new C9856tw2();
        } else if (C9613sw2.r()) {
            c = new C9613sw2();
        } else {
            c = new C9370rw2();
        }
        d = new Y61<>(16);
        C6399fr2.f();
    }

    public static void a() {
        d.d();
    }

    public static Typeface b(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface c(Context context, Typeface typeface, int i, boolean z) {
        if (context != null) {
            C10907yF1.g(i, 1, 1000, "weight");
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return c.h(context, typeface, i, z);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface d(Context context, CancellationSignal cancellationSignal, C5935dx0.c[] cVarArr, int i) {
        C6399fr2.c("TypefaceCompat.createFromFontInfo");
        try {
            return c.d(context, cancellationSignal, cVarArr, i);
        } finally {
            C6399fr2.f();
        }
    }

    public static Typeface e(Context context, CancellationSignal cancellationSignal, List<C5935dx0.c[]> list, int i) {
        C6399fr2.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return c.e(context, cancellationSignal, list, i);
        } finally {
            C6399fr2.f();
        }
    }

    @Deprecated
    public static Typeface f(Context context, C5693cx0.b bVar, Resources resources, int i, int i2, C10231vT1.f fVar, Handler handler, boolean z) {
        return g(context, bVar, resources, i, null, 0, i2, fVar, handler, z);
    }

    public static Typeface g(Context context, C5693cx0.b bVar, Resources resources, int i, String str, int i2, int i3, C10231vT1.f fVar, Handler handler, boolean z) {
        Typeface b2;
        boolean z2;
        int i4;
        List a2;
        if (bVar instanceof C5693cx0.f) {
            C5693cx0.f fVar2 = (C5693cx0.f) bVar;
            Typeface n = n(fVar2.d());
            if (n != null) {
                if (fVar != null) {
                    fVar.d(n, handler);
                }
                return n;
            }
            if (!z ? fVar == null : fVar2.b() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                i4 = fVar2.e();
            } else {
                i4 = -1;
            }
            int i5 = i4;
            Handler e = C10231vT1.f.e(handler);
            a aVar = new a(fVar);
            if (fVar2.a() != null) {
                a2 = C8391nw2.a(fVar2.c(), fVar2.a());
            } else {
                a2 = C8635ow2.a(fVar2.c());
            }
            b2 = C5935dx0.f(context, a2, i3, z2, i5, e, aVar);
        } else {
            b2 = c.b(context, (C5693cx0.d) bVar, resources, i3);
            if (fVar != null) {
                if (b2 != null) {
                    fVar.d(b2, handler);
                } else {
                    fVar.c(-3, handler);
                }
            }
        }
        if (b2 != null) {
            d.j(j(resources, i, str, i2, i3), b2);
        }
        return b2;
    }

    @Deprecated
    public static Typeface h(Context context, Resources resources, int i, String str, int i2) {
        return i(context, resources, i, str, 0, i2);
    }

    public static Typeface i(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface g = c.g(context, resources, i, str, i3);
        if (g != null) {
            d.j(j(resources, i, str, i2, i3), g);
        }
        return g;
    }

    public static String j(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    @Deprecated
    public static Typeface k(Resources resources, int i, int i2) {
        return l(resources, i, null, 0, i2);
    }

    public static Typeface l(Resources resources, int i, String str, int i2, int i3) {
        return d.f(j(resources, i, str, i2, i3));
    }

    public static Typeface m(Context context, Typeface typeface, int i) {
        C10588ww2 c10588ww2 = c;
        C5693cx0.d n = c10588ww2.n(typeface);
        if (n == null) {
            return null;
        }
        return c10588ww2.b(context, n, context.getResources(), i);
    }

    public static Typeface n(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }
}
