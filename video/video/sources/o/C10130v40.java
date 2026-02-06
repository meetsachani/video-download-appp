package o;

import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.v40  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10130v40 {
    public final DisplayCutout a;

    /* renamed from: o.v40$a */
    /* loaded from: classes.dex */
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* renamed from: o.v40$b */
    /* loaded from: classes.dex */
    public static class b {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* renamed from: o.v40$c */
    /* loaded from: classes.dex */
    public static class c {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        public static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    /* renamed from: o.v40$d */
    /* loaded from: classes.dex */
    public static class d {
        public static Path a(DisplayCutout displayCutout) {
            return displayCutout.getCutoutPath();
        }
    }

    /* renamed from: o.v40$e */
    /* loaded from: classes.dex */
    public static class e {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2, Path path) {
            DisplayCutout.Builder waterfallInsets = new DisplayCutout.Builder().setSafeInsets(insets).setWaterfallInsets(insets2);
            if (rect != null) {
                waterfallInsets.setBoundingRectLeft(rect);
            }
            if (rect2 != null) {
                waterfallInsets.setBoundingRectTop(rect2);
            }
            if (rect3 != null) {
                waterfallInsets.setBoundingRectRight(rect3);
            }
            if (rect4 != null) {
                waterfallInsets.setBoundingRectBottom(rect4);
            }
            if (path != null) {
                waterfallInsets.setCutoutPath(path);
            }
            return waterfallInsets.build();
        }
    }

    public C10130v40(Rect rect, List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? a.a(rect, list) : null);
    }

    public static DisplayCutout a(C9246rQ0 c9246rQ0, Rect rect, Rect rect2, Rect rect3, Rect rect4, C9246rQ0 c9246rQ02, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return e.a(c9246rQ0.h(), rect, rect2, rect3, rect4, c9246rQ02.h(), path);
        }
        if (i >= 30) {
            return c.a(c9246rQ0.h(), rect, rect2, rect3, rect4, c9246rQ02.h());
        }
        if (i >= 29) {
            return b.a(c9246rQ0.h(), rect, rect2, rect3, rect4);
        }
        if (i >= 28) {
            Rect rect5 = new Rect(c9246rQ0.a, c9246rQ0.b, c9246rQ0.c, c9246rQ0.d);
            ArrayList arrayList = new ArrayList();
            if (rect != null) {
                arrayList.add(rect);
            }
            if (rect2 != null) {
                arrayList.add(rect2);
            }
            if (rect3 != null) {
                arrayList.add(rect3);
            }
            if (rect4 != null) {
                arrayList.add(rect4);
            }
            return a.a(rect5, arrayList);
        }
        return null;
    }

    public static C10130v40 j(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C10130v40(displayCutout);
    }

    public List<Rect> b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.a);
        }
        return Collections.EMPTY_LIST;
    }

    public Path c() {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.a(this.a);
        }
        return null;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10130v40.class == obj.getClass()) {
            return C2691Ct1.a(this.a, ((C10130v40) obj).a);
        }
        return false;
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.a);
        }
        return 0;
    }

    public int g() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.a);
        }
        return 0;
    }

    public C9246rQ0 h() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C9246rQ0.g(c.b(this.a));
        }
        return C9246rQ0.e;
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.a;
        if (displayCutout != null) {
            hashCode = displayCutout.hashCode();
            return hashCode;
        }
        return 0;
    }

    public DisplayCutout i() {
        return this.a;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }

    public C10130v40(C9246rQ0 c9246rQ0, Rect rect, Rect rect2, Rect rect3, Rect rect4, C9246rQ0 c9246rQ02) {
        this(a(c9246rQ0, rect, rect2, rect3, rect4, c9246rQ02, null));
    }

    public C10130v40(C9246rQ0 c9246rQ0, Rect rect, Rect rect2, Rect rect3, Rect rect4, C9246rQ0 c9246rQ02, Path path) {
        this(a(c9246rQ0, rect, rect2, rect3, rect4, c9246rQ02, path));
    }

    public C10130v40(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }
}
