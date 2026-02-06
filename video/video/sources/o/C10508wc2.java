package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import o.CH;
import o.E60;
import o.ZL1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.wc2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10508wc2 extends E60 {
    public static final String m1 = "StateListDrawableCompat";
    public static final boolean n1 = false;
    public a k1;
    public boolean l1;

    /* renamed from: o.wc2$a */
    /* loaded from: classes.dex */
    public static class a extends E60.d {
        public int[][] J;

        public a(a aVar, C10508wc2 c10508wc2, Resources resources) {
            super(aVar, c10508wc2, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[g()];
            }
        }

        public int D(int[] iArr, Drawable drawable) {
            int a = a(drawable);
            this.J[a] = iArr;
            return a;
        }

        public int E(int[] iArr) {
            int[][] iArr2 = this.J;
            int i = i();
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C10508wc2(this, null);
        }

        @Override // o.E60.d
        public void r(int i, int i2) {
            super.r(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.J, 0, iArr, 0, i);
            this.J = iArr;
        }

        @Override // o.E60.d
        public void v() {
            int[] iArr;
            int[][] iArr2 = this.J;
            int[][] iArr3 = new int[iArr2.length];
            for (int length = iArr2.length - 1; length >= 0; length--) {
                int[] iArr4 = this.J[length];
                if (iArr4 != null) {
                    iArr = (int[]) iArr4.clone();
                } else {
                    iArr = null;
                }
                iArr3[length] = iArr;
            }
            this.J = iArr3;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C10508wc2(this, resources);
        }
    }

    public C10508wc2() {
        this(null, null);
    }

    private void w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        a aVar = this.k1;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next2 != 3) {
                    if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                        TypedArray s = C5206aw2.s(resources, theme, attributeSet, ZL1.b.w);
                        int resourceId = s.getResourceId(ZL1.b.x, -1);
                        if (resourceId > 0) {
                            drawable = C9010qT1.h().j(context, resourceId);
                        } else {
                            drawable = null;
                        }
                        s.recycle();
                        int[] p = p(attributeSet);
                        if (drawable == null) {
                            do {
                                next = xmlPullParser.next();
                            } while (next == 4);
                            if (next == 2) {
                                drawable = CH.a.a(resources, xmlPullParser, attributeSet, theme);
                            } else {
                                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + S9.y1);
                            }
                        }
                        aVar.D(p, drawable);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void x(TypedArray typedArray) {
        a aVar = this.k1;
        aVar.d |= CH.a.b(typedArray);
        aVar.i = typedArray.getBoolean(ZL1.b.s, aVar.i);
        aVar.l = typedArray.getBoolean(ZL1.b.t, aVar.l);
        aVar.A = typedArray.getInt(ZL1.b.u, aVar.A);
        aVar.B = typedArray.getInt(ZL1.b.v, aVar.B);
        aVar.x = typedArray.getBoolean(ZL1.b.q, aVar.x);
    }

    @Override // o.E60, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // o.E60
    public void b() {
        super.b();
        this.l1 = false;
    }

    @Override // o.E60
    public void i(E60.d dVar) {
        super.i(dVar);
        if (dVar instanceof a) {
            this.k1 = (a) dVar;
        }
    }

    @Override // o.E60, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // o.E60, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.l1 && super.mutate() == this) {
            this.k1.v();
            this.l1 = true;
        }
        return this;
    }

    public void n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.k1.D(iArr, drawable);
            onStateChange(getState());
        }
    }

    @Override // o.E60
    /* renamed from: o */
    public a c() {
        return new a(this.k1, this, null);
    }

    @Override // o.E60, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int E = this.k1.E(iArr);
        if (E < 0) {
            E = this.k1.E(StateSet.WILD_CARD);
        }
        if (!h(E) && !onStateChange) {
            return false;
        }
        return true;
    }

    public int[] p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public int q() {
        return this.k1.i();
    }

    public Drawable r(int i) {
        return this.k1.h(i);
    }

    public int s(int[] iArr) {
        return this.k1.E(iArr);
    }

    public a t() {
        return this.k1;
    }

    public int[] u(int i) {
        return this.k1.J[i];
    }

    public void v(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s = C5206aw2.s(resources, theme, attributeSet, ZL1.b.p);
        setVisible(s.getBoolean(ZL1.b.r, true), true);
        x(s);
        m(resources);
        s.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    public C10508wc2(a aVar, Resources resources) {
        i(new a(aVar, this, resources));
        onStateChange(getState());
    }

    public C10508wc2(a aVar) {
        if (aVar != null) {
            i(aVar);
        }
    }
}
