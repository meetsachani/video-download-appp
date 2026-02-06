package o;

import android.graphics.RectF;

/* renamed from: o.ou0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8625ou0 {
    public static final InterfaceC8381nu0 a = new a();
    public static final InterfaceC8381nu0 b = new b();

    /* renamed from: o.ou0$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC8381nu0 {
        @Override // o.InterfaceC8381nu0
        public C9360ru0 a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float n = C3095Gt2.n(f4, f6, f2, f3, f, true);
            float f8 = n / f4;
            float f9 = n / f6;
            return new C9360ru0(f8, f9, n, f5 * f8, n, f7 * f9);
        }

        @Override // o.InterfaceC8381nu0
        public boolean b(C9360ru0 c9360ru0) {
            if (c9360ru0.d > c9360ru0.f) {
                return true;
            }
            return false;
        }

        @Override // o.InterfaceC8381nu0
        public void c(RectF rectF, float f, C9360ru0 c9360ru0) {
            rectF.bottom -= Math.abs(c9360ru0.f - c9360ru0.d) * f;
        }
    }

    /* renamed from: o.ou0$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC8381nu0 {
        @Override // o.InterfaceC8381nu0
        public C9360ru0 a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float n = C3095Gt2.n(f5, f7, f2, f3, f, true);
            float f8 = n / f5;
            float f9 = n / f7;
            return new C9360ru0(f8, f9, f4 * f8, n, f6 * f9, n);
        }

        @Override // o.InterfaceC8381nu0
        public boolean b(C9360ru0 c9360ru0) {
            if (c9360ru0.c > c9360ru0.e) {
                return true;
            }
            return false;
        }

        @Override // o.InterfaceC8381nu0
        public void c(RectF rectF, float f, C9360ru0 c9360ru0) {
            float abs = (Math.abs(c9360ru0.e - c9360ru0.c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    public static InterfaceC8381nu0 a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return b;
                }
                throw new IllegalArgumentException("Invalid fit mode: " + i);
            }
            return a;
        } else if (b(z, rectF, rectF2)) {
            return a;
        } else {
            return b;
        }
    }

    public static boolean b(boolean z, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f = (height2 * width) / width2;
        float f2 = (width2 * height) / width;
        if (z) {
            if (f < height) {
                return false;
            }
            return true;
        } else if (f2 < height2) {
            return false;
        } else {
            return true;
        }
    }
}
