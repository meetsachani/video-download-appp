package o;

import java.io.EOFException;
import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "-RealBufferedSink")
@InterfaceC8303na2({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,219:1\n1#2:220\n51#3:221\n51#3:222\n51#3:223\n51#3:224\n51#3:225\n51#3:226\n51#3:227\n51#3:228\n51#3:229\n51#3:230\n51#3:231\n51#3:232\n51#3:233\n51#3:234\n51#3:235\n51#3:236\n51#3:237\n51#3:238\n51#3:239\n51#3:240\n51#3:241\n51#3:242\n51#3:243\n51#3:244\n51#3:245\n51#3:246\n51#3:247\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n*L\n35#1:221\n41#1:222\n51#1:223\n57#1:224\n67#1:225\n73#1:226\n79#1:227\n89#1:228\n96#1:229\n107#1:230\n117#1:231\n123#1:232\n129#1:233\n135#1:234\n141#1:235\n147#1:236\n153#1:237\n159#1:238\n165#1:239\n171#1:240\n172#1:241\n178#1:242\n179#1:243\n185#1:244\n186#1:245\n198#1:246\n199#1:247\n*E\n"})
/* renamed from: o.m  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7900m {
    public static final void a(@NotNull LO1 lo1) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            try {
                if (lo1.Y.size() > 0) {
                    J82 j82 = lo1.X;
                    C5422bq c5422bq = lo1.Y;
                    j82.write(c5422bq, c5422bq.size());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                lo1.X.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            lo1.Z = true;
            if (th == null) {
                return;
            }
            throw th;
        }
    }

    @NotNull
    public static final InterfaceC2579Bq b(@NotNull LO1 lo1) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            long size = lo1.Y.size();
            if (size > 0) {
                lo1.X.write(lo1.Y, size);
            }
            return lo1;
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq c(@NotNull LO1 lo1) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            long j = lo1.Y.j();
            if (j > 0) {
                lo1.X.write(lo1.Y, j);
            }
            return lo1;
        }
        throw new IllegalStateException("closed");
    }

    public static final void d(@NotNull LO1 lo1) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            if (lo1.Y.size() > 0) {
                J82 j82 = lo1.X;
                C5422bq c5422bq = lo1.Y;
                j82.write(c5422bq, c5422bq.size());
            }
            lo1.X.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final C8120mp2 e(@NotNull LO1 lo1) {
        C6562gT0.p(lo1, "<this>");
        return lo1.X.timeout();
    }

    @NotNull
    public static final String f(@NotNull LO1 lo1) {
        C6562gT0.p(lo1, "<this>");
        return "buffer(" + lo1.X + ')';
    }

    @NotNull
    public static final InterfaceC2579Bq g(@NotNull LO1 lo1, @NotNull C8859ps c8859ps) {
        C6562gT0.p(lo1, "<this>");
        C6562gT0.p(c8859ps, "byteString");
        if (!lo1.Z) {
            lo1.Y.K4(c8859ps);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq h(@NotNull LO1 lo1, @NotNull C8859ps c8859ps, int i, int i2) {
        C6562gT0.p(lo1, "<this>");
        C6562gT0.p(c8859ps, "byteString");
        if (!lo1.Z) {
            lo1.Y.O2(c8859ps, i, i2);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq i(@NotNull LO1 lo1, @NotNull InterfaceC7072ia2 interfaceC7072ia2, long j) {
        C6562gT0.p(lo1, "<this>");
        C6562gT0.p(interfaceC7072ia2, "source");
        while (j > 0) {
            long read = interfaceC7072ia2.read(lo1.Y, j);
            if (read != -1) {
                j -= read;
                lo1.l1();
            } else {
                throw new EOFException();
            }
        }
        return lo1;
    }

    @NotNull
    public static final InterfaceC2579Bq j(@NotNull LO1 lo1, @NotNull byte[] bArr) {
        C6562gT0.p(lo1, "<this>");
        C6562gT0.p(bArr, "source");
        if (!lo1.Z) {
            lo1.Y.write(bArr);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq k(@NotNull LO1 lo1, @NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(lo1, "<this>");
        C6562gT0.p(bArr, "source");
        if (!lo1.Z) {
            lo1.Y.write(bArr, i, i2);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    public static final void l(@NotNull LO1 lo1, @NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(lo1, "<this>");
        C6562gT0.p(c5422bq, "source");
        if (!lo1.Z) {
            lo1.Y.write(c5422bq, j);
            lo1.l1();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public static final long m(@NotNull LO1 lo1, @NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        C6562gT0.p(lo1, "<this>");
        C6562gT0.p(interfaceC7072ia2, "source");
        long j = 0;
        while (true) {
            long read = interfaceC7072ia2.read(lo1.Y, 8192L);
            if (read != -1) {
                j += read;
                lo1.l1();
            } else {
                return j;
            }
        }
    }

    @NotNull
    public static final InterfaceC2579Bq n(@NotNull LO1 lo1, int i) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            lo1.Y.writeByte(i);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq o(@NotNull LO1 lo1, long j) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            lo1.Y.S2(j);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq p(@NotNull LO1 lo1, long j) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            lo1.Y.F4(j);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq q(@NotNull LO1 lo1, int i) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            lo1.Y.writeInt(i);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq r(@NotNull LO1 lo1, int i) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            lo1.Y.K3(i);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq s(@NotNull LO1 lo1, long j) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            lo1.Y.writeLong(j);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq t(@NotNull LO1 lo1, long j) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            lo1.Y.X0(j);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq u(@NotNull LO1 lo1, int i) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            lo1.Y.writeShort(i);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq v(@NotNull LO1 lo1, int i) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            lo1.Y.m4(i);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq w(@NotNull LO1 lo1, @NotNull String str) {
        C6562gT0.p(lo1, "<this>");
        C6562gT0.p(str, "string");
        if (!lo1.Z) {
            lo1.Y.K1(str);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq x(@NotNull LO1 lo1, @NotNull String str, int i, int i2) {
        C6562gT0.p(lo1, "<this>");
        C6562gT0.p(str, "string");
        if (!lo1.Z) {
            lo1.Y.Z1(str, i, i2);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final InterfaceC2579Bq y(@NotNull LO1 lo1, int i) {
        C6562gT0.p(lo1, "<this>");
        if (!lo1.Z) {
            lo1.Y.R0(i);
            return lo1.l1();
        }
        throw new IllegalStateException("closed");
    }
}
