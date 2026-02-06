package o;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.Fy  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3010Fy {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 1;
    public static final C3010Fy m = new C3010Fy(-1, -16777216, 0, 0, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    @InterfaceC11300zs1
    public final Typeface f;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Fy$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public C3010Fy(int i2, int i3, int i4, int i5, int i6, @InterfaceC11300zs1 Typeface typeface) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = typeface;
    }

    @ES1(19)
    public static C3010Fy a(CaptioningManager.CaptionStyle captionStyle) {
        if (TD2.a >= 21) {
            return c(captionStyle);
        }
        return b(captionStyle);
    }

    @ES1(19)
    public static C3010Fy b(CaptioningManager.CaptionStyle captionStyle) {
        return new C3010Fy(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @ES1(21)
    public static C3010Fy c(CaptioningManager.CaptionStyle captionStyle) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (captionStyle.hasForegroundColor()) {
            i2 = captionStyle.foregroundColor;
        } else {
            i2 = m.a;
        }
        if (captionStyle.hasBackgroundColor()) {
            i3 = captionStyle.backgroundColor;
        } else {
            i3 = m.b;
        }
        if (captionStyle.hasWindowColor()) {
            i4 = captionStyle.windowColor;
        } else {
            i4 = m.c;
        }
        if (captionStyle.hasEdgeType()) {
            i5 = captionStyle.edgeType;
        } else {
            i5 = m.d;
        }
        if (captionStyle.hasEdgeColor()) {
            i6 = captionStyle.edgeColor;
        } else {
            i6 = m.e;
        }
        return new C3010Fy(i2, i3, i4, i5, i6, captionStyle.getTypeface());
    }
}
