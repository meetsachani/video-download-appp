package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.aw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5206aw2 {
    public static final String a = "http://schemas.android.com/apk/res/android";

    public static int a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static boolean b(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static Drawable c(TypedArray typedArray, int i, int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        if (drawable == null) {
            return typedArray.getDrawable(i2);
        }
        return drawable;
    }

    public static int d(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    public static boolean e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!r(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    public static int f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!r(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    public static ColorStateList g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 != 2) {
                if (i2 >= 28 && i2 <= 31) {
                    return h(typedValue);
                }
                return C8956qG.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        }
        return null;
    }

    public static ColorStateList h(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static UH i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return UH.b(typedValue.data);
            }
            UH g = UH.g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return UH.b(i2);
    }

    public static float j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!r(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    public static int k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!r(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    public static int l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!r(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    public static String m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static int n(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static String o(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        if (string == null) {
            return typedArray.getString(i2);
        }
        return string;
    }

    public static CharSequence p(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        if (text == null) {
            return typedArray.getText(i2);
        }
        return text;
    }

    public static CharSequence[] q(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        if (textArray == null) {
            return typedArray.getTextArray(i2);
        }
        return textArray;
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static TypedArray s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
