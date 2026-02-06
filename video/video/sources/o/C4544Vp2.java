package o;

import android.content.pm.PackageManager;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* renamed from: o.Vp2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4544Vp2 {
    public static final String b = "Token";
    public final C4738Xp2 a;

    public C4544Vp2(C4738Xp2 c4738Xp2) {
        this.a = c4738Xp2;
    }

    public static C4544Vp2 a(String str, PackageManager packageManager) {
        List<byte[]> b2 = C2606Bx1.b(str, packageManager);
        if (b2 == null) {
            return null;
        }
        try {
            return new C4544Vp2(C4738Xp2.c(str, b2));
        } catch (IOException e) {
            Log.e(b, "Exception when creating token.", e);
            return null;
        }
    }

    public static C4544Vp2 b(byte[] bArr) {
        return new C4544Vp2(C4738Xp2.e(bArr));
    }

    public boolean c(String str, PackageManager packageManager) {
        return C2606Bx1.d(str, packageManager, this.a);
    }

    public byte[] d() {
        return this.a.j();
    }
}
