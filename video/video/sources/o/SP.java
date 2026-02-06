package o;

/* loaded from: classes.dex */
public class SP {
    public static SP b;
    public final InterfaceC8082mg0 a = new VY();

    public static SP b() {
        if (b == null) {
            synchronized (SP.class) {
                try {
                    if (b == null) {
                        b = new SP();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public static void c() {
        if (b != null) {
            b = null;
        }
    }

    public InterfaceC8082mg0 a() {
        return this.a;
    }
}
