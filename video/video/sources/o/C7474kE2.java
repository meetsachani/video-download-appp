package o;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nUuidJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n1#1,277:1\n277#1:278\n277#1:279\n277#1:280\n277#1:281\n277#1:282\n277#1:283\n277#1:284\n277#1:285\n*S KotlinDebug\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n139#1:278\n140#1:279\n184#1:280\n185#1:281\n224#1:282\n225#1:283\n271#1:284\n272#1:285\n*E\n"})
/* renamed from: o.kE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7474kE2 {
    @InterfaceC6365fj0
    public static final void a(long j, @NotNull byte[] bArr, int i, int i2, int i3) {
        C6562gT0.p(bArr, "dst");
        C7717lE2.r(j, bArr, i, i2, i3);
    }

    @InterfaceC6365fj0
    public static final long b(@NotNull byte[] bArr, int i) {
        C6562gT0.p(bArr, "<this>");
        return C7717lE2.s(bArr, i);
    }

    @InterfaceC6365fj0
    @InterfaceC6480g82(version = "2.0")
    @NotNull
    public static final C6990iE2 c(@NotNull ByteBuffer byteBuffer) {
        C6562gT0.p(byteBuffer, "<this>");
        if (byteBuffer.position() + 15 < byteBuffer.limit()) {
            long j = byteBuffer.getLong();
            long j2 = byteBuffer.getLong();
            if (C6562gT0.g(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
                j = Long.reverseBytes(j);
                j2 = Long.reverseBytes(j2);
            }
            return C6990iE2.Z.b(j, j2);
        }
        throw new BufferUnderflowException();
    }

    @InterfaceC6365fj0
    @InterfaceC6480g82(version = "2.0")
    @NotNull
    public static final C6990iE2 d(@NotNull ByteBuffer byteBuffer, int i) {
        C6562gT0.p(byteBuffer, "<this>");
        if (i >= 0) {
            if (i + 15 < byteBuffer.limit()) {
                long j = byteBuffer.getLong(i);
                long j2 = byteBuffer.getLong(i + 8);
                if (C6562gT0.g(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
                    j = Long.reverseBytes(j);
                    j2 = Long.reverseBytes(j2);
                }
                return C6990iE2.Z.b(j, j2);
            }
            throw new IndexOutOfBoundsException("Not enough bytes to read a uuid at index: " + i + ", with limit: " + byteBuffer.limit() + ' ');
        }
        throw new IndexOutOfBoundsException("Negative index: " + i);
    }

    @InterfaceC6365fj0
    @InterfaceC6480g82(version = "2.0")
    @NotNull
    public static final ByteBuffer e(@NotNull ByteBuffer byteBuffer, int i, @NotNull C6990iE2 c6990iE2) {
        ByteBuffer putLong;
        C6562gT0.p(byteBuffer, "<this>");
        C6562gT0.p(c6990iE2, "uuid");
        long j = c6990iE2.j();
        long h = c6990iE2.h();
        if (i >= 0) {
            if (i + 15 < byteBuffer.limit()) {
                if (C6562gT0.g(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
                    byteBuffer.putLong(i, j);
                    putLong = byteBuffer.putLong(i + 8, h);
                } else {
                    byteBuffer.putLong(i, Long.reverseBytes(j));
                    putLong = byteBuffer.putLong(i + 8, Long.reverseBytes(h));
                }
                C6562gT0.o(putLong, "toLongs(...)");
                return putLong;
            }
            throw new IndexOutOfBoundsException("Not enough capacity to write a uuid at index: " + i + ", with limit: " + byteBuffer.limit() + ' ');
        }
        throw new IndexOutOfBoundsException("Negative index: " + i);
    }

    @InterfaceC6365fj0
    @InterfaceC6480g82(version = "2.0")
    @NotNull
    public static final ByteBuffer f(@NotNull ByteBuffer byteBuffer, @NotNull C6990iE2 c6990iE2) {
        ByteBuffer putLong;
        C6562gT0.p(byteBuffer, "<this>");
        C6562gT0.p(c6990iE2, "uuid");
        long j = c6990iE2.j();
        long h = c6990iE2.h();
        if (byteBuffer.position() + 15 < byteBuffer.limit()) {
            if (C6562gT0.g(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
                byteBuffer.putLong(j);
                putLong = byteBuffer.putLong(h);
            } else {
                byteBuffer.putLong(Long.reverseBytes(j));
                putLong = byteBuffer.putLong(Long.reverseBytes(h));
            }
            C6562gT0.o(putLong, "toLongs(...)");
            return putLong;
        }
        throw new BufferOverflowException();
    }

    public static final long g(long j) {
        return Long.reverseBytes(j);
    }

    @InterfaceC6365fj0
    @NotNull
    public static final C6990iE2 h() {
        byte[] bArr = new byte[16];
        JZ1.a.a().nextBytes(bArr);
        return C7717lE2.w(bArr);
    }

    @InterfaceC6365fj0
    @NotNull
    public static final Object i(@NotNull C6990iE2 c6990iE2) {
        C6562gT0.p(c6990iE2, "uuid");
        return new C7978mE2(c6990iE2.j(), c6990iE2.h());
    }

    @InterfaceC6365fj0
    public static final void j(@NotNull byte[] bArr, int i, long j) {
        C6562gT0.p(bArr, "<this>");
        C7717lE2.t(bArr, i, j);
    }

    @InterfaceC6365fj0
    @InterfaceC6480g82(version = "2.0")
    @NotNull
    public static final UUID k(@NotNull C6990iE2 c6990iE2) {
        C6562gT0.p(c6990iE2, "<this>");
        return new UUID(c6990iE2.j(), c6990iE2.h());
    }

    @InterfaceC6365fj0
    @InterfaceC6480g82(version = "2.0")
    @NotNull
    public static final C6990iE2 l(@NotNull UUID uuid) {
        C6562gT0.p(uuid, "<this>");
        return C6990iE2.Z.b(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @InterfaceC6365fj0
    @NotNull
    public static final C6990iE2 m(@NotNull String str) {
        C6562gT0.p(str, "hexString");
        return C7717lE2.x(str);
    }

    @InterfaceC6365fj0
    @NotNull
    public static final C6990iE2 n(@NotNull String str) {
        C6562gT0.p(str, "hexDashString");
        return C7717lE2.y(str);
    }
}
