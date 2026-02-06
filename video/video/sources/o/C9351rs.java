package o;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

@InterfaceC5116aa0
@InterfaceC10420wF0
/* renamed from: o.rs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9351rs {

    @InterfaceC10420wF0
    /* renamed from: o.rs$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final byte[] X;
        public final int Y;
        public final int Z;

        public a(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@MB Object obj) {
            if ((obj instanceof Byte) && C9351rs.i(this.X, ((Byte) obj).byteValue(), this.Y, this.Z) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Byte get(int i) {
            C10664xF1.C(i, size());
            return Byte.valueOf(this.X[this.Y + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e */
        public Byte set(int i, Byte b) {
            C10664xF1.C(i, size());
            byte[] bArr = this.X;
            int i2 = this.Y;
            byte b2 = bArr[i2 + i];
            bArr[i2 + i] = ((Byte) C10664xF1.E(b)).byteValue();
            return Byte.valueOf(b2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@MB Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                int size = size();
                if (aVar.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.X[this.Y + i] != aVar.X[aVar.Y + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        public byte[] f() {
            return Arrays.copyOfRange(this.X, this.Y, this.Z);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.Y; i2 < this.Z; i2++) {
                i = (i * 31) + C9351rs.g(this.X[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@MB Object obj) {
            int i;
            if ((obj instanceof Byte) && (i = C9351rs.i(this.X, ((Byte) obj).byteValue(), this.Y, this.Z)) >= 0) {
                return i - this.Y;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@MB Object obj) {
            int l;
            if ((obj instanceof Byte) && (l = C9351rs.l(this.X, ((Byte) obj).byteValue(), this.Y, this.Z)) >= 0) {
                return l - this.Y;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z - this.Y;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i, int i2) {
            C10664xF1.f0(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            byte[] bArr = this.X;
            int i3 = this.Y;
            return new a(bArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append((int) this.X[this.Y]);
            int i = this.Y;
            while (true) {
                i++;
                if (i < this.Z) {
                    sb.append(C6566gU0.h);
                    sb.append((int) this.X[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        public a(byte[] bArr, int i, int i2) {
            this.X = bArr;
            this.Y = i;
            this.Z = i2;
        }
    }

    public static List<Byte> c(byte... bArr) {
        if (bArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new a(bArr);
    }

    public static byte[] d(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            i2 += bArr4.length;
        }
        return bArr3;
    }

    public static boolean e(byte[] bArr, byte b) {
        for (byte b2 : bArr) {
            if (b2 == b) {
                return true;
            }
        }
        return false;
    }

    public static byte[] f(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "Invalid minLength: %s", i);
        if (i2 >= 0) {
            z2 = true;
        }
        C10664xF1.k(z2, "Invalid padding: %s", i2);
        if (bArr.length < i) {
            return Arrays.copyOf(bArr, i + i2);
        }
        return bArr;
    }

    public static int h(byte[] bArr, byte b) {
        return i(bArr, b, 0, bArr.length);
    }

    public static int i(byte[] bArr, byte b, int i, int i2) {
        while (i < i2) {
            if (bArr[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int j(byte[] bArr, byte[] bArr2) {
        C10664xF1.F(bArr, "array");
        C10664xF1.F(bArr2, "target");
        if (bArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (bArr.length - bArr2.length) + 1) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i + i2] != bArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static int k(byte[] bArr, byte b) {
        return l(bArr, b, 0, bArr.length);
    }

    public static int l(byte[] bArr, byte b, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (bArr[i3] == b) {
                return i3;
            }
        }
        return -1;
    }

    public static void m(byte[] bArr) {
        C10664xF1.E(bArr);
        n(bArr, 0, bArr.length);
    }

    public static void n(byte[] bArr, int i, int i2) {
        C10664xF1.E(bArr);
        C10664xF1.f0(i, i2, bArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            byte b = bArr[i];
            bArr[i] = bArr[i3];
            bArr[i3] = b;
            i++;
        }
    }

    public static byte[] o(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = ((Number) C10664xF1.E(array[i])).byteValue();
        }
        return bArr;
    }

    public static int g(byte b) {
        return b;
    }
}
