package o;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* renamed from: o.zt0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11303zt0 {
    public final Context a;

    /* renamed from: o.zt0$a */
    /* loaded from: classes.dex */
    public class a extends FingerprintManager.AuthenticationCallback {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.a.a(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.a.c(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.a.d(new d(C11303zt0.g(b.b(authenticationResult))));
        }
    }

    /* renamed from: o.zt0$b */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        public static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        public static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        public static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() == null) {
                return null;
            }
            return new e(cryptoObject.getMac());
        }

        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() == null) {
                return null;
            }
            return new FingerprintManager.CryptoObject(eVar.b());
        }
    }

    /* renamed from: o.zt0$d */
    /* loaded from: classes.dex */
    public static final class d {
        public final e a;

        public d(e eVar) {
            this.a = eVar;
        }

        public e a() {
            return this.a;
        }
    }

    public C11303zt0(Context context) {
        this.a = context;
    }

    public static C11303zt0 c(Context context) {
        return new C11303zt0(context);
    }

    public static FingerprintManager d(Context context) {
        return b.c(context);
    }

    public static e g(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    public static FingerprintManager.AuthenticationCallback h(c cVar) {
        return new a(cVar);
    }

    public static FingerprintManager.CryptoObject i(e eVar) {
        return b.g(eVar);
    }

    public void a(e eVar, int i, CancellationSignal cancellationSignal, c cVar, Handler handler) {
        FingerprintManager d2 = d(this.a);
        if (d2 != null) {
            b.a(d2, i(eVar), cancellationSignal, i, h(cVar), handler);
        }
    }

    @Deprecated
    public void b(e eVar, int i, C10593wy c10593wy, c cVar, Handler handler) {
        CancellationSignal cancellationSignal;
        if (c10593wy != null) {
            cancellationSignal = (CancellationSignal) c10593wy.b();
        } else {
            cancellationSignal = null;
        }
        a(eVar, i, cancellationSignal, cVar, handler);
    }

    public boolean e() {
        FingerprintManager d2 = d(this.a);
        if (d2 != null && b.d(d2)) {
            return true;
        }
        return false;
    }

    public boolean f() {
        FingerprintManager d2 = d(this.a);
        if (d2 != null && b.e(d2)) {
            return true;
        }
        return false;
    }

    /* renamed from: o.zt0$e */
    /* loaded from: classes.dex */
    public static class e {
        public final Signature a;
        public final Cipher b;
        public final Mac c;

        public e(Signature signature) {
            this.a = signature;
            this.b = null;
            this.c = null;
        }

        public Cipher a() {
            return this.b;
        }

        public Mac b() {
            return this.c;
        }

        public Signature c() {
            return this.a;
        }

        public e(Cipher cipher) {
            this.b = cipher;
            this.a = null;
            this.c = null;
        }

        public e(Mac mac) {
            this.c = mac;
            this.b = null;
            this.a = null;
        }
    }

    /* renamed from: o.zt0$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        public void b() {
        }

        public void d(d dVar) {
        }

        public void a(int i, CharSequence charSequence) {
        }

        public void c(int i, CharSequence charSequence) {
        }
    }
}
