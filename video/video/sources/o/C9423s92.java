package o;

import java.util.BitSet;
import o.SA;

@InterfaceC11149zF0
@InterfaceC8301na0
/* renamed from: o.s92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9423s92 extends SA.v {
    public static final int a1 = 1023;
    public static final int b1 = -862048943;
    public static final int c1 = 461845907;
    public static final double d1 = 0.5d;
    public final boolean Y0;
    public final char[] Z;
    public final long Z0;

    public C9423s92(char[] cArr, long j, boolean z, String str) {
        super(str);
        this.Z = cArr;
        this.Z0 = j;
        this.Y0 = z;
    }

    @InterfaceC5299bJ2
    public static int Z(int i) {
        if (i == 1) {
            return 2;
        }
        int highestOneBit = Integer.highestOneBit(i - 1) << 1;
        while (highestOneBit * 0.5d < i) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static SA a0(BitSet bitSet, String str) {
        int i;
        int cardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        int Z = Z(cardinality);
        char[] cArr = new char[Z];
        int i2 = Z - 1;
        int nextSetBit = bitSet.nextSetBit(0);
        long j = 0;
        while (nextSetBit != -1) {
            long j2 = (1 << nextSetBit) | j;
            int b0 = b0(nextSetBit);
            while (true) {
                i = b0 & i2;
                if (cArr[i] == 0) {
                    break;
                }
                b0 = i + 1;
            }
            cArr[i] = (char) nextSetBit;
            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
            j = j2;
        }
        return new C9423s92(cArr, j, z, str);
    }

    public static int b0(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    @Override // o.SA
    public boolean B(char c) {
        if (c == 0) {
            return this.Y0;
        }
        if (!Y(c)) {
            return false;
        }
        int length = this.Z.length - 1;
        int b0 = b0(c) & length;
        int i = b0;
        do {
            char c2 = this.Z[i];
            if (c2 == 0) {
                return false;
            }
            if (c2 == c) {
                return true;
            }
            i = (i + 1) & length;
        } while (i != b0);
        return false;
    }

    @Override // o.SA
    public void Q(BitSet bitSet) {
        char[] cArr;
        if (this.Y0) {
            bitSet.set(0);
        }
        for (char c : this.Z) {
            if (c != 0) {
                bitSet.set(c);
            }
        }
    }

    public final boolean Y(int i) {
        if (1 == ((this.Z0 >> i) & 1)) {
            return true;
        }
        return false;
    }
}
