package o;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import o.C7284jS;

@Deprecated
/* renamed from: o.ah2 */
/* loaded from: classes2.dex */
public final class C5146ah2 {
    public static /* synthetic */ boolean a(Object obj) {
        if (!(obj instanceof AbsoluteSizeSpan) && !(obj instanceof RelativeSizeSpan)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof InterfaceC8539oY0);
    }

    public static void c(C7284jS.c cVar) {
        cVar.b();
        if (cVar.k() instanceof Spanned) {
            if (!(cVar.k() instanceof Spannable)) {
                cVar.A(SpannableString.valueOf(cVar.k()));
            }
            e((Spannable) C9542sf.g(cVar.k()), new IF1() { // from class: o.Yg2
                @Override // o.IF1
                public final boolean apply(Object obj) {
                    return C5146ah2.b(obj);
                }
            });
        }
        d(cVar);
    }

    public static void d(C7284jS.c cVar) {
        cVar.C(-3.4028235E38f, Integer.MIN_VALUE);
        if (cVar.k() instanceof Spanned) {
            if (!(cVar.k() instanceof Spannable)) {
                cVar.A(SpannableString.valueOf(cVar.k()));
            }
            e((Spannable) C9542sf.g(cVar.k()), new IF1() { // from class: o.Zg2
                @Override // o.IF1
                public final boolean apply(Object obj) {
                    return C5146ah2.a(obj);
                }
            });
        }
    }

    public static void e(Spannable spannable, IF1<Object> if1) {
        Object[] spans;
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (if1.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float f(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        } else {
            f2 = i3;
        }
        return f * f2;
    }
}
