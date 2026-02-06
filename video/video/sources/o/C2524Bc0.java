package o;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;

/* renamed from: o.Bc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2524Bc0 {
    public static final String a = "EncoderProfilesProxyCompat";

    public static InterfaceC2426Ac0 a(CamcorderProfile camcorderProfile) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            C7433k41.p(a, "Should use from(EncoderProfiles) on API " + i + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return C2818Ec0.a(camcorderProfile);
    }

    public static InterfaceC2426Ac0 b(EncoderProfiles encoderProfiles) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return C2720Dc0.a(encoderProfiles);
        }
        if (i >= 31) {
            return C2622Cc0.a(encoderProfiles);
        }
        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i + ". Version 31 or higher required.");
    }
}
