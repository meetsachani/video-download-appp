package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* loaded from: classes2.dex */
public final class AS1 implements Parcelable {
    public static final Parcelable.Creator<AS1> CREATOR = new a();
    public static final int Y = 1;
    public static final int Y0 = 4;
    public static final int Z = 2;
    public static final int Z0 = 8;
    public static final int a1 = 16;
    public final int X;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<AS1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AS1 createFromParcel(Parcel parcel) {
            return new AS1(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AS1[] newArray(int i) {
            return new AS1[i];
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    public AS1(int i) {
        this.X = (i & 2) != 0 ? i | 1 : i;
    }

    public static boolean m(ConnectivityManager connectivityManager) {
        if (TD2.a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return true;
        }
    }

    public boolean a(Context context) {
        if (d(context) == 0) {
            return true;
        }
        return false;
    }

    public AS1 b(int i) {
        int i2 = this.X;
        int i3 = i & i2;
        if (i3 == i2) {
            return this;
        }
        return new AS1(i3);
    }

    public final int c(Context context) {
        if (!n()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) C9542sf.g(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && m(connectivityManager)) {
            if (!s() || !connectivityManager.isActiveNetworkMetered()) {
                return 0;
            }
            return 2;
        }
        return this.X & 3;
    }

    public int d(Context context) {
        int c = c(context);
        if (f() && !g(context)) {
            c |= 8;
        }
        if (k() && !h(context)) {
            c |= 4;
        }
        if (q() && !o(context)) {
            return c | 16;
        }
        return c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.X;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AS1.class == obj.getClass() && this.X == ((AS1) obj).X) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if ((this.X & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    public final boolean h(Context context) {
        PowerManager powerManager = (PowerManager) C9542sf.g(context.getSystemService("power"));
        int i = TD2.a;
        if (i >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i >= 20) {
            if (powerManager.isInteractive()) {
                return false;
            }
            return true;
        } else if (powerManager.isScreenOn()) {
            return false;
        } else {
            return true;
        }
    }

    public int hashCode() {
        return this.X;
    }

    public boolean k() {
        if ((this.X & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if ((this.X & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean o(Context context) {
        if (context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) {
            return true;
        }
        return false;
    }

    public boolean q() {
        if ((this.X & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean s() {
        if ((this.X & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X);
    }
}
