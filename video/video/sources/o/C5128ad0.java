package o;

/* renamed from: o.ad0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5128ad0<Z> implements InterfaceC5580cT1<Z> {
    public final boolean X;
    public final boolean Y;
    public final a Y0;
    public final InterfaceC5580cT1<Z> Z;
    public final InterfaceC6575gX0 Z0;
    public int a1;
    public boolean b1;

    /* renamed from: o.ad0$a */
    /* loaded from: classes.dex */
    public interface a {
        void b(InterfaceC6575gX0 interfaceC6575gX0, C5128ad0<?> c5128ad0);
    }

    public C5128ad0(InterfaceC5580cT1<Z> interfaceC5580cT1, boolean z, boolean z2, InterfaceC6575gX0 interfaceC6575gX0, a aVar) {
        this.Z = (InterfaceC5580cT1) C10175vF1.e(interfaceC5580cT1);
        this.X = z;
        this.Y = z2;
        this.Z0 = interfaceC6575gX0;
        this.Y0 = (a) C10175vF1.e(aVar);
    }

    @Override // o.InterfaceC5580cT1
    public synchronized void a() {
        if (this.a1 <= 0) {
            if (!this.b1) {
                this.b1 = true;
                if (this.Y) {
                    this.Z.a();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public synchronized void b() {
        if (!this.b1) {
            this.a1++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public InterfaceC5580cT1<Z> c() {
        return this.Z;
    }

    public boolean d() {
        return this.X;
    }

    public void e() {
        boolean z;
        synchronized (this) {
            int i = this.a1;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.a1 = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.Y0.b(this.Z0, this);
        }
    }

    @Override // o.InterfaceC5580cT1
    public Z get() {
        return this.Z.get();
    }

    @Override // o.InterfaceC5580cT1
    public int h0() {
        return this.Z.h0();
    }

    @Override // o.InterfaceC5580cT1
    public Class<Z> i0() {
        return this.Z.i0();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.X + ", listener=" + this.Y0 + ", key=" + this.Z0 + ", acquired=" + this.a1 + ", isRecycled=" + this.b1 + ", resource=" + this.Z + '}';
    }
}
