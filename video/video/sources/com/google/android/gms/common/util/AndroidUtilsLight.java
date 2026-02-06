package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class AndroidUtilsLight {
    public static volatile int a = -1;

    @InterfaceC11300zs1
    @KeepForSdk
    @Deprecated
    public static byte[] a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) throws PackageManager.NameNotFoundException {
        MessageDigest b;
        PackageInfo f = Wrappers.a(context).f(str, 64);
        Signature[] signatureArr = f.signatures;
        if (signatureArr != null && signatureArr.length == 1 && (b = b("SHA1")) != null) {
            return b.digest(f.signatures[0].toByteArray());
        }
        return null;
    }

    @InterfaceC11300zs1
    public static MessageDigest b(@InterfaceC5670cr1 String str) {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
