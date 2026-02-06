package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class W6 implements VN {
    public static byte[] A01;
    public final C1673gi A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{94, 89, 91, 76, 77, 89, 84, 103, 76, 81, 85, 93, 75, 76, 89, 85, 72, 64, 79, 74, 70, 77, 87, 124, 66, 83, 74, 124, 85, 70, 81, 80, 74, 76, 77, 101, 105, 104, 114, 99, 104, 114, 60, C3307Iz.a0, C3307Iz.a0, 5, 2, 31, C8077mf.B, 13, 0, 0, 51, C8077mf.H, 9, 10, 9, C8077mf.H, C8077mf.H, 9, C8077mf.H, 68, 94, 114, 78, 89, 57, 40, 42, 34, 40, C3307Iz.f0, C3307Iz.d0, C8077mf.z, C3307Iz.Z, 40, 36, C3307Iz.d0};
    }

    public W6(C1673gi c1673gi) {
        this.A00 = c1673gi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A03(String str, boolean z, String str2, String str3, String str4, long j) {
        this.A00.A0F().ABN(str);
        PackageManager packageManager = this.A00.getPackageManager();
        if (packageManager == null) {
            this.A00.A0F().ABS(str);
            return false;
        }
        ContentResolver contentResolver = this.A00.getContentResolver();
        if (contentResolver == null) {
            this.A00.A0F().ABP(str);
            return false;
        } else if (packageManager.resolveContentProvider(str, 0) == null) {
            this.A00.A0F().ABO(str);
            return false;
        } else {
            Uri parse = Uri.parse(A00(35, 10, 10) + str + A00(0, 1, 125) + str2);
            ContentValues values = new ContentValues();
            values.put(A00(17, 18, 47), (Integer) 1);
            values.put(A00(61, 5, 33), Boolean.valueOf(z));
            values.put(A00(45, 16, 96), str3);
            values.put(A00(66, 12, 69), str4);
            values.put(A00(1, 16, 52), Long.valueOf(j));
            try {
                contentResolver.insert(parse, values);
                this.A00.A0F().ABU(str);
                return true;
            } catch (UnsupportedOperationException unused) {
                this.A00.A0F().ABR(str);
                return false;
            } catch (Exception unused2) {
                this.A00.A0F().ABQ(str);
                return false;
            }
        }
    }

    public final void A04(boolean z, String str, String str2, String str3, long j, boolean z2) {
        this.A00.A0F().ABT();
        YG.A06.execute(new W7(this, z, str, str2, str3, j, z2));
    }
}
