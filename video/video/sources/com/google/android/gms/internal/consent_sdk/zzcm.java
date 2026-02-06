package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public final class zzcm {
    @InterfaceC8710pF0("DeviceId.class")
    @InterfaceC11300zs1
    public static String a;

    public static synchronized String a(Context context) {
        String str;
        String string;
        synchronized (zzcm.class) {
            try {
                if (a == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    if (contentResolver == null) {
                        string = null;
                    } else {
                        string = Settings.Secure.getString(contentResolver, "android_id");
                    }
                    if (string != null) {
                        if (zzcu.a(true)) {
                        }
                        a = b(string);
                    }
                    string = "emulator";
                    a = b(string);
                }
                str = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String b(String str) {
        for (int i = 0; i < 3; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return "";
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return "";
    }
}
