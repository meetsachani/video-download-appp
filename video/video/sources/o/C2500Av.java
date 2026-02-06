package o;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.Av  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2500Av implements InterfaceC11235zc0 {
    public static final String f = "Camera2EncoderProfilesProvider";
    public final boolean b;
    public final String c;
    public final int d;
    public final Map<Integer, InterfaceC2426Ac0> e = new HashMap();

    /* renamed from: o.Av$a */
    /* loaded from: classes.dex */
    public static class a {
        public static EncoderProfiles a(String str, int i) {
            return CamcorderProfile.getAll(str, i);
        }
    }

    public C2500Av(String str) {
        boolean z;
        int i;
        this.c = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            C7433k41.p(f, "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z = false;
            i = -1;
        }
        this.b = z;
        this.d = i;
    }

    @Override // o.InterfaceC11235zc0
    public boolean a(int i) {
        if (!this.b) {
            return false;
        }
        return CamcorderProfile.hasProfile(this.d, i);
    }

    @Override // o.InterfaceC11235zc0
    public InterfaceC2426Ac0 b(int i) {
        if (!this.b || !CamcorderProfile.hasProfile(this.d, i)) {
            return null;
        }
        if (this.e.containsKey(Integer.valueOf(i))) {
            return this.e.get(Integer.valueOf(i));
        }
        InterfaceC2426Ac0 d = d(i);
        this.e.put(Integer.valueOf(i), d);
        return d;
    }

    public final InterfaceC2426Ac0 c(int i) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.d, i);
        } catch (RuntimeException e) {
            C7433k41.q(f, "Unable to get CamcorderProfile by quality: " + i, e);
            camcorderProfile = null;
        }
        if (camcorderProfile == null) {
            return null;
        }
        return C2524Bc0.a(camcorderProfile);
    }

    public final InterfaceC2426Ac0 d(int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles a2 = a.a(this.c, i);
            if (a2 == null) {
                return null;
            }
            if (X20.a(C9501sT0.class) != null) {
                C7433k41.a(f, "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return C2524Bc0.b(a2);
                } catch (NullPointerException e) {
                    C7433k41.q(f, "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e);
                }
            }
        }
        return c(i);
    }
}
