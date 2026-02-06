package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C10662xF;
import o.C10763xf2;
import o.C5033aE;
import o.C6562gT0;
import o.C6695h12;
import o.C7458kA2;
import o.C7979mF;
import o.C8222nF;
import o.C9516sY;
import o.C9604su1;
import o.DF0;
import o.InterfaceC2677Cq;
import o.RP1;
import o.UE;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    @NotNull
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final byte[] WILDCARD_LABEL = {42};
    @NotNull
    private static final List<String> PREVAILING_RULE = C7979mF.k("*");
    @NotNull
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    @NotNull
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    @NotNull
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            int and;
            boolean z;
            int and2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        and = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        and = Util.and(bArr2[i8][i9], 255);
                        z = z3;
                    }
                    and2 = and - Util.and(bArr[i5 + i10], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    } else if (bArr2[i8].length == i9) {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    } else {
                        z2 = z;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset charset = StandardCharsets.UTF_8;
                                C6562gT0.o(charset, "UTF_8");
                                return new String(bArr, i5, i7, charset);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i4;
            }
            return null;
        }

        @NotNull
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        private Companion() {
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> H;
        List<String> H2;
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.publicSuffixListBytes != null) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                Charset charset = StandardCharsets.UTF_8;
                C6562gT0.o(charset, "UTF_8");
                byte[] bytes = list.get(i).getBytes(charset);
                C6562gT0.o(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                str = null;
                if (i2 < size) {
                    Companion companion = Companion;
                    byte[] bArr2 = this.publicSuffixListBytes;
                    if (bArr2 == null) {
                        C6562gT0.S("publicSuffixListBytes");
                        bArr2 = null;
                    }
                    str2 = companion.binarySearch(bArr2, bArr, i2);
                    if (str2 != null) {
                        break;
                    }
                    i2++;
                } else {
                    str2 = null;
                    break;
                }
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    bArr3[i3] = WILDCARD_LABEL;
                    Companion companion2 = Companion;
                    byte[] bArr4 = this.publicSuffixListBytes;
                    if (bArr4 == null) {
                        C6562gT0.S("publicSuffixListBytes");
                        bArr4 = null;
                    }
                    String binarySearch = companion2.binarySearch(bArr4, bArr3, i3);
                    if (binarySearch != null) {
                        str3 = binarySearch;
                        break;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i4 = size - 1;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    Companion companion3 = Companion;
                    byte[] bArr5 = this.publicSuffixExceptionListBytes;
                    if (bArr5 == null) {
                        C6562gT0.S("publicSuffixExceptionListBytes");
                        bArr5 = null;
                    }
                    String binarySearch2 = companion3.binarySearch(bArr5, bArr, i5);
                    if (binarySearch2 != null) {
                        str = binarySearch2;
                        break;
                    }
                    i5++;
                }
            }
            if (str != null) {
                return C10763xf2.n5(EXCEPTION_MARKER + str, new char[]{'.'}, false, 0, 6, null);
            } else if (str2 == null && str3 == null) {
                return PREVAILING_RULE;
            } else {
                if (str2 == null || (H = C10763xf2.n5(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
                    H = C8222nF.H();
                }
                if (str3 == null || (H2 = C10763xf2.n5(str3, new char[]{'.'}, false, 0, 6, null)) == null) {
                    H2 = C8222nF.H();
                }
                if (H.size() <= H2.size()) {
                    return H2;
                }
                return H;
            }
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [byte[], T] */
    /* JADX WARN: Type inference failed for: r3v7, types: [byte[], T] */
    private final void readTheList() throws IOException {
        try {
            RP1.h hVar = new RP1.h();
            RP1.h hVar2 = new RP1.h();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                InterfaceC2677Cq e = C9604su1.e(new DF0(C9604su1.u(resourceAsStream)));
                hVar.X = e.o2(e.readInt());
                hVar2.X = e.o2(e.readInt());
                C7458kA2 c7458kA2 = C7458kA2.a;
                C5033aE.a(e, null);
                synchronized (this) {
                    T t = hVar.X;
                    C6562gT0.m(t);
                    this.publicSuffixListBytes = (byte[]) t;
                    T t2 = hVar2.X;
                    C6562gT0.m(t2);
                    this.publicSuffixExceptionListBytes = (byte[]) t2;
                }
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e);
                    if (!z) {
                        return;
                    }
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> n5 = C10763xf2.n5(str, new char[]{'.'}, false, 0, 6, null);
        if (C6562gT0.g(C10662xF.s3(n5), "")) {
            return C10662xF.f2(n5, 1);
        }
        return n5;
    }

    @Nullable
    public final String getEffectiveTldPlusOne(@NotNull String str) {
        int size;
        int size2;
        C6562gT0.p(str, "domain");
        String unicode = IDN.toUnicode(str);
        C6562gT0.o(unicode, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        return C6695h12.F1(C6695h12.H0(C10662xF.C1(splitDomain(str)), size - size2), UE.h, null, null, 0, null, null, 62, null);
    }

    public final void setListBytes(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        C6562gT0.p(bArr, "publicSuffixListBytes");
        C6562gT0.p(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
