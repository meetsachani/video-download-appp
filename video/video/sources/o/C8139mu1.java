package o;

import java.io.IOException;

@Deprecated
/* renamed from: o.mu1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8139mu1 {
    public static final int l = 27;
    public static final int m = 255;
    public static final int n = 65025;

    /* renamed from: o  reason: collision with root package name */
    public static final int f810o = 65307;
    public static final int p = 1332176723;
    public static final int q = 4;
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    public final C3012Fy1 k = new C3012Fy1(255);

    public boolean a(InterfaceC4421Uj0 interfaceC4421Uj0, boolean z) throws IOException {
        b();
        this.k.U(27);
        if (!C4615Wj0.b(interfaceC4421Uj0, this.k.e(), 0, 27, z) || this.k.N() != 1332176723) {
            return false;
        }
        int L = this.k.L();
        this.a = L;
        if (L != 0) {
            if (z) {
                return false;
            }
            throw C3989Py1.e("unsupported bit stream revision");
        }
        this.b = this.k.L();
        this.c = this.k.y();
        this.d = this.k.A();
        this.e = this.k.A();
        this.f = this.k.A();
        int L2 = this.k.L();
        this.g = L2;
        this.h = L2 + 27;
        this.k.U(L2);
        if (!C4615Wj0.b(interfaceC4421Uj0, this.k.e(), 0, this.g, z)) {
            return false;
        }
        for (int i = 0; i < this.g; i++) {
            this.j[i] = this.k.L();
            this.i += this.j[i];
        }
        return true;
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public boolean c(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        return d(interfaceC4421Uj0, -1L);
    }

    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0, long j) throws IOException {
        boolean z;
        int i;
        if (interfaceC4421Uj0.getPosition() == interfaceC4421Uj0.n()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.k.U(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || interfaceC4421Uj0.getPosition() + 4 < j) && C4615Wj0.b(interfaceC4421Uj0, this.k.e(), 0, 4, true)) {
                this.k.Y(0);
                if (this.k.N() == 1332176723) {
                    interfaceC4421Uj0.i();
                    return true;
                }
                interfaceC4421Uj0.t(1);
            }
        }
        do {
            if (i != 0 && interfaceC4421Uj0.getPosition() >= j) {
                break;
            }
        } while (interfaceC4421Uj0.c(1) != -1);
        return false;
    }
}
