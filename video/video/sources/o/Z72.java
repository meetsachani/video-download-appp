package o;

/* loaded from: classes.dex */
public final class Z72 implements InterfaceC11257zh2 {
    public final String X;
    public final Object[] Y;

    public Z72(String str, Object[] objArr) {
        this.X = str;
        this.Y = objArr;
    }

    public static void b(InterfaceC11014yh2 interfaceC11014yh2, int i, Object obj) {
        long j;
        if (obj == null) {
            interfaceC11014yh2.O4(i);
        } else if (obj instanceof byte[]) {
            interfaceC11014yh2.p4(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            interfaceC11014yh2.c1(i, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            interfaceC11014yh2.c1(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            interfaceC11014yh2.g4(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            interfaceC11014yh2.g4(i, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            interfaceC11014yh2.g4(i, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            interfaceC11014yh2.g4(i, ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            interfaceC11014yh2.r3(i, (String) obj);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            interfaceC11014yh2.g4(i, j);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    public static void c(InterfaceC11014yh2 interfaceC11014yh2, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                b(interfaceC11014yh2, i, obj);
            }
        }
    }

    @Override // o.InterfaceC11257zh2
    public int a() {
        Object[] objArr = this.Y;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    @Override // o.InterfaceC11257zh2
    public String d() {
        return this.X;
    }

    @Override // o.InterfaceC11257zh2
    public void f(InterfaceC11014yh2 interfaceC11014yh2) {
        c(interfaceC11014yh2, this.Y);
    }

    public Z72(String str) {
        this(str, null);
    }
}
