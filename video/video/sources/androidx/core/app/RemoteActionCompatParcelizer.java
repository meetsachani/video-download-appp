package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import o.YE2;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(YE2 ye2) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) ye2.h0(remoteActionCompat.a, 1);
        remoteActionCompat.b = ye2.w(remoteActionCompat.b, 2);
        remoteActionCompat.c = ye2.w(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) ye2.W(remoteActionCompat.d, 4);
        remoteActionCompat.e = ye2.m(remoteActionCompat.e, 5);
        remoteActionCompat.f = ye2.m(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, YE2 ye2) {
        ye2.j0(false, false);
        ye2.m1(remoteActionCompat.a, 1);
        ye2.z0(remoteActionCompat.b, 2);
        ye2.z0(remoteActionCompat.c, 3);
        ye2.X0(remoteActionCompat.d, 4);
        ye2.n0(remoteActionCompat.e, 5);
        ye2.n0(remoteActionCompat.f, 6);
    }
}
