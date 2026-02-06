package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;

@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes2.dex */
public class GmsSignatureVerifier {
    public static final zzab a;
    public static final zzab b;
    public static final HashMap c;

    static {
        zzz zzzVar = new zzz();
        zzzVar.d("com.google.android.gms");
        zzzVar.a(204200000L);
        zzl zzlVar = zzn.d;
        zzzVar.c(zzag.F(zzlVar.V3(), zzn.b.V3()));
        zzl zzlVar2 = zzn.c;
        zzzVar.b(zzag.F(zzlVar2.V3(), zzn.a.V3()));
        a = zzzVar.e();
        zzz zzzVar2 = new zzz();
        zzzVar2.d("com.android.vending");
        zzzVar2.a(82240000L);
        zzzVar2.c(zzag.D(zzlVar.V3()));
        zzzVar2.b(zzag.D(zzlVar2.V3()));
        b = zzzVar2.e();
        c = new HashMap();
    }
}
