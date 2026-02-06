package o;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;

/* renamed from: o.iv2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7154iv2 {
    public static final String d = "TwilightManager";
    public static final int e = 6;
    public static final int f = 22;
    public static C7154iv2 g;
    public final Context a;
    public final LocationManager b;
    public final a c = new a();

    /* renamed from: o.iv2$a */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a;
        public long b;
    }

    public C7154iv2(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    public static C7154iv2 a(Context context) {
        if (g == null) {
            Context applicationContext = context.getApplicationContext();
            g = new C7154iv2(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.s));
        }
        return g;
    }

    public static void f(C7154iv2 c7154iv2) {
        g = c7154iv2;
    }

    public final Location b() {
        Location location;
        Location location2 = null;
        if (EC1.d(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = c("network");
        } else {
            location = null;
        }
        if (EC1.d(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = c("gps");
        }
        if (location2 != null && location != null) {
            if (location2.getTime() > location.getTime()) {
                return location2;
            }
            return location;
        } else if (location2 != null) {
            return location2;
        } else {
            return location;
        }
    }

    public final Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d(d, "Failed to get last known location", e2);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location b = b();
        if (b != null) {
            g(b);
            return aVar.a;
        }
        Log.i(d, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        if (i >= 6 && i < 22) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (this.c.b > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public final void g(Location location) {
        long j;
        a aVar = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        C6913hv2 b = C6913hv2.b();
        b.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (b.c != 1) {
            z = false;
        }
        boolean z2 = z;
        long j2 = b.b;
        long j3 = b.a;
        b.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = b.b;
        if (j2 != -1 && j3 != -1) {
            if (currentTimeMillis > j3) {
                j2 = j4;
            } else if (currentTimeMillis > j2) {
                j2 = j3;
            }
            j = j2 + 60000;
        } else {
            j = currentTimeMillis + 43200000;
        }
        aVar.a = z2;
        aVar.b = j;
    }
}
