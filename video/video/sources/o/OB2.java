package o;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public class OB2 implements Spannable {
    public boolean X = false;
    public Spannable Y;

    /* loaded from: classes.dex */
    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof C7234jF1;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // o.OB2.b
        public boolean a(CharSequence charSequence) {
            if (!C5282bF1.a(charSequence) && !(charSequence instanceof C7234jF1)) {
                return false;
            }
            return true;
        }
    }

    public OB2(Spannable spannable) {
        this.Y = spannable;
    }

    public static b c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new b();
        }
        return new c();
    }

    public final void a() {
        Spannable spannable = this.Y;
        if (!this.X && c().a(spannable)) {
            this.Y = new SpannableString(spannable);
        }
        this.X = true;
    }

    public Spannable b() {
        return this.Y;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.Y.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.Y);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.Y);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.Y.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.Y.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.Y.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.Y.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.Y.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.Y.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.Y.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.Y.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.Y.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.Y.toString();
    }

    public OB2(Spanned spanned) {
        this.Y = new SpannableString(spanned);
    }

    public OB2(CharSequence charSequence) {
        this.Y = new SpannableString(charSequence);
    }
}
