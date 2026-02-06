package o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class YU1 implements InterfaceC11257zh2, InterfaceC11014yh2 {
    public static final int d1 = 15;
    public static final int e1 = 10;
    public static final TreeMap<Integer, YU1> f1 = new TreeMap<>();
    public static final int g1 = 1;
    public static final int h1 = 2;
    public static final int i1 = 3;
    public static final int j1 = 4;
    public static final int k1 = 5;
    public volatile String X;
    public final long[] Y;
    public final String[] Y0;
    public final double[] Z;
    public final byte[][] Z0;
    public final int[] a1;
    public final int b1;
    public int c1;

    public YU1(int i) {
        this.b1 = i;
        int i2 = i + 1;
        this.a1 = new int[i2];
        this.Y = new long[i2];
        this.Z = new double[i2];
        this.Y0 = new String[i2];
        this.Z0 = new byte[i2];
    }

    public static YU1 h(String str, int i) {
        TreeMap<Integer, YU1> treeMap = f1;
        synchronized (treeMap) {
            try {
                Map.Entry<Integer, YU1> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    YU1 value = ceilingEntry.getValue();
                    value.k(str, i);
                    return value;
                }
                YU1 yu1 = new YU1(i);
                yu1.k(str, i);
                return yu1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static YU1 j(InterfaceC11257zh2 interfaceC11257zh2) {
        YU1 h = h(interfaceC11257zh2.d(), interfaceC11257zh2.a());
        interfaceC11257zh2.f(new a());
        return h;
    }

    public static void l() {
        TreeMap<Integer, YU1> treeMap = f1;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    @Override // o.InterfaceC11014yh2
    public void O4(int i) {
        this.a1[i] = 1;
    }

    @Override // o.InterfaceC11257zh2
    public int a() {
        return this.c1;
    }

    @Override // o.InterfaceC11014yh2
    public void c1(int i, double d) {
        this.a1[i] = 3;
        this.Z[i] = d;
    }

    @Override // o.InterfaceC11257zh2
    public String d() {
        return this.X;
    }

    @Override // o.InterfaceC11257zh2
    public void f(InterfaceC11014yh2 interfaceC11014yh2) {
        for (int i = 1; i <= this.c1; i++) {
            int i2 = this.a1[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                interfaceC11014yh2.p4(i, this.Z0[i]);
                            }
                        } else {
                            interfaceC11014yh2.r3(i, this.Y0[i]);
                        }
                    } else {
                        interfaceC11014yh2.c1(i, this.Z[i]);
                    }
                } else {
                    interfaceC11014yh2.g4(i, this.Y[i]);
                }
            } else {
                interfaceC11014yh2.O4(i);
            }
        }
    }

    public void g() {
        TreeMap<Integer, YU1> treeMap = f1;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.b1), this);
            l();
        }
    }

    @Override // o.InterfaceC11014yh2
    public void g4(int i, long j) {
        this.a1[i] = 2;
        this.Y[i] = j;
    }

    public void i(YU1 yu1) {
        int a2 = yu1.a() + 1;
        System.arraycopy(yu1.a1, 0, this.a1, 0, a2);
        System.arraycopy(yu1.Y, 0, this.Y, 0, a2);
        System.arraycopy(yu1.Y0, 0, this.Y0, 0, a2);
        System.arraycopy(yu1.Z0, 0, this.Z0, 0, a2);
        System.arraycopy(yu1.Z, 0, this.Z, 0, a2);
    }

    public void k(String str, int i) {
        this.X = str;
        this.c1 = i;
    }

    @Override // o.InterfaceC11014yh2
    public void p4(int i, byte[] bArr) {
        this.a1[i] = 5;
        this.Z0[i] = bArr;
    }

    @Override // o.InterfaceC11014yh2
    public void r3(int i, String str) {
        this.a1[i] = 4;
        this.Y0[i] = str;
    }

    @Override // o.InterfaceC11014yh2
    public void t5() {
        Arrays.fill(this.a1, 1);
        Arrays.fill(this.Y0, (Object) null);
        Arrays.fill(this.Z0, (Object) null);
        this.X = null;
    }

    /* loaded from: classes.dex */
    public static class a implements InterfaceC11014yh2 {
        public a() {
        }

        @Override // o.InterfaceC11014yh2
        public void O4(int i) {
            YU1.this.O4(i);
        }

        @Override // o.InterfaceC11014yh2
        public void c1(int i, double d) {
            YU1.this.c1(i, d);
        }

        @Override // o.InterfaceC11014yh2
        public void g4(int i, long j) {
            YU1.this.g4(i, j);
        }

        @Override // o.InterfaceC11014yh2
        public void p4(int i, byte[] bArr) {
            YU1.this.p4(i, bArr);
        }

        @Override // o.InterfaceC11014yh2
        public void r3(int i, String str) {
            YU1.this.r3(i, str);
        }

        @Override // o.InterfaceC11014yh2
        public void t5() {
            YU1.this.t5();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
