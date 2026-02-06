package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import o.C10231vT1;

/* renamed from: o.Ep2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2872Ep2 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    /* renamed from: o.Ep2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        public static int b(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public C2872Ep2(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static C2872Ep2 E(Context context, int i, int[] iArr) {
        return new C2872Ep2(context, context.obtainStyledAttributes(i, iArr));
    }

    public static C2872Ep2 F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C2872Ep2(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static C2872Ep2 G(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C2872Ep2(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public boolean A(int i, TypedValue typedValue) {
        return this.b.getValue(i, typedValue);
    }

    public TypedArray B() {
        return this.b;
    }

    public boolean C(int i) {
        return this.b.hasValue(i);
    }

    public int D() {
        return this.b.length();
    }

    public TypedValue H(int i) {
        return this.b.peekValue(i);
    }

    public void I() {
        this.b.recycle();
    }

    public boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public int b() {
        return a.a(this.b);
    }

    public int c(int i, int i2) {
        return this.b.getColor(i, i2);
    }

    public ColorStateList d(int i) {
        int resourceId;
        ColorStateList a2;
        if (this.b.hasValue(i) && (resourceId = this.b.getResourceId(i, 0)) != 0 && (a2 = C3220Ic.a(this.a, resourceId)) != null) {
            return a2;
        }
        return this.b.getColorStateList(i);
    }

    public float e(int i, float f) {
        return this.b.getDimension(i, f);
    }

    public int f(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public int g(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public Drawable h(int i) {
        int resourceId;
        if (this.b.hasValue(i) && (resourceId = this.b.getResourceId(i, 0)) != 0) {
            return C3220Ic.b(this.a, resourceId);
        }
        return this.b.getDrawable(i);
    }

    public Drawable i(int i) {
        int resourceId;
        if (this.b.hasValue(i) && (resourceId = this.b.getResourceId(i, 0)) != 0) {
            return C9038qc.b().d(this.a, resourceId, true);
        }
        return null;
    }

    public float j(int i, float f) {
        return this.b.getFloat(i, f);
    }

    public Typeface k(int i, int i2, C10231vT1.f fVar) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return C10231vT1.k(this.a, resourceId, this.c, i2, fVar);
    }

    public float l(int i, int i2, int i3, float f) {
        return this.b.getFraction(i, i2, i3, f);
    }

    public int m(int i) {
        return this.b.getIndex(i);
    }

    public int n() {
        return this.b.getIndexCount();
    }

    public int o(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public int p(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public int q(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public int r(int i, String str) {
        return this.b.getLayoutDimension(i, str);
    }

    public String s(int i) {
        return this.b.getNonResourceString(i);
    }

    public String t() {
        return this.b.getPositionDescription();
    }

    public int u(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public Resources v() {
        return this.b.getResources();
    }

    public String w(int i) {
        return this.b.getString(i);
    }

    public CharSequence x(int i) {
        return this.b.getText(i);
    }

    public CharSequence[] y(int i) {
        return this.b.getTextArray(i);
    }

    public int z(int i) {
        return a.b(this.b, i);
    }
}
