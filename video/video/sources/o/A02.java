package o;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class A02 {
    @NotNull
    public static final A02 a = new A02();

    @InterfaceC9511sW0
    public static final boolean g(@Nullable View view) {
        if (SQ.e(A02.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            A02 a02 = a;
            if (!a02.c((TextView) view) && !a02.a((TextView) view) && !a02.d((TextView) view) && !a02.f((TextView) view) && !a02.e((TextView) view)) {
                if (!a02.b((TextView) view)) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            SQ.c(th, A02.class);
            return false;
        }
    }

    public final boolean a(TextView textView) {
        int i;
        if (SQ.e(this)) {
            return false;
        }
        try {
            C9455sH2 c9455sH2 = C9455sH2.a;
            String o2 = new C10219vQ1("\\s").o(C9455sH2.k(textView), "");
            int length = o2.length();
            if (length >= 12 && length <= 19) {
                int i2 = length - 1;
                if (i2 >= 0) {
                    boolean z = false;
                    i = 0;
                    while (true) {
                        int i3 = i2 - 1;
                        char charAt = o2.charAt(i2);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        int F = CB.F(charAt);
                        if (z && (F = F * 2) > 9) {
                            F = (F % 10) + 1;
                        }
                        i += F;
                        z = !z;
                        if (i3 < 0) {
                            break;
                        }
                        i2 = i3;
                    }
                } else {
                    i = 0;
                }
                if (i % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final boolean b(TextView textView) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            C9455sH2 c9455sH2 = C9455sH2.a;
            String k = C9455sH2.k(textView);
            if (k != null && k.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(k).matches();
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final boolean c(TextView textView) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final boolean d(TextView textView) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            if (textView.getInputType() != 96) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final boolean e(TextView textView) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            if (textView.getInputType() != 3) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final boolean f(TextView textView) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            if (textView.getInputType() != 112) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }
}
