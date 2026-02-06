package o;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Lc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3517Lc2 {

    /* renamed from: o  reason: collision with root package name */
    public static final int f537o = 1;
    public static final float p = 0.0f;
    public static final float q = 1.0f;
    public static boolean r;
    @InterfaceC11300zs1
    public static Constructor<StaticLayout> s;
    @InterfaceC11300zs1
    public static Object t;
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int e;
    public boolean l;
    @InterfaceC11300zs1
    public InterfaceC3614Mc2 n;
    public int d = 0;
    public Layout.Alignment f = Layout.Alignment.ALIGN_NORMAL;
    public int g = Integer.MAX_VALUE;
    public float h = 0.0f;
    public float i = 1.0f;
    public int j = f537o;
    public boolean k = true;
    @InterfaceC11300zs1
    public TextUtils.TruncateAt m = null;

    @HT1({HT1.a.Y})
    /* renamed from: o.Lc2$a */
    /* loaded from: classes3.dex */
    public static class a extends Exception {
        public a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    public C3517Lc2(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.e = charSequence.length();
    }

    @InterfaceC5670cr1
    public static C3517Lc2 c(@InterfaceC5670cr1 CharSequence charSequence, @InterfaceC5670cr1 TextPaint textPaint, @BR0(from = 0) int i) {
        return new C3517Lc2(charSequence, textPaint, i);
    }

    @InterfaceC5670cr1
    public StaticLayout a() throws a {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        if (this.g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.b, max, this.m);
        }
        int min = Math.min(charSequence.length(), this.e);
        this.e = min;
        if (this.l && this.g == 1) {
            this.f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.d, min, this.b, max);
        obtain.setAlignment(this.f);
        obtain.setIncludePad(this.k);
        if (this.l) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.g);
        float f = this.h;
        if (f != 0.0f || this.i != 1.0f) {
            obtain.setLineSpacing(f, this.i);
        }
        if (this.g > 1) {
            obtain.setHyphenationFrequency(this.j);
        }
        InterfaceC3614Mc2 interfaceC3614Mc2 = this.n;
        if (interfaceC3614Mc2 != null) {
            interfaceC3614Mc2.a(obtain);
        }
        return obtain.build();
    }

    public final void b() throws a {
        TextDirectionHeuristic textDirectionHeuristic;
        if (r) {
            return;
        }
        try {
            if (this.l) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            t = textDirectionHeuristic;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            s = declaredConstructor;
            declaredConstructor.setAccessible(true);
            r = true;
        } catch (Exception e) {
            throw new a(e);
        }
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C3517Lc2 d(@InterfaceC5670cr1 Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C3517Lc2 e(@InterfaceC11300zs1 TextUtils.TruncateAt truncateAt) {
        this.m = truncateAt;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C3517Lc2 f(@BR0(from = 0) int i) {
        this.e = i;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C3517Lc2 g(int i) {
        this.j = i;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C3517Lc2 h(boolean z) {
        this.k = z;
        return this;
    }

    @InterfaceC5670cr1
    public C3517Lc2 i(boolean z) {
        this.l = z;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C3517Lc2 j(float f, float f2) {
        this.h = f;
        this.i = f2;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C3517Lc2 k(@BR0(from = 0) int i) {
        this.g = i;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C3517Lc2 l(@BR0(from = 0) int i) {
        this.d = i;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C3517Lc2 m(@InterfaceC11300zs1 InterfaceC3614Mc2 interfaceC3614Mc2) {
        this.n = interfaceC3614Mc2;
        return this;
    }
}
