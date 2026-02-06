package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* loaded from: classes.dex */
public final class ZD1 {
    public static final int b = 0;
    public static final int c = 1000;
    public static final int d = 1001;
    public static final int e = 1002;
    public static final int f = 1003;
    public static final int g = 1004;
    public static final int h = 1006;
    public static final int i = 1007;
    public static final int j = 1008;
    public static final int k = 1009;
    public static final int l = 1010;
    public static final int m = 1011;
    public static final int n = 1012;

    /* renamed from: o  reason: collision with root package name */
    public static final int f680o = 1013;
    public static final int p = 1014;
    public static final int q = 1015;
    public static final int r = 1016;
    public static final int s = 1017;
    public static final int t = 1018;
    public static final int u = 1019;
    public static final int v = 1020;
    public static final int w = 1021;
    public static final int x = 1000;
    public final PointerIcon a;

    /* loaded from: classes.dex */
    public static class a {
        public static PointerIcon a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        public static PointerIcon b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        public static PointerIcon c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    public ZD1(PointerIcon pointerIcon) {
        this.a = pointerIcon;
    }

    public static ZD1 a(Bitmap bitmap, float f2, float f3) {
        return new ZD1(a.a(bitmap, f2, f3));
    }

    public static ZD1 c(Context context, int i2) {
        return new ZD1(a.b(context, i2));
    }

    public static ZD1 d(Resources resources, int i2) {
        return new ZD1(a.c(resources, i2));
    }

    public Object b() {
        return this.a;
    }
}
