package o;

import android.os.Build;
import android.os.Trace;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: o.jF1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7234jF1 implements Spannable {
    public static final char Z0 = '\n';
    public static final Object a1 = new Object();
    public static Executor b1;
    public final Spannable X;
    public final b Y;
    public final PrecomputedText Y0;
    public final int[] Z;

    /* renamed from: o.jF1$c */
    /* loaded from: classes.dex */
    public static class c extends FutureTask<C7234jF1> {

        /* renamed from: o.jF1$c$a */
        /* loaded from: classes.dex */
        public static class a implements Callable<C7234jF1> {
            public b a;
            public CharSequence b;

            public a(b bVar, CharSequence charSequence) {
                this.a = bVar;
                this.b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public C7234jF1 call() throws Exception {
                return C7234jF1.a(this.b, this.a);
            }
        }

        public c(b bVar, CharSequence charSequence) {
            super(new a(bVar, charSequence));
        }
    }

    public C7234jF1(CharSequence charSequence, b bVar, int[] iArr) {
        this.X = new SpannableString(charSequence);
        this.Y = bVar;
        this.Z = iArr;
        this.Y0 = null;
    }

    public static C7234jF1 a(CharSequence charSequence, b bVar) {
        PrecomputedText.Params params;
        C10907yF1.l(charSequence);
        C10907yF1.l(bVar);
        try {
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = bVar.e) != null) {
                return new C7234jF1(C5039aF1.a(charSequence, params), bVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = TextUtils.indexOf(charSequence, '\n', i, length);
                if (indexOf < 0) {
                    i = length;
                } else {
                    i = indexOf + 1;
                }
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), bVar.e(), Integer.MAX_VALUE).setBreakStrategy(bVar.b()).setHyphenationFrequency(bVar.c()).setTextDirection(bVar.d()).build();
            return new C7234jF1(charSequence, bVar, iArr);
        } finally {
            Trace.endSection();
        }
    }

    public static Future<C7234jF1> g(CharSequence charSequence, b bVar, Executor executor) {
        c cVar = new c(bVar, charSequence);
        if (executor == null) {
            synchronized (a1) {
                try {
                    if (b1 == null) {
                        b1 = Executors.newFixedThreadPool(1);
                    }
                    executor = b1;
                } finally {
                }
            }
        }
        executor.execute(cVar);
        return cVar;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C6009eF1.a(this.Y0);
        }
        return this.Z.length;
    }

    public int c(int i) {
        C10907yF1.g(i, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return C6750hF1.a(this.Y0, i);
        }
        return this.Z[i];
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.X.charAt(i);
    }

    public int d(int i) {
        C10907yF1.g(i, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return C6993iF1.a(this.Y0, i);
        }
        if (i == 0) {
            return 0;
        }
        return this.Z[i - 1];
    }

    public b e() {
        return this.Y;
    }

    public PrecomputedText f() {
        if (C5282bF1.a(this.X)) {
            return C5524cF1.a(this.X);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.X.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.X.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.X.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) C5767dF1.a(this.Y0, i, i2, cls);
        }
        return (T[]) this.X.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.X.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.X.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                C6252fF1.a(this.Y0, obj);
                return;
            } else {
                this.X.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                C6507gF1.a(this.Y0, obj, i, i2, i3);
                return;
            } else {
                this.X.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.X.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.X.toString();
    }

    public C7234jF1(PrecomputedText precomputedText, b bVar) {
        this.X = a.a(precomputedText);
        this.Y = bVar;
        this.Z = null;
        this.Y0 = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* renamed from: o.jF1$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final TextPaint a;
        public final TextDirectionHeuristic b;
        public final int c;
        public final int d;
        public final PrecomputedText.Params e;

        /* renamed from: o.jF1$b$a */
        /* loaded from: classes.dex */
        public static class a {
            public final TextPaint a;
            public int c = 1;
            public int d = 1;
            public TextDirectionHeuristic b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a(TextPaint textPaint) {
                this.a = textPaint;
            }

            public b a() {
                return new b(this.a, this.b, this.c, this.d);
            }

            public a b(int i) {
                this.c = i;
                return this;
            }

            public a c(int i) {
                this.d = i;
                return this;
            }

            public a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        public b(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.e = C9446sF1.a(C9203rF1.a(C8954qF1.a(C8711pF1.a(C9689tF1.a(textPaint), i), i2), textDirectionHeuristic));
            } else {
                this.e = null;
            }
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i;
            this.d = i2;
        }

        public boolean a(b bVar) {
            if (this.c != bVar.b() || this.d != bVar.c() || this.a.getTextSize() != bVar.e().getTextSize() || this.a.getTextScaleX() != bVar.e().getTextScaleX() || this.a.getTextSkewX() != bVar.e().getTextSkewX() || this.a.getLetterSpacing() != bVar.e().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), bVar.e().getFontFeatureSettings()) || this.a.getFlags() != bVar.e().getFlags() || !this.a.getTextLocales().equals(bVar.e().getTextLocales())) {
                return false;
            }
            if (this.a.getTypeface() == null) {
                if (bVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.a.getTypeface().equals(bVar.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (a(bVar) && this.b == bVar.d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C2691Ct1.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.a.getTextSize());
            sb.append(", textScaleX=" + this.a.getTextScaleX());
            sb.append(", textSkewX=" + this.a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            sb.append(", textLocale=" + this.a.getTextLocales());
            sb.append(", typeface=" + this.a.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + C7477kF1.a(this.a));
            }
            sb.append(", textDir=" + this.b);
            sb.append(", breakStrategy=" + this.c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }

        public b(PrecomputedText.Params params) {
            this.a = C7720lF1.a(params);
            this.b = C7981mF1.a(params);
            this.c = C8224nF1.a(params);
            this.d = C8468oF1.a(params);
            this.e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }

    /* renamed from: o.jF1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Spannable a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }
}
