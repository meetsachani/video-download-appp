package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.c;
import o.C3889Ox1;

/* loaded from: classes.dex */
public class b implements c.f {
    public static final int b = 10;
    public static final ThreadLocal<StringBuilder> c = new ThreadLocal<>();
    public final TextPaint a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = c;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.c.f
    public boolean a(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder b2 = b();
        b2.setLength(0);
        while (i < i2) {
            b2.append(charSequence.charAt(i));
            i++;
        }
        return C3889Ox1.a(this.a, b2.toString());
    }
}
