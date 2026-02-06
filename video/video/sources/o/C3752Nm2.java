package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.O40;

/* renamed from: o.Nm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3752Nm2 extends AbstractC8588ol {
    public final StringBuilder I;
    public final StringBuilder J;
    public final StringBuilder K;
    public final StringBuilder L;
    public final RectF M;
    public final Matrix N;
    public final Paint O;
    public final Paint P;
    public final Map<C4276Sw0, List<HL>> Q;
    public final C5484c51<String> R;
    public final List<String> S;
    public final List<d> T;
    public final C3654Mm2 U;
    public final C8431o61 V;
    public final C10624x51 W;
    public EnumC4141Rm2 X;
    public AbstractC7840ll<Integer, Integer> Y;
    public AbstractC7840ll<Integer, Integer> Z;
    public AbstractC7840ll<Integer, Integer> a0;
    public AbstractC7840ll<Integer, Integer> b0;
    public AbstractC7840ll<Float, Float> c0;
    public AbstractC7840ll<Float, Float> d0;
    public AbstractC7840ll<Float, Float> e0;
    public AbstractC7840ll<Float, Float> f0;
    public AbstractC7840ll<Integer, Integer> g0;
    public AbstractC7840ll<Float, Float> h0;
    public AbstractC7840ll<Typeface, Typeface> i0;
    public AbstractC7840ll<Integer, Integer> j0;
    public AbstractC7840ll<Integer, Integer> k0;
    public AbstractC7840ll<Integer, Integer> l0;

    /* renamed from: o.Nm2$a */
    /* loaded from: classes.dex */
    public class a extends Paint {
        public a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: o.Nm2$b */
    /* loaded from: classes.dex */
    public class b extends Paint {
        public b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: o.Nm2$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[O40.a.values().length];
            a = iArr;
            try {
                iArr[O40.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[O40.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[O40.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C3752Nm2(C8431o61 c8431o61, C9760tY0 c9760tY0) {
        super(c8431o61, c9760tY0);
        D9 d9;
        D9 d92;
        C9663t9 c9663t9;
        D9 d93;
        C9663t9 c9663t92;
        D9 d94;
        C9663t9 c9663t93;
        E9 e9;
        C9663t9 c9663t94;
        E9 e92;
        C9177r9 c9177r9;
        E9 e93;
        C9177r9 c9177r92;
        E9 e94;
        C8928q9 c8928q9;
        E9 e95;
        C8928q9 c8928q92;
        this.I = new StringBuilder(2);
        this.J = new StringBuilder(0);
        this.K = new StringBuilder(0);
        this.L = new StringBuilder(0);
        this.M = new RectF();
        this.N = new Matrix();
        this.O = new a(1);
        this.P = new b(1);
        this.Q = new HashMap();
        this.R = new C5484c51<>();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.X = EnumC4141Rm2.INDEX;
        this.V = c8431o61;
        this.W = c9760tY0.c();
        C3654Mm2 a2 = c9760tY0.t().a();
        this.U = a2;
        a2.a(this);
        j(a2);
        B9 u = c9760tY0.u();
        if (u != null && (e95 = u.a) != null && (c8928q92 = e95.a) != null) {
            AbstractC7840ll<Integer, Integer> a3 = c8928q92.a();
            this.Y = a3;
            a3.a(this);
            j(this.Y);
        }
        if (u != null && (e94 = u.a) != null && (c8928q9 = e94.b) != null) {
            AbstractC7840ll<Integer, Integer> a4 = c8928q9.a();
            this.a0 = a4;
            a4.a(this);
            j(this.a0);
        }
        if (u != null && (e93 = u.a) != null && (c9177r92 = e93.c) != null) {
            C8629ov0 a5 = c9177r92.a();
            this.c0 = a5;
            a5.a(this);
            j(this.c0);
        }
        if (u != null && (e92 = u.a) != null && (c9177r9 = e92.d) != null) {
            C8629ov0 a6 = c9177r9.a();
            this.e0 = a6;
            a6.a(this);
            j(this.e0);
        }
        if (u != null && (e9 = u.a) != null && (c9663t94 = e9.e) != null) {
            AbstractC7840ll<Integer, Integer> a7 = c9663t94.a();
            this.g0 = a7;
            a7.a(this);
            j(this.g0);
        }
        if (u != null && (d94 = u.b) != null && (c9663t93 = d94.a) != null) {
            AbstractC7840ll<Integer, Integer> a8 = c9663t93.a();
            this.j0 = a8;
            a8.a(this);
            j(this.j0);
        }
        if (u != null && (d93 = u.b) != null && (c9663t92 = d93.b) != null) {
            AbstractC7840ll<Integer, Integer> a9 = c9663t92.a();
            this.k0 = a9;
            a9.a(this);
            j(this.k0);
        }
        if (u != null && (d92 = u.b) != null && (c9663t9 = d92.c) != null) {
            AbstractC7840ll<Integer, Integer> a10 = c9663t9.a();
            this.l0 = a10;
            a10.a(this);
            j(this.l0);
        }
        if (u != null && (d9 = u.b) != null) {
            this.X = d9.d;
        }
    }

    public final String P(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!g0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.R.e(j)) {
            return this.R.h(j);
        }
        this.I.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.I.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.I.toString();
        this.R.n(j, sb);
        return sb;
    }

    public final void Q(O40 o40, int i, int i2) {
        int intValue;
        AbstractC7840ll<Integer, Integer> abstractC7840ll = this.Z;
        if (abstractC7840ll != null) {
            this.O.setColor(abstractC7840ll.h().intValue());
        } else if (this.Y != null && e0(i2)) {
            this.O.setColor(this.Y.h().intValue());
        } else {
            this.O.setColor(o40.h);
        }
        AbstractC7840ll<Integer, Integer> abstractC7840ll2 = this.b0;
        if (abstractC7840ll2 != null) {
            this.P.setColor(abstractC7840ll2.h().intValue());
        } else if (this.a0 != null && e0(i2)) {
            this.P.setColor(this.a0.h().intValue());
        } else {
            this.P.setColor(o40.i);
        }
        int i3 = 100;
        if (this.x.k() == null) {
            intValue = 100;
        } else {
            intValue = this.x.k().h().intValue();
        }
        if (this.g0 != null && e0(i2)) {
            i3 = this.g0.h().intValue();
        }
        int round = Math.round(((((intValue * 255.0f) / 100.0f) * (i3 / 100.0f)) * i) / 255.0f);
        this.O.setAlpha(round);
        this.P.setAlpha(round);
        AbstractC7840ll<Float, Float> abstractC7840ll3 = this.d0;
        if (abstractC7840ll3 != null) {
            this.P.setStrokeWidth(abstractC7840ll3.h().floatValue());
        } else if (this.c0 != null && e0(i2)) {
            this.P.setStrokeWidth(this.c0.h().floatValue());
        } else {
            this.P.setStrokeWidth(o40.j * C6006eE2.e());
        }
    }

    public final void R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    public final void S(C4276Sw0 c4276Sw0, float f, O40 o40, Canvas canvas, int i, int i2) {
        Q(o40, i2, i);
        List<HL> b0 = b0(c4276Sw0);
        for (int i3 = 0; i3 < b0.size(); i3++) {
            Path Y = b0.get(i3).Y();
            Y.computeBounds(this.M, false);
            this.N.reset();
            this.N.preTranslate(0.0f, (-o40.g) * C6006eE2.e());
            this.N.preScale(f, f);
            Y.transform(this.N);
            if (o40.k) {
                V(Y, this.O, canvas);
                V(Y, this.P, canvas);
            } else {
                V(Y, this.P, canvas);
                V(Y, this.O, canvas);
            }
        }
    }

    public final void T(String str, O40 o40, Canvas canvas, int i, int i2) {
        Q(o40, i2, i);
        if (o40.k) {
            R(str, this.O, canvas);
            R(str, this.P, canvas);
            return;
        }
        R(str, this.P, canvas);
        R(str, this.O, canvas);
    }

    public final void U(String str, O40 o40, Canvas canvas, float f, int i, int i2) {
        this.S.clear();
        int i3 = 0;
        while (i3 < str.length()) {
            String P = P(str, i3);
            this.S.add(P);
            i3 += P.length();
        }
        int i4 = 0;
        while (i4 < this.S.size()) {
            this.J.setLength(0);
            this.J.append(this.S.get(i4));
            int i5 = i4 + 1;
            while (i5 < this.S.size()) {
                String str2 = this.S.get(i5);
                if (f0(str2)) {
                    this.J.insert(0, str2);
                    i5++;
                }
            }
            String sb = this.J.toString();
            O40 o402 = o40;
            T(sb, o402, canvas, i + i4, i2);
            canvas.translate(this.O.measureText(sb) + f, 0.0f);
            i4 = i5;
            o40 = o402;
        }
    }

    public final void V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    public final void W(String str, O40 o40, C3982Pw0 c3982Pw0, Canvas canvas, float f, float f2, float f3, int i) {
        O40 o402;
        Canvas canvas2;
        float f4;
        int i2;
        int i3 = 0;
        while (i3 < str.length()) {
            C4276Sw0 h = this.W.c().h(C4276Sw0.c(str.charAt(i3), c3982Pw0.b(), c3982Pw0.d()));
            if (h == null) {
                o402 = o40;
                canvas2 = canvas;
                f4 = f2;
                i2 = i;
            } else {
                o402 = o40;
                canvas2 = canvas;
                f4 = f2;
                i2 = i;
                S(h, f4, o402, canvas2, i3, i2);
                canvas2.translate((((float) h.b()) * f4 * C6006eE2.e()) + f3, 0.0f);
            }
            i3++;
            f2 = f4;
            o40 = o402;
            canvas = canvas2;
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(O40 o40, C3982Pw0 c3982Pw0, Canvas canvas, int i) {
        float f;
        float floatValue;
        int size;
        int i2;
        float f2;
        float measureText;
        float f3;
        int i3;
        C3752Nm2 c3752Nm2 = this;
        O40 o402 = o40;
        C3982Pw0 c3982Pw02 = c3982Pw0;
        Typeface d0 = c3752Nm2.d0(c3982Pw02);
        if (d0 != null) {
            String str = o402.a;
            C9816tm2 n0 = c3752Nm2.V.n0();
            if (n0 != null) {
                str = n0.c(c3752Nm2.getName(), str);
            }
            c3752Nm2.O.setTypeface(d0);
            AbstractC7840ll<Float, Float> abstractC7840ll = c3752Nm2.h0;
            if (abstractC7840ll != null) {
                f = abstractC7840ll.h().floatValue();
            } else {
                f = o402.c;
            }
            c3752Nm2.O.setTextSize(C6006eE2.e() * f);
            c3752Nm2.P.setTypeface(c3752Nm2.O.getTypeface());
            c3752Nm2.P.setTextSize(c3752Nm2.O.getTextSize());
            float f4 = o402.e / 10.0f;
            AbstractC7840ll<Float, Float> abstractC7840ll2 = c3752Nm2.f0;
            if (abstractC7840ll2 != null) {
                floatValue = abstractC7840ll2.h().floatValue();
            } else {
                AbstractC7840ll<Float, Float> abstractC7840ll3 = c3752Nm2.e0;
                if (abstractC7840ll3 != null) {
                    floatValue = abstractC7840ll3.h().floatValue();
                }
                float e = ((f4 * C6006eE2.e()) * f) / 100.0f;
                List<String> c0 = c3752Nm2.c0(str);
                size = c0.size();
                int i4 = -1;
                i2 = 0;
                int i5 = 0;
                while (i2 < size) {
                    String str2 = c0.get(i2);
                    PointF pointF = o402.m;
                    if (pointF == null) {
                        f2 = 0.0f;
                    } else {
                        f2 = pointF.x;
                    }
                    float f5 = e;
                    List<d> j0 = c3752Nm2.j0(str2, f2, c3982Pw02, 0.0f, f5, false);
                    int i6 = 0;
                    while (i6 < j0.size()) {
                        d dVar = j0.get(i6);
                        i4++;
                        canvas.save();
                        if (c3752Nm2.U == null && c3752Nm2.h0 == null && c3752Nm2.f0 == null) {
                            measureText = dVar.b;
                        } else {
                            measureText = c3752Nm2.O.measureText(dVar.a);
                        }
                        if (c3752Nm2.h0(canvas, o402, i4, measureText)) {
                            String str3 = dVar.a;
                            if (Bidi.requiresBidi(str3.toCharArray(), 0, str3.length())) {
                                str3 = c3752Nm2.i0(str3);
                            }
                            f3 = f5;
                            i3 = i5;
                            c3752Nm2.U(str3, o402, canvas, f3, i3, i);
                        } else {
                            f3 = f5;
                            i3 = i5;
                        }
                        i5 = i3 + dVar.a.length();
                        canvas.restore();
                        i6++;
                        c3752Nm2 = this;
                        o402 = o40;
                        f5 = f3;
                    }
                    e = f5;
                    i2++;
                    c3752Nm2 = this;
                    o402 = o40;
                    c3982Pw02 = c3982Pw0;
                }
            }
            f4 += floatValue;
            float e2 = ((f4 * C6006eE2.e()) * f) / 100.0f;
            List<String> c02 = c3752Nm2.c0(str);
            size = c02.size();
            int i42 = -1;
            i2 = 0;
            int i52 = 0;
            while (i2 < size) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(O40 o40, Matrix matrix, C3982Pw0 c3982Pw0, Canvas canvas, int i) {
        float f;
        float floatValue;
        int i2;
        float f2;
        float f3;
        float f4;
        C3752Nm2 c3752Nm2 = this;
        O40 o402 = o40;
        AbstractC7840ll<Float, Float> abstractC7840ll = c3752Nm2.h0;
        if (abstractC7840ll != null) {
            f = abstractC7840ll.h().floatValue();
        } else {
            f = o402.c;
        }
        float f5 = f / 100.0f;
        float g = C6006eE2.g(matrix);
        List<String> c0 = c3752Nm2.c0(o402.a);
        int size = c0.size();
        float f6 = o402.e / 10.0f;
        AbstractC7840ll<Float, Float> abstractC7840ll2 = c3752Nm2.f0;
        if (abstractC7840ll2 != null) {
            floatValue = abstractC7840ll2.h().floatValue();
        } else {
            AbstractC7840ll<Float, Float> abstractC7840ll3 = c3752Nm2.e0;
            if (abstractC7840ll3 != null) {
                floatValue = abstractC7840ll3.h().floatValue();
            }
            float f7 = f6;
            int i3 = -1;
            i2 = 0;
            while (i2 < size) {
                String str = c0.get(i2);
                PointF pointF = o402.m;
                if (pointF == null) {
                    f2 = 0.0f;
                } else {
                    f2 = pointF.x;
                }
                List<d> j0 = c3752Nm2.j0(str, f2, c3982Pw0, f5, f7, true);
                int i4 = 0;
                while (i4 < j0.size()) {
                    d dVar = j0.get(i4);
                    i3++;
                    canvas.save();
                    if (c3752Nm2.h0(canvas, o402, i3, dVar.b)) {
                        float f8 = f5;
                        O40 o403 = o402;
                        f3 = f7;
                        f4 = g;
                        c3752Nm2.W(dVar.a, o403, c3982Pw0, canvas, f4, f8, f3, i);
                        f5 = f8;
                    } else {
                        f3 = f7;
                        f4 = g;
                    }
                    canvas.restore();
                    i4++;
                    c3752Nm2 = this;
                    g = f4;
                    f7 = f3;
                    o402 = o40;
                }
                i2++;
                c3752Nm2 = this;
                f7 = f7;
                o402 = o40;
            }
        }
        f6 += floatValue;
        float f72 = f6;
        int i32 = -1;
        i2 = 0;
        while (i2 < size) {
        }
    }

    public final d a0(int i) {
        for (int size = this.T.size(); size < i; size++) {
            this.T.add(new d(null));
        }
        return this.T.get(i - 1);
    }

    public final List<HL> b0(C4276Sw0 c4276Sw0) {
        if (this.Q.containsKey(c4276Sw0)) {
            return this.Q.get(c4276Sw0);
        }
        List<V22> a2 = c4276Sw0.a();
        int size = a2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new HL(this.V, this, a2.get(i), this.W));
        }
        this.Q.put(c4276Sw0, arrayList);
        return arrayList;
    }

    public final List<String> c0(String str) {
        return Arrays.asList(str.replaceAll(VI0.D, "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // o.AbstractC8588ol, o.BX0
    public <T> void d(T t, O61<T> o61) {
        super.d(t, o61);
        if (t == D61.a) {
            AbstractC7840ll<Integer, Integer> abstractC7840ll = this.Z;
            if (abstractC7840ll != null) {
                H(abstractC7840ll);
            }
            if (o61 == null) {
                this.Z = null;
                return;
            }
            CE2 ce2 = new CE2(o61);
            this.Z = ce2;
            ce2.a(this);
            j(this.Z);
        } else if (t == D61.b) {
            AbstractC7840ll<Integer, Integer> abstractC7840ll2 = this.b0;
            if (abstractC7840ll2 != null) {
                H(abstractC7840ll2);
            }
            if (o61 == null) {
                this.b0 = null;
                return;
            }
            CE2 ce22 = new CE2(o61);
            this.b0 = ce22;
            ce22.a(this);
            j(this.b0);
        } else if (t == D61.v) {
            AbstractC7840ll<Float, Float> abstractC7840ll3 = this.d0;
            if (abstractC7840ll3 != null) {
                H(abstractC7840ll3);
            }
            if (o61 == null) {
                this.d0 = null;
                return;
            }
            CE2 ce23 = new CE2(o61);
            this.d0 = ce23;
            ce23.a(this);
            j(this.d0);
        } else if (t == D61.w) {
            AbstractC7840ll<Float, Float> abstractC7840ll4 = this.f0;
            if (abstractC7840ll4 != null) {
                H(abstractC7840ll4);
            }
            if (o61 == null) {
                this.f0 = null;
                return;
            }
            CE2 ce24 = new CE2(o61);
            this.f0 = ce24;
            ce24.a(this);
            j(this.f0);
        } else if (t == D61.I) {
            AbstractC7840ll<Float, Float> abstractC7840ll5 = this.h0;
            if (abstractC7840ll5 != null) {
                H(abstractC7840ll5);
            }
            if (o61 == null) {
                this.h0 = null;
                return;
            }
            CE2 ce25 = new CE2(o61);
            this.h0 = ce25;
            ce25.a(this);
            j(this.h0);
        } else if (t == D61.P) {
            AbstractC7840ll<Typeface, Typeface> abstractC7840ll6 = this.i0;
            if (abstractC7840ll6 != null) {
                H(abstractC7840ll6);
            }
            if (o61 == null) {
                this.i0 = null;
                return;
            }
            CE2 ce26 = new CE2(o61);
            this.i0 = ce26;
            ce26.a(this);
            j(this.i0);
        } else if (t == D61.R) {
            this.U.s(o61);
        }
    }

    public final Typeface d0(C3982Pw0 c3982Pw0) {
        Typeface h;
        AbstractC7840ll<Typeface, Typeface> abstractC7840ll = this.i0;
        if (abstractC7840ll != null && (h = abstractC7840ll.h()) != null) {
            return h;
        }
        Typeface o0 = this.V.o0(c3982Pw0);
        if (o0 != null) {
            return o0;
        }
        return c3982Pw0.e();
    }

    public final boolean e0(int i) {
        int length = this.U.h().a.length();
        AbstractC7840ll<Integer, Integer> abstractC7840ll = this.j0;
        if (abstractC7840ll == null || this.k0 == null) {
            return true;
        }
        int min = Math.min(abstractC7840ll.h().intValue(), this.k0.h().intValue());
        int max = Math.max(this.j0.h().intValue(), this.k0.h().intValue());
        AbstractC7840ll<Integer, Integer> abstractC7840ll2 = this.l0;
        if (abstractC7840ll2 != null) {
            int intValue = abstractC7840ll2.h().intValue();
            min += intValue;
            max += intValue;
        }
        if (this.X == EnumC4141Rm2.INDEX) {
            if (i >= min && i < max) {
                return true;
            }
            return false;
        }
        float f = (i / length) * 100.0f;
        if (f >= min && f < max) {
            return true;
        }
        return false;
    }

    public final boolean f0(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.getDirectionality(str.codePointAt(i)) == 2) {
                return true;
            }
        }
        return false;
    }

    public final boolean g0(int i) {
        if (Character.getType(i) != 16 && Character.getType(i) != 27 && Character.getType(i) != 6 && Character.getType(i) != 28 && Character.getType(i) != 8 && Character.getType(i) != 19) {
            return false;
        }
        return true;
    }

    @Override // o.AbstractC8588ol, o.InterfaceC6474g70
    public void h(RectF rectF, Matrix matrix, boolean z) {
        super.h(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.W.b().width(), this.W.b().height());
    }

    public final boolean h0(Canvas canvas, O40 o40, int i, float f) {
        float f2;
        float f3;
        PointF pointF = o40.l;
        PointF pointF2 = o40.m;
        float e = C6006eE2.e();
        float f4 = 0.0f;
        if (pointF == null) {
            f2 = 0.0f;
        } else {
            f2 = (o40.f * e) + pointF.y;
        }
        float f5 = (i * o40.f * e) + f2;
        if (this.V.T() && pointF2 != null && pointF != null && f5 >= pointF.y + pointF2.y + o40.c) {
            return false;
        }
        if (pointF == null) {
            f3 = 0.0f;
        } else {
            f3 = pointF.x;
        }
        if (pointF2 != null) {
            f4 = pointF2.x;
        }
        int i2 = c.a[o40.d.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f5);
                }
            } else {
                canvas.translate((f3 + f4) - f, f5);
            }
        } else {
            canvas.translate(f3, f5);
        }
        return true;
    }

    public final String i0(String str) {
        Bidi bidi = new Bidi(str, -2);
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i = 0; i < runCount; i++) {
            bArr[i] = (byte) bidi.getRunLevel(i);
            numArr[i] = Integer.valueOf(i);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        this.K.setLength(0);
        for (int i2 = 0; i2 < runCount; i2++) {
            int intValue = numArr[i2].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            int runLevel = bidi.getRunLevel(intValue);
            String substring = str.substring(runStart, runLimit);
            if ((runLevel & 1) == 0) {
                this.K.append(substring);
            } else {
                this.L.setLength(0);
                int i3 = 0;
                while (i3 < substring.length()) {
                    String P = P(substring, i3);
                    this.L.insert(0, P);
                    i3 += P.length();
                }
                this.K.append((CharSequence) this.L);
            }
        }
        return this.K.toString();
    }

    public final List<d> j0(String str, float f, C3982Pw0 c3982Pw0, float f2, float f3, boolean z) {
        float measureText;
        String substring;
        String trim;
        String substring2;
        String trim2;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                C4276Sw0 h = this.W.c().h(C4276Sw0.c(charAt, c3982Pw0.b(), c3982Pw0.d()));
                if (h != null) {
                    measureText = ((float) h.b()) * f2 * C6006eE2.e();
                }
            } else {
                measureText = this.O.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                d a0 = a0(i);
                if (i3 == i2) {
                    a0.c(str.substring(i2, i4).trim(), (f4 - f7) - ((trim2.length() - substring2.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    a0.c(str.substring(i2, i3 - 1).trim(), ((f4 - f5) - ((substring.length() - trim.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            a0(i).c(str.substring(i2), f4);
        }
        return this.T.subList(0, i);
    }

    @Override // o.AbstractC8588ol
    public void u(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        Canvas canvas2;
        O40 h = this.U.h();
        C3982Pw0 c3982Pw0 = this.W.g().get(h.b);
        if (c3982Pw0 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Q(h, i, 0);
        if (this.V.z1()) {
            canvas2 = canvas;
            Z(h, matrix, c3982Pw0, canvas2, i);
        } else {
            canvas2 = canvas;
            X(h, c3982Pw0, canvas2, i);
        }
        canvas2.restore();
    }

    /* renamed from: o.Nm2$d */
    /* loaded from: classes.dex */
    public static class d {
        public String a;
        public float b;

        public d() {
            this.a = "";
            this.b = 0.0f;
        }

        public void c(String str, float f) {
            this.a = str;
            this.b = f;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }
}
