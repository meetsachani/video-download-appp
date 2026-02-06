package o;

@Deprecated
/* loaded from: classes2.dex */
public class CJ {
    public final LD a;
    public boolean b;

    public CJ() {
        this(LD.a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.b) {
            wait();
        }
    }

    public synchronized boolean b(long j) throws InterruptedException {
        if (j <= 0) {
            return this.b;
        }
        long b = this.a.b();
        long j2 = j + b;
        if (j2 < b) {
            a();
        } else {
            while (!this.b && b < j2) {
                wait(j2 - b);
                b = this.a.b();
            }
        }
        return this.b;
    }

    public synchronized void c() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean d() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public synchronized boolean e() {
        return this.b;
    }

    public synchronized boolean f() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public CJ(LD ld) {
        this.a = ld;
    }
}
