package o;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nHashingSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n86#2:149\n*S KotlinDebug\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n*L\n75#1:149\n*E\n"})
/* loaded from: classes4.dex */
public final class HG0 extends AbstractC3011Fy0 implements J82 {
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
        public final HG0 a(@NotNull J82 j82, @NotNull C8859ps c8859ps) {
            C6562gT0.p(j82, "sink");
            C6562gT0.p(c8859ps, "key");
            return new HG0(j82, c8859ps, "HmacSHA1");
        }

        @InterfaceC9511sW0
        @NotNull
        public final HG0 b(@NotNull J82 j82, @NotNull C8859ps c8859ps) {
            C6562gT0.p(j82, "sink");
            C6562gT0.p(c8859ps, "key");
            return new HG0(j82, c8859ps, "HmacSHA256");
        }

        @InterfaceC9511sW0
        @NotNull
        public final HG0 c(@NotNull J82 j82, @NotNull C8859ps c8859ps) {
            C6562gT0.p(j82, "sink");
            C6562gT0.p(c8859ps, "key");
            return new HG0(j82, c8859ps, "HmacSHA512");
        }

        @InterfaceC9511sW0
        @NotNull
        public final HG0 d(@NotNull J82 j82) {
            C6562gT0.p(j82, "sink");
            return new HG0(j82, "MD5");
        }

        @InterfaceC9511sW0
        @NotNull
        public final HG0 e(@NotNull J82 j82) {
            C6562gT0.p(j82, "sink");
            return new HG0(j82, "SHA-1");
        }

        @InterfaceC9511sW0
        @NotNull
        public final HG0 f(@NotNull J82 j82) {
            C6562gT0.p(j82, "sink");
            return new HG0(j82, com.facebook.internal.l0.e);
        }

        @InterfaceC9511sW0
        @NotNull
        public final HG0 g(@NotNull J82 j82) {
            C6562gT0.p(j82, "sink");
            return new HG0(j82, "SHA-512");
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HG0(@NotNull J82 j82, @NotNull MessageDigest messageDigest) {
        super(j82);
        C6562gT0.p(j82, "sink");
        C6562gT0.p(messageDigest, "digest");
        this.X = messageDigest;
        this.Y = null;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final HG0 f(@NotNull J82 j82, @NotNull C8859ps c8859ps) {
        return Z.a(j82, c8859ps);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final HG0 h(@NotNull J82 j82, @NotNull C8859ps c8859ps) {
        return Z.b(j82, c8859ps);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final HG0 i(@NotNull J82 j82, @NotNull C8859ps c8859ps) {
        return Z.c(j82, c8859ps);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final HG0 j(@NotNull J82 j82) {
        return Z.d(j82);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final HG0 k(@NotNull J82 j82) {
        return Z.e(j82);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final HG0 l(@NotNull J82 j82) {
        return Z.f(j82);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final HG0 m(@NotNull J82 j82) {
        return Z.g(j82);
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

    @Override // o.AbstractC3011Fy0, o.J82
    public void write(@NotNull C5422bq c5422bq, long j) throws IOException {
        C6562gT0.p(c5422bq, "source");
        C8648p.e(c5422bq.size(), 0L, j);
        PZ1 pz1 = c5422bq.X;
        C6562gT0.m(pz1);
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, pz1.c - pz1.b);
            MessageDigest messageDigest = this.X;
            if (messageDigest != null) {
                messageDigest.update(pz1.a, pz1.b, min);
            } else {
                Mac mac = this.Y;
                C6562gT0.m(mac);
                mac.update(pz1.a, pz1.b, min);
            }
            j2 += min;
            pz1 = pz1.f;
            C6562gT0.m(pz1);
        }
        super.write(c5422bq, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HG0(@NotNull J82 j82, @NotNull String str) {
        this(j82, r3);
        C6562gT0.p(j82, "sink");
        C6562gT0.p(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        C6562gT0.o(messageDigest, "getInstance(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HG0(@NotNull J82 j82, @NotNull Mac mac) {
        super(j82);
        C6562gT0.p(j82, "sink");
        C6562gT0.p(mac, "mac");
        this.Y = mac;
        this.X = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HG0(@NotNull J82 j82, @NotNull C8859ps c8859ps, @NotNull String str) {
        this(j82, r0);
        C6562gT0.p(j82, "sink");
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
