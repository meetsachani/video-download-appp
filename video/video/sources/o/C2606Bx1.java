package o;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Bx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2606Bx1 {
    public static final String a = "PackageIdentity";

    /* renamed from: o.Bx1$a */
    /* loaded from: classes.dex */
    public static class a implements c {
        @Override // o.C2606Bx1.c
        public List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, C10323vs.Q0);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (Signature signature : signingInfo.getApkContentsSigners()) {
                    arrayList.add(C2606Bx1.a(signature));
                }
                return arrayList;
            }
            arrayList.add(C2606Bx1.a(signingInfo.getSigningCertificateHistory()[0]));
            return arrayList;
        }

        @Override // o.C2606Bx1.c
        public boolean b(String str, PackageManager packageManager, C4738Xp2 c4738Xp2) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> a;
            if (!c4738Xp2.h().equals(str) || (a = a(str, packageManager)) == null) {
                return false;
            }
            if (a.size() == 1) {
                return packageManager.hasSigningCertificate(str, c4738Xp2.f(0), 1);
            }
            return c4738Xp2.equals(C4738Xp2.c(str, a));
        }
    }

    /* renamed from: o.Bx1$b */
    /* loaded from: classes.dex */
    public static class b implements c {
        @Override // o.C2606Bx1.c
        public List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                byte[] a = C2606Bx1.a(signature);
                if (a == null) {
                    return null;
                }
                arrayList.add(a);
            }
            return arrayList;
        }

        @Override // o.C2606Bx1.c
        public boolean b(String str, PackageManager packageManager, C4738Xp2 c4738Xp2) throws IOException, PackageManager.NameNotFoundException {
            List<byte[]> a;
            if (!str.equals(c4738Xp2.h()) || (a = a(str, packageManager)) == null) {
                return false;
            }
            return c4738Xp2.equals(C4738Xp2.c(str, a));
        }
    }

    /* renamed from: o.Bx1$c */
    /* loaded from: classes.dex */
    public interface c {
        List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException;

        boolean b(String str, PackageManager packageManager, C4738Xp2 c4738Xp2) throws IOException, PackageManager.NameNotFoundException;
    }

    public static byte[] a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static List<byte[]> b(String str, PackageManager packageManager) {
        try {
            return c().a(str, packageManager);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(a, "Could not get fingerprint for package.", e);
            return null;
        }
    }

    public static c c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new a();
        }
        return new b();
    }

    public static boolean d(String str, PackageManager packageManager, C4738Xp2 c4738Xp2) {
        try {
            return c().b(str, packageManager, c4738Xp2);
        } catch (PackageManager.NameNotFoundException | IOException e) {
            Log.e(a, "Could not check if package matches token.", e);
            return false;
        }
    }
}
