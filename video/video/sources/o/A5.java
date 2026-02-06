package o;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class A5 {
    public static final String a = "android.activity.usage_time";
    public static final String b = "android.usage_time_packages";

    /* loaded from: classes.dex */
    public static class a extends A5 {
        public final ActivityOptions c;

        public a(ActivityOptions activityOptions) {
            this.c = activityOptions;
        }

        @Override // o.A5
        public Rect a() {
            return this.c.getLaunchBounds();
        }

        @Override // o.A5
        public int b() {
            int launchDisplayId;
            if (Build.VERSION.SDK_INT >= 26) {
                launchDisplayId = this.c.getLaunchDisplayId();
                return launchDisplayId;
            }
            return -1;
        }

        @Override // o.A5
        public void k(PendingIntent pendingIntent) {
            this.c.requestUsageTimeReport(pendingIntent);
        }

        @Override // o.A5
        public A5 l(Rect rect) {
            return new a(this.c.setLaunchBounds(rect));
        }

        @Override // o.A5
        public A5 m(int i) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.c.setLaunchDisplayId(i);
            }
            return this;
        }

        @Override // o.A5
        public A5 n(int i) {
            boolean z;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                this.c.setPendingIntentBackgroundActivityStartMode(i);
                return this;
            }
            if (i2 >= 33) {
                if (i != 2) {
                    z = true;
                } else {
                    z = false;
                }
                this.c.setPendingIntentBackgroundActivityLaunchAllowed(z);
            }
            return this;
        }

        @Override // o.A5
        public A5 o(boolean z) {
            ActivityOptions shareIdentityEnabled;
            if (Build.VERSION.SDK_INT >= 34) {
                shareIdentityEnabled = this.c.setShareIdentityEnabled(z);
                return new a(shareIdentityEnabled);
            }
            return this;
        }

        @Override // o.A5
        public Bundle p() {
            return this.c.toBundle();
        }

        @Override // o.A5
        public void q(A5 a5) {
            if (a5 instanceof a) {
                this.c.update(((a) a5).c);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public static A5 c() {
        return new a(ActivityOptions.makeBasic());
    }

    public static A5 d(View view, int i, int i2, int i3, int i4) {
        return new a(ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4));
    }

    public static A5 e(Context context, int i, int i2) {
        return new a(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public static A5 f(View view, int i, int i2, int i3, int i4) {
        return new a(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    public static A5 g(Activity activity, View view, String str) {
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public static A5 h(Activity activity, C4377Tx1<View, String>... c4377Tx1Arr) {
        Pair[] pairArr;
        if (c4377Tx1Arr != null) {
            pairArr = new Pair[c4377Tx1Arr.length];
            for (int i = 0; i < c4377Tx1Arr.length; i++) {
                C4377Tx1<View, String> c4377Tx1 = c4377Tx1Arr[i];
                pairArr[i] = Pair.create(c4377Tx1.a, c4377Tx1.b);
            }
        } else {
            pairArr = null;
        }
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    public static A5 i() {
        return new a(ActivityOptions.makeTaskLaunchBehind());
    }

    public static A5 j(View view, Bitmap bitmap, int i, int i2) {
        return new a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    public Rect a() {
        return null;
    }

    public int b() {
        return -1;
    }

    public Bundle p() {
        return null;
    }

    public void k(PendingIntent pendingIntent) {
    }

    public A5 l(Rect rect) {
        return this;
    }

    public A5 m(int i) {
        return this;
    }

    public A5 n(int i) {
        return this;
    }

    public A5 o(boolean z) {
        return this;
    }

    public void q(A5 a5) {
    }
}
