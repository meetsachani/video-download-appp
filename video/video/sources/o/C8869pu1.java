package o;

import android.util.Base64;
import android.util.Log;
import com.facebook.C2381j;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: o.pu1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8869pu1 {
    @NotNull
    public static final C8869pu1 a = new C8869pu1();
    @NotNull
    public static final String b = "/.well-known/oauth/openid/keys/";
    @NotNull
    public static final String c = "SHA256withRSA";
    public static final long d = 5000;

    @InterfaceC9511sW0
    @NotNull
    public static final PublicKey c(@NotNull String str) {
        C6562gT0.p(str, "key");
        byte[] decode = Base64.decode(C9545sf2.z2(C9545sf2.z2(C9545sf2.z2(str, "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), 0);
        C6562gT0.o(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        C6562gT0.o(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String d(@NotNull final String str) {
        C6562gT0.p(str, "kid");
        com.facebook.M m = com.facebook.M.a;
        final URL url = new URL("https", C6562gT0.C("www.", com.facebook.M.z()), b);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final RP1.h hVar = new RP1.h();
        com.facebook.M.y().execute(new Runnable() { // from class: o.ou1
            @Override // java.lang.Runnable
            public final void run() {
                C8869pu1.e(url, hVar, str, reentrantLock, newCondition);
            }
        });
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) hVar.X;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public static final void e(URL url, RP1.h hVar, String str, ReentrantLock reentrantLock, Condition condition) {
        C6562gT0.p(url, "$openIdKeyUrl");
        C6562gT0.p(hVar, "$result");
        C6562gT0.p(str, "$kid");
        C6562gT0.p(reentrantLock, "$lock");
        URLConnection openConnection = url.openConnection();
        if (openConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            try {
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    C6562gT0.o(inputStream, "connection.inputStream");
                    String m = C4532Vm2.m(new BufferedReader(new InputStreamReader(inputStream, HB.b), 8192));
                    httpURLConnection.getInputStream().close();
                    hVar.X = new JSONObject(m).optString(str);
                    httpURLConnection.disconnect();
                    reentrantLock.lock();
                    try {
                        condition.signal();
                        C7458kA2 c7458kA2 = C7458kA2.a;
                        return;
                    } finally {
                    }
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    reentrantLock.lock();
                    try {
                        condition.signal();
                        C7458kA2 c7458kA22 = C7458kA2.a;
                        throw th;
                    } finally {
                    }
                }
            } catch (Exception e) {
                String name = a.getClass().getName();
                String message = e.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    C7458kA2 c7458kA23 = C7458kA2.a;
                    return;
                } finally {
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    @InterfaceC9511sW0
    public static final boolean f(@NotNull PublicKey publicKey, @NotNull String str, @NotNull String str2) {
        C6562gT0.p(publicKey, "publicKey");
        C6562gT0.p(str, "data");
        C6562gT0.p(str2, C2381j.g1);
        try {
            Signature signature = Signature.getInstance(c);
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(HB.b);
            C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            C6562gT0.o(decode, "decode(signature, Base64.URL_SAFE)");
            return signature.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    public final String b() {
        return b;
    }
}
