package o;

import android.location.LocationRequest;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.l31  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7672l31 {
    public static final long h = Long.MAX_VALUE;
    public static final int i = 100;
    public static final int j = 102;
    public static final int k = 104;
    public static final long l = -1;
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final float f;
    public final long g;

    /* renamed from: o.l31$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Class<?> a;
        public static Method b;
        public static Method c;
        public static Method d;
        public static Method e;
        public static Method f;

        public static Object a(C7672l31 c7672l31, String str) {
            try {
                if (a == null) {
                    a = Class.forName("android.location.LocationRequest");
                }
                Method method = b;
                Class cls = Long.TYPE;
                if (method == null) {
                    Method declaredMethod = a.getDeclaredMethod("createFromDeprecatedProvider", String.class, cls, Float.TYPE, Boolean.TYPE);
                    b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = b.invoke(null, str, Long.valueOf(c7672l31.b()), Float.valueOf(c7672l31.e()), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                Method method2 = c;
                Class cls2 = Integer.TYPE;
                if (method2 == null) {
                    Method declaredMethod2 = a.getDeclaredMethod("setQuality", cls2);
                    c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                c.invoke(invoke, Integer.valueOf(c7672l31.g()));
                if (d == null) {
                    Method declaredMethod3 = a.getDeclaredMethod("setFastestInterval", cls);
                    d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                d.invoke(invoke, Long.valueOf(c7672l31.f()));
                if (c7672l31.d() < Integer.MAX_VALUE) {
                    if (e == null) {
                        Method declaredMethod4 = a.getDeclaredMethod("setNumUpdates", cls2);
                        e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    e.invoke(invoke, Integer.valueOf(c7672l31.d()));
                }
                if (c7672l31.a() < Long.MAX_VALUE) {
                    if (f == null) {
                        Method declaredMethod5 = a.getDeclaredMethod("setExpireIn", cls);
                        f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f.invoke(invoke, Long.valueOf(c7672l31.a()));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* renamed from: o.l31$b */
    /* loaded from: classes.dex */
    public static class b {
        public static LocationRequest a(C7672l31 c7672l31) {
            return new LocationRequest.Builder(c7672l31.b()).setQuality(c7672l31.g()).setMinUpdateIntervalMillis(c7672l31.f()).setDurationMillis(c7672l31.a()).setMaxUpdates(c7672l31.d()).setMinUpdateDistanceMeters(c7672l31.e()).setMaxUpdateDelayMillis(c7672l31.c()).build();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.l31$d */
    /* loaded from: classes.dex */
    public @interface d {
    }

    public C7672l31(long j2, int i2, long j3, int i3, long j4, float f, long j5) {
        this.b = j2;
        this.a = i2;
        this.c = j4;
        this.d = j3;
        this.e = i3;
        this.f = f;
        this.g = j5;
    }

    public long a() {
        return this.d;
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.g;
    }

    public int d() {
        return this.e;
    }

    public float e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7672l31)) {
            return false;
        }
        C7672l31 c7672l31 = (C7672l31) obj;
        if (this.a == c7672l31.a && this.b == c7672l31.b && this.c == c7672l31.c && this.d == c7672l31.d && this.e == c7672l31.e && Float.compare(c7672l31.f, this.f) == 0 && this.g == c7672l31.g) {
            return true;
        }
        return false;
    }

    public long f() {
        long j2 = this.c;
        if (j2 == -1) {
            return this.b;
        }
        return j2;
    }

    public int g() {
        return this.a;
    }

    public LocationRequest h() {
        return b.a(this);
    }

    public int hashCode() {
        long j2 = this.b;
        long j3 = this.c;
        return (((this.a * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public LocationRequest i(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return h();
        }
        return C7429k31.a(a.a(this, str));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.b != Long.MAX_VALUE) {
            sb.append("@");
            C5178ap2.e(this.b, sb);
            int i2 = this.a;
            if (i2 != 100) {
                if (i2 != 102) {
                    if (i2 == 104) {
                        sb.append(" LOW_POWER");
                    }
                } else {
                    sb.append(" BALANCED");
                }
            } else {
                sb.append(" HIGH_ACCURACY");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.d != Long.MAX_VALUE) {
            sb.append(", duration=");
            C5178ap2.e(this.d, sb);
        }
        if (this.e != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.e);
        }
        long j2 = this.c;
        if (j2 != -1 && j2 < this.b) {
            sb.append(", minUpdateInterval=");
            C5178ap2.e(this.c, sb);
        }
        if (this.f > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f);
        }
        if (this.g / 2 > this.b) {
            sb.append(", maxUpdateDelay=");
            C5178ap2.e(this.g, sb);
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: o.l31$c */
    /* loaded from: classes.dex */
    public static final class c {
        public long a;
        public int b;
        public long c;
        public int d;
        public long e;
        public float f;
        public long g;

        public c(long j) {
            d(j);
            this.b = 102;
            this.c = Long.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            this.e = -1L;
            this.f = 0.0f;
            this.g = 0L;
        }

        public C7672l31 a() {
            boolean z;
            if (this.a == Long.MAX_VALUE && this.e == -1) {
                z = false;
            } else {
                z = true;
            }
            C10907yF1.o(z, "passive location requests must have an explicit minimum update interval");
            long j = this.a;
            return new C7672l31(j, this.b, this.c, this.d, Math.min(this.e, j), this.f, this.g);
        }

        public c b() {
            this.e = -1L;
            return this;
        }

        public c c(long j) {
            this.c = C10907yF1.h(j, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        public c d(long j) {
            this.a = C10907yF1.h(j, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        public c e(long j) {
            this.g = j;
            this.g = C10907yF1.h(j, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        public c f(int i) {
            this.d = C10907yF1.g(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        public c g(float f) {
            this.f = f;
            this.f = C10907yF1.f(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        public c h(long j) {
            this.e = C10907yF1.h(j, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        public c i(int i) {
            boolean z;
            if (i != 104 && i != 102 && i != 100) {
                z = false;
            } else {
                z = true;
            }
            C10907yF1.c(z, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i));
            this.b = i;
            return this;
        }

        public c(C7672l31 c7672l31) {
            this.a = c7672l31.b;
            this.b = c7672l31.a;
            this.c = c7672l31.d;
            this.d = c7672l31.e;
            this.e = c7672l31.c;
            this.f = c7672l31.f;
            this.g = c7672l31.g;
        }
    }
}
