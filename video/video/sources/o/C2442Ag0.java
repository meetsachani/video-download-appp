package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: o.Ag0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2442Ag0 {
    public static final String e = "ExifAttribute";
    public static final long f = -1;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 7;

    /* renamed from: o  reason: collision with root package name */
    public static final int f413o = 8;
    public static final int p = 9;
    public static final int q = 10;
    public static final int r = 11;
    public static final int s = 12;
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;
    public static final Charset g = StandardCharsets.US_ASCII;
    public static final String[] t = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] u = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] v = {65, 83, 67, 73, 73, 0, 0, 0};

    public C2442Ag0(int i2, int i3, byte[] bArr) {
        this(i2, i3, -1L, bArr);
    }

    public static C2442Ag0 a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new C2442Ag0(1, 1, new byte[]{(byte) (str.charAt(0) - C3599Ly1.j)});
        }
        byte[] bytes = str.getBytes(g);
        return new C2442Ag0(1, bytes.length, bytes);
    }

    public static C2442Ag0 b(double d, ByteOrder byteOrder) {
        return c(new double[]{d}, byteOrder);
    }

    public static C2442Ag0 c(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[u[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d : dArr) {
            wrap.putDouble(d);
        }
        return new C2442Ag0(12, dArr.length, wrap.array());
    }

    public static C2442Ag0 d(int i2, ByteOrder byteOrder) {
        return e(new int[]{i2}, byteOrder);
    }

    public static C2442Ag0 e(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[u[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i2 : iArr) {
            wrap.putInt(i2);
        }
        return new C2442Ag0(9, iArr.length, wrap.array());
    }

    public static C2442Ag0 f(X41 x41, ByteOrder byteOrder) {
        return g(new X41[]{x41}, byteOrder);
    }

    public static C2442Ag0 g(X41[] x41Arr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[u[10] * x41Arr.length]);
        wrap.order(byteOrder);
        for (X41 x41 : x41Arr) {
            wrap.putInt((int) x41.b());
            wrap.putInt((int) x41.a());
        }
        return new C2442Ag0(10, x41Arr.length, wrap.array());
    }

    public static C2442Ag0 h(String str) {
        byte[] bytes = (str + (char) 0).getBytes(g);
        return new C2442Ag0(2, bytes.length, bytes);
    }

    public static C2442Ag0 i(long j2, ByteOrder byteOrder) {
        return j(new long[]{j2}, byteOrder);
    }

    public static C2442Ag0 j(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[u[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j2 : jArr) {
            wrap.putInt((int) j2);
        }
        return new C2442Ag0(4, jArr.length, wrap.array());
    }

    public static C2442Ag0 k(X41 x41, ByteOrder byteOrder) {
        return l(new X41[]{x41}, byteOrder);
    }

    public static C2442Ag0 l(X41[] x41Arr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[u[5] * x41Arr.length]);
        wrap.order(byteOrder);
        for (X41 x41 : x41Arr) {
            wrap.putInt((int) x41.b());
            wrap.putInt((int) x41.a());
        }
        return new C2442Ag0(5, x41Arr.length, wrap.array());
    }

    public static C2442Ag0 m(int i2, ByteOrder byteOrder) {
        return n(new int[]{i2}, byteOrder);
    }

    public static C2442Ag0 n(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[u[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i2 : iArr) {
            wrap.putShort((short) i2);
        }
        return new C2442Ag0(3, iArr.length, wrap.array());
    }

    public double o(ByteOrder byteOrder) {
        Object r2 = r(byteOrder);
        if (r2 != null) {
            if (r2 instanceof String) {
                return Double.parseDouble((String) r2);
            }
            if (r2 instanceof long[]) {
                long[] jArr = (long[]) r2;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (r2 instanceof int[]) {
                int[] iArr = (int[]) r2;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (r2 instanceof double[]) {
                double[] dArr = (double[]) r2;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (r2 instanceof X41[]) {
                X41[] x41Arr = (X41[]) r2;
                if (x41Arr.length == 1) {
                    return x41Arr[0].c();
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public int p(ByteOrder byteOrder) {
        Object r2 = r(byteOrder);
        if (r2 != null) {
            if (r2 instanceof String) {
                return Integer.parseInt((String) r2);
            }
            if (r2 instanceof long[]) {
                long[] jArr = (long[]) r2;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (r2 instanceof int[]) {
                int[] iArr = (int[]) r2;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public String q(ByteOrder byteOrder) {
        Object r2 = r(byteOrder);
        if (r2 == null) {
            return null;
        }
        if (r2 instanceof String) {
            return (String) r2;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (r2 instanceof long[]) {
            long[] jArr = (long[]) r2;
            while (i2 < jArr.length) {
                sb.append(jArr[i2]);
                i2++;
                if (i2 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (r2 instanceof int[]) {
            int[] iArr = (int[]) r2;
            while (i2 < iArr.length) {
                sb.append(iArr[i2]);
                i2++;
                if (i2 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (r2 instanceof double[]) {
            double[] dArr = (double[]) r2;
            while (i2 < dArr.length) {
                sb.append(dArr[i2]);
                i2++;
                if (i2 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(r2 instanceof X41[])) {
            return null;
        } else {
            X41[] x41Arr = (X41[]) r2;
            while (i2 < x41Arr.length) {
                sb.append(x41Arr[i2].b());
                sb.append('/');
                sb.append(x41Arr[i2].a());
                i2++;
                if (i2 != x41Arr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:18:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v20, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v22, types: [long[]] */
    /* JADX WARN: Type inference failed for: r11v24, types: [o.X41[]] */
    /* JADX WARN: Type inference failed for: r11v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v28, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v30, types: [o.X41[]] */
    /* JADX WARN: Type inference failed for: r11v32, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v35, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(ByteOrder byteOrder) {
        C6400fs c6400fs;
        InputStream inputStream;
        byte b;
        byte b2;
        String str;
        InputStream inputStream2 = null;
        try {
            try {
                c6400fs = new C6400fs(this.d);
            } catch (IOException e2) {
                e = e2;
                c6400fs = null;
            } catch (Throwable th) {
                th = th;
                if (inputStream2 != null) {
                }
                throw th;
            }
            try {
                c6400fs.h(byteOrder);
                int i2 = 0;
                switch (this.a) {
                    case 1:
                    case 6:
                        byte[] bArr = this.d;
                        if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                            str = new String(new char[]{(char) (b + 48)});
                            break;
                        } else {
                            String str2 = new String(bArr, g);
                            try {
                                c6400fs.close();
                                return str2;
                            } catch (IOException e3) {
                                C7433k41.d(e, "IOException occurred while closing InputStream", e3);
                                return str2;
                            }
                        }
                        break;
                    case 2:
                    case 7:
                        if (this.b >= v.length) {
                            int i3 = 0;
                            while (true) {
                                byte[] bArr2 = v;
                                if (i3 < bArr2.length) {
                                    if (this.d[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                } else {
                                    i2 = bArr2.length;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        while (i2 < this.b && (b2 = this.d[i2]) != 0) {
                            if (b2 >= 32) {
                                sb.append((char) b2);
                            } else {
                                sb.append('?');
                            }
                            i2++;
                        }
                        str = sb.toString();
                        break;
                    case 3:
                        ?? r11 = new int[this.b];
                        while (true) {
                            str = r11;
                            if (i2 < this.b) {
                                r11[i2] = c6400fs.readUnsignedShort();
                                i2++;
                            }
                        }
                        break;
                    case 4:
                        ?? r112 = new long[this.b];
                        while (true) {
                            str = r112;
                            if (i2 < this.b) {
                                r112[i2] = c6400fs.f();
                                i2++;
                            }
                        }
                        break;
                    case 5:
                        ?? r113 = new X41[this.b];
                        while (true) {
                            str = r113;
                            if (i2 < this.b) {
                                r113[i2] = new X41(c6400fs.f(), c6400fs.f());
                                i2++;
                            }
                        }
                        break;
                    case 8:
                        ?? r114 = new int[this.b];
                        while (true) {
                            str = r114;
                            if (i2 < this.b) {
                                r114[i2] = c6400fs.readShort();
                                i2++;
                            }
                        }
                        break;
                    case 9:
                        ?? r115 = new int[this.b];
                        while (true) {
                            str = r115;
                            if (i2 < this.b) {
                                r115[i2] = c6400fs.readInt();
                                i2++;
                            }
                        }
                        break;
                    case 10:
                        ?? r116 = new X41[this.b];
                        while (true) {
                            str = r116;
                            if (i2 < this.b) {
                                r116[i2] = new X41(c6400fs.readInt(), c6400fs.readInt());
                                i2++;
                            }
                        }
                        break;
                    case 11:
                        ?? r117 = new double[this.b];
                        while (true) {
                            str = r117;
                            if (i2 < this.b) {
                                r117[i2] = c6400fs.readFloat();
                                i2++;
                            }
                        }
                        break;
                    case 12:
                        ?? r118 = new double[this.b];
                        while (true) {
                            str = r118;
                            if (i2 < this.b) {
                                r118[i2] = c6400fs.readDouble();
                                i2++;
                            }
                        }
                        break;
                    default:
                        try {
                            c6400fs.close();
                            return null;
                        } catch (IOException e4) {
                            C7433k41.d(e, "IOException occurred while closing InputStream", e4);
                            return null;
                        }
                }
                try {
                    c6400fs.close();
                    return str;
                } catch (IOException e5) {
                    C7433k41.d(e, "IOException occurred while closing InputStream", e5);
                    return str;
                }
            } catch (IOException e6) {
                e = e6;
                C7433k41.q(e, "IOException occurred during reading a value", e);
                if (c6400fs != null) {
                    try {
                        c6400fs.close();
                    } catch (IOException e7) {
                        C7433k41.d(e, "IOException occurred while closing InputStream", e7);
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException e8) {
                    C7433k41.d(e, "IOException occurred while closing InputStream", e8);
                }
            }
            throw th;
        }
    }

    public int s() {
        return u[this.a] * this.b;
    }

    public String toString() {
        return C9811tl1.c + t[this.a] + ", data length:" + this.d.length + C9811tl1.d;
    }

    public C2442Ag0(int i2, int i3, long j2, byte[] bArr) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = bArr;
    }
}
