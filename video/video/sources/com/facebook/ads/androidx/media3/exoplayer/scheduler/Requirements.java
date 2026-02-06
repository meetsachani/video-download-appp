package com.facebook.ads.androidx.media3.exoplayer.scheduler;

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
import com.facebook.ads.redexgen.X.AbstractC04543y;
import com.facebook.ads.redexgen.X.C5C;
import com.facebook.ads.redexgen.X.CO;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class Requirements implements Parcelable {
    public static byte[] A01;
    public static String[] A02 = {"uwN5TqWruOwNeCy1aiqDeLgzeCho9gnR", "uTqO4HZ69OtT2", "pp7wWJEgHEGU283E", "XPZfXvI81RbECUtIqAEftJ2yNIIbXze1", "5SwimXMBGWXyWjNLtwjqMnX", "7CGYXLa6aYpujc5oADJ5LB3FbDI8uqBi", "FEMkx52dE2zGpzw1", "Fv9wompXFxfx6YB8Vj7MYx3uqzKPyKZl"};
    public static final Parcelable.Creator<Requirements> CREATOR;
    public final int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{36, 49, C3307Iz.Z, 53, 50, C3307Iz.d0, C3307Iz.Z, -15, C3307Iz.d0, 49, 55, 40, 49, 55, -15, 36, C3307Iz.Y, 55, C3307Iz.d0, 50, 49, -15, 5, 4, C8077mf.A, C8077mf.A, 8, C8077mf.y, 28, 34, 6, C8077mf.m, 4, 17, 10, 8, 7, -13, 0, -10, 4, 1, -5, -10, C2638Cg0.o7, -5, 0, 6, -9, 0, 6, C2638Cg0.o7, -13, -11, 6, -5, 1, 0, C2638Cg0.o7, -42, -41, -24, -37, -43, -41, -15, -27, -26, C2638Cg0.C7, -28, -45, C2638Cg0.E7, -41, -15, -34, C2638Cg0.C7, -23, -25, -13, -14, -14, -23, -25, -8, -19, -6, -19, -8, -3, -9, -10, -2, -20, -7, 3, 4, -15, 4, 5, 3};
    }

    static {
        A02();
        CREATOR = new CO();
    }

    public Requirements(int i) {
        this.A00 = (i & 2) != 0 ? i | 1 : i;
    }

    private int A00(Context context) {
        if (A0A()) {
            ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC04543y.A01(context.getSystemService(A01(77, 12, 28)));
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                boolean A06 = A06(connectivityManager);
                String[] strArr = A02;
                if (strArr[2].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                A02[5] = "RKqvXcDMvtoTOxGBV3lSSEVfZ64ZYoxU";
                if (A06) {
                    if (A0C()) {
                        boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                        if (A02[3].charAt(16) != 'q') {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A02;
                        strArr2[1] = "RJMLW2AndFlsS";
                        strArr2[4] = "adHoYRSEIssUTsmuQLV0TXA";
                        if (isActiveNetworkMetered) {
                            if (A02[0].charAt(4) != 'h') {
                                String[] strArr3 = A02;
                                strArr3[1] = "EctWe7FhnH81C";
                                strArr3[4] = "lAwOl2qOFCjLVAIEQ1yyJzT";
                                return 2;
                            }
                            String[] strArr4 = A02;
                            strArr4[1] = "YeFdaHJUx43hD";
                            strArr4[4] = "U4BsCHt3kJE5KJEOEKp0bYO";
                            return 2;
                        }
                    }
                    return 0;
                }
            }
            return this.A00 & 3;
        }
        return 0;
    }

    private boolean A03(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter(A01(0, 37, 91)));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra(A01(94, 6, 40), -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A04(Context context) {
        PowerManager powerManager = (PowerManager) AbstractC04543y.A01(context.getSystemService(A01(89, 5, 31)));
        if (C5C.A02 >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (C5C.A02 >= 20) {
            return !powerManager.isInteractive();
        }
        boolean isScreenOn = powerManager.isScreenOn();
        if (A02[7].charAt(15) != '8') {
            throw new RuntimeException();
        }
        A02[7] = "0vwiCxXTqkOZryo8en8HAet2lmwum6iC";
        if (!isScreenOn) {
        }
    }

    private boolean A05(Context context) {
        return context.registerReceiver(null, new IntentFilter(A01(37, 40, 42))) == null;
    }

    public static boolean A06(ConnectivityManager connectivityManager) {
        if (C5C.A02 < 24) {
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

    public final int A07(Context context) {
        int A00 = A00(context);
        if (A08() && !A03(context)) {
            A00 |= 8;
        }
        if (A09() && !A04(context)) {
            A00 |= 4;
        }
        if (A0B() && !A05(context)) {
            return A00 | 16;
        }
        return A00;
    }

    public final boolean A08() {
        return (this.A00 & 8) != 0;
    }

    public final boolean A09() {
        return (this.A00 & 4) != 0;
    }

    public final boolean A0A() {
        return (this.A00 & 1) != 0;
    }

    public final boolean A0B() {
        return (this.A00 & 16) != 0;
    }

    public final boolean A0C() {
        return (this.A00 & 2) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((Requirements) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }
}
