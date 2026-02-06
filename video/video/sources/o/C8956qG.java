package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import o.HL1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.qG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8956qG {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    public static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static ColorStateList d(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        Resources resources2 = resources;
        int i2 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i3 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i2 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray h = h(resources2, theme, attributeSet, HL1.j.d);
                int i4 = HL1.j.e;
                int resourceId = h.getResourceId(i4, -1);
                if (resourceId != -1 && !f(resources2, resourceId)) {
                    try {
                        color = a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = h.getColor(HL1.j.e, -65281);
                    }
                } else {
                    color = h.getColor(i4, -65281);
                }
                int i5 = HL1.j.f;
                float f2 = 1.0f;
                if (h.hasValue(i5)) {
                    f2 = h.getFloat(i5, 1.0f);
                } else {
                    int i6 = HL1.j.h;
                    if (h.hasValue(i6)) {
                        f2 = h.getFloat(i6, 1.0f);
                    }
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    int i7 = HL1.j.g;
                    if (h.hasValue(i7)) {
                        f = h.getFloat(i7, -1.0f);
                        h.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr3 = new int[attributeCount];
                        int i8 = 0;
                        for (i = 0; i < attributeCount; i++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != HL1.a.a && attributeNameResource != HL1.a.n) {
                                int i9 = i8 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr3[i8] = attributeNameResource;
                                i8 = i9;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr3, i8);
                        iArr2 = ZE0.a(iArr2, i3, g(color, f2, f));
                        iArr = (int[][]) ZE0.c(iArr, i3, trimStateSet);
                        i3++;
                    }
                }
                f = h.getFloat(HL1.j.i, -1.0f);
                h.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i82 = 0;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i82);
                iArr2 = ZE0.a(iArr2, i3, g(color, f2, f));
                iArr = (int[][]) ZE0.c(iArr, i3, trimStateSet2);
                i3++;
            }
            i2 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i3];
        int[][] iArr5 = new int[i3];
        System.arraycopy(iArr2, 0, iArr4, 0, i3);
        System.arraycopy(iArr, 0, iArr5, 0, i3);
        return new ColorStateList(iArr5, iArr4);
    }

    public static boolean f(Resources resources, int i) {
        TypedValue c = c();
        resources.getValue(i, c, true);
        int i2 = c.type;
        if (i2 >= 28 && i2 <= 31) {
            return true;
        }
        return false;
    }

    public static int g(int i, float f, float f2) {
        boolean z;
        if (f2 >= 0.0f && f2 <= 100.0f) {
            z = true;
        } else {
            z = false;
        }
        if (f == 1.0f && !z) {
            return i;
        }
        int e = C9293rd1.e((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
        if (z) {
            C4557Vt c = C4557Vt.c(i);
            i = C4557Vt.q(c.j(), c.i(), f2);
        }
        return (i & C6516gH2.x) | (e << 24);
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
