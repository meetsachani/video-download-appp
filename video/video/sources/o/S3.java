package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* loaded from: classes.dex */
public final class S3 {

    @Deprecated
    /* loaded from: classes.dex */
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class b implements a {
    }

    /* loaded from: classes.dex */
    public static class c implements AccessibilityManager.AccessibilityStateChangeListener {
        public a X;

        public c(a aVar) {
            this.X = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return this.X.equals(((c) obj).X);
        }

        public int hashCode() {
            return this.X.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            this.X.onAccessibilityStateChanged(z);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static boolean a(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* loaded from: classes.dex */
    public static final class f implements AccessibilityManager.TouchExplorationStateChangeListener {
        public final e a;

        public f(e eVar) {
            this.a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return this.a.equals(((f) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.a.onTouchExplorationStateChanged(z);
        }
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new c(aVar));
    }

    @JR1(expression = "manager.addTouchExplorationStateChangeListener(listener)")
    @Deprecated
    public static boolean b(AccessibilityManager accessibilityManager, e eVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new f(eVar));
    }

    @JR1(expression = "manager.getEnabledAccessibilityServiceList(feedbackTypeFlags)")
    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    @JR1(expression = "manager.getInstalledAccessibilityServiceList()")
    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    public static boolean e(AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.a(accessibilityManager);
        }
        return true;
    }

    @JR1(expression = "manager.isTouchExplorationEnabled()")
    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean g(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new c(aVar));
    }

    @JR1(expression = "manager.removeTouchExplorationStateChangeListener(listener)")
    @Deprecated
    public static boolean h(AccessibilityManager accessibilityManager, e eVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new f(eVar));
    }
}
