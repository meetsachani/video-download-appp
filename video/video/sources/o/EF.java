package o;

/* loaded from: classes3.dex */
public class EF {
    @InterfaceC4698Xf2
    public final int a;
    @InterfaceC4698Xf2
    public final int b;

    /* loaded from: classes3.dex */
    public static class b {
        @InterfaceC4698Xf2
        public int a;
        @InterfaceC4698Xf2
        public int b;

        @InterfaceC5670cr1
        public EF c() {
            return new EF(this);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b d(@InterfaceC4698Xf2 int i) {
            this.b = i;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b e(@InterfaceC4698Xf2 int i) {
            this.a = i;
            return this;
        }
    }

    @InterfaceC4698Xf2
    public int a() {
        return this.b;
    }

    @InterfaceC4698Xf2
    public int b() {
        return this.a;
    }

    public EF(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }
}
