package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: o.ii1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7102ii1 {
    public static final String e = "MemorySizeCalculator";
    public static final int f = 4;
    public static final int g = 2;
    public final int a;
    public final int b;
    public final Context c;
    public final int d;

    /* renamed from: o.ii1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final int i = 2;
        public static final int j;
        public static final float k = 0.4f;
        public static final float l = 0.33f;
        public static final int m = 4194304;
        public final Context a;
        public ActivityManager b;
        public c c;
        public float e;
        public float d = 2.0f;
        public float f = 0.4f;
        public float g = 0.33f;
        public int h = 4194304;

        static {
            int i2;
            if (Build.VERSION.SDK_INT < 26) {
                i2 = 4;
            } else {
                i2 = 1;
            }
            j = i2;
        }

        public a(Context context) {
            this.e = j;
            this.a = context;
            this.b = (ActivityManager) context.getSystemService(androidx.appcompat.widget.b.r);
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C7102ii1.e(this.b)) {
                this.e = 0.0f;
            }
        }

        public C7102ii1 a() {
            return new C7102ii1(this);
        }

        public a b(ActivityManager activityManager) {
            this.b = activityManager;
            return this;
        }

        public a c(int i2) {
            this.h = i2;
            return this;
        }

        public a d(float f) {
            boolean z;
            if (f >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            C10175vF1.b(z, "Bitmap pool screens must be greater than or equal to 0");
            this.e = f;
            return this;
        }

        public a e(float f) {
            boolean z;
            if (f >= 0.0f && f <= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            C10175vF1.b(z, "Low memory max size multiplier must be between 0 and 1");
            this.g = f;
            return this;
        }

        public a f(float f) {
            boolean z;
            if (f >= 0.0f && f <= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            C10175vF1.b(z, "Size multiplier must be between 0 and 1");
            this.f = f;
            return this;
        }

        public a g(float f) {
            boolean z;
            if (f >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            C10175vF1.b(z, "Memory cache screens must be greater than or equal to 0");
            this.d = f;
            return this;
        }

        public a h(c cVar) {
            this.c = cVar;
            return this;
        }
    }

    /* renamed from: o.ii1$b */
    /* loaded from: classes.dex */
    public static final class b implements c {
        public final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // o.C7102ii1.c
        public int a() {
            return this.a.heightPixels;
        }

        @Override // o.C7102ii1.c
        public int b() {
            return this.a.widthPixels;
        }
    }

    /* renamed from: o.ii1$c */
    /* loaded from: classes.dex */
    public interface c {
        int a();

        int b();
    }

    public C7102ii1(a aVar) {
        int i;
        boolean z;
        this.c = aVar.a;
        if (e(aVar.b)) {
            i = aVar.h / 2;
        } else {
            i = aVar.h;
        }
        this.d = i;
        int c2 = c(aVar.b, aVar.f, aVar.g);
        float b2 = aVar.c.b() * aVar.c.a() * 4;
        int round = Math.round(aVar.e * b2);
        int round2 = Math.round(b2 * aVar.d);
        int i2 = c2 - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.b = round2;
            this.a = round;
        } else {
            float f2 = i2;
            float f3 = aVar.e;
            float f4 = aVar.d;
            float f5 = f2 / (f3 + f4);
            this.b = Math.round(f4 * f5);
            this.a = Math.round(f5 * aVar.e);
        }
        if (Log.isLoggable(e, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.b));
            sb.append(", pool size: ");
            sb.append(f(this.a));
            sb.append(", byte array size: ");
            sb.append(f(i));
            sb.append(", memory class limited? ");
            if (i3 > c2) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(f(c2));
            sb.append(", memoryClass: ");
            sb.append(aVar.b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.b));
            Log.d(e, sb.toString());
        }
    }

    public static int c(ActivityManager activityManager, float f2, float f3) {
        boolean e2 = e(activityManager);
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e2) {
            f2 = f3;
        }
        return Math.round(memoryClass * f2);
    }

    public static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public final String f(int i) {
        return Formatter.formatFileSize(this.c, i);
    }
}
