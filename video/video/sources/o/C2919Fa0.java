package o;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: o.Fa0 */
/* loaded from: classes.dex */
public final class C2919Fa0 implements InputFilter {
    public final TextView a;
    public c.g b;

    /* renamed from: o.Fa0$a */
    /* loaded from: classes.dex */
    public static class a extends c.g {
        public final Reference<TextView> a;
        public final Reference<C2919Fa0> b;

        public a(TextView textView, C2919Fa0 c2919Fa0) {
            this.a = new WeakReference(textView);
            this.b = new WeakReference(c2919Fa0);
        }

        @Override // androidx.emoji2.text.c.g
        public void b() {
            CharSequence text;
            CharSequence x;
            super.b();
            TextView textView = this.a.get();
            if (c(textView, this.b.get()) && textView.isAttachedToWindow() && text != (x = androidx.emoji2.text.c.c().x((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(x);
                int selectionEnd = Selection.getSelectionEnd(x);
                textView.setText(x);
                if (x instanceof Spannable) {
                    C2919Fa0.b((Spannable) x, selectionStart, selectionEnd);
                }
            }
        }

        public final boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public C2919Fa0(TextView textView) {
        this.a = textView;
    }

    public static void b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public final c.g a() {
        if (this.b == null) {
            this.b = new a(this.a, this);
        }
        return this.b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!this.a.isInEditMode()) {
            int i5 = androidx.emoji2.text.c.c().i();
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 3) {
                        return charSequence;
                    }
                } else if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.a.getText()) {
                    return charSequence;
                } else {
                    if (charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return androidx.emoji2.text.c.c().y(charSequence, 0, charSequence.length());
                    }
                    return charSequence;
                }
            }
            androidx.emoji2.text.c.c().B(a());
            return charSequence;
        }
        return charSequence;
    }
}
