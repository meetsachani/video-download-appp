package o;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class R3 {
    public static final int A = 64;
    public static final int B = 128;
    public static final int C = 256;
    public static final int D = 512;
    public static final int E = 1024;
    public static final int F = 2048;
    public static final int G = 4096;
    public static final int H = -1;
    @Deprecated
    public static final int a = 128;
    @Deprecated
    public static final int b = 256;
    @Deprecated
    public static final int c = 512;
    @Deprecated
    public static final int d = 1024;
    @Deprecated
    public static final int e = 2048;
    @Deprecated
    public static final int f = 4096;
    @Deprecated
    public static final int g = 8192;
    public static final int h = 16384;
    public static final int i = 32768;
    public static final int j = 65536;
    public static final int k = 131072;
    public static final int l = 262144;
    public static final int m = 524288;
    public static final int n = 1048576;

    /* renamed from: o  reason: collision with root package name */
    public static final int f593o = 2097152;
    public static final int p = 4194304;
    public static final int q = 8388608;
    public static final int r = 16777216;
    public static final int s = 67108864;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 4;
    public static final int x = 8;
    public static final int y = 16;
    public static final int z = 32;

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.isAccessibilityDataSensitive();
        }

        public static void b(AccessibilityEvent accessibilityEvent, boolean z) {
            accessibilityEvent.setAccessibilityDataSensitive(z);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    @JR1(expression = "event.appendRecord(record)")
    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent, E4 e4) {
        accessibilityEvent.appendRecord((AccessibilityRecord) e4.g());
    }

    @Deprecated
    public static E4 b(AccessibilityEvent accessibilityEvent) {
        return new E4(accessibilityEvent);
    }

    @JR1(expression = "event.getAction()")
    @Deprecated
    public static int c(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getAction();
    }

    @JR1(expression = "event.getContentChangeTypes()")
    @Deprecated
    public static int d(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @JR1(expression = "event.getMovementGranularity()")
    @Deprecated
    public static int e(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getMovementGranularity();
    }

    @Deprecated
    public static E4 f(AccessibilityEvent accessibilityEvent, int i2) {
        return new E4(accessibilityEvent.getRecord(i2));
    }

    @JR1(expression = "event.getRecordCount()")
    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static boolean h(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(accessibilityEvent);
        }
        return false;
    }

    public static void i(AccessibilityEvent accessibilityEvent, boolean z2) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.b(accessibilityEvent, z2);
        }
    }

    @JR1(expression = "event.setAction(action)")
    @Deprecated
    public static void j(AccessibilityEvent accessibilityEvent, int i2) {
        accessibilityEvent.setAction(i2);
    }

    @JR1(expression = "event.setContentChangeTypes(changeTypes)")
    @Deprecated
    public static void k(AccessibilityEvent accessibilityEvent, int i2) {
        accessibilityEvent.setContentChangeTypes(i2);
    }

    @JR1(expression = "event.setMovementGranularity(granularity)")
    @Deprecated
    public static void l(AccessibilityEvent accessibilityEvent, int i2) {
        accessibilityEvent.setMovementGranularity(i2);
    }
}
