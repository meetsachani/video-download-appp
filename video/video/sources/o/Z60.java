package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import o.HT1;
import org.xmlpull.v1.XmlPullParserException;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class Z60 {
    public static final int a = -1;
    public static final int b = -1;
    public static final int c = -1;

    /* loaded from: classes3.dex */
    public static class a {
        @K40
        public static void a(@InterfaceC5670cr1 Outline outline, @InterfaceC5670cr1 Path path) {
            outline.setConvexPath(path);
        }
    }

    @ES1(30)
    /* loaded from: classes3.dex */
    public static class b {
        @K40
        public static void a(@InterfaceC5670cr1 Outline outline, @InterfaceC5670cr1 Path path) {
            outline.setPath(path);
        }
    }

    @InterfaceC11300zs1
    public static Drawable a(@InterfaceC11300zs1 Drawable drawable, @InterfaceC11300zs1 Drawable drawable2) {
        return b(drawable, drawable2, -1, -1);
    }

    @InterfaceC11300zs1
    public static Drawable b(@InterfaceC11300zs1 Drawable drawable, @InterfaceC11300zs1 Drawable drawable2, @PK1 int i, @PK1 int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i == -1) {
            i = i(drawable, drawable2);
        }
        if (i2 == -1) {
            i2 = h(drawable, drawable2);
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    @InterfaceC11300zs1
    public static Drawable c(@InterfaceC11300zs1 Drawable drawable, @InterfaceC11300zs1 ColorStateList colorStateList, @InterfaceC11300zs1 PorterDuff.Mode mode) {
        return e(drawable, colorStateList, mode, false);
    }

    @InterfaceC11300zs1
    public static Drawable d(@InterfaceC11300zs1 Drawable drawable, @InterfaceC11300zs1 ColorStateList colorStateList, @InterfaceC11300zs1 PorterDuff.Mode mode) {
        return e(drawable, colorStateList, mode, false);
    }

    @InterfaceC11300zs1
    public static Drawable e(@InterfaceC11300zs1 Drawable drawable, @InterfaceC11300zs1 ColorStateList colorStateList, @InterfaceC11300zs1 PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            Drawable mutate = D60.r(drawable).mutate();
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (z) {
            drawable.mutate();
        }
        return drawable;
    }

    @InterfaceC5670cr1
    public static int[] f(@InterfaceC5670cr1 int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    @InterfaceC11300zs1
    public static ColorStateList g(@InterfaceC11300zs1 Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && Q60.a(drawable)) {
            colorStateList = S60.a(drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    public static int h(@InterfaceC5670cr1 Drawable drawable, @InterfaceC5670cr1 Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        if (intrinsicHeight != -1) {
            return intrinsicHeight;
        }
        return drawable.getIntrinsicHeight();
    }

    public static int i(@InterfaceC5670cr1 Drawable drawable, @InterfaceC5670cr1 Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        if (intrinsicWidth != -1) {
            return intrinsicWidth;
        }
        return drawable.getIntrinsicWidth();
    }

    @InterfaceC5670cr1
    public static int[] j(@InterfaceC5670cr1 int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != 16842912) {
                iArr2[i] = i2;
                i++;
            }
        }
        return iArr2;
    }

    @InterfaceC5670cr1
    public static AttributeSet k(@InterfaceC5670cr1 Context context, @XN2 int i, @InterfaceC5670cr1 CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (TextUtils.equals(xml.getName(), charSequence)) {
                    return Xml.asAttributeSet(xml);
                }
                throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            e = e;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e2) {
            e = e2;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    public static void l(@InterfaceC5670cr1 Outline outline, @InterfaceC5670cr1 Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            b.a(outline, path);
        } else if (i >= 29) {
            try {
                a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.a(outline, path);
        }
    }

    public static void m(@InterfaceC11300zs1 RippleDrawable rippleDrawable, int i) {
        rippleDrawable.setRadius(i);
    }

    public static void n(@InterfaceC5670cr1 Drawable drawable, @JF int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
    }

    @InterfaceC11300zs1
    public static PorterDuffColorFilter o(@InterfaceC5670cr1 Drawable drawable, @InterfaceC11300zs1 ColorStateList colorStateList, @InterfaceC11300zs1 PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
        }
        return null;
    }
}
