package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import com.facebook.internal.q0;
import java.util.List;
import o.C3230Ie1;
import o.C3426Ke1;
import o.C3524Le1;
import o.ES1;

/* JADX INFO: Access modifiers changed from: package-private */
@ES1(29)
/* loaded from: classes2.dex */
public final class zztd {
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints;
        Boolean bool;
        Boolean bool2;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int c = c(supportedPerformancePoints, C3426Ke1.a(i, i2, (int) d));
        boolean z = true;
        if (c == 1) {
            bool = zzte.a;
            if (bool == null) {
                if (Build.VERSION.SDK_INT < 35) {
                    int b = b(false);
                    int b2 = b(true);
                    if (b != 0) {
                        if (b2 == 0) {
                        }
                    }
                    zzte.a = Boolean.valueOf(z);
                    bool2 = zzte.a;
                    if (!bool2.booleanValue()) {
                        return 0;
                    }
                }
                z = false;
                zzte.a = Boolean.valueOf(z);
                bool2 = zzte.a;
                if (!bool2.booleanValue()) {
                }
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        r2 = r2.getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(boolean z) {
        List supportedPerformancePoints;
        try {
            zzx zzxVar = new zzx();
            zzxVar.E("video/avc");
            zzz K = zzxVar.K();
            if (K.f301o != null) {
                List e = zztw.e(zztl.a, K, z, false);
                for (int i = 0; i < e.size(); i++) {
                    if (((zztc) e.get(i)).d != null && (r2 = ((zztc) e.get(i)).d.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                        C3524Le1.a();
                        return c(supportedPerformancePoints, C3426Ke1.a(q0.q1, 720, 60));
                    }
                }
            }
        } catch (zztq unused) {
        }
        return 0;
    }

    public static int c(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i = 0; i < list.size(); i++) {
            covers = C3230Ie1.a(list.get(i)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
