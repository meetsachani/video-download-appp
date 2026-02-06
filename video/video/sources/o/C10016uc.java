package o;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import o.OL1;

/* renamed from: o.uc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10016uc {
    public final TextView a;
    public final C3213Ia0 b;

    public C10016uc(TextView textView) {
        this.a = textView;
        this.b = new C3213Ia0(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.b.a(inputFilterArr);
    }

    public boolean b() {
        return this.b.b();
    }

    public void c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, OL1.m.v0, i, 0);
        try {
            int i2 = OL1.m.K0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void d(boolean z) {
        this.b.c(z);
    }

    public void e(boolean z) {
        this.b.d(z);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.b.f(transformationMethod);
    }
}
