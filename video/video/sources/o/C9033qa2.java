package o;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.qa2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9033qa2 extends SpannableStringBuilder {
    public final Class<?> X;
    public final List<a> Y;

    /* renamed from: o.qa2$a */
    /* loaded from: classes.dex */
    public static class a implements TextWatcher, SpanWatcher {
        public final Object X;
        public final AtomicInteger Y = new AtomicInteger(0);

        public a(Object obj) {
            this.X = obj;
        }

        public final void a() {
            this.Y.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.X).afterTextChanged(editable);
        }

        public final boolean b(Object obj) {
            return obj instanceof AbstractC3115Ha0;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.X).beforeTextChanged(charSequence, i, i2, i3);
        }

        public final void c() {
            this.Y.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.Y.get() > 0 && b(obj)) {
                return;
            }
            ((SpanWatcher) this.X).onSpanAdded(spannable, obj, i, i2);
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.Y.get() > 0 && b(obj)) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                    ((SpanWatcher) this.X).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                }
            }
            i5 = i;
            i6 = i3;
            ((SpanWatcher) this.X).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.Y.get() > 0 && b(obj)) {
                return;
            }
            ((SpanWatcher) this.X).onSpanRemoved(spannable, obj, i, i2);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.X).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public C9033qa2(Class<?> cls) {
        this.Y = new ArrayList();
        C10907yF1.m(cls, "watcherClass cannot be null");
        this.X = cls;
    }

    public static C9033qa2 d(Class<?> cls, CharSequence charSequence) {
        return new C9033qa2(cls, charSequence);
    }

    public void b() {
        c();
    }

    public final void c() {
        for (int i = 0; i < this.Y.size(); i++) {
            this.Y.get(i).a();
        }
    }

    public void e() {
        j();
        f();
    }

    public final void f() {
        for (int i = 0; i < this.Y.size(); i++) {
            this.Y.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    public final a g(Object obj) {
        for (int i = 0; i < this.Y.size(); i++) {
            a aVar = this.Y.get(i);
            if (aVar.X == obj) {
                return aVar;
            }
        }
        return null;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a g;
        if (i(obj) && (g = g(obj)) != null) {
            obj = g;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a g;
        if (i(obj) && (g = g(obj)) != null) {
            obj = g;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a g;
        if (i(obj) && (g = g(obj)) != null) {
            obj = g;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (h(cls)) {
            a[] aVarArr = (a[]) super.getSpans(i, i2, a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
            for (int i3 = 0; i3 < aVarArr.length; i3++) {
                tArr[i3] = aVarArr[i3].X;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    public final boolean h(Class<?> cls) {
        if (this.X == cls) {
            return true;
        }
        return false;
    }

    public final boolean i(Object obj) {
        if (obj != null && h(obj.getClass())) {
            return true;
        }
        return false;
    }

    public final void j() {
        for (int i = 0; i < this.Y.size(); i++) {
            this.Y.get(i).c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return super.nextSpanTransition(i, i2, (cls == null || h(cls)) ? a.class : a.class);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVar;
        if (i(obj)) {
            aVar = g(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.Y.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (i(obj)) {
            a aVar = new a(obj);
            this.Y.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return new C9033qa2(this.X, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        c();
        super.replace(i, i2, charSequence);
        j();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public C9033qa2(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.Y = new ArrayList();
        C10907yF1.m(cls, "watcherClass cannot be null");
        this.X = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        c();
        super.replace(i, i2, charSequence, i3, i4);
        j();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public C9033qa2(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.Y = new ArrayList();
        C10907yF1.m(cls, "watcherClass cannot be null");
        this.X = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
