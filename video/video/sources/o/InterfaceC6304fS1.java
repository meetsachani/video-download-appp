package o;

/* renamed from: o.fS1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6304fS1 {

    /* renamed from: o.fS1$a */
    /* loaded from: classes.dex */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        public final boolean X;

        a(boolean z) {
            this.X = z;
        }

        public boolean g() {
            return this.X;
        }
    }

    boolean a();

    void b(InterfaceC5334bS1 interfaceC5334bS1);

    boolean c(InterfaceC5334bS1 interfaceC5334bS1);

    boolean d(InterfaceC5334bS1 interfaceC5334bS1);

    void f(InterfaceC5334bS1 interfaceC5334bS1);

    InterfaceC6304fS1 getRoot();

    boolean j(InterfaceC5334bS1 interfaceC5334bS1);
}
