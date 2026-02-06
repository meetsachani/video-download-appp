package o;

import java.nio.ByteBuffer;
import java.util.UUID;

@Deprecated
/* loaded from: classes2.dex */
public final class DK1 {
    public static final String a = "PsshAtomUtil";

    /* loaded from: classes2.dex */
    public static class a {
        public final UUID a;
        public final int b;
        public final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }

    public static byte[] a(UUID uuid, @InterfaceC11300zs1 byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, @InterfaceC11300zs1 UUID[] uuidArr, @InterfaceC11300zs1 byte[] bArr) {
        int i;
        int i2;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i3 = i + 32;
        if (uuidArr != null) {
            i3 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        allocate.putInt(i3);
        allocate.putInt(AbstractC4501Vf.y0);
        if (uuidArr != null) {
            i2 = 16777216;
        } else {
            i2 = 0;
        }
        allocate.putInt(i2);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        if (d(bArr) != null) {
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    public static a d(byte[] bArr) {
        C3012Fy1 c3012Fy1 = new C3012Fy1(bArr);
        if (c3012Fy1.g() < 32) {
            return null;
        }
        c3012Fy1.Y(0);
        if (c3012Fy1.s() != c3012Fy1.a() + 4 || c3012Fy1.s() != 1886614376) {
            return null;
        }
        int c = AbstractC4501Vf.c(c3012Fy1.s());
        if (c > 1) {
            I31.n(a, "Unsupported pssh version: " + c);
            return null;
        }
        UUID uuid = new UUID(c3012Fy1.E(), c3012Fy1.E());
        if (c == 1) {
            c3012Fy1.Z(c3012Fy1.P() * 16);
        }
        int P = c3012Fy1.P();
        if (P != c3012Fy1.a()) {
            return null;
        }
        byte[] bArr2 = new byte[P];
        c3012Fy1.n(bArr2, 0, P);
        return new a(uuid, c, bArr2);
    }

    @InterfaceC11300zs1
    public static byte[] e(byte[] bArr, UUID uuid) {
        a d = d(bArr);
        if (d == null) {
            return null;
        }
        if (uuid.equals(d.a)) {
            return d.c;
        }
        I31.n(a, "UUID mismatch. Expected: " + uuid + ", got: " + d.a + UE.h);
        return null;
    }

    @InterfaceC11300zs1
    public static UUID f(byte[] bArr) {
        a d = d(bArr);
        if (d != null) {
            return d.a;
        }
        return null;
    }

    public static int g(byte[] bArr) {
        a d = d(bArr);
        if (d != null) {
            return d.b;
        }
        return -1;
    }
}
