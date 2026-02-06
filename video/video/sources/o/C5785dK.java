package o;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.dK  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5785dK {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;

    /* renamed from: o.dK$a */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.dK$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    public static NetworkInfo a(ConnectivityManager connectivityManager, Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int b(ConnectivityManager connectivityManager) {
        return a.a(connectivityManager);
    }

    @JR1(expression = "cm.isActiveNetworkMetered()")
    @Deprecated
    public static boolean c(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
