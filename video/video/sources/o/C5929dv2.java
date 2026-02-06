package o;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

@Deprecated
/* renamed from: o.dv2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5929dv2 {
    public static final String a = "TtmlRenderUtil";

    public static void a(Spannable spannable, int i, int i2, C6172ev2 c6172ev2, @InterfaceC11300zs1 C5445bv2 c5445bv2, Map<String, C6172ev2> map, int i3) {
        C5445bv2 e;
        int i4;
        C6172ev2 f;
        int i5;
        if (c6172ev2.l() != -1) {
            spannable.setSpan(new StyleSpan(c6172ev2.l()), i, i2, 33);
        }
        if (c6172ev2.t()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c6172ev2.u()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c6172ev2.q()) {
            C8790pa2.a(spannable, new ForegroundColorSpan(c6172ev2.c()), i, i2, 33);
        }
        if (c6172ev2.p()) {
            C8790pa2.a(spannable, new BackgroundColorSpan(c6172ev2.b()), i, i2, 33);
        }
        if (c6172ev2.d() != null) {
            C8790pa2.a(spannable, new TypefaceSpan(c6172ev2.d()), i, i2, 33);
        }
        if (c6172ev2.o() != null) {
            C10791xm2 c10791xm2 = (C10791xm2) C9542sf.g(c6172ev2.o());
            int i6 = c10791xm2.a;
            if (i6 == -1) {
                if (i3 != 2 && i3 != 1) {
                    i6 = 1;
                } else {
                    i6 = 3;
                }
                i5 = 1;
            } else {
                i5 = c10791xm2.b;
            }
            int i7 = c10791xm2.c;
            if (i7 == -2) {
                i7 = 1;
            }
            C8790pa2.a(spannable, new C11034ym2(i6, i5, i7), i, i2, 33);
        }
        int j = c6172ev2.j();
        if (j != 2) {
            if (j == 3 || j == 4) {
                spannable.setSpan(new C4986a20(), i, i2, 33);
            }
        } else {
            C5445bv2 d = d(c5445bv2, map);
            if (d != null && (e = e(d, map)) != null) {
                if (e.g() == 1 && e.f(0).b != null) {
                    String str = (String) TD2.o(e.f(0).b);
                    C6172ev2 f2 = f(e.f, e.l(), map);
                    if (f2 != null) {
                        i4 = f2.i();
                    } else {
                        i4 = -1;
                    }
                    if (i4 == -1 && (f = f(d.f, d.l(), map)) != null) {
                        i4 = f.i();
                    }
                    spannable.setSpan(new C7300jW1(str, i4), i, i2, 33);
                } else {
                    I31.h(a, "Skipping rubyText node without exactly one text child.");
                }
            }
        }
        if (c6172ev2.n()) {
            C8790pa2.a(spannable, new C7488kI0(), i, i2, 33);
        }
        int f3 = c6172ev2.f();
        if (f3 != 1) {
            if (f3 != 2) {
                if (f3 != 3) {
                    return;
                }
                C8790pa2.a(spannable, new RelativeSizeSpan(c6172ev2.e() / 100.0f), i, i2, 33);
                return;
            }
            C8790pa2.a(spannable, new RelativeSizeSpan(c6172ev2.e()), i, i2, 33);
            return;
        }
        C8790pa2.a(spannable, new AbsoluteSizeSpan((int) c6172ev2.e(), true), i, i2, 33);
    }

    public static String b(String str) {
        return str.replaceAll(VI0.D, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", C4500Ve2.b).replaceAll("[ \t\\x0B\f\r]+", C4500Ve2.b);
    }

    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    @InterfaceC11300zs1
    public static C5445bv2 d(@InterfaceC11300zs1 C5445bv2 c5445bv2, Map<String, C6172ev2> map) {
        while (c5445bv2 != null) {
            C6172ev2 f = f(c5445bv2.f, c5445bv2.l(), map);
            if (f != null && f.j() == 1) {
                return c5445bv2;
            }
            c5445bv2 = c5445bv2.j;
        }
        return null;
    }

    @InterfaceC11300zs1
    public static C5445bv2 e(C5445bv2 c5445bv2, Map<String, C6172ev2> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c5445bv2);
        while (!arrayDeque.isEmpty()) {
            C5445bv2 c5445bv22 = (C5445bv2) arrayDeque.pop();
            C6172ev2 f = f(c5445bv22.f, c5445bv22.l(), map);
            if (f != null && f.j() == 3) {
                return c5445bv22;
            }
            for (int g = c5445bv22.g() - 1; g >= 0; g--) {
                arrayDeque.push(c5445bv22.f(g));
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public static C6172ev2 f(@InterfaceC11300zs1 C6172ev2 c6172ev2, @InterfaceC11300zs1 String[] strArr, Map<String, C6172ev2> map) {
        int i = 0;
        if (c6172ev2 == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C6172ev2 c6172ev22 = new C6172ev2();
                int length = strArr.length;
                while (i < length) {
                    c6172ev22.a(map.get(strArr[i]));
                    i++;
                }
                return c6172ev22;
            }
        } else if (strArr != null && strArr.length == 1) {
            return c6172ev2.a(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c6172ev2.a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c6172ev2;
    }
}
