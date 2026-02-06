package o;

import java.io.IOException;

@Deprecated
/* renamed from: o.aI0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5050aI0 implements IX1 {
    public final int X;
    public final C6020eI0 Y;
    public int Z = -1;

    public C5050aI0(C6020eI0 c6020eI0, int i) {
        this.Y = c6020eI0;
        this.X = i;
    }

    public void a() {
        boolean z;
        if (this.Z == -1) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.Z = this.Y.x(this.X);
    }

    @Override // o.IX1
    public void b() throws IOException {
        int i = this.Z;
        if (i != -2) {
            if (i == -1) {
                this.Y.W();
                return;
            } else if (i != -3) {
                this.Y.X(i);
                return;
            } else {
                return;
            }
        }
        throw new HX1(this.Y.q().b(this.X).c(0).g1);
    }

    public final boolean c() {
        int i = this.Z;
        if (i != -1 && i != -3 && i != -2) {
            return true;
        }
        return false;
    }

    public void d() {
        if (this.Z != -1) {
            this.Y.r0(this.X);
            this.Z = -1;
        }
    }

    @Override // o.IX1
    public boolean isReady() {
        if (this.Z != -3) {
            if (!c() || !this.Y.S(this.Z)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // o.IX1
    public int j(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
        if (this.Z == -3) {
            c9267rW.j(4);
            return -4;
        } else if (!c()) {
            return -3;
        } else {
            return this.Y.g0(this.Z, c2899Ex0, c9267rW, i);
        }
    }

    @Override // o.IX1
    public int n(long j) {
        if (c()) {
            return this.Y.q0(this.Z, j);
        }
        return 0;
    }
}
