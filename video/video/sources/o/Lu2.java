package o;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface Lu2 {
    public static final String a = "androidx.browser.trusted.displaymode.KEY_ID";

    /* loaded from: classes.dex */
    public static class a implements Lu2 {
        public static final int b = 0;

        @Override // o.Lu2
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putInt(Lu2.a, 0);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Lu2 {
        public static final int d = 1;
        public static final String e = "androidx.browser.trusted.displaymode.KEY_STICKY";
        public static final String f = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";
        public final boolean b;
        public final int c;

        public b(boolean z, int i) {
            this.b = z;
            this.c = i;
        }

        public static Lu2 a(Bundle bundle) {
            return new b(bundle.getBoolean(e), bundle.getInt(f));
        }

        public boolean b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        @Override // o.Lu2
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putInt(Lu2.a, 1);
            bundle.putBoolean(e, this.b);
            bundle.putInt(f, this.c);
            return bundle;
        }
    }

    static Lu2 a(Bundle bundle) {
        if (bundle.getInt(a) != 1) {
            return new a();
        }
        return b.a(bundle);
    }

    Bundle e();
}
