package o;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class K21 {
    public static final String a = "mockLocation";
    public static final String b = "verticalAccuracy";
    public static final String c = "speedAccuracy";
    public static final String d = "bearingAccuracy";
    public static final String e = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final String f = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static Method g;
    public static Field h;
    public static Integer i;
    public static Integer j;
    public static Integer k;

    /* loaded from: classes.dex */
    public static class a {
        public static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        public static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        public static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        public static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        public static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        public static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }

        public static void g(Location location) {
            try {
                K21.e().setByte(location, (byte) (K21.e().getByte(location) & (~K21.f())));
            } catch (IllegalAccessException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (NoSuchFieldException e2) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e2);
                throw noSuchFieldError;
            }
        }

        public static void h(Location location) {
            try {
                K21.e().setByte(location, (byte) (K21.e().getByte(location) & (~K21.g())));
            } catch (IllegalAccessException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (NoSuchFieldException e2) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e2);
                throw noSuchFieldError;
            }
        }

        public static void i(Location location) {
            try {
                K21.e().setByte(location, (byte) (K21.e().getByte(location) & (~K21.h())));
            } catch (IllegalAccessException | NoSuchFieldException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            }
        }

        public static void j(Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        public static void k(Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        public static void l(Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean hasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean hasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean hasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean hasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean hasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean hasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (hasAltitude) {
                    location.setAltitude(altitude);
                }
                if (hasSpeed) {
                    location.setSpeed(speed);
                }
                if (hasBearing) {
                    location.setBearing(bearing);
                }
                if (hasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (hasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (hasSpeedAccuracy) {
                    location.setBearingAccuracyDegrees(speedAccuracyMetersPerSecond);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        public static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean hasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean hasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean hasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean hasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean hasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean hasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (hasAltitude) {
                    location.setAltitude(altitude);
                }
                if (hasSpeed) {
                    location.setSpeed(speed);
                }
                if (hasBearing) {
                    location.setBearing(bearing);
                }
                if (hasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (hasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (hasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        public static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean hasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean hasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean hasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean hasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean hasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                boolean hasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (hasAltitude) {
                    location.setAltitude(altitude);
                }
                if (hasSpeed) {
                    location.setSpeed(speed);
                }
                if (hasBearing) {
                    location.setBearing(bearing);
                }
                if (hasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (hasSpeedAccuracy) {
                    location.setSpeedAccuracyMetersPerSecond(speedAccuracyMetersPerSecond);
                }
                if (hasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(Location location) {
            if (!location.hasBearingAccuracy()) {
                return;
            }
            double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
            b.a(location);
            location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
        }

        public static void b(Location location) {
            if (!location.hasSpeedAccuracy()) {
                return;
            }
            double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
            b.b(location);
            location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
        }

        public static void c(Location location) {
            if (!location.hasVerticalAccuracy()) {
                return;
            }
            double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
            b.c(location);
            location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static boolean a(Location location) {
            return location.isMock();
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static void a(Location location) {
            location.removeBearingAccuracy();
        }

        public static void b(Location location) {
            location.removeSpeedAccuracy();
        }

        public static void c(Location location) {
            location.removeVerticalAccuracy();
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static float a(Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        public static double b(Location location) {
            return location.getMslAltitudeMeters();
        }

        public static boolean c(Location location) {
            return location.hasMslAltitude();
        }

        public static boolean d(Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        public static void e(Location location) {
            location.removeMslAltitude();
        }

        public static void f(Location location) {
            location.removeMslAltitudeAccuracy();
        }

        public static void g(Location location, float f) {
            location.setMslAltitudeAccuracyMeters(f);
        }

        public static void h(Location location, double d) {
            location.setMslAltitudeMeters(d);
        }
    }

    public static void A(Location location, float f2) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.j(location, f2);
        } else {
            k(location).putFloat(d, f2);
        }
    }

    public static void B(Location location, boolean z) {
        try {
            l().invoke(location, Boolean.valueOf(z));
        } catch (IllegalAccessException e2) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e2);
            throw illegalAccessError;
        } catch (NoSuchMethodException e3) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e3);
            throw noSuchMethodError;
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void C(Location location, float f2) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.g(location, f2);
        } else {
            k(location).putFloat(f, f2);
        }
    }

    public static void D(Location location, double d2) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.h(location, d2);
        } else {
            k(location).putDouble(e, d2);
        }
    }

    public static void E(Location location, float f2) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.k(location, f2);
        } else {
            k(location).putFloat(c, f2);
        }
    }

    public static void F(Location location, float f2) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.l(location, f2);
        } else {
            k(location).putFloat(b, f2);
        }
    }

    public static boolean a(Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null && extras.containsKey(str)) {
            return true;
        }
        return false;
    }

    public static float b(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(d, 0.0f);
    }

    public static long c(Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    @JR1(expression = "location.getElapsedRealtimeNanos()")
    @Deprecated
    public static long d(Location location) {
        return location.getElapsedRealtimeNanos();
    }

    public static Field e() throws NoSuchFieldException {
        if (h == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            h = declaredField;
            declaredField.setAccessible(true);
        }
        return h;
    }

    public static int f() throws NoSuchFieldException, IllegalAccessException {
        if (j == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            j = Integer.valueOf(declaredField.getInt(null));
        }
        return j.intValue();
    }

    public static int g() throws NoSuchFieldException, IllegalAccessException {
        if (i == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            i = Integer.valueOf(declaredField.getInt(null));
        }
        return i.intValue();
    }

    public static int h() throws NoSuchFieldException, IllegalAccessException {
        if (k == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            k = Integer.valueOf(declaredField.getInt(null));
        }
        return k.intValue();
    }

    public static float i(Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return f.a(location);
        }
        return k(location).getFloat(f);
    }

    public static double j(Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return f.b(location);
        }
        return k(location).getDouble(e);
    }

    public static Bundle k(Location location) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            return location.getExtras();
        }
        return extras;
    }

    public static Method l() throws NoSuchMethodException {
        if (g == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            g = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return g;
    }

    public static float m(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(c, 0.0f);
    }

    public static float n(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(b, 0.0f);
    }

    public static boolean o(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.d(location);
        }
        return a(location, d);
    }

    public static boolean p(Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return f.c(location);
        }
        return a(location, e);
    }

    public static boolean q(Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return f.d(location);
        }
        return a(location, f);
    }

    public static boolean r(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.e(location);
        }
        return a(location, c);
    }

    public static boolean s(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.f(location);
        }
        return a(location, b);
    }

    public static boolean t(Location location) {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.a(location);
        }
        return location.isFromMockProvider();
    }

    public static void u(Location location) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            e.a(location);
        } else if (i2 >= 29) {
            c.a(location);
        } else if (i2 >= 28) {
            b.a(location);
        } else if (i2 >= 26) {
            a.g(location);
        } else {
            v(location, d);
        }
    }

    public static void v(Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    public static void w(Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.e(location);
        } else {
            v(location, e);
        }
    }

    public static void x(Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.f(location);
        } else {
            v(location, f);
        }
    }

    public static void y(Location location) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            e.b(location);
        } else if (i2 >= 29) {
            c.b(location);
        } else if (i2 >= 28) {
            b.b(location);
        } else if (i2 >= 26) {
            a.h(location);
        } else {
            v(location, c);
        }
    }

    public static void z(Location location) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            e.c(location);
        } else if (i2 >= 29) {
            c.c(location);
        } else if (i2 >= 28) {
            b.c(location);
        } else if (i2 >= 26) {
            a.i(location);
        } else {
            v(location, b);
        }
    }
}
