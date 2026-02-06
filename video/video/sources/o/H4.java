package o;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;

/* loaded from: classes.dex */
public class H4 {
    public static final int b = -1;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public final Object a;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        public static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            return accessibilityWindowInfo.getChild(i);
        }

        public static int c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        public static int d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        public static int e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        public static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        public static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        public static int h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        public static boolean i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        public static boolean j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        public static boolean k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        public static AccessibilityWindowInfo l() {
            return AccessibilityWindowInfo.obtain();
        }

        public static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        public static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static AccessibilityWindowInfo a() {
            return new AccessibilityWindowInfo();
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static int a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        public static void b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        public static C10861y4 c(Object obj, int i) {
            return C10861y4.u2(((AccessibilityWindowInfo) obj).getRoot(i));
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        public static long b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public H4() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = d.a();
        } else {
            this.a = null;
        }
    }

    public static H4 t() {
        return y(a.l());
    }

    public static H4 u(H4 h4) {
        if (h4 == null) {
            return null;
        }
        return y(a.m((AccessibilityWindowInfo) h4.a));
    }

    public static String w(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "<UNKNOWN>";
                    }
                    return "TYPE_ACCESSIBILITY_OVERLAY";
                }
                return "TYPE_SYSTEM";
            }
            return "TYPE_INPUT_METHOD";
        }
        return "TYPE_APPLICATION";
    }

    public static H4 y(Object obj) {
        if (obj != null) {
            return new H4(obj);
        }
        return null;
    }

    public C10861y4 a() {
        return C10861y4.u2(b.a((AccessibilityWindowInfo) this.a));
    }

    public void b(Rect rect) {
        a.a((AccessibilityWindowInfo) this.a, rect);
    }

    public H4 c(int i) {
        return y(a.b((AccessibilityWindowInfo) this.a, i));
    }

    public int d() {
        return a.c((AccessibilityWindowInfo) this.a);
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.a((AccessibilityWindowInfo) this.a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H4)) {
            return false;
        }
        H4 h4 = (H4) obj;
        Object obj2 = this.a;
        if (obj2 == null) {
            if (h4.a == null) {
                return true;
            }
            return false;
        }
        return obj2.equals(h4.a);
    }

    public int f() {
        return a.d((AccessibilityWindowInfo) this.a);
    }

    public int g() {
        return a.e((AccessibilityWindowInfo) this.a);
    }

    public C9637t21 h() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C9637t21.o(f.a((AccessibilityWindowInfo) this.a));
        }
        return C9637t21.g();
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public H4 i() {
        return y(a.f((AccessibilityWindowInfo) this.a));
    }

    public void j(Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            e.b((AccessibilityWindowInfo) this.a, region);
            return;
        }
        Rect rect = new Rect();
        a.a((AccessibilityWindowInfo) this.a, rect);
        region.set(rect);
    }

    public C10861y4 k() {
        return C10861y4.u2(a.g((AccessibilityWindowInfo) this.a));
    }

    public C10861y4 l(int i) {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.c(this.a, i);
        }
        return k();
    }

    public CharSequence m() {
        return b.b((AccessibilityWindowInfo) this.a);
    }

    public long n() {
        if (Build.VERSION.SDK_INT >= 34) {
            return f.b((AccessibilityWindowInfo) this.a);
        }
        return 0L;
    }

    public int o() {
        return a.h((AccessibilityWindowInfo) this.a);
    }

    public boolean p() {
        return a.i((AccessibilityWindowInfo) this.a);
    }

    public boolean q() {
        return a.j((AccessibilityWindowInfo) this.a);
    }

    public boolean r() {
        return a.k((AccessibilityWindowInfo) this.a);
    }

    public boolean s() {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.a((AccessibilityWindowInfo) this.a);
        }
        return false;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        b(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(f());
        sb.append(", type=");
        sb.append(w(o()));
        sb.append(", layer=");
        sb.append(g());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(r());
        sb.append(", active=");
        sb.append(q());
        sb.append(", hasParent=");
        boolean z2 = false;
        if (i() != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", hasChildren=");
        if (d() > 0) {
            z2 = true;
        }
        sb.append(z2);
        sb.append(", transitionTime=");
        sb.append(n());
        sb.append(", locales=");
        sb.append(h());
        sb.append(']');
        return sb.toString();
    }

    public AccessibilityWindowInfo x() {
        return (AccessibilityWindowInfo) this.a;
    }

    public H4(Object obj) {
        this.a = obj;
    }

    @Deprecated
    public void v() {
    }
}
