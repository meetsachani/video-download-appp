package o;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import o.C10508wc2;
import o.CH;
import o.E60;
import o.ZL1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class S9 extends C10508wc2 implements InterfaceC2480Ap2 {
    public static final String t1 = "S9";
    public static final String u1 = "transition";
    public static final String v1 = "item";
    public static final String w1 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    public static final String x1 = ": <transition> tag requires 'fromId' & 'toId' attributes";
    public static final String y1 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    public c o1;
    public g p1;
    public int q1;
    public int r1;
    public boolean s1;

    /* loaded from: classes.dex */
    public static class b extends g {
        public final Animatable a;

        public b(Animatable animatable) {
            super();
            this.a = animatable;
        }

        @Override // o.S9.g
        public void c() {
            this.a.start();
        }

        @Override // o.S9.g
        public void d() {
            this.a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends C10508wc2.a {
        public static final long M = 4294967296L;
        public static final long N = 8589934592L;
        public C5484c51<Long> K;
        public C10986ya2<Integer> L;

        public c(c cVar, S9 s9, Resources resources) {
            super(cVar, s9, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new C5484c51<>();
            this.L = new C10986ya2<>();
        }

        public static long H(int i, int i2) {
            return i2 | (i << 32);
        }

        public int F(int[] iArr, Drawable drawable, int i) {
            int D = super.D(iArr, drawable);
            this.L.o(D, Integer.valueOf(i));
            return D;
        }

        public int G(int i, int i2, Drawable drawable, boolean z) {
            long j;
            int a = super.a(drawable);
            long H = H(i, i2);
            if (z) {
                j = 8589934592L;
            } else {
                j = 0;
            }
            long j2 = a;
            this.K.b(H, Long.valueOf(j2 | j));
            if (z) {
                this.K.b(H(i2, i), Long.valueOf(M | j2 | j));
            }
            return a;
        }

        public int I(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.i(i, 0).intValue();
        }

        public int J(int[] iArr) {
            int E = super.E(iArr);
            if (E >= 0) {
                return E;
            }
            return super.E(StateSet.WILD_CARD);
        }

        public int K(int i, int i2) {
            return (int) this.K.i(H(i, i2), -1L).longValue();
        }

        public boolean L(int i, int i2) {
            if ((this.K.i(H(i, i2), -1L).longValue() & M) != 0) {
                return true;
            }
            return false;
        }

        public boolean M(int i, int i2) {
            if ((this.K.i(H(i, i2), -1L).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        @Override // o.C10508wc2.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new S9(this, null);
        }

        @Override // o.C10508wc2.a, o.E60.d
        public void v() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // o.C10508wc2.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new S9(this, resources);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends g {
        public final T9 a;

        public d(T9 t9) {
            super();
            this.a = t9;
        }

        @Override // o.S9.g
        public void c() {
            this.a.start();
        }

        @Override // o.S9.g
        public void d() {
            this.a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends g {
        public final ObjectAnimator a;
        public final boolean b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int i;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.a = ofInt;
        }

        @Override // o.S9.g
        public boolean a() {
            return this.b;
        }

        @Override // o.S9.g
        public void b() {
            this.a.reverse();
        }

        @Override // o.S9.g
        public void c() {
            this.a.start();
        }

        @Override // o.S9.g
        public void d() {
            this.a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public static class f implements TimeInterpolator {
        public int[] a;
        public int b;
        public int c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        public int a() {
            return this.c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * this.c) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            if (i3 < i2) {
                f2 = i / this.c;
            } else {
                f2 = 0.0f;
            }
            return (i3 / i2) + f2;
        }
    }

    public S9() {
        this(null, null);
    }

    public static S9 B(Context context, int i, Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return C(context, resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e2) {
            Log.e(t1, "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e(t1, "parser error", e3);
            return null;
        }
    }

    public static S9 C(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            S9 s9 = new S9();
            s9.v(context, resources, xmlPullParser, attributeSet, theme);
            return s9;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void D() {
        onStateChange(getState());
    }

    @Override // o.C10508wc2
    /* renamed from: A */
    public c o() {
        return new c(this.o1, this, null);
    }

    public final int E(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray s = C5206aw2.s(resources, theme, attributeSet, ZL1.b.h);
        int resourceId = s.getResourceId(ZL1.b.i, 0);
        int resourceId2 = s.getResourceId(ZL1.b.j, -1);
        if (resourceId2 > 0) {
            drawable = C9010qT1.h().j(context, resourceId2);
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
                if (xmlPullParser.getName().equals(ME2.k1)) {
                    drawable = ME2.e(resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = CH.a.a(resources, xmlPullParser, attributeSet, theme);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + y1);
            }
        }
        if (drawable != null) {
            return this.o1.F(p, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + y1);
    }

    public final int F(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray s = C5206aw2.s(resources, theme, attributeSet, ZL1.b.k);
        int resourceId = s.getResourceId(ZL1.b.n, -1);
        int resourceId2 = s.getResourceId(ZL1.b.m, -1);
        int resourceId3 = s.getResourceId(ZL1.b.l, -1);
        if (resourceId3 > 0) {
            drawable = C9010qT1.h().j(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = s.getBoolean(ZL1.b.f681o, false);
        s.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals(T9.e1)) {
                    drawable = T9.e(context, resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = CH.a.a(resources, xmlPullParser, attributeSet, theme);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + w1);
            }
        }
        if (drawable != null) {
            if (resourceId != -1 && resourceId2 != -1) {
                return this.o1.G(resourceId, resourceId2, drawable, z);
            }
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + x1);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + w1);
    }

    public final boolean G(int i) {
        int d2;
        int K;
        g bVar;
        g gVar = this.p1;
        if (gVar != null) {
            if (i == this.q1) {
                return true;
            }
            if (i == this.r1 && gVar.a()) {
                gVar.b();
                this.q1 = this.r1;
                this.r1 = i;
                return true;
            }
            d2 = this.q1;
            gVar.d();
        } else {
            d2 = d();
        }
        this.p1 = null;
        this.r1 = -1;
        this.q1 = -1;
        c cVar = this.o1;
        int I = cVar.I(d2);
        int I2 = cVar.I(i);
        if (I2 == 0 || I == 0 || (K = cVar.K(I, I2)) < 0) {
            return false;
        }
        boolean M = cVar.M(I, I2);
        h(K);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.L(I, I2), M);
        } else if (current instanceof T9) {
            bVar = new d((T9) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.c();
        this.p1 = bVar;
        this.r1 = d2;
        this.q1 = i;
        return true;
    }

    @Override // o.C10508wc2, o.E60
    public void b() {
        super.b();
        this.s1 = false;
    }

    @Override // o.C10508wc2, o.E60
    public void i(E60.d dVar) {
        super.i(dVar);
        if (dVar instanceof c) {
            this.o1 = (c) dVar;
        }
    }

    @Override // o.C10508wc2, o.E60, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // o.E60, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.p1;
        if (gVar != null) {
            gVar.d();
            this.p1 = null;
            h(this.q1);
            this.q1 = -1;
            this.r1 = -1;
        }
    }

    @Override // o.C10508wc2, o.E60, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.s1 && super.mutate() == this) {
            this.o1.v();
            this.s1 = true;
        }
        return this;
    }

    @Override // o.C10508wc2, o.E60, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        int J = this.o1.J(iArr);
        if (J != d() && (G(J) || h(J))) {
            z = true;
        } else {
            z = false;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return current.setState(iArr) | z;
        }
        return z;
    }

    @Override // o.E60, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.p1;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    @Override // o.C10508wc2
    public void v(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s = C5206aw2.s(resources, theme, attributeSet, ZL1.b.a);
        setVisible(s.getBoolean(ZL1.b.c, true), true);
        x(s);
        m(resources);
        s.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        D();
    }

    public final void w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals("item")) {
                            E(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals(u1)) {
                            F(context, resources, xmlPullParser, attributeSet, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void x(TypedArray typedArray) {
        c cVar = this.o1;
        cVar.d |= CH.a.b(typedArray);
        cVar.B(typedArray.getBoolean(ZL1.b.d, cVar.i));
        cVar.x(typedArray.getBoolean(ZL1.b.e, cVar.l));
        cVar.y(typedArray.getInt(ZL1.b.f, cVar.A));
        cVar.z(typedArray.getInt(ZL1.b.g, cVar.B));
        setDither(typedArray.getBoolean(ZL1.b.b, cVar.x));
    }

    public void y(int[] iArr, Drawable drawable, int i) {
        C2691Ct1.d(drawable);
        this.o1.F(iArr, drawable, i);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void z(int i, int i2, T t, boolean z) {
        C2691Ct1.d(t);
        this.o1.G(i, i2, t, z);
    }

    public S9(c cVar, Resources resources) {
        super(null);
        this.q1 = -1;
        this.r1 = -1;
        i(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
