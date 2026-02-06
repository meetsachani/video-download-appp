package o;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: o.zd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11240zd1 implements InputFilter {
    public int a;

    public C11240zd1(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    public void b(int i) {
        this.a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
