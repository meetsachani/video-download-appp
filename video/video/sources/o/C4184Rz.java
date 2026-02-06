package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Rz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4184Rz {
    @NotNull
    public static final C4184Rz a = new C4184Rz();
    @NotNull
    public static final String b = ":";

    @InterfaceC9511sW0
    @NotNull
    public static final String a(@NotNull Context context) {
        C6562gT0.p(context, "ctx");
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            C6562gT0.o(signatureArr, "signatures");
            int length = signatureArr.length;
            int i = 0;
            while (i < length) {
                Signature signature = signatureArr[i];
                i++;
                messageDigest.update(signature.toByteArray());
                sb.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb.append(":");
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            String sb2 = sb.toString();
            C6562gT0.o(sb2, "sb.toString()");
            return sb2;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    @InterfaceC5056aJ2(otherwise = 2)
    public static /* synthetic */ void b() {
    }
}
