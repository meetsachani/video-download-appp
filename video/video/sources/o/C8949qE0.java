package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.HL1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.qE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8949qE0 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    public static a a(a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new a(i, i3, i2);
        }
        return new a(i, i2);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return c(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static Shader c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray s = C5206aw2.s(resources, theme, attributeSet, HL1.j.D);
            float j = C5206aw2.j(s, xmlPullParser, "startX", HL1.j.M, 0.0f);
            float j2 = C5206aw2.j(s, xmlPullParser, "startY", HL1.j.N, 0.0f);
            float j3 = C5206aw2.j(s, xmlPullParser, "endX", HL1.j.O, 0.0f);
            float j4 = C5206aw2.j(s, xmlPullParser, "endY", HL1.j.P, 0.0f);
            float j5 = C5206aw2.j(s, xmlPullParser, "centerX", HL1.j.H, 0.0f);
            float j6 = C5206aw2.j(s, xmlPullParser, "centerY", HL1.j.I, 0.0f);
            int k = C5206aw2.k(s, xmlPullParser, "type", HL1.j.G, 0);
            int f = C5206aw2.f(s, xmlPullParser, "startColor", HL1.j.E, 0);
            boolean r = C5206aw2.r(xmlPullParser, "centerColor");
            int f2 = C5206aw2.f(s, xmlPullParser, "centerColor", HL1.j.L, 0);
            int f3 = C5206aw2.f(s, xmlPullParser, "endColor", HL1.j.F, 0);
            int k2 = C5206aw2.k(s, xmlPullParser, "tileMode", HL1.j.K, 0);
            float j7 = C5206aw2.j(s, xmlPullParser, "gradientRadius", HL1.j.J, 0.0f);
            s.recycle();
            a a2 = a(d(resources, xmlPullParser, attributeSet, theme), f, f3, r, f2);
            if (k != 1) {
                if (k != 2) {
                    return new LinearGradient(j, j2, j3, j4, a2.a, a2.b, e(k2));
                }
                return new SweepGradient(j5, j6, a2.a, a2.b);
            } else if (j7 > 0.0f) {
                return new RadialGradient(j5, j6, j7, a2.a, a2.b, e(k2));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray s = C5206aw2.s(resources, theme, attributeSet, HL1.j.Q);
                int i = HL1.j.R;
                boolean hasValue = s.hasValue(i);
                int i2 = HL1.j.S;
                boolean hasValue2 = s.hasValue(i2);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color = s.getColor(i, 0);
                float f = s.getFloat(i2, 0.0f);
                s.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    public static Shader.TileMode e(int i) {
        if (i != 1) {
            if (i != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* renamed from: o.qE0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final int[] a;
        public final float[] b;

        public a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = list.get(i).intValue();
                this.b[i] = list2.get(i).floatValue();
            }
        }

        public a(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{0.0f, 1.0f};
        }

        public a(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
