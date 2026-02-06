package o;

/* renamed from: o.zx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11320zx1 {
    public int a;
    public int b;
    public String c;
    public InterfaceC9457sI0 d;
    public boolean e;

    /* renamed from: o.zx1$b */
    /* loaded from: classes.dex */
    public static class b {
        public int a = 20000;
        public int b = 20000;
        public String c = DK.e;
        public InterfaceC9457sI0 d = new C8297nZ();
        public boolean e = false;

        public C11320zx1 a() {
            return new C11320zx1(this);
        }

        public b b(int i) {
            this.b = i;
            return this;
        }

        public b c(boolean z) {
            this.e = z;
            return this;
        }

        public b d(InterfaceC9457sI0 interfaceC9457sI0) {
            this.d = interfaceC9457sI0;
            return this;
        }

        public b e(int i) {
            this.a = i;
            return this;
        }

        public b f(String str) {
            this.c = str;
            return this;
        }
    }

    public static b f() {
        return new b();
    }

    public int a() {
        return this.b;
    }

    public InterfaceC9457sI0 b() {
        return this.d;
    }

    public int c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public void g(int i) {
        this.b = i;
    }

    public void h(boolean z) {
        this.e = z;
    }

    public void i(InterfaceC9457sI0 interfaceC9457sI0) {
        this.d = interfaceC9457sI0;
    }

    public void j(int i) {
        this.a = i;
    }

    public void k(String str) {
        this.c = str;
    }

    public C11320zx1(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
    }
}
