package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzfuf {
    public static final zzfud a = new zzfud("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                a.d("Play Store package is disabled.", new Object[0]);
            } else {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr != null && (r0 = signatureArr.length) != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String a2 = zzfue.a(signature.toByteArray());
                            arrayList.add(a2);
                            if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a2)) {
                                String str = Build.TAGS;
                                if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a2)) {
                                    return true;
                                }
                            } else {
                                return true;
                            }
                        }
                        zzfud zzfudVar = a;
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence) C6566gU0.h);
                            }
                        }
                        zzfudVar.d(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb.toString()), new Object[0]);
                    } else {
                        a.d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    a.d("Play Store package is not found.", new Object[0]);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            a.d("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
