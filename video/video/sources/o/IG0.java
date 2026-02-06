package o;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class IG0 extends AbstractC3501Ky0 implements InterfaceC7072ia2 {
    @NotNull
    public static final a Z = new a(null);
    @Nullable
    public final MessageDigest X;
    @Nullable
    public final Mac Y;

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final IG0 a(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull C8859ps c8859ps) {
            C6562gT0.p(interfaceC7072ia2, "source");
            C6562gT0.p(c8859ps, "key");
            return new IG0(interfaceC7072ia2, c8859ps, "HmacSHA1");
        }

        @InterfaceC9511sW0
        @NotNull
        public final IG0 b(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull C8859ps c8859ps) {
            C6562gT0.p(interfaceC7072ia2, "source");
            C6562gT0.p(c8859ps, "key");
            return new IG0(interfaceC7072ia2, c8859ps, "HmacSHA256");
        }

        @InterfaceC9511sW0
        @NotNull
        public final IG0 c(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull C8859ps c8859ps) {
            C6562gT0.p(interfaceC7072ia2, "source");
            C6562gT0.p(c8859ps, "key");
            return new IG0(interfaceC7072ia2, c8859ps, "HmacSHA512");
        }

        @InterfaceC9511sW0
        @NotNull
        public final IG0 d(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
            C6562gT0.p(interfaceC7072ia2, "source");
            return new IG0(interfaceC7072ia2, "MD5");
        }

        @InterfaceC9511sW0
        @NotNull
        public final IG0 e(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
            C6562gT0.p(interfaceC7072ia2, "source");
            return new IG0(interfaceC7072ia2, "SHA-1");
        }

        @InterfaceC9511sW0
        @NotNull
        public final IG0 f(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
            C6562gT0.p(interfaceC7072ia2, "source");
            return new IG0(interfaceC7072ia2, com.facebook.internal.l0.e);
        }

        @InterfaceC9511sW0
        @NotNull
        public final IG0 g(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
            C6562gT0.p(interfaceC7072ia2, "source");
            return new IG0(interfaceC7072ia2, "SHA-512");
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IG0(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull MessageDigest messageDigest) {
        super(interfaceC7072ia2);
        C6562gT0.p(interfaceC7072ia2, "source");
        C6562gT0.p(messageDigest, "digest");
        this.X = messageDigest;
        this.Y = null;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final IG0 f(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull C8859ps c8859ps) {
        return Z.a(interfaceC7072ia2, c8859ps);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final IG0 h(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull C8859ps c8859ps) {
        return Z.b(interfaceC7072ia2, c8859ps);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final IG0 i(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull C8859ps c8859ps) {
        return Z.c(interfaceC7072ia2, c8859ps);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final IG0 j(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        return Z.d(interfaceC7072ia2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final IG0 k(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        return Z.e(interfaceC7072ia2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final IG0 l(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        return Z.f(interfaceC7072ia2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final IG0 m(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        return Z.g(interfaceC7072ia2);
    }

    @InterfaceC8046mW0(name = "-deprecated_hash")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "hash", imports = {}))
    @NotNull
    public final C8859ps a() {
        return d();
    }

    @InterfaceC8046mW0(name = "hash")
    @NotNull
    public final C8859ps d() {
        byte[] doFinal;
        MessageDigest messageDigest = this.X;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.Y;
            C6562gT0.m(mac);
            doFinal = mac.doFinal();
        }
        C6562gT0.m(doFinal);
        return new C8859ps(doFinal);
    }

    @Override // o.AbstractC3501Ky0, o.InterfaceC7072ia2
    public long read(@NotNull C5422bq c5422bq, long j) throws IOException {
        C6562gT0.p(c5422bq, "sink");
        long read = super.read(c5422bq, j);
        if (read != -1) {
            long size = c5422bq.size() - read;
            long size2 = c5422bq.size();
            PZ1 pz1 = c5422bq.X;
            C6562gT0.m(pz1);
            while (size2 > size) {
                pz1 = pz1.g;
                C6562gT0.m(pz1);
                size2 -= pz1.c - pz1.b;
            }
            while (size2 < c5422bq.size()) {
                int i = (int) ((pz1.b + size) - size2);
                MessageDigest messageDigest = this.X;
                if (messageDigest != null) {
                    messageDigest.update(pz1.a, i, pz1.c - i);
                } else {
                    Mac mac = this.Y;
                    C6562gT0.m(mac);
                    mac.update(pz1.a, i, pz1.c - i);
                }
                size2 += pz1.c - pz1.b;
                pz1 = pz1.f;
                C6562gT0.m(pz1);
                size = size2;
            }
        }
        return read;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IG0(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull String str) {
        this(interfaceC7072ia2, r3);
        C6562gT0.p(interfaceC7072ia2, "source");
        C6562gT0.p(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        C6562gT0.o(messageDigest, "getInstance(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IG0(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull Mac mac) {
        super(interfaceC7072ia2);
        C6562gT0.p(interfaceC7072ia2, "source");
        C6562gT0.p(mac, "mac");
        this.Y = mac;
        this.X = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IG0(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull C8859ps c8859ps, @NotNull String str) {
        this(interfaceC7072ia2, r0);
        C6562gT0.p(interfaceC7072ia2, "source");
        C6562gT0.p(c8859ps, "key");
        C6562gT0.p(str, "algorithm");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(c8859ps.r0(), str));
            C7458kA2 c7458kA2 = C7458kA2.a;
            C6562gT0.m(mac);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
