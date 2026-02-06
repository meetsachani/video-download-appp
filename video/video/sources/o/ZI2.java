package o;

import android.view.View;

/* loaded from: classes.dex */
public abstract class ZI2 extends AbstractC11305zt2 {
    public static final String a = "android:visibilityPropagation:visibility";
    public static final String b = "android:visibilityPropagation:center";
    public static final String[] c = {a, b};

    public static int d(C3291It2 c3291It2, int i) {
        int[] iArr;
        if (c3291It2 == null || (iArr = (int[]) c3291It2.a.get(b)) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // o.AbstractC11305zt2
    public void a(C3291It2 c3291It2) {
        View view = c3291It2.b;
        Integer num = (Integer) c3291It2.a.get(VI2.Y1);
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        c3291It2.a.put(a, num);
        view.getLocationOnScreen(r2);
        int round = r2[0] + Math.round(view.getTranslationX());
        int[] iArr = {round};
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        c3291It2.a.put(b, iArr);
    }

    @Override // o.AbstractC11305zt2
    public String[] b() {
        return c;
    }

    public int e(C3291It2 c3291It2) {
        Integer num;
        if (c3291It2 == null || (num = (Integer) c3291It2.a.get(a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(C3291It2 c3291It2) {
        return d(c3291It2, 0);
    }

    public int g(C3291It2 c3291It2) {
        return d(c3291It2, 1);
    }
}
