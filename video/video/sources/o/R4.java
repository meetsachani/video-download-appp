package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import o.OL1;

/* loaded from: classes.dex */
public class R4 {
    public Context a;

    public R4(Context context) {
        this.a = context;
    }

    public static R4 b(Context context) {
        return new R4(context);
    }

    public boolean a() {
        if (this.a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    public int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i <= 600) {
            if (i <= 960 || i2 <= 720) {
                if (i <= 720 || i2 <= 960) {
                    if (i < 500) {
                        if (i <= 640 || i2 <= 480) {
                            if (i <= 480 || i2 <= 640) {
                                if (i >= 360) {
                                    return 3;
                                }
                                return 2;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 5;
            }
            return 5;
        }
        return 5;
    }

    public int e() {
        return this.a.getResources().getDimensionPixelSize(OL1.e.k);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, OL1.m.a, OL1.b.f, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(OL1.m.f572o, 0);
        Resources resources = this.a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(OL1.e.j));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.a.getResources().getBoolean(OL1.c.a);
    }

    public boolean h() {
        return true;
    }
}
