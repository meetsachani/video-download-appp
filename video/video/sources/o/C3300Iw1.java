package o;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* renamed from: o.Iw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3300Iw1 extends C3202Hw1 {

    /* renamed from: o.Iw1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final OutputConfiguration a;
        public long b = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Objects.equals(this.a, aVar.a) || this.b != aVar.b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() ^ 31;
            return Long.hashCode(this.b) ^ ((hashCode << 5) - hashCode);
        }
    }

    public C3300Iw1(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    public static C3300Iw1 s(OutputConfiguration outputConfiguration) {
        return new C3300Iw1(new a(outputConfiguration));
    }

    @Override // o.C3202Hw1, o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public void c(long j) {
        ((a) this.a).b = j;
    }

    @Override // o.C3202Hw1, o.C3496Kw1, o.C3006Fw1.a
    public void d(Surface surface) {
        ((OutputConfiguration) m()).removeSurface(surface);
    }

    @Override // o.C3202Hw1, o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public void e(String str) {
        ((OutputConfiguration) m()).setPhysicalCameraId(str);
    }

    @Override // o.C3202Hw1, o.C3496Kw1, o.C3006Fw1.a
    public int f() {
        return ((OutputConfiguration) m()).getMaxSharedSurfaceCount();
    }

    @Override // o.C3202Hw1, o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public String i() {
        return null;
    }

    @Override // o.C3202Hw1, o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public long l() {
        return ((a) this.a).b;
    }

    @Override // o.C3202Hw1, o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public Object m() {
        C10907yF1.a(this.a instanceof a);
        return ((a) this.a).a;
    }

    public C3300Iw1(int i, Surface surface) {
        this(new a(new OutputConfiguration(i, surface)));
    }

    public C3300Iw1(Object obj) {
        super(obj);
    }
}
