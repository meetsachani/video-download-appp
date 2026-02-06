package o;

@InterfaceC8046mW0(name = "ProcessKt")
/* loaded from: classes3.dex */
public final class YH1 {
    @XP0
    public static final Void a(int i) {
        System.exit(i);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
